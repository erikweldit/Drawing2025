package com.example.application.coonvert;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;

@Route("zoomsvg1")
public  class ZoomSvg extends VerticalLayout {

    public ZoomSvg() {

        NumberField zoomLevel = new NumberField("Zoom nivå");
        zoomLevel.setValue(2.0);
        zoomLevel.setStep(0.1);

        Div svgContainer = new Div();
        svgContainer.setId("svgContainer");
        svgContainer.getElement().setProperty("innerHTML", """
            <svg id='svgCanvas' width='800' height='800' viewBox='300 300 500 500'>
                <circle cx='350' cy='350' r='40' stroke='black' stroke-width='2' fill='red' />
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


