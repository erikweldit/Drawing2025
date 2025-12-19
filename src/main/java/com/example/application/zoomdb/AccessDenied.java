package com.example.application.zoomdb;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("accessdenied")
@PageTitle("Weld IT AS - Access Denied")
public class AccessDenied extends HorizontalLayout implements BeforeEnterObserver {

    public AccessDenied() {
        setWidthFull();
        setHeightFull();
        setPadding(false);
        setMargin(false);
        setSpacing(false);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);
        getStyle()
            .set("background", "linear-gradient(135deg, #232526 0%, #414345 100%)")
            .set("overflow-x", "hidden");

        // Header with logo and app name (always in one line)
        HorizontalLayout header = new HorizontalLayout();
        header.setWidthFull();
        header.getStyle().set("overflow-x", "hidden");
        header.setAlignItems(Alignment.CENTER);
        header.setJustifyContentMode(JustifyContentMode.START);
        header.getStyle()
            .set("background", "#232526")
            .set("padding", "0.5em 2em")
            .set("box-shadow", "0 2px 8px rgba(0,0,0,0.08)")
            .set("min-height", "64px");

        com.vaadin.flow.component.html.Image logo = new com.vaadin.flow.component.html.Image("icons/logo.png", "Weldit Logo");
        logo.setWidth("40px");
        logo.getStyle().set("margin-right", "1em");

        H1 appName = new H1("Weldit AS");
        appName.getStyle().set("color", "#fff").set("font-size", "1.5em").set("margin", "0");

        header.add(logo, appName);

        // Card container (full width, centered content)
        Div card = new Div();
        card.getStyle()
            .set("background", "#fff")
            .set("border-radius", "16px")
            .set("box-shadow", "0 4px 24px rgba(0,0,0,0.15)")
            .set("padding", "3em 2em")
            .set("width", "100%")
            .set("max-width", "600px")
            .set("margin", "3em auto")
            .set("text-align", "center")
            .set("box-sizing", "border-box");

        Icon lockIcon = VaadinIcon.LOCK.create();
        lockIcon.setSize("48px");
        lockIcon.getStyle().set("color", "#c00").set("margin-bottom", "0.5em");

        H1 title = new H1("Access Denied");
        title.getStyle().set("color", "#232526").set("font-size", "2em").set("margin", "0.5em 0 0.2em 0");

        Paragraph message = new Paragraph("You do not have permission to access this resource. If you believe this is an error, please contact your administrator.");
        message.getStyle().set("color", "#555").set("font-size", "1.1em").set("margin", "1.5em 0 0.5em 0");

        card.add(lockIcon, title, message);

        // Use a vertical layout to stack header and card, but card fills width
        VerticalLayout container = new VerticalLayout();
        container.setWidthFull();
        container.setHeightFull();
        container.setPadding(false);
        container.setMargin(false);
        container.setSpacing(false);
        container.setAlignItems(Alignment.CENTER);
        container.setJustifyContentMode(JustifyContentMode.START);
        container.getStyle().set("overflow-x", "hidden");
        container.add(header, card);

        add(container);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // Optionally, add logic here to log or handle denied access
    }
}
