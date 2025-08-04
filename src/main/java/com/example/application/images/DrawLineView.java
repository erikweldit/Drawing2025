package com.example.application.images;


import com.example.application.Mouse.MouseLine;
import com.example.application.app.DataHandlerLine;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.auth.AnonymousAllowed;


@AnonymousAllowed
@Route(value = "line" , layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Drawing line ")
public class DrawLineView extends VerticalLayout {

    public DrawLineView() {

        com.vaadin.flow.component.button.Button myButton = new Button("Finish linedrawing");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  new MouseLine(); } );
        add(myButton);
        // Opprett SVG-elementet
        Div svgContainer = new Div();
        /*
        svgContainer.getElement().setProperty("innerHTML",
                "<svg id='draw-svg' width='1200' height='900' style='border:1px solid black;'>" +
                        "</svg>"
        );


         */

        String movingCurve =  "<svg id='draw-svg' width='1200' height='860' viewBox = '0 0 1200 860' style='border:1px solid black;'>" ;
        svgContainer.getElement().setProperty("innerHTML", movingCurve + CalcValues.startSvg + CalcValues.svgNew + CalcValues.svgBuffer
        );
        // Legg til SVG-elementet i UI
        add(svgContainer);

        // Kjør JavaScript-koden etter at komponenten er festet
        this.getElement().executeJs(
                "console.log('JavaScript-koden er utført');" +
                        "let svg = document.getElementById('draw-svg');" +
                        "let firstClick = null;" +  // Variabel for å lagre første klikk

                        "if (svg) {" +
                        "  svg.addEventListener('mousedown', handleMouseDown);" +  // Lytt til musklikk på SVG-en
                        //      " <button onclick='toggleLineStyle()'>Bytt linjestil</button> " +
                        // Funksjon for å hente musens posisjon
                        "  function getMousePosition(event) {" +
                        "    let svgRect = svg.getBoundingClientRect();" +
                        "    return {" +
                        "      x: event.clientX - svgRect.left," +
                        "      y: event.clientY - svgRect.top" +
                        "    };" +
                        "  }" +

                        // Funksjon for å håndtere museklikk
                        "  function handleMouseDown(event) {" +
                        "    const pos = getMousePosition(event);" +
                        "    console.log('Klikk på posisjon:', pos.x, pos.y);" +

                        "    if (!firstClick) {" +  // Hvis det er første klikk, lagre posisjonen
                        "      firstClick = pos;" +
                        "       drawCircle(firstClick);"+
                        "    } else {" +  // Hvis det er andre klikk, tegn en strek
                        "      drawLine(firstClick, pos);" +
                        "       drawCircle(pos);"+
                        "      sendLineToServer(firstClick, pos);" +  // Send linjepunktene til serveren
                        "      firstClick = null;" +  // Nullstill etter andre klikk
                        "    }" +
                        "  }" +

                        // Funksjon for å tegne en strek
                        "  function drawLine(start, end) {" +
                        "    const line = document.createElementNS('http://www.w3.org/2000/svg', 'line');" +
                        "    line.setAttribute('x1', start.x);" +
                        "    line.setAttribute('y1', start.y);" +
                        "    line.setAttribute('x2', end.x);" +
                        "    line.setAttribute('y2', end.y);" +
                        "    line.setAttribute('stroke', 'black');" +  // Fargen på streken
                        "    line.setAttribute('stroke-width', '1');" + // Bredden på streken
                        "         line.setAttribute('stroke-dasharray', '5,3'); " + // Stiplet linje
                        "    svg.appendChild(line);" +  // Legg streken til SVG-en
                        "  }" +
                        // Function for å tegne en sirkel
                        "    function drawCircle(start) {" +
                        // Add a red circle to mark the point
                        "   const  circle = document.createElementNS('http://www.w3.org/2000/svg', 'circle');" +
                        " circle.setAttribute('cx', start.x);" +
                        "  circle.setAttribute('cy', start.y); "+
                        "   circle.setAttribute('r', 2); "+
                        "   circle.setAttribute('fill', 'red'); "+
                        "   svg.appendChild(circle); "+
                        "  }" +

// Funksjon for å bytte mellom heltrukket og stiplet linje
                        " function toggleLineStyle() {" +
                        "     if (line.getAttribute('stroke-dasharray')) {" +
                        "         line.removeAttribute('stroke-dasharray');" + // Heltrukket linje
                        "    } else {" +
                        "         line.setAttribute('stroke-dasharray', '5,5'); " +// Stiplet linje
                        "     }" +
                        " }" +



                        // Funksjon for å sende linjepunktene til serveren
                        "  function sendLineToServer(start, end) {" +
                        "    const lineData = {" +
                        "      startX: start.x," +
                        "      startY: start.y," +
                        "      endX: end.x," +
                        "      endY: end.y" +
                        "    };" +
                        "    console.log('Sender linjepunktene til serveren:', lineData);" +
                        "    $0.$server.updateLineData(JSON.stringify(lineData));" +  // Send data til serveren
                        "  }" +
                        "} else {" +
                        "  console.error('SVG-elementet ble ikke funnet');" +
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
}


