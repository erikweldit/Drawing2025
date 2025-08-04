package com.example.application.zoomdb;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.component.html.Image;

import java.util.LinkedHashMap;
import java.util.Map;

@Route("svg-viewer")
public class SvgSectorViewer extends VerticalLayout {

    private final Div imageContainer = new Div();
    private final Map<String, Image> images = new LinkedHashMap<>();

    public SvgSectorViewer() {
        setSizeFull();
        imageContainer.setWidth("800px");
        imageContainer.setHeight("800px");
        imageContainer.getStyle().set("position", "relative");
        imageContainer.getStyle().set("border", "1px solid black");

        for (int i = 0; i < 4; i++) {
            String name = "sector-" + i;
            Image image = new Image();
            image.setSrc(getSampleSvg("Sample " + (i + 1)));
            image.setAlt(name);
            image.setWidth("50%");
            image.setHeight("50%");
            image.getStyle().set("position", "absolute");
            positionImage(image, i);

            image.addClickListener(e -> bringToFront(image));
            images.put(name, image);
            imageContainer.add(image);
        }

        add(imageContainer);
    }

    private StreamResource getSampleSvg(String label) {
        return new StreamResource(label + ".svg", () -> {
            String svg = """

                <svg width='200' height='200' xmlns='http://www.w3.org/2000/svg'>
                    <rect width='200' height='200' fill='white' stroke='black'/>
                    <text x='50%' y='50%' dominant-baseline='middle' text-anchor='middle' fill='black'>" + label + "</text>
                </svg>
            """.strip();
            return new java.io.ByteArrayInputStream(svg.getBytes());
        });
    }

    private void positionImage(Image image, int index) {
        switch (index) {
            case 0 -> {
                image.getStyle().set("top", "0");
                image.getStyle().set("left", "0");
            }
            case 1 -> {
                image.getStyle().set("top", "0");
                image.getStyle().set("left", "50%");
            }
            case 2 -> {
                image.getStyle().set("top", "50%");
                image.getStyle().set("left", "0");
            }
            case 3 -> {
                image.getStyle().set("top", "50%");
                image.getStyle().set("left", "50%");
            }
        }
    }

    private void bringToFront(Image selected) {
        imageContainer.getChildren().forEach(component -> component.getElement().getStyle().remove("z-index"));
        selected.getElement().getStyle().set("z-index", "10");
        selected.setWidth("100%");
        selected.setHeight("100%");
    }
}
