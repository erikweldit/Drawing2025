package com.example.application.menu;


import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.component.page.Meta;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

//import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("My View")
@Route("Mainview1")
//@Meta(order = 0, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class MyViewView extends Composite<VerticalLayout> {

    public MyViewView() {
        Button buttonPrimary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Button");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(buttonPrimary);
    }
}

