package com.example.application.menu;

import com.example.application.Mouse.ChangePlot3;
import com.example.application.Mouse.MouseBue;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("zoomimageplacing")
public class ZoomImagePlacing extends AppLayout {   //  extends AppLayout
    double zoom;

    public ZoomImagePlacing() {
        CalcValues.valgIndeks = 4;
        zoom= 4.0/3.0;
        createHeader();

        Div svgContainer = new Div();
        String movingCurve = "<svg id='svgCanvas' width='1800' height='1290' viewBox = '0 0 1200 860' style='border:1px solid black;'>"
                + "<g id='zoomGroup'>"; // Legg til en gruppe for zooming
        svgContainer.getElement().setProperty("innerHTML", movingCurve + CalcValues.startSvg + CalcValues.svgNew + CalcValues.svgBuffer
                + "</g></svg>");
        //     System.out.println("type  " + CalcValues.gang[2]);
        HorizontalLayout content = new HorizontalLayout();

        UI.getCurrent().getPage().executeJs(
                "let zoomGroup = document.getElementById('svgCanvas');" +
                        "if (zoomGroup) {" +
                        "    zoomGroup.setAttribute('transform', 'scale(' + $0 + ')');" +
                        "} else {" +
                        "    console.error('Element med ID zoomGroup ikke funnet!');" +
                        "}", zoom);

        content.add(svgContainer);
        setContent(content);
    }
/*
    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");
        // Menyvalgene
        // RouterLink home = new RouterLink("Hjem", Home.class);
        Image imga = new Image("icons/logo.png", "logo");
        imga.setWidth("40px");
        imga.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );

        Button home =new Button("Home");
        home.setWidth("40px");
        home.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );

        Button myButton = new Button("Finished zooming");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> { UI.getCurrent().getPage().setLocation("Image");} );

        Button     myButttonDraw = new Button("Draw string");
        myButttonDraw.addClassName("my-button");
        myButttonDraw.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoomimage0"); } );

        Button     myButttonLU = new Button("Left upper");
        myButttonLU.addClassName("my-button");
        myButttonLU.addClickListener(click -> {
            CalcValues.placing = 1;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );

        Button     myButttonRU = new Button("Right  upper");
        myButttonRU.addClassName("my-button");
        myButttonRU.addClickListener(click -> {
            CalcValues.placing = 2;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );

        Button     myButttonLL = new Button("Left  lower");
        myButttonLL.addClassName("my-button");
        myButttonLL.addClickListener(click -> {
            CalcValues.placing = 3;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );

        Button     myButttonRL = new Button("Right lower");
        myButttonRL.addClassName("my-button");
        myButttonRL.addClickListener(click -> {
            CalcValues.placing = 4;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );

        Button     myButttonC = new Button("Center");
        myButttonC.addClassName("my-button");
        myButttonC.addClickListener(click -> {
            CalcValues.placing = 0;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );

        Button myButtonMove = new Button("Move string " );
        myButtonMove.addClassName("my-button");
        myButtonMove.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoomimage4"); } );

        myButton = new Button("Move symbol");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  UI.getCurrent().getPage().setLocation("zoomimage4S"); } );

        Button myButtonDelete = new Button("Delete string");
        myButtonDelete.addClassName("my-button");
        myButtonDelete.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoomimage2");  } );

        Button myButtonZoom = new Button("Zooming Up");
        myButtonZoom.addClassName("my-button");
        myButtonZoom.addClickListener(click -> {
            //   CalcValues.zoomIndex = 1.4;
            UI.getCurrent().getPage().setLocation("zoommenue");} );

        Button myButtonSymbol = new Button("Welding Symbol");
        myButtonSymbol.addClassName("my-button");
        myButtonSymbol.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoomimage3");  } );

        Button myButtonLine = new Button("Drawing line");
        myButtonLine.addClassName("my-button");
        myButtonLine.addClickListener(click -> {  UI.getCurrent().getPage().setLocation("zoomimage1"); } );

        Button myButtonPlace = new Button("Placing");
        myButtonPlace.addClassName("my-button");
        myButtonPlace.addClickListener(click -> {


            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );

        // Legg menyvalgene i en horisontal layout
        HorizontalLayout menuBar = new HorizontalLayout(imga, home, 
                myButttonC, myButttonLU, myButttonRU, myButttonLL,myButttonRL);
        menuBar.setSpacing(true);
        //   HorizontalLayout menuBarAlter = new HorizontalLayout(imga,  myButttonDraw,   myButtonMove ,  myButtonDelete , myButtonSymbol, myButtonLine ,
        //         myButtonZoom );
        //    menuBarAlter.setSpacing(true);
        //   menuBar.getStyle().set("margin-left", "auto"); // Skyver menyen til høyre

        // Topplinje med tittel og meny
        HorizontalLayout header = new HorizontalLayout(title,  menuBar);
        //      HorizontalLayout     headerAlt = new HorizontalLayout(title, menuBarAlter);

        header.setWidthFull();
        header.setAlignItems(FlexComponent.Alignment.CENTER);
        header.setPadding(true);

        //   headerAlt.setWidthFull();
        //   headerAlt.setAlignItems(FlexComponent.Alignment.CENTER);
        //   headerAlt.setPadding(true);

        //      header.getStyle().set("background", "#333").set("color", "white");

        addToNavbar(header); // Legger det til i toppen
    }



 */


    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");
        // Menyvalgene
        // RouterLink home = new RouterLink("Hjem", Home.class);

        Button myButton = new Button("Finished drawing curv");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  new MouseBue(); } );

        Button myButtonPlace1 = new Button("Placing 1");
        myButtonPlace1.addClassName("my-button");
        myButtonPlace1.addClickListener(click -> {
            CalcValues.placing = 1;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );
        Button myButtonPlace2 = new Button("Placing 2");
        myButtonPlace2.addClassName("my-button");
        myButtonPlace2.addClickListener(click -> {
            CalcValues.placing = 2;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );
        Button myButtonPlace3 = new Button("Placing 3");
        myButtonPlace3.addClassName("my-button");
        myButtonPlace3.addClickListener(click -> {
            CalcValues.placing = 3;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );
        Button myButtonPlace4 = new Button("Placing 4");
        myButtonPlace4.addClassName("my-button");
        myButtonPlace4.addClickListener(click -> {
            CalcValues.placing = 4;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );
        Button myButtonPlace = new Button("Placing center");
        myButtonPlace.addClassName("my-button");
        myButtonPlace.addClickListener(click -> {
            CalcValues.placing = 0;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");
        } );

        Image imga = new Image("icons/logo.png", "logo");
        imga.setWidth("40px");
        imga.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );

        Button home =new Button("Home");
        home.setWidth("40px");
        home.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );

        // Legg menyvalgene i en horisontal layout
 //       HorizontalLayout menuBar = new HorizontalLayout( home,  myButtonPlace1);
  //      menuBar.setSpacing(true);
        //   menuBar.getStyle().set("margin-left", "auto"); // Skyver menyen til høyre

        // Topplinje med tittel og meny
        HorizontalLayout header = new HorizontalLayout(title, imga, home,  myButtonPlace1);
        header.setWidthFull();
        header.setAlignItems(FlexComponent.Alignment.CENTER);
        header.setPadding(true);
        //      header.getStyle().set("background", "#333").set("color", "white");
        addToNavbar(header); // Legger det til i toppen
    }


}

