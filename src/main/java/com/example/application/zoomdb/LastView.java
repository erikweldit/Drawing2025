package com.example.application.zoomdb;


import com.example.application.diverse.camvas.GreetingComponent;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.views.list.MainLayoutSave;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import jakarta.annotation.security.PermitAll;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

//@Route(value = "lastviewold", layout = MainLayoutSave.class)
@Route("lastviewold")
@PermitAll
@CssImport("./styles/shared-styles.css")
public class LastView extends HorizontalLayout {

    private final SvgImageRepository repository;
    private  String currentUser = GreetingComponent.userIdents;        //"UserID";
    private final Div canvas = new Div();
    private final Div gallery = new Div();
    private final Input rotationInput = new Input();
    private final Button rotateButton = new Button("Roter valgt");
    private final Span statusMessage = new Span();
    private final Span  responseLabel = new Span(); // gjør det final

    public LastView(@Autowired SvgImageRepository repository) {
        this.repository = repository;
        setSizeFull();

        createMenu();
        gallery.setWidth("200px");
        gallery.getStyle().set("background", "#f0f0f0");
        gallery.getStyle().set("z-index", "5").set("position", "relative");
        refreshGallery();
        add(gallery);

        canvas.setWidth("1200px");
        canvas.setHeight("860px");
        canvas.getStyle().set("border", "1px solid black");
        canvas.setId("svg-canvas");
        add(canvas);
    }

    private void createMenu() {
        VerticalLayout menu = new VerticalLayout();
        menu.setWidth("200px");
        menu.getStyle().set("z-index", "10").set("background", "white");
        menu.add(new Span("Meny"));

        Button home = new Button("Home");
        home.addClickListener(e ->  UI.getCurrent().getPage().setLocation("home" ));;
        menu.add(home);

        Button pngButton = new Button("Eksporter til PNG");
        pngButton.addClickListener(e -> exportCanvasToPng());
        menu.add(pngButton);

        Button pdfButton = new Button("Eksporter til PDF");
        pdfButton.addClickListener(e -> exportCanvasToPdf());
        menu.add(pdfButton);


        Button printButton = new Button("Skriv ut");
        printButton.addClickListener(e -> printCanvas());
        menu.add(printButton);

        Upload upload = createUploadComponent();
        menu.add(upload);

        rotationInput.setPlaceholder("Vinkel (grader)");
        rotationInput.setValue("15");
        rotateButton.addClickListener(e -> rotateSelected());
        menu.add(rotationInput, rotateButton);

        NumberField zoomField = new NumberField("Zoom");
        zoomField.setValue(1.0);
        zoomField.setMin(0.1);
        zoomField.setMax(3.0);
        zoomField.setStep(0.1);
        zoomField.addValueChangeListener(e -> UI.getCurrent().getPage().executeJs("""
            const svg = document.getElementById('active-svg');
            if (svg) {
                const angle = svg.dataset.angle || '0';
                const scale = $0;
                svg.dataset.scale = scale;
                svg.style.transform = `rotate(${angle}deg) scale(${scale})`;
            }
        """, e.getValue()));
        menu.add(zoomField);

        TextField textField = new TextField("Tekst");
        Button addTextButton = new Button("Legg til tekst");
        addTextButton.addClickListener(e -> UI.getCurrent().getPage().executeJs("""
            const canvas = document.getElementById('svg-canvas');
            let svg = canvas.querySelector('svg');
            if (!svg) {
                svg = document.createElementNS("http://www.w3.org/2000/svg", "svg");
                svg.setAttribute("width", "1200");
                svg.setAttribute("height", "860");
                canvas.appendChild(svg);
            }

            const text = document.createElementNS("http://www.w3.org/2000/svg", "text");
            text.setAttribute("x", "100");
            text.setAttribute("y", "100");
            text.setAttribute("fill", "black");
            text.setAttribute("font-size", "20");
            text.textContent = $0;
            text.setAttribute("cursor", "move");

            let isDragging = false;
            let offsetX = 0;
            let offsetY = 0;

            text.addEventListener('mousedown', (e) => {
                isDragging = true;
                offsetX = e.offsetX - parseFloat(text.getAttribute("x"));
                offsetY = e.offsetY - parseFloat(text.getAttribute("y"));
            });

            svg.addEventListener('mousemove', (e) => {
                if (isDragging) {
                    const pt = svg.createSVGPoint();
                    pt.x = e.clientX;
                    pt.y = e.clientY;
                    const svgP = pt.matrixTransform(svg.getScreenCTM().inverse());
                    text.setAttribute("x", svgP.x - offsetX);
                    text.setAttribute("y", svgP.y - offsetY);
                }
            });

            window.addEventListener('mouseup', () => {
                isDragging = false;
            });

            svg.appendChild(text);
        """, textField.getValue()));
        menu.add(textField, addTextButton);

        Button deleteButton = new Button("Slett valgt bilde");
        deleteButton.addClickListener(e -> UI.getCurrent().getPage().executeJs("""
            const svg = document.getElementById('active-svg');
            if (svg && svg.parentNode) {
                svg.parentNode.removeChild(svg);
            }
        """));
        menu.add(deleteButton);

        Button saveButton = new Button("Lagre redigert");
        saveButton.addClickListener(e -> saveEditedSvg());
        menu.add(saveButton);

        Button sendToApiButton = new Button("Send til API");
        sendToApiButton.addClickListener(e -> sendToApi());
        menu.add(sendToApiButton);

        add(menu);

        statusMessage.setText(""); // tom ved start
        menu.add(statusMessage);

        Upload importUpload = createDbImportUpload();
        menu.add(new Span("Importer til DB"), importUpload);

    }
    private void downloadCanvas() {
        UI.getCurrent().getPage().executeJs("""
            const svg = document.getElementById('main-canvas');
            if (!svg) return;
            const clone = svg.cloneNode(true);
            clone.removeAttribute('id');
            clone.setAttribute("xmlns", "http://www.w3.org/2000/svg");
            const serializer = new XMLSerializer();
            const content = serializer.serializeToString(clone);
            const blob = new Blob([content], {type: "image/svg+xml"});
            const url = URL.createObjectURL(blob);
            const a = document.createElement('a');
            a.href = url;
            a.download = 'tegneomrade.svg';
            document.body.appendChild(a);
            a.click();
            document.body.removeChild(a);
            URL.revokeObjectURL(url);
        """);
    }
    private Upload createDbImportUpload() {
        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);
        upload.setAcceptedFileTypes(".svg");
        upload.setDropAllowed(true);
        upload.setUploadButton(new Button("Last opp til database"));

        upload.addSucceededListener(event -> {
            try {
                InputStream input = buffer.getInputStream();
                String content = IOUtils.toString(input, StandardCharsets.UTF_8);
                SvgImage image = new SvgImage();
                image.setName(event.getFileName());
                image.setContent(content);
                image.setUserId(currentUser);
                image.setCreatedAt(LocalDateTime.now());
                repository.save(image);
                Notification.show("Lagt til i database: " + event.getFileName());
                refreshGallery(); // Oppdater galleri om aktuelt
            } catch (Exception e) {
                Notification.show("Feil ved lagring: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
            }
        });

        return upload;
    }


    private Upload createUploadComponent() {
        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);
        upload.setAcceptedFileTypes(".svg");
        upload.addSucceededListener(event -> {
            try {
                InputStream input = buffer.getInputStream();
                String content = IOUtils.toString(input, StandardCharsets.UTF_8);
                SvgImage image = new SvgImage();
                image.setName(event.getFileName());
                image.setContent(content);
                image.setUserId(currentUser);
                image.setCreatedAt(LocalDateTime.now());
                repository.save(image);
                refreshGallery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return upload;
    }

    private void refreshGallery() {
        gallery.removeAll();
        gallery.add(new Span("Galleri"));
        List<SvgImage> images = repository.findByUserId(currentUser);
        if (images.isEmpty()) {
            gallery.add(new Span(" Ingen SVG-er funnet."));
            return;
        }
        images.stream()
                .sorted(Comparator.comparing(SvgImage::getCreatedAt).reversed())
                .limit(4)
                .forEach(svg -> {
                    StreamResource resource = new StreamResource(svg.getName(), () -> new ByteArrayInputStream(svg.getContent().getBytes(StandardCharsets.UTF_8)));
                    Image img = new Image(resource, svg.getName());
                    img.setWidth("200px");
                    img.addClickListener(e -> addToCanvas(svg));
                    gallery.add(img);
                });
    }

    private void addToCanvas(SvgImage svg) {
        UI.getCurrent().getPage().executeJs("""
            const canvas = document.getElementById('svg-canvas');
            const parser = new DOMParser();
            const svgDoc = parser.parseFromString($0, "image/svg+xml").documentElement;

            svgDoc.style.position = 'absolute';
            svgDoc.style.zIndex = '1';
            svgDoc.style.left = '500px';
            svgDoc.style.top = '300px';
            svgDoc.style.transform = 'rotate(0deg) scale(1)';
            svgDoc.setAttribute('id', 'active-svg');
            svgDoc.dataset.angle = '0';
            svgDoc.dataset.scale = '1';

            let offsetX = 0, offsetY = 0, isDragging = false;

            svgDoc.addEventListener('mousedown', (e) => {
                isDragging = true;
                offsetX = e.clientX - parseInt(svgDoc.style.left);
                offsetY = e.clientY - parseInt(svgDoc.style.top);
            });

            window.addEventListener('mousemove', (e) => {
                if (isDragging) {
                    svgDoc.style.left = (e.clientX - offsetX) + 'px';
                    svgDoc.style.top = (e.clientY - offsetY) + 'px';
                }
            });

            window.addEventListener('mouseup', () => {
                isDragging = false;
            });

            svgDoc.addEventListener('wheel', e => {
                e.preventDefault();
                let scale = parseFloat(svgDoc.dataset.scale) || 1;
                scale += e.deltaY < 0 ? 0.1 : -0.1;
                scale = Math.max(0.1, scale);
                svgDoc.dataset.scale = scale.toString();
                updateTransform(svgDoc);
            });

            function updateTransform(el) {
                const angle = el.dataset.angle || 0;
                const scale = el.dataset.scale || 1;
                el.style.transform = `rotate(${angle}deg) scale(${scale})`;
            }

            canvas.appendChild(svgDoc);
        """, svg.getContent());
    }

    private void rotateSelected() {
        try {
            int angle = Integer.parseInt(rotationInput.getValue());
            UI.getCurrent().getPage().executeJs("""
                const svg = document.getElementById('active-svg');
                if (svg) {
                    let current = parseInt(svg.dataset.angle || '0');
                    svg.dataset.angle = (current + $0) % 360;
                    const scale = svg.dataset.scale || 1;
                    svg.style.transform = `rotate(${svg.dataset.angle}deg) scale(${scale})`;
                }
            """, angle);
        } catch (NumberFormatException e) {
            rotationInput.setValue("15");
        }
    }

    private void saveEditedSvg() {
        UI.getCurrent().getPage().executeJs("""
            const svg = document.getElementById('active-svg');
            if (!svg) return;

            const clone = svg.cloneNode(true);
            clone.removeAttribute('id');

            const wrapper = document.createElementNS('http://www.w3.org/2000/svg', 'svg');
            wrapper.setAttribute('xmlns', 'http://www.w3.org/2000/svg');
            wrapper.setAttribute('viewBox', '0 0 1200 860');
            wrapper.setAttribute('width', '1200');
            wrapper.setAttribute('height', '860');
            wrapper.appendChild(clone);

            const serializer = new XMLSerializer();
            const content = serializer.serializeToString(wrapper);
            $1.$server.saveSvgFromClient(content);
        """, getElement());
    }
    private void sendToApi() {
        UI.getCurrent().getPage().executeJs("""
        const svg = document.getElementById('active-svg');
        if (!svg) return;

        const clone = svg.cloneNode(true);
        clone.removeAttribute('id');

        const wrapper = document.createElementNS('http://www.w3.org/2000/svg', 'svg');
        wrapper.setAttribute('xmlns', 'http://www.w3.org/2000/svg');
        wrapper.setAttribute('viewBox', '0 0 1200 860');
        wrapper.setAttribute('width', '1200');
        wrapper.setAttribute('height', '860');
        wrapper.appendChild(clone);

        const serializer = new XMLSerializer();
        const content = serializer.serializeToString(wrapper);
        $0.$server.sendSvgToApi(content);
    """, getElement());
    }
// linje 330 var 0 nå 1
   /*
    private void sendToApi() {
        UI.getCurrent().getPage().executeJs("""
            const svg = document.getElementById('active-svg');
            if (!svg) return;

            const clone = svg.cloneNode(true);
            clone.removeAttribute('id');

            const wrapper = document.createElementNS('http://www.w3.org/2000/svg', 'svg');
            wrapper.setAttribute('xmlns', 'http://www.w3.org/2000/svg');
            wrapper.setAttribute('viewBox', '0 0 1200 860');
            wrapper.setAttribute('width', '1200');
            wrapper.setAttribute('height', '860');
            wrapper.appendChild(clone);

            const serializer = new XMLSerializer();
            const content = serializer.serializeToString(wrapper);
            $1.$server.sendSvgToApi(content);
        """, getElement());

    }

    */

    @ClientCallable
    public void saveSvgFromClient(String content) {
        SvgImage image = new SvgImage();
        image.setName("redigert_" + UUID.randomUUID());
        image.setContent(content);
        image.setUserId(currentUser);
        image.setCreatedAt(LocalDateTime.now());
        repository.save(image);
        refreshGallery();
    }

    @ClientCallable
    public void sendSvgToApi(String content) {
        UI ui = UI.getCurrent();


        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);

            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("file", new ByteArrayResource(content.getBytes(StandardCharsets.UTF_8)) {
                @Override
                public String getFilename() {
                    return currentUser + "_" + System.currentTimeMillis() + ".svg";
                }
            });

            HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity<>(body, headers);
            RestTemplate restTemplate = new RestTemplate();

            ResponseEntity<String> response = restTemplate.postForEntity("https://weldit.weldit.no/api/images", request, String.class);

            if (ui != null) {
                ui.access(() -> responseLabel.setText("Respons fra API: " + response.getStatusCode()));
            }
        } catch (Exception e) {
            if (ui != null) {
                ui.access(() -> responseLabel.setText("Feil ved sending: " + e.getMessage()));
            }
        }
    }





    /*
    @ClientCallable
    public void sendSvgToApi(String content) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_XML);
            HttpEntity<String> request = new HttpEntity<>(content, headers);

            RestTemplate restTemplate = new RestTemplate();
            var response = restTemplate.exchange(
                    "https://weldit.weldit.no/NewfileAPI",
                    org.springframework.http.HttpMethod.POST,
                    request,
                    String.class
            );

            String status = "SVG sendt til API. Respons: " + response.getStatusCode();
            UI.getCurrent().access(() -> statusMessage.setText(status));

        } catch (Exception e) {
            e.printStackTrace();
            UI.getCurrent().access(() -> statusMessage.setText("Feil ved sending: " + e.getMessage()));
        }
    }




    public void sendSvgToApi(String content) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_XML);
            HttpEntity<String> request = new HttpEntity<>(content, headers);
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.postForObject("https://weldit.weldit.no/api/images", request, String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     */

    public void printCanvas() {
        UI.getCurrent().getPage().executeJs("window.print();");
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        UI.getCurrent().getPage().executeJs("""
            const canvas = document.getElementById('svg-canvas');
            canvas.addEventListener('dragover', e => {
                e.preventDefault();
            });
            canvas.addEventListener('drop', e => {
                e.preventDefault();
            });
        """
        );
    }
    private void exportCanvasToPng() {
        UI.getCurrent().getPage().executeJs("""
        const svgElement = document.getElementById("svg-canvas");
        const svgData = new XMLSerializer().serializeToString(svgElement);
        const canvas = document.createElement("canvas");
        canvas.width = svgElement.clientWidth;
        canvas.height = svgElement.clientHeight;
        const ctx = canvas.getContext("2d");

        const img = new Image();
        const svgBlob = new Blob([svgData], {type: "image/svg+xml;charset=utf-8"});
        const url = URL.createObjectURL(svgBlob);

        img.onload = () => {
            ctx.drawImage(img, 0, 0);
            URL.revokeObjectURL(url);

            const pngUrl = canvas.toDataURL("image/png");
            const a = document.createElement("a");
            a.href = pngUrl;
            a.download = "tegneomrade.png";
            document.body.appendChild(a);
            a.click();
            document.body.removeChild(a);
        };
        img.src = url;
    """);
    }
    private void exportCanvasToPdf() {
        UI.getCurrent().getPage().executeJs("""
        const svgElement = document.getElementById("svg-canvas");
        const svgData = new XMLSerializer().serializeToString(svgElement);
        const canvas = document.createElement("canvas");
        canvas.width = svgElement.clientWidth;
        canvas.height = svgElement.clientHeight;
        const ctx = canvas.getContext("2d");

        const img = new Image();
        const svgBlob = new Blob([svgData], {type: "image/svg+xml;charset=utf-8"});
        const url = URL.createObjectURL(svgBlob);

        img.onload = () => {
            ctx.drawImage(img, 0, 0);
            URL.revokeObjectURL(url);

            const imgData = canvas.toDataURL("image/png");
            const pdf = new jspdf.jsPDF({
                orientation: "landscape",
                unit: "pt",
                format: [canvas.width, canvas.height]
            });
            pdf.addImage(imgData, 'PNG', 0, 0, canvas.width, canvas.height);
            pdf.save("tegneomrade.pdf");
        };
        img.src = url;
    """);
    }

}

