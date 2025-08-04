package com.example.application.images;

import com.example.application.Mouse.DrawWeldingSymbol;
import com.example.application.Mouse.DrawWeldinnString;
import com.example.application.under.WeldPoint;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.example.application.Mouse.MouseMoved;

import java.awt.*;
import java.util.ArrayList;


@AnonymousAllowed
@Route(value = "placing")
public class BezierPlacing  extends VerticalLayout {

    Boolean entered;
    ArrayList<WeldPoint> weldList = new ArrayList<>();
    WeldPoint tester = new WeldPoint();
    int enterTypeNew;
    int code;
    int[] telleValue = new int[8];
    Point point = new Point();
    private  Point firstPointNew = new Point();
    private Point lastPointNew = new Point();
    private Point middelPointNew = new Point();
    private Point textPoint = new Point();

    public BezierPlacing() {
 //       System.out.println("enter BezierPlacing  ");
        this.telleValue = MouseMoved.telleValue;
        this.tester = MouseMoved.tester;
        this.enterTypeNew = MouseMoved.enterTypeNew;
        this.weldList = CalcValues.weldList;

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
        /*
        System.out.println("enter BezierPlacing  ");
    for (int i=0; i<8; i++) {


        System.out.println( telleValue[i] );
    }

         */
        if ( code == 2 ) {
            new DrawWeldingSymbol();
        } else {
            new DrawWeldinnString();
        }


    }
}

