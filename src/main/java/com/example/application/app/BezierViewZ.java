package com.example.application.app;


import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route("movez")
public class BezierViewZ extends VerticalLayout {

    public BezierViewZ() {
        // Opprett SVG-elementet
        Div svgContainer = new Div();
        svgContainer.getElement().setProperty("innerHTML",
                "<svg id='bezier-svg' width='1200' height='900' style='border:1px solid black;'>" +
                        "  <path id='curve' d='M 100 250 Q 250 100, 400 250' stroke='black' fill='transparent'/>" +
                        "  <circle cx='100' cy='250' r='10' fill='red' class='end-point' style='cursor: pointer;'/>" +
                        "  <circle cx='250' cy='100' r='10' fill='blue' class='control-point' style='cursor: pointer;'/>" +
                        "  <circle cx='400' cy='250' r='10' fill='red' class='end-point' style='cursor: pointer;'/>" +
                        "</svg>"
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
                        "  console.log('Antall punkter funnet:', points.length);" +
                        "  points.forEach(point => {" +
                        "    console.log('Legger til hendelse på punkt:', point);" +
                        "    point.addEventListener('mousedown', startDrag);" +
                        "  });" +

                        "  svg.addEventListener('mousemove', drag);" +
                        "  svg.addEventListener('mouseup', endDrag);" +

                        "  function getMousePosition(event) {" +
                        "    let svgRect = svg.getBoundingClientRect();" +
                        "    return {" +
                        "      x: event.clientX - svgRect.left," +
                        "      y: event.clientY - svgRect.top" +
                        "    };" +
                        "  }" +

                        "  function startDrag(event) {" +
                        "    console.log('Mousedown på punkt:', event.target);" +
                        "    if (event.target.tagName.toLowerCase() === 'circle') {" +
                        "      activePoint = event.target;" +
                        "      activePoint.style.cursor = 'grabbing';" +
                        "      dragging = true;" +
                        "      event.preventDefault();" +
                        "    }" +
                        "  }" +

                        "  function drag(event) {" +
                        "    if (dragging && activePoint) {" +
                        "      const pos = getMousePosition(event);" +
                        "      console.log('Flytter punkt til:', pos.x, pos.y);" +
                        "      activePoint.setAttribute('cx', pos.x);" +
                        "      activePoint.setAttribute('cy', pos.y);" +
                        "      updateCurve();" +
                        "      event.preventDefault();" +
                        "    }" +
                        "  }" +

                        "  function endDrag() {" +
                        "    if (dragging && activePoint) {" +
                        "      console.log('Museknapp sluppet på punkt');" +
                        "      activePoint.style.cursor = 'pointer';" +
                        "      dragging = false;" +
                        "      sendUpdatedPointsToServer();" +
                        "      activePoint = null;" +
                        "    }" +
                        "  }" +

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

                        "  function sendUpdatedPointsToServer() {" +
                        "    const points = Array.from(svg.querySelectorAll('circle'));" +
                        "    const data = points.map(point => ({ cx: point.getAttribute('cx'), cy: point.getAttribute('cy') }));" +
                        "    console.log('Sender oppdaterte punkter til server:', data);" +
                        "    $0.$server.updateCurvePoints(JSON.stringify(data));" +  // $0 refererer nå til BezierView
                        "  }" +
                        "} else {" +
                        "  console.error('SVG-elementet ble ikke funnet');" +
                        "}"
        );
    }

    // Backend-metode som tar imot data fra JavaScript
    @ClientCallable
    public void updateCurvePoints(String jsonData) {
        // Behandle de oppdaterte punktene fra frontend
        //   System.out.println("Oppdaterte punkter: " + jsonData);

        // Eksempel på å sende punktene videre til en annen klasse for videre prosessering
        BezierDataHandler.processCurvePoints(jsonData);
    }
}


