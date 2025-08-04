package com.example.application.app;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route("movec")
public class BezierViewC extends VerticalLayout {

    public BezierViewC() {
        // Opprette SVG-elementet med en kvadratisk Bézier-kurve
        Div svgContainer = new Div();
        svgContainer.getElement().setProperty("innerHTML",
                "<svg id='bezier-svg' width='1200' height='860' style='border:1px solid black'>" +
                        "  <path id='curve' d='M 100 250 Q 250 100, 400 250' stroke='black' fill='transparent'/>" +
                        // Startpunkt (rød)
                        "  <circle cx='100' cy='250' r='5' fill='red' class='end-point' data-index='0'/>" +
                        // Kontrollpunkt (blå)
                        "  <circle cx='250' cy='100' r='5' fill='blue' class='control-point' data-index='1'/>" +
                        // Endepunkt (rød)
                        "  <circle cx='400' cy='250' r='5' fill='red' class='end-point' data-index='2'/>" +
                        "</svg>"
        );

        // Legg SVG-elementet til UI
        add(svgContainer);

        // Kjør JavaScript for å aktivere dra-funksjonalitet for punktene
        svgContainer.getElement().executeJs(
                "document.querySelectorAll('.control-point, .end-point').forEach(point => {" +
                        "  point.addEventListener('mousedown', startDrag);" +
                        "});" +
                        "function startDrag(event) {" +
                        "  event.preventDefault();" +
                        "  const point = event.target;" +
                        "  document.addEventListener('mousemove', drag);" +
                        "  document.addEventListener('mouseup', endDrag);" +
                        "  function drag(evt) {" +
                        "    const svg = point.closest('svg');" +
                        "    const rect = svg.getBoundingClientRect();" +
                        "    const cx = evt.clientX - rect.left;" +
                        "    const cy = evt.clientY - rect.top;" +
                        "    point.setAttribute('cx', cx);" +
                        "    point.setAttribute('cy', cy);" +
                        "    updateCurve();" +
                        "  }" +
                        "  function endDrag() {" +
                        "    document.removeEventListener('mousemove', drag);" +
                        "    document.removeEventListener('mouseup', endDrag);" +
                        "  }" +
                        "}" +
                        "function updateCurve() {" +
                        "  const startPoint = document.querySelectorAll('.end-point')[0];" +
                        "  const controlPoint = document.querySelector('.control-point');" +
                        "  const endPoint = document.querySelectorAll('.end-point')[1];" +
                        "  const curve = document.getElementById('curve');" +
                        "  const startX = startPoint.getAttribute('cx');" +
                        "  const startY = startPoint.getAttribute('cy');" +
                        "  const controlX = controlPoint.getAttribute('cx');" +
                        "  const controlY = controlPoint.getAttribute('cy');" +
                        "  const endX = endPoint.getAttribute('cx');" +
                        "  const endY = endPoint.getAttribute('cy');" +
                        "  const d = `M ${startX} ${startY} Q ${controlX} ${controlY}, ${endX} ${endY}`;" +
                        "  curve.setAttribute('d', d);" +
                        "}" +
                        "function sendUpdatedPointsToServer() {" +
                        "  const points = Array.from(document.querySelectorAll('circle'));" +
                        "  const data = points.map(point => ({ cx: point.getAttribute('cx'), cy: point.getAttribute('cy') }));" +
                        "  $0.$server.updateCurvePoints(JSON.stringify(data));" +  // Send oppdaterte punkter til backend
                        "}"
        );
    }
    // Metode som tar imot data fra frontend
    @ClientCallable
    public void updateCurvePoints(String jsonData) {
        // Her kan du sende dataene til en annen Java-klasse eller behandle dem lokalt
        System.out.println("Oppdaterte punkter: " + jsonData);

        // Send punktene videre til en annen klasse om nødvendig
        BezierDataHandler.processCurvePoints(jsonData);
    }
}


