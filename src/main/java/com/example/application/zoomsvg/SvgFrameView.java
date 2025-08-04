package com.example.application.zoomsvg;

import com.vaadin.flow.component.html.IFrame;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("svg-frame")
public class SvgFrameView extends VerticalLayout {

    public SvgFrameView() {
        IFrame iframe = new IFrame("/svg-view");
        iframe.setWidth("100%");
        iframe.setHeight("800px");  // eller dynamisk størrelse
        iframe.getStyle().set("border", "none");

        add(iframe);
    }
}

