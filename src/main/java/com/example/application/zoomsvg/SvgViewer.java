package com.example.application.zoomsvg;

import com.vaadin.flow.component.html.IFrame;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("svg-display")
public class SvgViewer extends VerticalLayout {

    public SvgViewer() {
        IFrame iframe = new IFrame("/svg/1"); // 1 = database-ID for SVG
        iframe.setWidth("100%");
        iframe.setHeight("800px");
        iframe.getStyle().set("border", "1px solid #ccc");

        add(iframe);
    }
}

