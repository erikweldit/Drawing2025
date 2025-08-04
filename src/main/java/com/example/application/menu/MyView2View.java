package com.example.application.menu;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;




import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;



@PageTitle("My View2")
@Route("my-view")
//@Menu(order = 1)
public class MyView2View extends Composite<VerticalLayout> {

    public MyView2View() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");

    }
}

