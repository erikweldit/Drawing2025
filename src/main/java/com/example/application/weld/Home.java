package com.example.application.weld;

import com.example.application.diverse.camvas.GreetingComponent;
import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

/**
 * Home page for the application
 *
 *@author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@PageTitle("Weld IT AS - Menu for weld drawing")
@Route(value = "home", layout = MainLayoutDraw.class)
@RouteAlias("index")

//@JsModule("./../frontend/generated/prefers-color-scheme.js")
//@NoTheme
//@Theme("mytodo")
public class Home extends VerticalLayout  {

    public static double factor ;
    public Home() {
        //   new GoodBy();
       // new Language();
        setSpacing(false);
        new GreetingComponent();
        for (int k=0; k<CalcValues.partImage.length; k++) {
         //   CalcValues.partImage[k] = "";
        }
        for ( int i=0; i < 10 ; i++) {
          CalcValues.bufferId[i] = 0;
        }
        for ( int i=0; i<17; i++) {
            ImageStorage.inBuffer[i] = false;
        }
        CalcValues.svgExtra = "";
        Image img = new Image("images/Weld IT fuge tegning.jpg", "Introduction image");
        img.setWidth("580px");

        add(img);

        H2 header = new H2("WPS drawing program for joint configuration and string buildup");
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);
        add(header);
        add(new Paragraph("For more info se 'Use info' in the menu"));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");

    }
    public static double getFactor() {
        return factor;
    }

    public static void setFactor(double fact) {
        factor = fact;
    }


}





