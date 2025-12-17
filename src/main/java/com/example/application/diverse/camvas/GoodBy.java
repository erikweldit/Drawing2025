package com.example.application.diverse.camvas;

import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import java.util.ArrayList;
import com.vaadin.flow.server.VaadinSession;

@AnonymousAllowed
@Route("logout")

public class GoodBy extends Div implements HasUrlParameter<String> {
    String s = " ";   // actual user
    String user ;
    public static WeldPoint tester = new WeldPoint();
    private ArrayList<WeldPoint> actualList = new ArrayList<>();

    @Override
    public void setParameter(BeforeEvent beforeEvent, String s) {

        System.out.println(CalcValues.weldList.size());
        if (s.isEmpty()) {
            s = VaadinSession.getCurrent().getAttribute("tenantUser") != null ?            VaadinSession.getCurrent().getAttribute("tenantUser").toString() :            GreetingComponent.userIdents;
        }

        for (int i = CalcValues.weldList.size()-1; i< 0 ; i--) {
            tester = CalcValues.weldList.get(i);
            user = tester.getUser();
            if (user.equals(s)) {
                // blir slettet her
            } else {
                    actualList.add(0,tester);
            }
        }
        CalcValues.weldList = actualList;
        System.out.println(CalcValues.weldList.size());

        }
  //      System.out.println(CalcValues.weldList.size());
  //      UI.getCurrent().getPage().setLocation("home");
    }
