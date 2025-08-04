package com.example.application.app;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route("hello")
public class HelloView extends VerticalLayout {
    public HelloView() {
        TextField textField = new TextField("Your name");
        Button button = new Button("Say hello", e ->
                add(new Paragraph("Hello, " + textField.getValue())));
        add(textField, button);
    }
}

