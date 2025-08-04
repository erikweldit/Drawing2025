package com.example.application.coonvert;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;

@Route("zoomViewSvg")
public class ZoomViewSvg extends VerticalLayout {

    public ZoomViewSvg() {
        NumberField zoomLevel = new NumberField("Zoom nivå");
        zoomLevel.setValue(1.0);
        zoomLevel.setStep(0.1);

        Button zoomButton = new Button("Zoom SVG", event -> {
            double zoom = zoomLevel.getValue();
            UI.getCurrent().getPage().executeJs(
                    "document.querySelector('svg').setAttribute('transform', 'scale(' + $0 + ')');", zoom
            );
        });

        Button resetButton = new Button("Tilbakestill zoom", event -> {
            UI.getCurrent().getPage().executeJs(
                    "document.querySelector('svg').setAttribute('transform', 'scale(1)');"
            );
        });

        add(zoomLevel, zoomButton, resetButton);
    }
}
