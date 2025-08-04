package com.example.application.menu;

import com.example.application.html.EmptyString;
import com.example.application.Mouse.ChangePlot3;
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

@Route("zoomjust")
public class zoomjust extends AppLayout {   //  extends AppLayout
    double zoom;

    public zoomjust() {
        CalcValues.valgIndeks = 4;
        zoom= 1.0;
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
        this.getElement().executeJs("""
                const svg = document.getElementById("svgCamvas");
                  const svg = document.getElementById("zoomGroup");
                let viewBox = { x: 0, y: 0, width: 300, height: 200 };
                
                // Flytt høyre
                function panRight() {
                  viewBox.x += 10;
                  updateViewBox();
                }
                
                // Flytt ned
                function panDown() {
                  viewBox.y += 10;
                  updateViewBox();
                }
                
                function updateViewBox() {
                  svg.setAttribute("viewBox", `${viewBox.x} ${viewBox.y} ${viewBox.width} ${viewBox.height}`);
                }
                
                """
        );
    }

    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");
        // Menyvalgene
        // RouterLink home = new RouterLink("Hjem", Home.class);
        Image imga = new Image("icons/logo.png", "logo");
        imga.setWidth("40px");
        imga.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );

        Button skille = new Button("*");
        skille.setWidth("10px");

        Button home =new Button("Home");
        home.setWidth("40px");
        home.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );

        Button myButton = new Button("Finished zooming");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> { UI.getCurrent().getPage().setLocation("Image");} );

        Button     myButttonDraw = new Button("Draw");
        myButttonDraw.addClassName("my-button");
        myButttonDraw.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoomimage0"); } );

        Button     myButttonLU = new Button("Left upper");
        myButttonLU.addClassName("my-button");
        myButttonLU.addClickListener(click -> { CalcValues.placing = 1; } );

        Button     myButttonRU = new Button("Right  upper");
        myButttonRU.addClassName("my-button");
        myButttonRU.addClickListener(click -> { CalcValues.placing = 2; } );

        Button     myButttonLL = new Button("Left  lower");
        myButttonLL.addClassName("my-button");
        myButttonLL.addClickListener(click -> { CalcValues.placing = 3; } );

        Button     myButttonRL = new Button("Right lower");
        myButttonRL.addClassName("my-button");
        myButttonRL.addClickListener(click -> { CalcValues.placing = 4; } );

        Button     myButttonC = new Button("Center");
        myButttonC.addClassName("my-button");
        myButttonC.addClickListener(click -> { CalcValues.placing = 0; } );

        Button     myTransfer = new Button("Transfer");
        myTransfer.addClassName("my-button");
        myTransfer.addClickListener(click -> { UI.getCurrent().getPage().setLocation("print"); } );

        Button     myIdent = new Button("New name");
        myIdent.addClassName("my-button");
        myIdent.addClickListener(click -> { UI.getCurrent().getPage().setLocation("NewIdent"); } );

        Button     mySymbol = new Button("Weld symbol");
        mySymbol.addClassName("my-button");
        mySymbol.addClickListener(click -> { UI.getCurrent().getPage().setLocation("symbol");  } );

        Button myButtonMove = new Button("Move" );
        myButtonMove.addClassName("my-button");
        myButtonMove.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoomimage4"); } );

        myButton = new Button("Move symbol");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  UI.getCurrent().getPage().setLocation("zoomimage4S"); } );

        Button myButtonDelete = new Button("Delete");
        myButtonDelete.addClassName("my-button");
        myButtonDelete.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoomimage2");  } );

        Button myButtonText = new Button("Text");
        myButtonText.addClassName("my-button");
        myButtonText.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoomimage6");  } );

        Button myButtonZoom = new Button("Zooming Up");
        myButtonZoom.addClassName("my-button");
        myButtonZoom.addClickListener(click -> {
            //   CalcValues.zoomIndex = 1.4;
            UI.getCurrent().getPage().setLocation("zoommenue");} );

        Button myButtonSymbol = new Button("Symbol");
        myButtonSymbol.addClassName("my-button");
        myButtonSymbol.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoomimage3");  } );

        Button myButtonLine = new Button("Line");
        myButtonLine.addClassName("my-button");
        myButtonLine.addClickListener(click -> {  UI.getCurrent().getPage().setLocation("zoomimage1"); } );

        Button myButtonPlace1 = new Button("Buffer#1");
        myButtonPlace1.addClassName("my-button");
        myButtonPlace1.addClickListener(click -> {
            CalcValues.placing = 1;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            CalcValues.bufferId[1] = oldPlotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");


            //       UI.getCurrent().getPage().setLocation("zoomimageplacing");

        } );

        Button myButtonPlace2 = new Button("Buffer#2");
        myButtonPlace2.addClassName("my-button");
        myButtonPlace2.addClickListener(click -> {
            CalcValues.placing = 2;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            CalcValues.bufferId[2] = oldPlotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");


            //       UI.getCurrent().getPage().setLocation("zoomimageplacing");

        } );
        Button myButtonPlace3 = new Button("Buffer#3");
        myButtonPlace3.addClassName("my-button");
        myButtonPlace3.addClickListener(click -> {
            CalcValues.placing = 3;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            CalcValues.bufferId[3] = oldPlotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");


            //       UI.getCurrent().getPage().setLocation("zoomimageplacing");

        } );
        Button myButtonPlace4 = new Button("Buffer#4");
        myButtonPlace4.addClassName("my-button");
        myButtonPlace4.addClickListener(click -> {
            CalcValues.placing = 4;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            CalcValues.bufferId[4] = oldPlotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            new EmptyString();
            //     UI.getCurrent().getPage().setLocation("emptystring");
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");


            //       UI.getCurrent().getPage().setLocation("zoomimageplacing");

        } );
        Button myButtonPlace0 = new Button("Buffer size");
        myButtonPlace0.addClassName("my-button");
        myButtonPlace0.addClickListener(click -> {
            CalcValues.placing = 0;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 1.4;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            CalcValues.bufferId[0] = oldPlotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");


            //       UI.getCurrent().getPage().setLocation("zoomimageplacing");

        } );
        // Legg menyvalgene i en horisontal layout

        HorizontalLayout menuBar = new HorizontalLayout();
        if (CalcValues.gang[2] == 14) {
            menuBar = new HorizontalLayout(imga, home,  myButttonDraw,   myButtonMove ,  myButtonDelete , myButtonSymbol, myButtonLine ,
                    myIdent, mySymbol, myButtonPlace0, myTransfer );
        } else{
            menuBar = new HorizontalLayout(imga, home,  myButttonDraw,   myButtonMove ,  myButtonDelete , myButtonSymbol, myButtonLine ,
                    myIdent, mySymbol, myButtonZoom , myButtonPlace1, myButtonPlace2, myButtonPlace3, myButtonPlace4, myTransfer );
        }



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


}







