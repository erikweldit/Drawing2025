package com.example.application.Mouse;

import com.example.application.html.WeldSymbol;
import com.example.application.html.svg;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.application.weld.CalcValues.*;
import static com.example.application.weld.CalcValues.gang;
import static com.example.application.weld.CalcValues.plotType;

/**
 * Generate string of svg kode for the actual weldPoint
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class ChangePlot3Old {
    Point resultPoint = new Point();
    Point firstPoint = new Point();
    Point middelPoint = new Point();
    Point lastPoint = new Point();
    Point textPoint = new Point();
    String ident;
    boolean punktPlottes;
    boolean textPlottes;
    int numberWeld;
    int plotModus;
    WeldPoint tester = new WeldPoint();
    WeldPoint testerNew = new WeldPoint();
    private ArrayList<WeldPoint> weldList = new ArrayList<>();
    private ArrayList<WeldPoint> actualList = new ArrayList<>();
    String svgInnhold;
    String svgWeld;
    String user;
    int type;
    int indicator;
    String typePlot;
    List<String> svgStringWeld = new ArrayList<>();
    List<String> svgStringCircleFirst = new ArrayList<>();
    List<String> svgStringCircleLast = new ArrayList<>();
    List<String> svgStringCircleMiddel = new ArrayList<>();
    List<String> svgStringText = new ArrayList<>();
    int zoomStorage;
    double zoomIndex;
    double zoomNew;
    int newIndex;
    int oldPlotIndicator;
    int plotModell;
    int [] modellIndicator = new int[10];
    String aText = "";
    int a1=0;
    int a2 = 0;
    int a3 = 0;

    WeldSymbol sym1 = new WeldSymbol(aText, a1,a2, a1);
    WeldSymbol sym2 = new WeldSymbol(a1, a1,a2);

    public ChangePlot3Old(int plotModus, int oldPlotIndicator) {
        this.oldPlotIndicator = oldPlotIndicator;
        this.modellIndicator = CalcValues.modellIndicator;
        this.zoomStorage = CalcValues.zoomStorage;
        this.plotModell = CalcValues.plotModell;
        this.zoomIndex = CalcValues.zoomIndex;
        this.plotModus = plotModus;
        this.weldList = CalcValues.weldList;
        newIndex = 0;
        CalcValues.svgNew = "";
        String outSvgNew;  // =  outSvg;
        svg canv = new svg();
        canv.setColor("red");
        canv.setStroke(1);
        String svgStop = canv.svgEnd();
        int code;
        numberWeld = weldList.size();
        svgWeld = "";

//////////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < numberWeld; i++) {
            tester = weldList.get(i);
            indicator = tester.getIndicator();
            type = tester.getType();
            user = tester.getUser();
            code = tester.getCode();
            if (indicator == plotIndicator) {

                if ( code == 1 || code == 3 ) {
                    firstPoint = tester.getWeldPointFirst();
                    lastPoint = tester.getWeldPointLast();
                    middelPoint = tester.getWeldPointMiddel();
                    textPoint = tester.getWeldPointTextPoint();

                    firstPoint = calcPoint(firstPoint.x, firstPoint.y);
                    textPoint = calcPoint(textPoint.x, textPoint.y);
                    middelPoint = calcPoint(middelPoint.x, middelPoint.y);
                    lastPoint = calcPoint(lastPoint.x, lastPoint.y);

                    tester.setWeldPointFirst(firstPoint);
                    tester.setWeldPointMiddel(middelPoint);
                    tester.setWeldPointLast(lastPoint);
                    tester.setWeldPointTextPoint(textPoint);
                }

                if ( code == 2 ) {
                    textPoint = tester.getWeldPointTextPoint();
                    textPoint = calcPoint(textPoint.x, textPoint.y);
                    tester.setWeldPointTextPoint(textPoint);
                }
                //     System.out.println("actual old  " + textPoint + "   "  +ident + "   "  + code);
                actualList.add(0,tester);
                //        System.out.println("textPoint  " +  tester.getWeldPointTextPoint());
            }
        }
        int  numberActual = actualList.size();
        System.out.println("numberActual  " + "  " + actualList.size());
//////////////////////////////////////////////////////////////////////////////////////////////
        if(plotModell == 4 ) {
//////////////////////////////
            for (int  j= 0; j < numberWeld; j++) {
                tester = weldList.get(j);
                indicator = tester.getIndicator();
                type = tester.getType();
                user = tester.getUser();
                code = tester.getCode();

                if (( indicator == CalcValues.modellIndicator[1]   ||   indicator == CalcValues.modellIndicator[2]   ||   indicator == CalcValues.modellIndicator[3] )  ){    //&& (code == 30)) {

                    tester.setIndicator(CalcValues.modellIndicator[4]);
                    actualList.add(0, tester);
                }
            }
        }
        System.out.println("numberActual  " + "  " + actualList.size()  +   "   olotModell " + plotModell);
        numberActual = actualList.size();
        System.out.println("numberActual etter " + "  " + numberActual);
        svgWeld = "";
        int ant = svgStringWeld.size();
        int ind = 0;

        for (int i = 0; i < numberActual; i++) {
            testerNew = actualList.get(i);
            indicator = testerNew.getIndicator();
            type = testerNew.getType();
            user = testerNew.getUser();
            code = testerNew.getCode();
            firstPoint = testerNew.getWeldPointFirst();
            middelPoint = testerNew.getWeldPointMiddel();
            lastPoint = testerNew.getWeldPointLast();
            textPoint = testerNew.getWeldPointTextPoint();
            ident = testerNew.getWeldPointText();
            punktPlottes = testerNew.getWeldPointPlottes();
            textPlottes = testerNew.getWeldTextPlottes();
            aText = testerNew.getAString();
            type = testerNew.getType();
            ind = i;
            typePlot = testerNew.getPlotType();

            if (code == 1 ) {
                svgWeld += canv.drawBezier2(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
                svgWeld += canv.drawText(ident, textPoint.x, textPoint.y);
                //    System.out.println(svgWeld);
            }
            if (code == 3 ) {
                svgWeld += canv.drawBezier2(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
                //     System.out.println(svgWeld);
            }
            if ( code == 2) {
                svgWeld += canv.drawText(ident, textPoint.x, textPoint.y);
                if (!(aText.equals("0") || aText.equals("100")))  {
                    int tall = sym1.giveInteger(aText);
                    String textNew = sym2.choseSymbol(tall, textPoint.x, textPoint.y);
                    tester.setSymbol(textNew);
                    svgWeld += textNew;
                }
            }

            if (punktPlottes && ( code == 1 || code == 3)) {
                svgWeld += canv.drawCircle(firstPoint.x, firstPoint.y, 3);
                svgWeld += canv.drawCircle(lastPoint.x, lastPoint.y, 3);
                svgWeld += canv.drawCircle(middelPoint.x, middelPoint.y, 3);
                //    System.out.println(svgWeld);
            }
            /*
            if (textPlottes) {
                svgWeld += canv.drawText(ident, textPoint.x, textPoint.y);

            }

             */

        }
        //     System.out.println("plotModell " + plotModell);
        // System.out.println("svgWeld  " + svgWeld);
        //    System.out.println("out ChangePlot " + plotModus + "  " + plotModell);
        modellIndicator[plotModell] = indicator ;
        CalcValues.modellIndicator[plotModell] = indicator;

        if(plotModell == 1 ) { gang[2] =7;}
        if(plotModell == 2 ) { gang[2] =8;}
        if(plotModell == 3 ) { gang[2] =9;}
        if(plotModell == 4 ) { gang[2] =10;}
        if(plotModell == 5 ) { gang[2] =11;}
        if(plotModell == 6 ) { gang[2] =15;}
        if(plotModell == 7 ) { gang[2] =12;}
        CalcValues.plotModell = plotModell;

//////////////////////////
        /*
        System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj svgNew");
        System.out.println(CalcValues.svgNew);
        System.out.println("ffffffffffffffffffffffffffffffffffffffffffffff svgWeld" );
        System.out.println(svgWeld);

        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh svgBuffer");
        System.out.println(CalcValues.svgBuffer);
        ///////////////////////////////

         */
        CalcValues.svgNew = svgWeld;
        //  CalcValues.svgNew = svgWeld;
        svgBuffer += svgWeld;
        //      System.out.println("svgNew  " + svgNew);
        System.out.println("svgWeld = " + svgWeld);
//     System.out.println("ekstra  =  " +  CalcValues.svgSymbol);
        if(plotModell == 4 || plotModell == 7 ){
            svgBuffer += svgWeld;
        }

        CalcValues.svgBuffer = svgBuffer;
        System.out.println("svgNews etter");
        //   System.out.println(CalcValues.svgNew);

        new DrawWeldinnString();
        new DrawWeldingSymbol();
    }
    private Point calcPoint(int x, int y){
        Point resultPoint = new Point();
        int xMove = 0;
        int yMove = 0;

        if (plotType.equals("fillet" ) && gang[2] == 0) yMove += -48;
        if (plotType.equals("flanged" ) && gang[2] == 0) yMove += -48;
        if (plotType.equals("overlap" ) && gang[2] == 0) yMove += -48;
        //   if (plotType.equals("corner" ) && gang[2] == 0) yMove += -48;
        //   if (plotType.equals("fillet" ) && gang[2] == 14) { xMove += -0; yMove += -0;}
        if (plotModell == 4 ) { xMove += 300 ; yMove += 300;}
        if (plotModell == 3 ) { xMove += -300 ; yMove += 300;}
        if (plotModell == 2 ) { xMove += 300 ; yMove += -130;}
        if (plotModell == 1 ) { xMove += -300 ; yMove += -130;}
        if (plotModell == 5 ) { xMove += -300 ; yMove += -130;}
        if (plotModell == 6 ) { xMove += -300 ; yMove += -130;}
        if (plotModell == 7 ) { xMove +=   0 ; yMove =  0;}
        //    if (plotModus == 0 ) { xMove += 0 ; yMove = +-130;}
        //    if (plotModus == 5 ) { xMove += 0 ; yMove = 130;}
        resultPoint.x = x + xMove;
        resultPoint.y = y + yMove ;
        return resultPoint;
    }
}



