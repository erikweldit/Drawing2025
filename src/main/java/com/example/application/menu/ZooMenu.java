package com.example.application.menu;

import com.example.application.app.DataHandlerLine;
import com.example.application.weld.CalcValues;
import com.example.application.weld.Home;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("zoomenu")
public class ZooMenu extends AppLayout {   //  extends AppLayout

    public ZooMenu() {
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
        String movingCurve = "<svg id='svgCanvas' width='1200' height='900' viewBox = '00 00 1200 1000' style='border:1px solid black;'>"
                + "<g id='zoomGroup'>"; // Legg til en gruppe for zooming
        svgContainer.getElement().setProperty("innerHTML", movingCurve + CalcValues.outSvg + CalcValues.svgNew + CalcValues.svgBuffer
                + "</g></svg>");
        // Legg til SVG-elementet i UI
        //add(svgContainer);

        HorizontalLayout content = new HorizontalLayout();
        //    NumberField zoomLevel = new NumberField("Zoom nivå");
        //   zoomLevel.setValue(1.0);
        //    zoomLevel.setStep(0.1);
        double zoom = 2.0;
        /// //////////////////////////
        //      Button zoomButton = new Button("Zoom SVG", event -> {
        //   double zoom = zoomLevel.getValue();
        UI.getCurrent().getPage().executeJs(
                "let zoomGroup = document.getElementById('zoomGroup');" +
                        "if (zoomGroup) {" +
                        "    zoomGroup.setAttribute('transform', 'scale(' + $0 + ')');" +
                        "} else {" +
                        "    console.error('Element med ID zoomGroup ikke funnet!');" +
                        "}", zoom);
        //     });
/*
        Button resetButton = new Button("Tilbakestill zoom", event -> {
            UI.getCurrent().getPage().executeJs(
                    "document.getElementById('svgCanvas').setAttribute('transform', 'scale(1)');"
            );
        });


 */
        content.add(svgContainer);
        setContent(content);

        // Kjør JavaScript-koden etter at komponenten er festet
        this.getElement().executeJs(
                "console.log('JavaScript-koden er utført');" +
                        "let zoomLevel = 1.9; // Zoomnivå - må være det samme som i Java " +
                        "let svg = document.getElementById('svgCanvas');" +
                        "let zoomGroup = document.getElementById('zoomGroup');" +
                        "let firstClick = null; " +

                        "if (svg && zoomGroup) { " +
                        "  svg.addEventListener('mousedown', handleMouseDown); " +

                        // Funksjon for å hente museposisjon og justere for zoom
                        "  function getMousePosition(event) { " +
                        "    let svgRect = svg.getBoundingClientRect(); " +
                        "    return { " +
                        "      x: (event.clientX - svgRect.left) / zoomLevel, " +
                        "      y: (event.clientY - svgRect.top) / zoomLevel " +
                        "    }; " +
                        "  } " +

                        // Funksjon for å håndtere museklikk
                        "  function handleMouseDown(event) { " +
                        "    const pos = getMousePosition(event); " +
                        "    console.log('Klikk på posisjon:', pos.x, pos.y, 'med zoom:', zoomLevel); " +

                        "    if (!firstClick) { " +
                        "      firstClick = pos; " +
                        "      drawCircle(firstClick); " +
                        "    } else { " +
                        "      drawLine(firstClick, pos); " +
                        "      drawCircle(pos); " +
                        "      sendLineToServer(firstClick, pos); " +
                        "      firstClick = null; " +
                        "    } " +
                        "  } "+

                // Funksjon for å tegne en strek
                "  function drawLine(start, end) { " +
                        "    const line = document.createElementNS('http://www.w3.org/2000/svg', 'line'); " +
                        "    line.setAttribute('x1', start.x); " +
                        "    line.setAttribute('y1', start.y); " +
                        "    line.setAttribute('x2', end.x); " +
                        "    line.setAttribute('y2', end.y); " +
                        "    line.setAttribute('stroke', 'black'); " +
                        "    line.setAttribute('stroke-width', '1'); " +
                        "    line.setAttribute('stroke-dasharray', '5,3'); " +
                        "    zoomGroup.appendChild(line); " +
                        "  } " +

                        // Funksjon for å tegne en sirkel
                        "  function drawCircle(start) { " +
                        "    const circle = document.createElementNS('http://www.w3.org/2000/svg', 'circle'); " +
                        "    circle.setAttribute('cx', start.x); " +
                        "    circle.setAttribute('cy', start.y); " +
                        "    circle.setAttribute('r', 2); " +
                        "    circle.setAttribute('fill', 'red'); " +
                        "    zoomGroup.appendChild(circle); " +
                        "  } " +

                        // Funksjon for å bytte linjestil
                        "  function toggleLineStyle(line) { " +
                        "    if (line.getAttribute('stroke-dasharray')) { " +
                        "      line.removeAttribute('stroke-dasharray'); " +
                        "    } else { " +
                        "      line.setAttribute('stroke-dasharray', '5,5'); " +
                        "    } " +
                        "  } " +

                        // Funksjon for å sette zoom-nivå
                        "  function setZoom(level) { " +
                        "    zoomLevel = level; " +
                        "    zoomGroup.setAttribute('transform', 'scale(' + zoomLevel + ')'); " +
                        "    console.log('Zoom oppdatert til:', zoomLevel); " +
                        "  } " +
                        // Funksjon for å sende linjepunktene til serveren
                        "  function sendLineToServer(start, end) { " +
                        "    const lineData = { " +
                        "      startX: start.x, " +
                        "      startY: start.y, " +
                        "      endX: end.x, " +
                        "      endY: end.y " +
                        "    }; " +
                        "    console.log('Sender linjepunktene til serveren:', lineData); " +
                        "    $0.$server.updateLineData(JSON.stringify(lineData)); " +
                        "  } " +

                        "} else { " +
                        "  console.error('SVG-elementet eller zoomGroup ble ikke funnet'); " +
                        "  console.log('JavaScript-koden ble fullført uten feil'); " +
                        "} else { " +
                        "  console.error('SVG-elementet eller zoomGroup ble ikke funnet'); " +
                        "}"


        );


    }


    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");
        // Menyvalgene
        RouterLink home = new RouterLink("Hjem", Home.class);
        RouterLink about = new RouterLink("Om oss",Home.class);
        RouterLink services = new RouterLink("Tjenester", Home.class);
        RouterLink contact = new RouterLink("Kontakt", Home.class);

        // Legg menyvalgene i en horisontal layout
        HorizontalLayout menuBar = new HorizontalLayout(home, about, services, contact);
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
    // Backend-metode for å motta data fra klienten
    @ClientCallable
    public void updateLineData(String jsonData) {
           System.out.println("Oppdaterte linjepunkter: " + jsonData);
        // Her kan du prosessere dataen videre hvis ønskelig
        DataHandlerLine.processCurvePoints(jsonData);
    }

}
