package com.example.application.Mouse;

import com.example.application.html.ActualString;
import com.example.application.under.ExtraTall;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Route("possible")
public class MakeMovePossible {

    private List<ExtraTall> extraTall = new ArrayList<>();
    private  List<ExtraTall> extraTallTegn = new ArrayList<>();
    private ArrayList<WeldPoint> weldList = new ArrayList<WeldPoint>();
    Point firstPointNew = new Point();
    Point middelPointNew = new Point();
    Point lastPointNew = new Point();
    int index = 0;
    int code = 2;
    Boolean punktPlottes = false;
    Boolean textPlottes = true;
    int type = CalcValues.gang[2];
    String plotType = CalcValues.plotType;
    String atext = "100";
    int indicator ;
    String svgTab ;
    String user = CalcValues.userID;

    public  MakeMovePossible() {
   //     System.out.println("inn MakMovePossible ");
        firstPointNew.x = 0;
        middelPointNew.x = 0;
        lastPointNew.x = 0;
        firstPointNew.y = 0;
        middelPointNew.y = 0;
        lastPointNew.y = 0;
        indicator = CalcValues.plotIndicator;
        svgTab = "";
        for ( int i = 0; i < CalcValues.extraTallTegn.size(); i++) {
            Point textPoint = new Point();
            ExtraTall tester = new ExtraTall();
            tester = CalcValues.extraTallTegn.get(i);
            textPoint.x = tester.getFirstX();
            textPoint.y = tester.getFirstY();
       //     String identifi = "." + tester.getLastString();
            String identifi =  tester.getLastString();
          CalcValues.weldList.add(0, new WeldPoint(firstPointNew, middelPointNew, lastPointNew,new Point(textPoint.x, textPoint.y),identifi, punktPlottes,textPlottes, type,plotType, index, atext, code, indicator, user, svgTab));
        }
        for ( int i = 0; i < CalcValues.extraTall.size(); i++) {
            Point textPoint = new Point();
            ExtraTall tester = new ExtraTall();
            tester = CalcValues.extraTall.get(i);
            textPoint.x = tester.getFirstX();
            textPoint.y = tester.getFirstY();
            String identifi =  tester.getLastString();

          CalcValues.weldList.add(0, new WeldPoint(firstPointNew, middelPointNew, lastPointNew,textPoint,identifi, punktPlottes,textPlottes, type,plotType, index, atext, code, indicator, user, svgTab));
        }
     //   new MouseSymbol();
    //    new ActualString();
    //    new DrawWeldinnString();
   //     final var drawWeldingSymbol = new DrawWeldingSymbol();
  //      System.out.println(indicator);

    }
}
