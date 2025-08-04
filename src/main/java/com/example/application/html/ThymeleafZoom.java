package com.example.application.html;

import com.example.application.Mouse.DrawWeldinnString;
import com.example.application.views.list.MainLayoutFile;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;


/**
 * Genererer tegningene som en svg-kode
 * @retur outSvg  som er en streng for gir hele svg koden unntatt avslutningsn
 * Legger verdier inn i statiske variable
 * CalcValues.outSvg
 * CalcValues.endSvg
 * CalcValues.outHtml
 * CalcValues.stopHtml
 *
 */
@AnonymousAllowed
@Route(value = "/thymeleaf-zoom")
@PageTitle("Weld IT AS - Actual weld drawing")

public class ThymeleafZoom extends VerticalLayout {



    public ThymeleafZoom()  {


     //       Button zoomIn = new Button("Zoom inn", e -> zoom(2.0));
      //     Button zoomOut = new Button("Zoom ut", e -> zoom(0.8));

      //      add(zoomIn, zoomOut);

        // Opprett et Div-element for å vise Thymeleaf-innhold
        Div thymeleafContent = new Div();
        // Hent Thymeleaf-templaten og legg til i Div-elementet
        ActualString actual = new ActualString();


        thymeleafContent.getElement().setProperty("innerHTML", actual.getThymeleafTemplate());

        add(thymeleafContent);
   //     new DrawWeldinnString();

    }
    private void zoom(double scale) {
        UI.getCurrent().getPage().executeJs("document.body.style.zoom = $0", scale);
    }

}



