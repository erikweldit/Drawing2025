package com.example.application.menu;

import com.example.application.Mouse.ChangePlot;
import com.example.application.Mouse.ChangePlot3;
import com.example.application.Mouse.MouseBue;
import com.example.application.app.DataHandlerLine;
import com.example.application.app.DataHandlerLineExtra;
import com.example.application.html.EmptyString;
import com.example.application.html.ThymeleafExampleView;
import com.example.application.weld.CalcValues;
import com.example.application.weld.Home;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route("zoommenue")
public class ZoomMenue extends AppLayout {   //  extends AppLayout
    double zoom;

    public ZoomMenue() {
        CalcValues.valgIndeks = 3;
        this.zoom = 2.0;
        createHeader();
// definerer venstemarg
        /*
        VerticalLayout ver  = new VerticalLayout();
        DrawerToggle toggle = new DrawerToggle();
        Tabs menuTabs = new Tabs(
                new Tab("Hjem"),
                new Tab("Zoom"),
                new Tab("Om")
        );
       addToDrawer(menuTabs);
        addToNavbar(toggle);
         */

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


    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");
        // Menyvalgene
        // RouterLink home = new RouterLink("Hjem", Home.class);
        Image imga = new Image("icons/logo.png", "logo");
        imga.setWidth("40px");
        imga.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );
        Button myButtonPlace34 = new Button("Buffer#3 + #4");
        myButtonPlace34.addClassName("my-button");
        myButtonPlace34.addClickListener(click -> {
            CalcValues.placing = 7;
            CalcValues.plotModell = CalcValues.placing;
            CalcValues.zoomIndex = 2.8;
            CalcValues.valgIndeks = 1;
            int oldPlotIndicator = CalcValues.plotIndicator;
            CalcValues.bufferId[4] = oldPlotIndicator;
            CalcValues.bufferId[3] = oldPlotIndicator;
            new ChangePlot3(CalcValues.plotModell,oldPlotIndicator);
            new EmptyString();
            //     UI.getCurrent().getPage().setLocation("/thymeleaf-example");
            new ThymeleafExampleView();
        } );
        Button home =new Button("Home");
        home.setWidth("40px");
        home.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );

        Button myButton = new Button("Finished zooming");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> { UI.getCurrent().getPage().setLocation("Image");} );

        Button     myTransfer = new Button("Save");
        myTransfer.addClassName("my-button");
        myTransfer.addClickListener(click -> { UI.getCurrent().getPage().setLocation("base"); } );

        Button     myButttonDraw = new Button("Draw");
        myButttonDraw.addClassName("my-button");
        myButttonDraw.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoommenue0"); } );

        Button myButtonMove = new Button("Move" );
        myButtonMove.addClassName("my-button");
        myButtonMove.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoommenue4"); } );

        myButton = new Button("Move symbol");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  UI.getCurrent().getPage().setLocation("zoommenue4S"); } );

        Button myButtonDelete = new Button("Delete");
        myButtonDelete.addClassName("my-button");
        myButtonDelete.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoommenue2");  } );

        Button myButtonZoom = new Button("Finhishng zooming");
        myButtonZoom.addClassName("my-button");
        myButtonZoom.addClickListener(click -> {
            CalcValues.zoomIndex = 1.4;
            UI.getCurrent().getPage().setLocation("zoomimage");} );

        Button myButtonSymbol = new Button("Symbol");
        myButtonSymbol.addClassName("my-button");
        myButtonSymbol.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoommenue3");  } );

        Button     myIdent = new Button("New name");
        myIdent.addClassName("my-button");
        myIdent.addClickListener(click -> { UI.getCurrent().getPage().setLocation("NewIdent"); } );

        Button myButtonWeld = new Button("Weld symbol");
        myButtonWeld.addClassName("my-button");
        myButtonWeld.addClickListener(click -> { UI.getCurrent().getPage().setLocation("symbol");  } );

        Button myButtonLine = new Button("Line");
        myButtonLine.addClassName("my-button");
        myButtonLine.addClickListener(click -> {  UI.getCurrent().getPage().setLocation("zoommenue1"); } );

        Button myButtonCut = new Button("Cut");
        myButtonCut.addClassName("my-button");
        myButtonCut.addClickListener(click -> {  UI.getCurrent().getPage().setLocation("zoommenuecut"); } );

        Button myButtonPlace = new Button("Placing");
        myButtonPlace.addClassName("my-button");
        myButtonPlace.addClickListener(click -> {  new ChangePlot3(2,1); } );
        // Legg menyvalgene i en horisontal layout
        if (CalcValues.plotType.equals("butt") || CalcValues.plotType.equals("Butt")) {
            HorizontalLayout menuBar = new HorizontalLayout(imga, home, myButttonDraw, myButtonMove, myButtonDelete, myButtonSymbol,
                    myButtonLine, myIdent, myButtonWeld, myButtonZoom, myTransfer, myButtonCut, myButtonPlace34);
            menuBar.setSpacing(true);
            HorizontalLayout header = new HorizontalLayout(title, menuBar);
            header.setWidthFull();
            header.setAlignItems(FlexComponent.Alignment.CENTER);
            header.setPadding(true);
            //      header.getStyle().set("background", "#333").set("color", "white");
            addToNavbar(header); // Legger det til i toppen
        } else {
            HorizontalLayout menuBar = new HorizontalLayout(imga, home, myButttonDraw, myButtonMove, myButtonDelete, myButtonSymbol,
                    myButtonLine, myIdent , myButtonWeld, myButtonZoom, myTransfer, myButtonCut );
            menuBar.setSpacing(true);
            HorizontalLayout header = new HorizontalLayout(title, menuBar);
            header.setWidthFull();
            header.setAlignItems(FlexComponent.Alignment.CENTER);
            header.setPadding(true);
            //      header.getStyle().set("background", "#333").set("color", "white");
            addToNavbar(header); // Legger det til i toppen
        }

        //   menuBar.getStyle().set("margin-left", "auto"); // Skyver menyen til høyre

        // Topplinje med tittel og meny


    }

    @ClientCallable
    public void updateLineData(String jsonData) {
     //   System.out.println("Oppdaterte linjepunkter: " + jsonData);
        // Her kan du prosessere dataen videre hvis ønskelig
        DataHandlerLineExtra.processCurvePoints(jsonData);
    }

}




