package com.example.application.images;


import com.example.application.Mouse.MouseMoved;
import com.example.application.app.BezierDataHandler;
import com.example.application.under.WeldPoint;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import java.awt.*;
import java.util.ArrayList;

@AnonymousAllowed
@Route(value = "mover" , layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Drawing welding string")
public class BezierViewR extends VerticalLayout {
    private java.awt.Point firstPointNew = new java.awt.Point();
    private java.awt.Point lastPointNew = new java.awt.Point();
    private java.awt.Point middelPointNew = new java.awt.Point();
    private java.awt.Point textPoint = new Point();
    int cx1 =100;
    int cx2 =250;
    int cx3 = 400;
    int cx4 = 200;
    int cy1 = 250;
    int cy2 =100;
    int cy3 =250 ;
    int cy4 =200;
    int width = 1200;
    int height = 900;
    String movingCurve;
    int r = 3;
    public ArrayList<WeldPoint> weldList = new ArrayList<>();
    WeldPoint tester = new WeldPoint();

    int foundIndex;
    int enterType;
    String testTall;


    public BezierViewR() {

        com.vaadin.flow.component.button.Button myButton = new Button("Finish moving");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  new BezierPlacing(); } );
        add(myButton);
        // Opprett SVG-elementet
        this.tester = MouseMoved.tester;
        this.enterType = MouseMoved.enterTypeNew;
        this.weldList = CalcValues.weldList;
        firstPointNew = tester.getWeldPointFirst();
        lastPointNew = tester.getWeldPointLast();
        middelPointNew = tester.getWeldPointMiddel();
        textPoint = tester.getWeldPointTextPoint();
        cx1 = firstPointNew.x;
        cy1 = firstPointNew.y;
        cx2 = middelPointNew.x;
        cy2 = middelPointNew.y;
        cx3 = lastPointNew.x;
        cy3 = lastPointNew.y;
        cx4 = textPoint.x;
        cy4 = textPoint.y;
        testTall = tester.getWeldPointText();
        //       System.out.println("her i r ");
        movingCurve = "<svg id='bezier-svg' width='" + width + "' height='" + height + "'>" +
                "  <path id='curve' d='M " + cx1 + "  " + cy1 + " Q " + cx2 + "  " + cy2 + ", " + cx3 + "  " + cy3 + "' stroke='black' fill='transparent'/>" +
                "  <circle cx='" + cx1 + "' cy='" + cy1 + "' r='" + r + "' fill='red' class='end-point' style='cursor: pointer;'/>" +
                "  <circle cx='" + cx2 + "' cy='" + cy2 + "' r='" + r + "' fill='blue' class='control-point' style='cursor: pointer;'/>" +
                "  <circle cx='" + cx3 + "' cy='" + cy3 + "' r='" + r + "' fill='red' class='end-point' style='cursor: pointer;'/>" +
                "  <text id='curve-text' x='" + cx4 + "' y='" + cy4 + "' font-family='Arial' font-size='14' fill='" + "blue" + "'>" + testTall + "</text>";
        // Opprett SVG-elementet

        Div svgContainer = new Div();
        svgContainer.getElement().setProperty("innerHTML", movingCurve + CalcValues.outSvg + CalcValues.svgNew + CalcValues.svgBuffer
        );

        // Legg til SVG-elementet i UI
        add(svgContainer);

        // Kjør JavaScript-koden etter at komponenten er festet
        this.getElement().executeJs(
                "console.log('JavaScript-koden er utført');" +
                        "let activePoint = null;" +
                        "let dragging = false;" +
                        "const svg = document.getElementById('bezier-svg');" +

                        "if (svg) {" +
                        "  const points = svg.querySelectorAll('circle');" +
                        "  const curveText = document.getElementById('curve-text');" + // Hent tekstfeltet
                        "  console.log('Antall punkter funnet:', points.length);" +
                        "  points.forEach(point => {" +
                        "    point.addEventListener('mousedown', startDrag);" +        // Koble punktene til drag-funksjonen
                        "  });" +

                        "  curveText.addEventListener('mousedown', startTextDrag);" +  // Koble teksten til egen drag-funksjon
                        "  svg.addEventListener('mousemove', drag);" +
                        "  svg.addEventListener('mouseup', endDrag);" +

                        // Funksjon for å få musens posisjon
                        "  function getMousePosition(event) {" +
                        "    let svgRect = svg.getBoundingClientRect();" +
                        "    return {" +
                        "      x: event.clientX - svgRect.left," +
                        "      y: event.clientY - svgRect.top" +
                        "    };" +
                        "  }" +

                        // Funksjon for draing av punkter
                        "  function startDrag(event) {" +
                        "    console.log('Mousedown på punkt:', event.target);" +
                        "    if (event.target.tagName.toLowerCase() === 'circle') {" +
                        "      activePoint = event.target;" +
                        "      activePoint.style.cursor = 'grabbing';" +
                        "      dragging = true;" +
                        "      event.preventDefault();" +
                        "    }" +
                        "  }" +

                        // Funksjon for draing av tekst
                        "  function startTextDrag(event) {" +
                        "    console.log('Mousedown på tekst:', event.target);" +
                        "    activePoint = event.target;" +
                        "    activePoint.style.cursor = 'grabbing';" +  // Endre pekeren til "grabbing"
                        "    dragging = true;" +
                        "    event.preventDefault();" +
                        "  }" +

                        // Funksjon som kjører når museknappen holdes nede og musen beveges
                        "  function drag(event) {" +
                        "    if (dragging && activePoint) {" +
                        "      const pos = getMousePosition(event);" +
                        "      console.log('Flytter punkt/tekst til:', pos.x, pos.y);" +
                        "      if (activePoint.tagName.toLowerCase() === 'text') {" +
                        "        activePoint.setAttribute('x', pos.x);" +  // Flytt teksten ved å oppdatere x- og y-koordinater
                        "        activePoint.setAttribute('y', pos.y);" +
                        "      } else {" +
                        "        activePoint.setAttribute('cx', pos.x);" + // Flytt punktet ved å oppdatere cx og cy
                        "        activePoint.setAttribute('cy', pos.y);" +
                        "      }" +
                        "      updateCurve();" +
                        "      event.preventDefault();" +
                        "    }" +
                        "  }" +

                        // Funksjon som kjører når museknappen slippes
                        "  function endDrag() {" +
                        "    if (dragging && activePoint) {" +
                        "      console.log('Museknapp sluppet på punkt/tekst');" +
                        "      activePoint.style.cursor = 'pointer';" +   // Tilbakestill pekeren til "pointer"
                        "      dragging = false;" +
                        "      sendUpdatedPointsToServer();" +            // Send de nye posisjonene til serveren
                        "      activePoint = null;" +
                        "    }" +
                        "  }" +

                        // Oppdater Bézier-kurven
                        "  function updateCurve() {" +
                        "    const startPoint = svg.querySelectorAll('.end-point')[0];" +
                        "    const controlPoint = svg.querySelector('.control-point');" +
                        "    const endPoint = svg.querySelectorAll('.end-point')[1];" +
                        "    const curve = document.getElementById('curve');" +
                        "    const startX = startPoint.getAttribute('cx');" +
                        "    const startY = startPoint.getAttribute('cy');" +
                        "    const controlX = controlPoint.getAttribute('cx');" +
                        "    const controlY = controlPoint.getAttribute('cy');" +
                        "    const endX = endPoint.getAttribute('cx');" +
                        "    const endY = endPoint.getAttribute('cy');" +
                        "    const d = `M ${startX} ${startY} Q ${controlX} ${controlY}, ${endX} ${endY}`;" +
                        "    curve.setAttribute('d', d);" +
                        "  }" +

                        // Send de oppdaterte punktene til serveren
                        "  function sendUpdatedPointsToServer() {" +
                        "    const points = Array.from(svg.querySelectorAll('circle'));" +
                        "    const pointData = points.map(point => ({ cx: point.getAttribute('cx'), cy: point.getAttribute('cy') }));" +
                        "    const textX = curveText.getAttribute('x');" +
                        "    const textY = curveText.getAttribute('y');" +
                        "    const data = { points: pointData, text: { x: textX, y: textY } };" +
                        "    console.log('Sender oppdaterte punkter og tekst til server:', data);" +
                        "    $0.$server.updateCurvePoints(JSON.stringify(data));" +  // Server-kall for å oppdatere punkter og tekst
                        "  }" +
                        "} else {" +
                        "  console.error('SVG-elementet ble ikke funnet');" +
                        "}"
        );
    }

    // Backend-metode som tar imot data fra JavaScript
    @ClientCallable
    public void updateCurvePoints(String jsonData) {
        // Behandle de oppdaterte punktene og teksten fra frontend
   //        System.out.println("Oppdaterte punkter og tekst old : " + jsonData);

        // Eksempel på å sende punktene videre til en annen klasse for videre prosessering
        BezierDataHandler.processCurvePoints(jsonData);
    }
}



