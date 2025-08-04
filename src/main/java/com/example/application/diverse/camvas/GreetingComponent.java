package com.example.application.diverse.camvas;



import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route("start")
@RouteAlias("index")
public class GreetingComponent extends Div implements HasUrlParameter<String> {
    public static String userIdents = "UserID";
    String s = " ";
    @Override
    public void setParameter(BeforeEvent beforeEvent, String s) {

        if (s.isEmpty()) {
            userIdents = "UserID";
            //    setText("Welcome anonymous");
        } else {
            //    setText(String.format("Handling %s!", s));
            userIdents = s;
        }
        //  System.out.println(userIdents);
        UI.getCurrent().getPage().setLocation("home");
    }
}


