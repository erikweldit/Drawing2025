package com.example.application.zoom;

import com.vaadin.flow.component.Svg;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.DomEvent;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import elemental.json.JsonObject;

import com.vaadin.flow.component.dependency.JsModule;

@Route("svgviewnew")
@JsModule("./svg-import.js")
public class SvgView extends VerticalLayout {

    public SvgView() {
        Svg svg = new Svg();
        svg.getElement().getStyle().set("width", "800px");
        svg.getElement().getStyle().set("height", "600px");
        svg.getElement().setAttribute("viewBox", "0 0 800 600");

        add(createControlBar(svg), svg);
        svg.getElement().executeJs("this.enablePan(); this.enableZoom();");

        // Last inn fire mini-SVGer
        String[][] parts = {
                {"frontend/svg/part1.svg", "0", "0"},
                {"frontend/svg/part2.svg", "400", "0"},
                {"frontend/svg/part3.svg", "0", "300"},
                {"frontend/svg/part4.svg", "400", "300"}
        };
        for (var p : parts) {
            svg.getElement().executeJs(
                    "window.loadInlineSvg(this, $0, $1, $2, 380, 280)",
                    p[0], Integer.parseInt(p[1]), Integer.parseInt(p[2])
            );
        }

        svg.getElement()
                .addEventListener("click", this::handleClick)
                .addEventData("event.offsetX")
                .addEventData("event.offsetY");
    }

    private void handleClick(DomEvent event) {
        JsonObject d = event.getEventData();
        Notification.show(String.format("Klikk pos: (%.1f, %.1f)",
                d.getNumber("event.offsetX"), d.getNumber("event.offsetY")));
    }

    private HorizontalLayout createControlBar(Svg svg) {
        Button in = new Button("+", e ->
                svg.getElement().executeJs("this.zoom(this.getZoom()*1.2)")
        );
        Button out = new Button("–", e ->
                svg.getElement().executeJs("this.zoom(this.getZoom()/1.2)")
        );
        Button reset = new Button("🔄", e ->
                svg.getElement().executeJs("this.resetZoom()")
        );
        return new HorizontalLayout(out, in, reset);
    }
}

