package com.example.application.menu;


import com.example.application.Mouse.MouseBue;
import com.example.application.Mouse.MouseLine;
import com.example.application.app.DataHandlerLine;
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

@Route("zoomimage1")
public class ZoomImage1 extends AppLayout {   //  extends AppLayout
    double zoom;

    public ZoomImage1() {
        CalcValues.valgIndeks = 4;
        this.zoom = 4.0/3.0;
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
        // Legg til SVG-elementet i UI
        //add(svgContainer);
//        System.out.println("type  " + CalcValues.gang[2]);
//       System.out.println(movingCurve + " /n/n " + CalcValues.startSvg +" /n/n " + CalcValues.svgNew + " /n/n " +CalcValues.svgBuffer);

        HorizontalLayout content = new HorizontalLayout();
        //    NumberField zoomLevel = new NumberField("Zoom nivå");
        //   zoomLevel.setValue(1.0);
        //   zoomLevel.setStep(0.1);
        /// //////////////////////////
        //      Button zoomButton = new Button("Zoom SVG", event -> {
        //   double zoom = zoomLevel.getValue();
        //     UI.getCurrent().getPage().executeJs("document.body.style.zoom = $0", zoom);


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
                        //               "    console.log('Klikk på posisjon:', pos.x, pos.y);" +

                        "    if (!firstClick) {"+  // Hvis det er første klikk, lagre posisjonen
                        "      firstClick = pos;"+
                        "       drawCircle(firstClick);"+
                        "    } else {"+  // Hvis det er andre klikk, tegn en strek
                        "      secondClick = pos;"+
                        "      drawLine(firstClick, secondClick);"+
                        "       drawCircle(secondClick);"+
                        "      sendLineToServer(firstClick, secondClick);"+  // Send linjepunktene til serveren
                        "      firstClick = secondClick = null;"+  // Nullstill etter andre klikk
                        "    }"+
                        "  }"+
                        // Funksjon for å tegne en strek


                        // Tegn en sirkel
                        "  function drawCircle(pos) {" +
                        "    const circle = document.createElementNS('http://www.w3.org/2000/svg', 'circle');" +
                        "    circle.setAttribute('cx', pos.x/2);" +
                        "    circle.setAttribute('cy', pos.y/2);" +
                        "    circle.setAttribute('r', 2);" +
                        "    circle.setAttribute('fill', 'red');" +
                        "    zoomGroup.appendChild(circle);" +
                        "  }" +
                        // Funksjon for å tegne en strek
                        "  function drawLine(start, end) {" +
                        //           "   console.log(zoomGroup); " +
                        //           "  console.log('Write line from ', start.x , start.y , end.x , end.y  );" +
                        //            "  console.log('Write line to ', end.x );" +
                        "    const line = document.createElementNS('http://www.w3.org/2000/svg', 'line');" +
                        "    line.setAttribute('x1', start.x /2 );"+
                        "    line.setAttribute('y1', start.y /2);"+
                        "    line.setAttribute('x2', end.x /2 );"+
                        "    line.setAttribute('y2', end.y/2);"+
                        "    line.setAttribute('stroke', 'black');"+  // Fargen på streken
                        "    line.setAttribute('stroke-width', '1');"+ // Bredden på streken
                        "    line.setAttribute('stroke-dasharray', '5,3'); "+ // Stiplet linje
                        "    zoomGroup.appendChild(line);"+  // Legg streken til SVG-en
                        "  }"+

// Funksjon for å bytte mellom heltrukket og stiplet linje
                        " function toggleLineStyle() {"+
                        "     if (line.getAttribute('stroke-dasharray')) {"+
                        "         line.removeAttribute('stroke-dasharray');"+ // Heltrukket linje
                        "    } else {"+
                        "         line.setAttribute('stroke-dasharray', '5,3'); "+// Stiplet linje
                        "     }"+
                        " }"+
                        // Tegn Bézier-kurve
                        "  function drawBezierCurve() {" +
                        "    const path = document.createElementNS('http://www.w3.org/2000/svg', 'path');" +
                        "    const d = 'M ' + firstClick.x/2 + ',' + firstClick.y/2 + " +
                        "              ' Q ' + secondClick.x/2 + ',' + secondClick.y/2 + " +
                        "              ' ' + thirdClick.x/2 + ',' + thirdClick.y/2;" +
                        "    path.setAttribute('d', d);" +
                        "    path.setAttribute('stroke', 'black');" +
                        "    path.setAttribute('fill', 'none');" +
                        "    path.setAttribute('stroke-width', 1);" +

                        //       "    console.log('Prøver å legge til path:', path.outerHTML);" +
                        "    zoomGroup.appendChild(path);" +
                        //        "    console.log('Path lagt til i zoomGroup:', zoomGroup.innerHTML);" +
                        "  }" +

                        // Send data til serveren
                        "  function sendLineToServer(start, end) {"+
                        "    const lineData = {"+
                        "      startX: start.x / 2,"+
                        "      startY: start.y / 2,"+
                        "      endX: end.x / 2,"+
                        "      endY: end.y / 2"+
                        "    };"+
                        //           "    console.log('Sender linjepunktene til serveren:', lineData);" +
                        "    $0.$server.updateLineData(JSON.stringify(lineData));" +
                        "  }" +

                        "} else {" +
                        "  console.error('SVG-elementet eller zoomGroup ble ikke funnet');" +
                        "}"
        );


    }



/*

        this.getElement().executeJs(
                "console.log('JavaScript-koden er utført');"+
                        "let svg = document.getElementById('svgCanvas');"+
                        "let zoomGroup = document.getElementById('zoomGroup');"+
                        "let firstClick = null, secondClick = null;"+  // Variabel for å lagre første klikk

                        "if (svg && zoomGroup) {"+
                        "  svg.addEventListener('mousedown', handleMouseDown);"+  // Lytt til musklikk på SVG-en
                        //      " <button onclick='toggleLineStyle()'>Bytt linjestil</button> " +
                        // Funksjon for å hente musens posisjon
                        "  function getMousePosition(event) {"+
                        "    let svgRect = svg.getBoundingClientRect();"+
                        "    return {"+
                        "      x: event.clientX - svgRect.left,"+
                        "      y: event.clientY - svgRect.top"+
                        "    };"+
                        "  }"+

                        // Funksjon for å håndtere museklikk
                        "  function handleMouseDown(event) {"+
                        "    const pos = getMousePosition(event);"+
                        "    console.log('Klikk på posisjon:', pos.x, pos.y);"+

                        "    if (!firstClick) {"+  // Hvis det er første klikk, lagre posisjonen
                        "      firstClick = pos;"+
                        "       drawCircle(firstClick);"+
                        "    } else {"+  // Hvis det er andre klikk, tegn en strek
                        "      secondClick = pos;"+
                        "      drawLine(firstClick, secondClick);"+
                        "       drawCircle(secondCick);"+
                        "      sendLineToServer(firstClick, secondClick);"+  // Send linjepunktene til serveren
                        "      firstClick = secondClick = null;"+  // Nullstill etter andre klikk
                        "    }"+
                        "  }"+

                        // Funksjon for å tegne en strek
                        "  function drawLine(start, end) {"+
                        "    const line = document.createElementNS('http://www.w3.org/2000/svg', 'line');"+
                        "    line.setAttribute('x1', start.x);"+
                        "    line.setAttribute('y1', start.y);"+
                        "    line.setAttribute('x2', end.x;"+
                        "    line.setAttribute('y2', end.y);"+
                        "    line.setAttribute('stroke', 'black');"+  // Fargen på streken
                        "    line.setAttribute('stroke-width', '1');"+ // Bredden på streken
                        "         line.setAttribute('stroke-dasharray', '5,3'); "+ // Stiplet linje
                        "    zoomGroup.appendChild(line);"+  // Legg streken til SVG-en
                        "  }"+
                        // Function for å tegne en sirkel
                        "    function drawCircle(start) {"+
                        // Add a red circle to mark the point
                        "   const  circle = document.createElementNS('http://www.w3.org/2000/svg', 'circle');"+
                        " circle.setAttribute('cx', start.x);"+
                        "  circle.setAttribute('cy', start.y); "+
                        "   circle.setAttribute('r', 2); "+
                        "   circle.setAttribute('fill', 'red'); "+
                        "   zoomGroup.appendChild(circle); "+
                        "  }"+

// Funksjon for å bytte mellom heltrukket og stiplet linje
                        " function toggleLineStyle() {"+
                        "     if (line.getAttribute('stroke-dasharray')) {"+
                        "         line.removeAttribute('stroke-dasharray');"+ // Heltrukket linje
                        "    } else {"+
                        "         line.setAttribute('stroke-dasharray', '5,5'); "+// Stiplet linje
                        "     }"+
                        " }"+


                        // Funksjon for å sende linjepunktene til serveren
                        "  function sendLineToServer(start, end) {"+
                        "    const lineData = {"+
                        "      startX: start.x,"+
                        "      startY: start.y,"+
                        "      endX: end.x,"+
                        "      endY: end.y"+
                        "    };"+
                        "    console.log('Sender linjepunktene til serveren:', lineData);"+
                        "    $0.$server.updateLineData(JSON.stringify(lineData));"+  // Send data til serveren
                        "  }"+
                        "} else {"+
                        "  console.error('SVG-elementet ble ikke funnet');"+
                        "}"
        );

    }


    // Backend-metode for å motta data fra klienten
    @ClientCallable
    public void updateLineData(String jsonData) {
        //   System.out.println("Oppdaterte linjepunkter: " + jsonData);
        // Her kan du prosessere dataen videre hvis ønskelig
        DataHandlerLine.processCurvePoints(jsonData);
    }



 */

    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");
        // Menyvalgene
        // RouterLink home = new RouterLink("Hjem", Home.class);
        // RouterLink about = new RouterLink("Om oss",Home.class);
        //   RouterLink services = new RouterLink("Tjenester", Home.class);
        //     RouterLink contact = new RouterLink("Kontakt", Home.class);
        Button myButton = new Button("Finished drawing line");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  new MouseLine(); } );
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
        //       System.out.println("Oppdaterte linjepunkter: " + jsonData);
        // Her kan du prosessere dataen videre hvis ønskelig
        DataHandlerLine.processCurvePoints(jsonData);
    }


}


