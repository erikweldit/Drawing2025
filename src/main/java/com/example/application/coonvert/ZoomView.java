package com.example.application.coonvert;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.UI;

@Route("zoomview")
public class ZoomView extends VerticalLayout {

    public ZoomView() {
        Button zoomIn = new Button("Zoom inn", e -> zoom(1.2));
        Button zoomOut = new Button("Zoom ut", e -> zoom(0.8));

        add(zoomIn, zoomOut);
    }

    private void zoom(double scale) {
        UI.getCurrent().getPage().executeJs("document.body.style.zoom = $0", scale);
    }
}

