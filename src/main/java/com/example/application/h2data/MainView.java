package com.example.application.h2data;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("svgbase")
public class MainView extends VerticalLayout {

    public MainView() {
        // Anta at du har lagret et SVG-innhold med ID 1
        Image svgImage = new Image("/svg/1", "Min SVG");
        svgImage.setWidth("400px");

        add(svgImage);
    }

}

