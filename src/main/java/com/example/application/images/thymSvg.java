package com.example.application.images;





import com.example.application.weld.CalcValues;
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
 * Writing to html page by use of Thymeleaf function
 * Standard collected from Thymeleaf documentation
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route("thymSvg")
public class thymSvg extends VerticalLayout {


    public thymSvg() {

        // Opprett et Div-element for å vise Thymeleaf-innhold på html siden
        Div thymeleafContent = new Div();

        // Hent Thymeleaf-templaten og legg til i Div-elementet
        thymeleafContent.getElement().setProperty("innerHTML", getThymeleafTemplate());

        // Legg til Div-elementet i layouten
        add(thymeleafContent);
    }

    /**
     * Generate the string for output on the html page
     * where out.Svg indicate the basic figures
     * and svgNew indikate weldstring and symbol
     *
     * @return svg + svgNew
     */
    public String getThymeleafTemplate() {
        var conv = new CalcValues();
        String svg = CalcValues.outSvg ;
        String svgNew = CalcValues.svgNew ;
        return svg + svgNew;


    }
}



