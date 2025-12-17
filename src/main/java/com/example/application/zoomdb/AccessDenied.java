package com.example.application.zoomdb;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("accessdenied")
@PageTitle("Weld IT AS - Access Denied")
public class AccessDenied extends HorizontalLayout implements BeforeEnterObserver {

    private final Span infoSpan = new Span();

    public AccessDenied() {
        setWidthFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);

        H1 appName = new H1("Weldit AS");
        appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
        appName.getStyle().set("color", "#fff").set("background", "#333").set("padding", "0.5em 1em");

        Paragraph message = new Paragraph("Access Denied: You do not have permission to access this resource.");
        message.getStyle().set("color", "#c00").set("font-size", "1.2em").set("margin", "2em");

        add(appName, message);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // Optionally, you can add logic here to log or handle denied access
    }
}
