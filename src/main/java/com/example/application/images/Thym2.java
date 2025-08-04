package com.example.application.images;







import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.List;
/**
 * Test for Thymeleaf function
 * Not in use
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route("thym2")
public class Thym2 extends VerticalLayout {

    public String svg ;
    public Thym2() {

        // Opprett et Div-element for å vise Thymeleaf-innhold
        Div thymeleafContent = new Div();

        // Hent Thymeleaf-templaten og legg til i Div-elementet
        thymeleafContent.getElement().setProperty("innerHTML", getThymeleafTemplate());

        // Legg til Div-elementet i layouten
        add(thymeleafContent);

    }

    public String getThymeleafTemplate() {
        int x = 1600;
        int y = 800;

        String svg =  "<!DOCTYPE html> \n " +
                "<html lang='en'>\n " +
                "<head>\n " +
                " <meta charset='UTF-8'>\n " +
                " <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n " +
                " <title>Bézier Curve with SVG</title>\n " +
                " <style>\n " +
                "  svg {\n " +
                "     border: 1px solid black;\n " +
                "    width: 800px;\n " +
                "    height: 500px;\n " +
                "  }\n " +
                "   circle {\n " +
                "       fill: red;\n " +
                "       cursor: pointer;\n " +
                "   }\n " +
                "  </style>\n " +
                "</head>\n " +
                "<body>\n " +
                " <svg id='svgCanvas' viewBox=0 0 800 500'>\n " +
                "    <!-- Bézier curve path -->\n " +
                "    <path id='bezierCurve' stroke='blue' fill='transparent' stroke-width='2'/>\n " +

                "    <!-- Control points -->\n " +
                "    <circle id='startPoint' r='5' cx='100' cy='250'/>\n " +
                "    <circle id='controlPoint1' r='5' cx='200' cy='50'/>\n " +
                "<!--      <circle id='controlPoint2' r='5' cx='600' cy='450'/> -->\n " +
                "    <circle id='endPoint' r='5' cx='700' cy='250'/>\n " +
                " </svg>\n " +

                "  <script src='https://unpkg.com/htmx.org@1.6.1'></script>\n " +

                "<script>\n " +
                "const svg = document.getElementById('svgCanvas');\n " +
                "const bezierCurve = document.getElementById('bezierCurve');\n " +
                "const points = {\n " +
                "  startPoint: document.getElementById('startPoint'),\n " +
                "  controlPoint1: document.getElementById('controlPoint1'),\n " +
                "  controlPoint2: document.getElementById('controlPoint1'),  \n " +
                "  endPoint: document.getElementById('endPoint')\n " +
                "};\n " +

                "let selectedPoint = null;\n " +

                "svg.addEventListener('mousedown', (e) => {\n " +
                "  if (e.target.tagName === 'circle') {\n " +
                "    selectedPoint = e.target;\n " +
                "  }\n " +
                "});\n " +

                "svg.addEventListener('mousemove', (e) => {\n " +
                "  if (selectedPoint) {\n " +
                "     const svgRect = svg.getBoundingClientRect();\n " +
                "     const x = e.clientX - svgRect.left;\n " +
                "     const y = e.clientY - svgRect.top;\n " +
                "     selectedPoint.setAttribute('cx', x);\n " +
                "     selectedPoint.setAttribute('cy', y);\n " +
                "     updateCurve();\n " +
                "  }\n " +
                "});\n " +


                "svg.addEventListener('mouseup', () => {\n " +
                "    selectedPoint = null;\n " +
                "});\n " +

                "function updateCurve() {\n " +

                "// htmx optional\n " +
                "   const startX = points.startPoint.getAttribute('cx');\n " +
                "   const startY = points.startPoint.getAttribute('cy');\n " +
                "  const controlX1 = points.controlPoint1.getAttribute('cx');\n " +
                "  const controlY1 = points.controlPoint1.getAttribute('cy');\n " +
                "  const controlX2 = points.controlPoint2.getAttribute('cx');\n " +
                " const controlY2 = points.controlPoint2.getAttribute('cy');\n " +
                "  const endX = points.endPoint.getAttribute('cx');\n " +
                "  const endY = points.endPoint.getAttribute('cy');\n " +

                "  const d = `M ${startX},${startY} C ${controlX1},${controlY1} ${controlX1},${controlY1} ${endX},${endY}`;\n " +
                "  bezierCurve.setAttribute('d', d);\n " +

                "   // Send the updated path to the server\n " +
                "   htmx.ajax('POST', '/update-curve', {\n " +
                "      values: { path: d }\n " +
                "    });\n " +
                "}\n " +


                "// Initial curve drawing\n " +
                "updateCurve();\n " +

                "</script>\n " +
                "</body>\n " +
                "</html>\n " ;




/*
        String svg = "<svg width='200' height='200' xmlns='http://www.w3.org/2000/svg'> " +
                "<rect width='200' height='200' fill='lightgray' /> " +

                "<circle cx='100' cy='100' r='50' fill='blue' " +
                " onclick='handleClick()' />" +
                "<script type='text/ecmascript'>" +
                "  <![CDATA[" +
                "    function handleClick() {" +
                "      alert('Sirkel ble klikket!');" +
                "    }" +
                "  ]]>" +
                " </script>" +
                "</svg>" ;


        String svg = "<!DOCTYPE html>\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\"\n" +
                "      xmlns:th=\"http://www.thymeleaf.org\"\n" +
                "      lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv = \"refresh\" content = \"1;url= /Image\" />\n" +
                "    <title>Taming Thymeleaf</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";
        */
        return svg ;


    }
}

