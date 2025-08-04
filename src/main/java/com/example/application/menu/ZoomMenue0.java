package com.example.application.menu;


import com.example.application.Mouse.MouseBue;
import com.example.application.app.DataHandlerLine;
import com.example.application.app.DataHandlerLineExtra;
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

@Route("zoommenue0")
public class ZoomMenue0 extends AppLayout {   //  extends AppLayout
    double zoom;

    public ZoomMenue0() {
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

        this.getElement().executeJs(
                "console.log('JavaScript-koden er utført');" +
                        "let svg = document.getElementById('svgCanvas');" +
                        "let zoomGroup = document.getElementById('zoomGroup');" +
                        "let firstClick = null, secondClick = null, thirdClick = null;" +

                        "if (svg && zoomGroup) {" +
                        "  svg.addEventListener('mousedown', handleMouseDown);" +

                        // Funksjon for å hente museposisjon
                        "  function getMousePosition(event) {" +
                        "    let svgRect = svg.getBoundingClientRect();" +
                        "    return {" +
                        "      x: event.clientX - svgRect.left," +
                        "      y: event.clientY - svgRect.top" +
                        "    };" +
                        "  }" +

                        // Håndter museklikk
                        "  function handleMouseDown(event) {" +
                        "    const pos = getMousePosition(event);" +
                        "    console.log('Klikk på posisjon:', pos.x, pos.y);" +

                        "    if (!firstClick) {" +
                        "      firstClick = pos;" +
                        "      drawCircle(firstClick);" +
                        "    } else if (!secondClick) {" +
                        "      secondClick = pos ;" +
                        "      drawCircle(secondClick);" +
                        "    } else { " +
                        "      thirdClick = pos ;" +
                        "      drawCircle(thirdClick);" +
                        "      drawBezierCurve();" +
                        "      sendLineToServer(firstClick, secondClick, thirdClick);" +
                        "      firstClick = secondClick = thirdClick = null;" +
                        "    }" +
                        "  }" +

                        // Tegn en sirkel
                        "  function drawCircle(pos) {" +
                        "    const circle = document.createElementNS('http://www.w3.org/2000/svg', 'circle');" +
                        "    circle.setAttribute('cx', pos.x/3);" +
                        "    circle.setAttribute('cy', pos.y/3);" +
                        "    circle.setAttribute('r', 2);" +
                        "    circle.setAttribute('fill', 'red');" +
                        "    zoomGroup.appendChild(circle);" +
                        "  }" +

                        // Tegn Bézier-kurve
                        "  function drawBezierCurve() {" +
                        "    const path = document.createElementNS('http://www.w3.org/2000/svg', 'path');" +
                        "    const d = 'M ' + firstClick.x/3 + ',' + firstClick.y/3 + " +
                        "              ' Q ' + secondClick.x/3 + ',' + secondClick.y/3 + " +
                        "              ' ' + thirdClick.x/3 + ',' + thirdClick.y/3;" +
                        "    path.setAttribute('d', d);" +
                        "    path.setAttribute('stroke', 'black');" +
                        "    path.setAttribute('fill', 'none');" +
                        "    path.setAttribute('stroke-width', 1);" +

                        //            "    console.log('Prøver å legge til path:', path.outerHTML);" +
                        "    zoomGroup.appendChild(path);" +
                        //         "    console.log('Path lagt til i zoomGroup:', zoomGroup.innerHTML);" +
                        "  }" +

                        // Send data til serveren
                        "  function sendLineToServer(start, middle, end) {" +
                        "    const lineData = {" +
                        "      startX: start.x / 3, startY: start.y / 3," +
                        "      middleX: middle.x / 3, middleY: middle.y / 3," +
                        "      endX: end.x / 3, endY: end.y / 3" +
                        "    };" +
                        "    console.log('Sender linjepunktene til serveren:', lineData);" +
                        "    $0.$server.updateLineData(JSON.stringify(lineData));" +
                        "  }" +

                        "} else {" +
                        "  console.error('SVG-elementet eller zoomGroup ble ikke funnet');" +
                        "}"
        );


    }





    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");
        // Menyvalgene
        // RouterLink home = new RouterLink("Hjem", Home.class);

        Button myButton = new Button("Finished drawing curv");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  new MouseBue(); } );
        Image imga = new Image("icons/logo.png", "logo");
        imga.setWidth("40px");
        imga.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );

        // Legg menyvalgene i en horisontal layout
        HorizontalLayout menuBar = new HorizontalLayout(imga, myButton);
        menuBar.setSpacing(true);
        //   menuBar.getStyle().set("margin-left", "auto"); // Skyver menyen til høyre

        // Topplinje med tittel og meny
        HorizontalLayout header = new HorizontalLayout(title, menuBar);
        header.setWidthFull();
        header.setAlignItems(FlexComponent.Alignment.CENTER);
        header.setPadding(true);
        //      header.getStyle().set("background", "#333").set("color", "white");
        addToNavbar(header); // Legger det til i toppen
    }

    @ClientCallable
    public void updateLineData(String jsonData) {
     //     System.out.println("Oppdaterte linjepunkter ord: " + jsonData);
        // Her kan du prosessere dataen videre hvis ønskelig
        DataHandlerLineExtra.processCurvePoints(jsonData);
    }

}




