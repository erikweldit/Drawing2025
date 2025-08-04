package com.example.application.app;



import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route("Bez")
@PageTitle("Bezier Curve")
//@Tag("bezier-curve")
public class BezierView extends VerticalLayout {
    public BezierView() {
        setSizeFull();
    }

}

