package com.example.application.Mouse;


import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;

import java.awt.*;
import java.util.ArrayList;
/**
 * Give a new welding point inn to system
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
public class MousDraw {
    Point firstPointNew = new Point();
    Point middelPointNew = new Point();
    Point lastPointNew = new Point();
    public ArrayList<WeldPoint> weldList = new ArrayList<>();
    Point textPointNew = new Point();
    String ident;

    public MousDraw(Point firstPointNew, Point middelPointNew, Point lastPointNew, Point textPointNew, String ident) {
        this.firstPointNew = firstPointNew;
        this.middelPointNew = middelPointNew;
        this.lastPointNew = lastPointNew;
        this.textPointNew = textPointNew;
        this.ident = ident;

        var can = new CalcValues();
        this.weldList = can.weldList;


        new DrawWeldinnString();


    }
}



