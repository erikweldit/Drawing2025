package com.example.application.images;


import com.example.application.Mouse.MouseLine;
import com.example.application.app.DataHandlerLine;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.auth.AnonymousAllowed;


@AnonymousAllowed
@Route(value = "linezoom" , layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Drawing zoom ")
public class DrawLineViewZoom extends VerticalLayout {

    public DrawLineViewZoom() {

        com.vaadin.flow.component.button.Button myButton = new Button("Finish zooming");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  new MouseLine(); } );
       add(myButton);


        /// ////////////////////
        NumberField zoomLevel = new NumberField("Zoom nivå");
        zoomLevel.setValue(1.0);
        zoomLevel.setStep(0.1);

        Div svgContainer = new Div();
        svgContainer.setId("svgContainer");

        Button zoomButton = new Button("Zoom SVG", event -> {
            double zoom = zoomLevel.getValue();
            UI.getCurrent().getPage().executeJs(
                    "document.getElementById('svgCanvas ').setAttribute('transform', 'scale(' + $0 + ')');", zoom
            );
        });

        Button resetButton = new Button("Tilbakestill zoom", event -> {
            UI.getCurrent().getPage().executeJs(
                    "document.getElementById('#svgCanvas g').setAttribute('transform', 'scale(1)');"    );
        });
        String movingCurve =  "<svg id='svgCanvas' width='1200' height='860' viewBox = '0 0 1200 860'  style='border:1px solid black;'>" ;
        svgContainer.getElement().setProperty("innerHTML", movingCurve + CalcValues.startSvg + CalcValues.svgNew + CalcValues.svgBuffer
        );
        HorizontalLayout hl = new HorizontalLayout(
                zoomLevel, zoomButton, resetButton);
        add(hl);



        add(
                svgContainer);
    }




}


