package com.example.application.zoom;

import com.vaadin.flow.component.Svg;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.dom.DomEvent;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import elemental.json.JsonObject;


@Route("mockup")
public class SvgMockupView extends VerticalLayout {

    public SvgMockupView() {
        Svg svg = new Svg();
        svg.getElement().getStyle().set("width", "800px");
        svg.getElement().getStyle().set("height", "600px");
        svg.getElement().setAttribute("viewBox", "0 0 800 600");

        for (int i = 0; i < 4; i++) {
            int x = (i % 2) * 400;
            int y = (i / 2) * 300;

            // Opprett rektangel
            Element rect = new Element("rect");
            rect.setAttribute("x", String.valueOf(x));
            rect.setAttribute("y", String.valueOf(y));
            rect.setAttribute("width", "380");
            rect.setAttribute("height", "280");
            rect.setAttribute("fill", "#e0e0e0");
            rect.setAttribute("stroke", "#444");
            rect.setAttribute("stroke-width", "2");
            svg.getElement().appendChild(rect);

            // Opprett tekst
            Element text = new Element("text");
            text.setAttribute("x", String.valueOf(x + 190));
            text.setAttribute("y", String.valueOf(y + 150));
            text.setAttribute("text-anchor", "middle");
            text.setAttribute("font-size", "24");
            text.setText("Del " + (i + 1));
            svg.getElement().appendChild(text);
        }

        add(createControlBar(svg), svg);

        svg.getElement().executeJs("this.enablePan(); this.enableZoom();");

        svg.getElement()
                .addEventListener("click", this::handleClick)
                .addEventData("event.offsetX")
                .addEventData("event.offsetY");
    }

    private void handleClick(DomEvent event) {
        JsonObject data = event.getEventData();
        double x = data.getNumber("event.offsetX");
        double y = data.getNumber("event.offsetY");
        Notification.show(String.format("Klikk pos: (%.1f, %.1f)", x, y));
    }

    private HorizontalLayout createControlBar(Svg svg) {
        Button zoomIn = new Button("+", e ->
                svg.getElement().executeJs("this.zoom(this.getZoom()*1.2)")
        );
        Button zoomOut = new Button("–", e ->
                svg.getElement().executeJs("this.zoom(this.getZoom()/1.2)")
        );
        Button reset = new Button("🔄", e ->
                svg.getElement().executeJs("this.resetZoom()")
        );

        return new HorizontalLayout(zoomOut, zoomIn, reset);
    }
}
