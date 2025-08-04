package com.example.application.Mouse;



import com.example.application.under.ExtraLine;
import com.example.application.under.WeldPoint;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;


import java.awt.*;
import java.util.ArrayList;

/**
 * Moving an old point to new point after locating it
 *
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route(value = "mouseline" , layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Drawing line ")

public class MouseLine {
    String user;
    public ArrayList<WeldPoint> weldList = new ArrayList<>();
    Point[] firstPointNew = new Point[10];;
    Point[] middlePointNew = new Point[10];
    Point[] lastPointNew = new Point[10];;
    Point[] textPointNew = new Point[10];
    String svgTab;
    private int index;
    private String atext;
    boolean punktPlottes = true;
    boolean textPlottes = true;
    int type = 0;
    int indi;
    String plotType = "";

    String identifi;
    ArrayList<ExtraLine> weldStroke = new ArrayList<ExtraLine>();

    public static WeldPoint tester = new WeldPoint();
    ExtraLine el = new ExtraLine();

    int code;
    public MouseLine() {
        type = CalcValues.gang[2];
        index = 0;
        atext = "0";
        code = 3;
        identifi = ".";
        this.plotType = CalcValues.plotType;
        indi = CalcValues.plotIndicator;
        this.weldList = CalcValues.weldList;
        this.weldStroke = CalcValues.weldStroke;
        user = CalcValues.userID;
        svgTab = " ";
        int h = this.weldStroke.size();
        for (int f=0; f<h ; f++) {
            el = this.weldStroke.get(f);
            firstPointNew[f] = new Point();
            lastPointNew[f] = new Point();
            middlePointNew[f]  = new Point();
            textPointNew[f]  = new Point();
            firstPointNew[f].x = el.getFirstX();
            firstPointNew[f].y = el.getFirstY();
            lastPointNew[f].x = el.getLastX();
            lastPointNew[f].y = el.getLastY();
            middlePointNew[f].x = (firstPointNew[f].x + lastPointNew[f].x) / 2;
            middlePointNew[f].y = (firstPointNew[f].y + lastPointNew[f].y) / 2;
            textPointNew[f].x = 0;
            textPointNew[f].y = 0;
            this.weldList.add(  new WeldPoint(firstPointNew[f], middlePointNew[f], lastPointNew[f], textPointNew[f], identifi, punktPlottes, textPlottes, type, plotType, index, atext, code, indi, user, svgTab));
        }
        int hl = CalcValues.weldStroke.size();
        for (int j = hl-1; j >= 0; j--) {
            CalcValues.weldStroke.remove(j);
        }
        CalcValues.weldList = this.weldList;
        new DrawWeldinnString();
    }

}









