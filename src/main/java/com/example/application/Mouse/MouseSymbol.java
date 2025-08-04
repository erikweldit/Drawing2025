package com.example.application.Mouse;

import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;

import java.awt.*;
import java.util.ArrayList;

/**
 * Find location for a welding symbol

 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
public class MouseSymbol {
    Point firstPointNew = new Point();
    //   public ArrayList<ExtraSymbol> symbolList = new ArrayList<>();
    public ArrayList<WeldPoint> weldList = new ArrayList<>();
    Point middlePointNew = new Point();
    Point lastPointNew = new Point();

    Point textPointNew = new Point();
    String ident;
    private int index;
    private String atext;
    int identificator ;
    boolean punktPlottes = false;
    boolean textPlottes = true;
    int type = 0;
    int indi;
    String plotType = CalcValues.plotType;

    /**
     * Find location for a welding symbol
     * @param textPointNew
     *
     * @author Erik Andreas Vold -  erikvold84@gmail.com
     */
    public MouseSymbol(Point textPointNew) {
        this.textPointNew = textPointNew;
        //   System.out.println("MouseSymbol  " + textPointNew);
        atext = "20";
        firstPointNew.x = 0;
        firstPointNew.y = 0;
        middlePointNew.x = 0;
        middlePointNew.y = 0;
        lastPointNew.x = 0;
        lastPointNew.y = 0;
   //     System.out.println("inn mouseSymbol ");
        var can = new CalcValues();
        CalcValues.startValue++;
        if (CalcValues.startValue > 122 ) {CalcValues.startValue = 65;}
        this.identificator = CalcValues.startValue;
        char kl = (char) identificator;
        String identifi = "." + kl;
        int type = CalcValues.gang[2];
        //System.out.println(" tttt " + kl );
        index = 0;
        atext = "0";
        int code = 2;
        String svgTab = "";
        int indi = CalcValues.plotIndicator;
        this.weldList = can.weldList;
        String user = CalcValues.userID;
   //     WeldPoint punkt1 = new WeldPoint(firstPointNew, middlePointNew, lastPointNew,textPointNew,identifi, punktPlottes,textPlottes, type,plotType, index, atext, code, indi, user, svgTab);
        CalcValues.weldList.add(0, new WeldPoint(firstPointNew, middlePointNew, lastPointNew,textPointNew,identifi, punktPlottes,textPlottes, type,plotType, index, atext, code, indi, user, svgTab));
  //        System.out.println("MouseSymbol  " + weldList.size() + "  " +  identifi);
        new DrawWeldingSymbol();
        // new DrawWeldinnString();


    }
}




