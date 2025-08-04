package com.example.application.Mouse;




import com.example.application.under.ExtraBue;
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
@Route(value = "mousebue" , layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Drawing line ")

public class MouseBue {
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
    ArrayList<ExtraBue> weldBue = new ArrayList<ExtraBue>();

    public static WeldPoint tester = new WeldPoint();
    ExtraBue el = new ExtraBue();

    int code;
    public MouseBue() {

        type = CalcValues.gang[2];
        index = 0;

        atext = "0";
        code = 3;
        identifi = ".";

        atext = "";
        code = 1;

        this.plotType = CalcValues.plotType;
        indi = CalcValues.plotIndicator;
        this.weldList = CalcValues.weldList;
        this.weldBue = CalcValues.weldBue;
        user = CalcValues.userID;
        svgTab = " ";
        int h = this.weldBue.size();
        for (int f=h-1; f>= 0 ; f--) {              //   for (int f=0; f<h ; f++) {
            el = this.weldBue.get(f);
            CalcValues.numberOfSymbols += 1;
            identifi = "" + CalcValues.numberOfSymbols;
            firstPointNew[f] = new Point();
            lastPointNew[f] = new Point();
            middlePointNew[f]  = new Point();
            textPointNew[f]  = new Point();
            firstPointNew[f].x = el.getFirstX();
            firstPointNew[f].y = el.getFirstY();
            lastPointNew[f].x = el.getFirstZ();
            lastPointNew[f].y = el.getLastZ();
            middlePointNew[f].x = el.getLastX();
            middlePointNew[f].y = el.getLastY();
            textPointNew[f].x = (el.getFirstX() +el.getFirstZ() )/2;
            textPointNew[f].y = (el.getFirstY()+el.getLastZ())/2;

            this.weldList.add(  new WeldPoint(firstPointNew[f], middlePointNew[f], lastPointNew[f], textPointNew[f], identifi, punktPlottes, textPlottes, type, plotType, index, atext, code, indi, user, svgTab));
        }
        int hl = CalcValues.weldBue.size();
        for (int j = hl-1; j >= 0; j--) {
            CalcValues.weldBue.remove(j);
        }
        CalcValues.weldList = this.weldList;
        new DrawWeldinnString();
    }

}











