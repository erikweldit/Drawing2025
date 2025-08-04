package com.example.application.app;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;

@Route("zooom")
public class ZooomView extends VerticalLayout {

    public ZooomView() {
        NumberField zoomLevel = new NumberField("Zoom nivå");
        zoomLevel.setValue(1.0);
        zoomLevel.setStep(0.1);

        Div svgContainer = new Div();
        svgContainer.setId("svgContainer");
        svgContainer.getElement().setProperty("innerHTML", """
            <svg id='svgCanvas' width='400' height='400' viewBox='0 0 100 100'>
                <circle cx='50' cy='50' r='40' stroke='black' stroke-width='2' fill='red' />
            </svg>
        """);

        Button zoomButton = new Button("Zoom SVG", event -> {
            double zoom = zoomLevel.getValue();
            UI.getCurrent().getPage().executeJs(
                    "document.getElementById('svgCanvas').setAttribute('transform', 'scale(' + $0 + ')');", zoom
            );
        });

        Button resetButton = new Button("Tilbakestill zoom", event -> {
            UI.getCurrent().getPage().executeJs(
                    "document.getElementById('svgCanvas').setAttribute('transform', 'scale(1)');"
            );
        });

        add(zoomLevel, zoomButton, resetButton, svgContainer);
    }
}

