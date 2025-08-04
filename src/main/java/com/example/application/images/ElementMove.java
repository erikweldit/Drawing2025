package com.example.application.images;




import com.example.application.Mouse.DrawWeldinnString;
import com.example.application.Mouse.MouseMoved;
import com.example.application.under.WeldPoint;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import java.awt.*;
import java.util.ArrayList;

@AnonymousAllowed
@Route(value = "placingNew", layout = MainLayoutDraw.class)
public class ElementMove  extends VerticalLayout {

    Boolean entered;
    ArrayList<WeldPoint> weldList = new ArrayList<>();

    WeldPoint tester = new WeldPoint();
    int enterTypeNew;
    int code;
    int[] telleValue = new int[8];
    Point point = new Point();
    private java.awt.Point firstPointNew = new java.awt.Point();
    private java.awt.Point lastPointNew = new java.awt.Point();
    private java.awt.Point middelPointNew = new java.awt.Point();
    private java.awt.Point textPoint = new Point();

    public ElementMove() {

        this.telleValue = MouseMoved.telleValue;
        this.tester = MouseMoved.tester;
        this.enterTypeNew = MouseMoved.enterTypeNew;
        this.weldList = CalcValues.weldList;
/*
        firstPointNew.x = telleValue[0];
        firstPointNew.y = telleValue[1];
        middelPointNew.x = telleValue[2];
        middelPointNew.y = telleValue[3];
        lastPointNew.x = telleValue[4];
        lastPointNew.y = telleValue[5];
        textPoint.x = telleValue[6];
        textPoint.y = telleValue[7];

        code = tester.getCode();
        //System.out.println("  code =  " + code);
        tester.setWeldPointFirst(firstPointNew);
        tester.setWeldPointLast(lastPointNew);
        tester.setWeldPointMiddel(middelPointNew);
        tester.setWeldPointTextPoint(textPoint);


        int foundIndex = weldList.size();
        weldList.add(foundIndex, tester);   // setter inn nye verdier
        CalcValues.weldList = weldList;   // setter inn nye verdier

        if ( code == 2 ) {
            new DrawWeldingSymbol();
        } else {
            new DrawWeldinnString();
        }

 */
        if(MouseMoved.enterTypeNew >= 5 ){
            new DrawWeldinnString();
        }

    }
}


