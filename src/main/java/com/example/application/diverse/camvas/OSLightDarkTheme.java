package com.example.application.diverse.camvas;



import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
//@Route("os-light-dark-theme")

public class OSLightDarkTheme extends VerticalLayout {

    public OSLightDarkTheme() {
        add(new Html("<p>This view will switch between light and dark themes depending on your OS setting (via the browsers 'prefers-color-scheme').<br/>"
                + "<a href='https://web.dev/prefers-color-scheme/#activating-dark-mode-in-the-operating-system'>Read more about dark mode at web.dev</a><br/>"
                + "Usually you want to <b>apply this to your main layout</b> instead of a single view."
                + "In this example, the whole application will be affected after you visit this view.</p>"));
    }

}



