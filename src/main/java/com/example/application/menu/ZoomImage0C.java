package com.example.application.menu;
import com.example.application.Mouse.MouseBue;;
import com.example.application.app.DataHandlerLineExtra;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
//@JsModule("./zoomimage.js")
@Route("zoomimage0c")
public class ZoomImage0C extends AppLayout {   //  extends AppLayout
    double zoom;
    public ZoomImage0C() {
        CalcValues.valgIndeks = 4;
        this.zoom = 4.0/3.0;
        createHeader();
        Div svgContainer = new Div();

        String movingCurve = "<svg id='svgCanvas' width='1800' height='1290' viewBox = '0 0 1200 860' style='border:1px solid black;'>"
                + "<g id='zoomGroup'>"
                + CalcValues.startSvg
                + CalcValues.svgNew
                + CalcValues.svgBuffer
                + "</g></svg>";
        svgContainer.getElement().setProperty("innerHTML", movingCurve);
        HorizontalLayout content = new HorizontalLayout();
        content.add(svgContainer);
        setContent(content);

        svgContainer.getElement().executeJs(
                "const zoomGroup = document.getElementById('zoomGroup');" +
                        "if (zoomGroup) {" +
                        "  zoomGroup.setAttribute('transform', 'scale(' + $0 + ')');" +
                        "} else {" +
                        "  console.error('zoomGroup ikke funnet');" +
                        "}", zoom
        );

     UI.getCurrent().getPage().addJsModule("/zoomimage.js");
    }
    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");
        Button myButton = new Button("Finished drawing curv");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  new MouseBue(); } );
        Image imga = new Image("icons/logo.png", "logo");
        imga.setWidth("40px");
        imga.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );
        HorizontalLayout menuBar = new HorizontalLayout( myButton);
        menuBar.setSpacing(true);
        HorizontalLayout header = new HorizontalLayout(title, menuBar);
        header.setWidthFull();
        header.setAlignItems(FlexComponent.Alignment.CENTER);
        header.setPadding(true);
        addToNavbar(header); // Legger det til i toppen
    }
    @ClientCallable
    public void updateLineData(String jsonData) {
        // System.out.println("Oppdaterte linjepunkter ord: " + jsonData);
        DataHandlerLineExtra.processCurvePoints(jsonData);
    }
}