package com.example.application.html;





import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

/**
 * Test for Thymeleaf function
 * Not in use
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route("thymeleaf-base")

public class ThymeleafBase extends VerticalLayout {


    public ThymeleafBase() {

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

        String svg = "<svg height='" + x + "'" + " width='" + y + "'>" +
                "<path id='lineAB' d='M 100 350 l 150 -300' stroke='red' stroke-width='3' fill='none' />" +
                "<path id='lineAB' d='M 250 50 l 150 300' stroke='red' stroke-width='3' fill='none' />" +
                "<path d='M 175 200 l 150 0' stroke='green' stroke-width='3' fill='none' />" +
                "<path d='M 100 350 q 150 -300 300 0' stroke='blue' stroke-width='5' fill='none' />" +
                "<!-- Mark relevant points -->" +
                "<g stroke='black' stroke-width='3' fill='black'>" +
                "<circle id='pointA' cx='100' cy='350' r='3' />" +
                "<circle id='pointB' cx='250' cy='50' r='3' />" +
                "<circle id='pointC' cx='400' cy='350' r='3' />" +
                "</g>" +
                "<!-- Label the points -->" +
                "<g font-size='30' font-family='sans-serif' fill='black' stroke='none' text-anchor='middle'>" +
                " <text x='100' y='350' dx='-30'>A</text>" +
                "<text x='250' y='50' dy='-10'>B</text>" +
                " <text x='400' y='350' dx='30'>C</text>" +
                "</g>" +
                " Sorry, your browser does not support inline SVG." +
                "</svg>";


        return svg ;


    }
}



