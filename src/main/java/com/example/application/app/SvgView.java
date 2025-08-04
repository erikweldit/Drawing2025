package com.example.application.app;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("/svgview")
public class SvgView extends VerticalLayout {
/*
    private static final double SCALE_FACTOR = 0.25; // 1:4 skala

    public SvgView() {
        add(createSvgComponent());
    }

    private Div createSvgComponent() {
        String originalSvg = loadSvg(); // Hent SVG-innhold
        String scaledSvg = scaleSvg(originalSvg, SCALE_FACTOR); // Skaler SVG

        StreamResource resource = new StreamResource("image.svg",
                () -> new ByteArrayInputStream(scaledSvg.getBytes(StandardCharsets.UTF_8)));

        Image svgImage = new Image(resource, "Scaled SVG");
        svgImage.setWidth("100%"); // Holder bredde fleksibel
        svgImage.setHeight("auto"); // Bevarer aspektforhold

        Div container = new Div(svgImage);
        container.setSizeFull();

        return container;
    }

    private String loadSvg() {
        return """
            <svg width="400" height="400" viewBox="0 0 400 400" xmlns="http://www.w3.org/2000/svg">
                <rect width="400" height="400" fill="blue"/>
                <circle cx="200" cy="200" r="100" fill="red"/>
            </svg>
            """;
    }

    private String scaleSvg(String svgContent, double scaleFactor) {
        return svgContent.replaceAll("width=\"(\\d+)\"", m ->
                        "width=\"" + (int)(Integer.parseInt(m.group(1)) * scaleFactor) + "\"")
                .replaceAll("height=\"(\\d+)\"", m ->
                        "height=\"" + (int)(Integer.parseInt(m.group(1)) * scaleFactor) + "\"");
    }



 */

}


