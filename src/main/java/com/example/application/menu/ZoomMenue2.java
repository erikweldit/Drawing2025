package com.example.application.menu;

import com.example.application.Mouse.MouseReleased;
import com.example.application.app.DataHandlerLineExtra;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import com.example.application.Mouse.MouseBue;
import java.awt.*;

@Route("zoommenue2")
public class ZoomMenue2 extends AppLayout {   //  extends AppLayout
    double zoom;
int x;
int y;
Point relPoint = new Point(0,0);
    public ZoomMenue2() {
        CalcValues.valgIndeks = 3;
        this.zoom = 2.0;
        createHeader();

        Div svgContainer = new Div();
        String movingCurve = "<svg id='svgCanvas' width='1800' height='1290' viewBox = '0 0 1200 860' style='border:1px solid black;'>"
                + "<g id='zoomGroup'>"; // Legg til en gruppe for zooming
        svgContainer.getElement().setProperty("innerHTML", movingCurve + CalcValues.startSvg + CalcValues.svgNew + CalcValues.svgBuffer
                + "</g></svg>");
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
                        "let firstClick = null ;" +

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
                        //        "      drawCircle(firstClick);" +
                        //               "    } else if (!secondClick) {" +
                        //           "      secondClick = pos ;" +
                        //      "      drawCircle(secondClick);" +
                        //      "    } else { " +
                        //       "      thirdClick = pos ;" +
                        //     "      drawCircle(thirdClick);" +
                        //     "      drawBezierCurve();" +
                        "      sendLineToServer(firstClick);" +
                        "      firstClick =  null;" +
                        "    }" +
                        "  }" +
                        // Send data til serveren
                        "  function sendLineToServer(start, middle, end) {" +
                        "    const lineData = {" +
                        "      startX: start.x / 3, startY: start.y / 3," +
                        //            "      middleX: middle.x / 3, middleY: middle.y / 3," +
                        //           "      endX: end.x / 3, endY: end.y / 3" +
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

        Button myButton = new Button("Finished delete");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  new MouseBue(); } );
        com.vaadin.flow.component.html.Image imga = new Image("icons/logo.png", "logo");
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
    //       System.out.println("Oppdaterte linjepunkter: " + jsonData);
        // Her kan du prosessere dataen videre hvis ønskelig
  //      DataHandlerLineExtra.processCurvePoints(jsonData);
        int i = jsonData.indexOf(":", 0 );
        int j = jsonData.indexOf(",", 0 );
        int skille = jsonData.indexOf(",", 0 );
        //     System.out.println(jsonData.substring(i+1,j));
        int k = jsonData.indexOf(":", skille );
        int l = jsonData.indexOf("}", skille );

        //    System.out.println(jsonData.substring(k+1,l));
        double xx = Double.parseDouble(jsonData.substring(i+1,j));
        double yy = Double.parseDouble(jsonData.substring(k+1,l));
        int x = (int) xx;
        int y = (int) yy;
        relPoint.x = x;
        relPoint.y = y;
    //    System.out.println(relPoint);
        new MouseReleased(relPoint);
    }

}





