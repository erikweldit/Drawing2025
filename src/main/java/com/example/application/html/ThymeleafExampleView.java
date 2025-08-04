package com.example.application.html;

import com.example.application.Mouse.DrawWeldingSymbol;
import com.example.application.Mouse.DrawWeldinnString;
import com.example.application.Mouse.MakeMovePossible;
import com.example.application.views.list.MainLayoutFile;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import static com.example.application.diverse.camvas.Language.actual;


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
@Route(value = "/thymeleaf-example", layout = MainLayoutFile.class)
@PageTitle("Weld IT AS - Actual weld drawing")

public class ThymeleafExampleView extends VerticalLayout {
    public ThymeleafExampleView()  {
        CalcValues.svgNew = " ";

        Div thymeleafContent = new Div();
     //   new DrawWeldinnString();
        new ActualString();
        new DrawWeldingSymbol();
        thymeleafContent.getElement().setProperty("innerHTML", CalcValues.outSvg + CalcValues.svgStop);

        add(thymeleafContent);

    }


}






