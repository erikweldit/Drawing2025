package com.example.application.Mouse;




import com.example.application.html.WeldSymbol;
import com.example.application.html.svg;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.UI;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.application.weld.CalcValues.gang;


/**
 * Generate string of svg code for weldPoint on printing page
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 *
 */

public class DrawWeldoutString {
    Point firstPoint = new Point();
    Point middelPoint = new Point();
    Point lastPoint = new Point();
    Point textPoint = new Point();
    String ident;
    boolean punktPlottes;
    boolean textPlottes;
    int numberWeld;
    int indicator;
    WeldPoint tester = new WeldPoint();
    public ArrayList<WeldPoint> weldList = new ArrayList<>();
    private ArrayList<WeldPoint> actualList = new ArrayList<>();
    String svgInnhold;
    String svgWeld;
    int type;
    String typePlot;
    List<String> svgStringWeld = new ArrayList<>();
    List<String> svgStringCircleFirst = new ArrayList<>();
    List<String> svgStringCircleLast = new ArrayList<>();
    List<String> svgStringCircleMiddel = new ArrayList<>();
    List<String> svgStringText= new ArrayList<>();
    String user;
    String aText = "0";
    int a1=0;
    int a2 = 0;
    int a3 = 0;

    WeldSymbol sym1 = new WeldSymbol(aText, a1,a2, a1);
    WeldSymbol sym2 = new WeldSymbol(a1, a1,a2);
    public DrawWeldoutString() {
        String outSvgNew;  // =  outSvg;
        var canv = new svg();
        canv.setColor("red");

        String svgStop = canv.svgEnd();

        this.weldList = CalcValues.weldList;
        numberWeld = weldList.size();
        svgWeld = "";

        for ( int i=0; i<numberWeld; i++) {
            tester = weldList.get(i);
            indicator = tester.getIndicator();
            type = tester.getType();
            user = tester.getUser();
            if (indicator == CalcValues.plotIndicator) {
                actualList.add(tester);
            }
            if (gang[2] == 12) {
                CalcValues.emptyBuffer = 12;
                if (( type == 7 || type ==8 || type == 11  )&& user.equals(CalcValues.userID)){
                    actualList.add(tester);
                }
            }
            if (gang[2] == 10) {
                CalcValues.emptyBuffer = 10;
                if (( type == 7 || type ==8 || type == 9 || type == 11 || type == 15  )&& user.equals(CalcValues.userID)){
                    actualList.add(tester);
                }
            }
            if (gang[2] == 16) {
                CalcValues.emptyBuffer = 16;
                if (( type == 7 || type ==9 || type == 15  )&& user.equals(CalcValues.userID)){
                    actualList.add(tester);
                }
            }
        }
        int ant = svgStringWeld.size();
        for (int ind = 0; ind < actualList.size(); ind++) {

            tester = actualList.get(ind);
            firstPoint = tester.getWeldPointFirst();
            middelPoint = tester.getWeldPointMiddel();
            lastPoint = tester.getWeldPointLast();
            textPoint = tester.getWeldPointTextPoint();
            ident = tester.getWeldPointText();
            punktPlottes = tester.getWeldPointPlottes();
            textPlottes = tester.getWeldTextPlottes();
            type = tester.getType();
            typePlot = tester.getPlotType();
            indicator = tester.getIndicator();

            String ident = tester.getWeldPointText();
            aText = tester.getAString();
            int code  = tester.getCode();
            if(  code == 1) {
                svgWeld += canv.drawBezier2(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
                svgWeld += canv.drawText(ident  ,textPoint.x,textPoint.y );
            }
            if( code == 3 ) {
                svgWeld += canv.drawBezier2(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
            }

            if ( code == 2) {
                svgWeld += canv.drawText(ident, textPoint.x, textPoint.y);
                int tall = sym1.giveInteger(aText);
                String textNew = sym2.choseSymbol( tall, textPoint.x, textPoint.y);
                tester.setSymbol(textNew);
                svgWeld += textNew;
            }

            if (punktPlottes && ( code == 1 || code == 3)) {
                svgWeld += canv.drawCircle(firstPoint.x, firstPoint.y, 3);
                svgWeld += canv.drawCircle(lastPoint.x, lastPoint.y, 3);
                svgWeld += canv.drawCircle(middelPoint.x, middelPoint.y, 3);
            }

        }


        CalcValues.svgNew = svgWeld;
        if (CalcValues.valgIndeks == 1) {
            UI.getCurrent().getPage().setLocation("ImageLast");
        }
        if (CalcValues.valgIndeks == 2) {
            UI.getCurrent().getPage().setLocation("Image");
        }
        if (CalcValues.valgIndeks == 3) {
     //       UI.getCurrent().getPage().setLocation("zoommenue");
        }
        if (CalcValues.valgIndeks == 4) {
            //     new ZoomMenue5();
            UI.getCurrent().getPage().setLocation("zoomimage");
        }
    }

}


