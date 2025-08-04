package com.example.application.menu;

import com.example.application.html.EmptyString;
import com.example.application.Mouse.ChangePlot3;
import com.example.application.weld.CalcValues;
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
@JsModule("./svg-panzoom.js")
@Route("responsiv")
public class Responsivvg extends AppLayout {   //  extends AppLayout
    double zoom;

    public Responsivvg() {
        CalcValues.valgIndeks = 4;
        zoom= 4.0/3.0;
        createHeader();

        Div svgContainer = new Div();
        String movingCurve = "<svg id='svgCanvas' width='100%' height='100%' viewBox = '0 0 1200 860' style='border:1px solid black;'>"
                + "<g id='zoomGroup'>"; // Legg til en gruppe for zooming
        svgContainer.getElement().setProperty("innerHTML", movingCurve + CalcValues.startSvg + CalcValues.svgNew + CalcValues.svgBuffer
                + "</g></svg>");
        //     System.out.println("type  " + CalcValues.gang[2]);
        HorizontalLayout content = new HorizontalLayout();


        content.add(svgContainer);
        setContent(content);

        getElement().executeJs("""
                  const svg = document.getElementById(svgCanvas);
                
                  // Konfigurasjon med standardverdier
                  const minZoom = options.minZoom || 0.1;
                  const maxZoom = options.maxZoom || 10;
                  const originalViewBox = { x: 0, y: 0, width: 1200, height: 860 };
                  let viewBox = { ...originalViewBox };
                
                  let isPanning = false;
                  let start = { x: 0, y: 0 };
                
                  function updateViewBox() {
                    svg.setAttribute("viewBox", `${viewBox.x} ${viewBox.y} ${viewBox.width} ${viewBox.height}`);
                  }
                
                  function resetViewBox() {
                    viewBox = { ...originalViewBox };
                    updateViewBox();
                  }
                
                  svg.addEventListener("wheel", (e) => {
                    e.preventDefault();
                    const zoomFactor = 1.1;
                    const scale = e.deltaY < 0 ? 1 / zoomFactor : zoomFactor;
                
                    const newWidth = viewBox.width * scale;
                    const newHeight = viewBox.height * scale;
                
                    // Beregn zoomnivå relativt til original bredde
                    const currentZoom = originalViewBox.width / newWidth;
                    if (currentZoom < minZoom || currentZoom > maxZoom) return;
                
                    const rect = svg.getBoundingClientRect();
                    const offsetX = e.clientX - rect.left;
                    const offsetY = e.clientY - rect.top;
                
                    const x = (offsetX / rect.width) * viewBox.width + viewBox.x;
                    const y = (offsetY / rect.height) * viewBox.height + viewBox.y;
                
                    viewBox.width = newWidth;
                    viewBox.height = newHeight;
                    viewBox.x = x - (x - viewBox.x) * scale;
                    viewBox.y = y - (y - viewBox.y) * scale;
                
                    updateViewBox();
                  });
                
                  svg.addEventListener("mousedown", (e) => {
                    isPanning = true;
                    start = { x: e.clientX, y: e.clientY };
                    svg.style.cursor = "grabbing";
                  });
                
                  svg.addEventListener("mousemove", (e) => {
                    if (!isPanning) return;
                    const dx = (e.clientX - start.x) * (viewBox.width / svg.clientWidth);
                    const dy = (e.clientY - start.y) * (viewBox.height / svg.clientHeight);
                    viewBox.x -= dx;
                    viewBox.y -= dy;
                    start = { x: e.clientX, y: e.clientY };
                    updateViewBox();
                  });
                
                  svg.addEventListener("mouseup", () => {
                    isPanning = false;
                    svg.style.cursor = "grab";
                  });
                
                  svg.addEventListener("mouseleave", () => {
                    isPanning = false;
                    svg.style.cursor = "grab";
                  });
                
                  updateViewBox();
                  svg.style.cursor = "grab";
                
                  // Returner et API for ekstern kontroll
                  return {
                    reset: resetViewBox
                  };
                
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

        Button     myTransfer = new Button("Save");
        myTransfer.addClassName("my-button");
        myTransfer.addClickListener(click -> { UI.getCurrent().getPage().setLocation("base"); } );

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






