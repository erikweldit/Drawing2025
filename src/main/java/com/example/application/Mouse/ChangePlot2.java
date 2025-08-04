package com.example.application.Mouse;


import com.example.application.html.svg;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.application.weld.CalcValues.gang;
import static com.example.application.weld.CalcValues.plotType;

/**
 * Generate string of svg kode for the actual weldPoint
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class ChangePlot2 {
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

    public ChangePlot2(int plotModus, int oldPlotIndicator) {
        this.oldPlotIndicator = oldPlotIndicator;
        this.modellIndicator = CalcValues.modellIndicator;
        this.zoomStorage = CalcValues.zoomStorage;
        this.plotModell = CalcValues.plotModell;
        this.zoomIndex = CalcValues.zoomIndex;
        this.plotModus = plotModus;
        this.weldList = CalcValues.weldList;
        newIndex = 0;
    //    System.out.println("inn ChangePlot2 " );
  //     System.out.println("stat2 subroutine2  zoomNew = " + zoomNew + "   newIndex =  " + newIndex + " plotModus =  " + plotModus + " plotModel = " + plotModell);
 //      System.out.println( this.zoomStorage + "  " +  this.zoomStorage + "  " +      this.zoomIndex + "  " + this.plotModus  );
       String outSvgNew;  // =  outSvg;
        var canv = new svg();
        canv.setColor("red");
        String svgStop = canv.svgEnd();

        int code;

        numberWeld = weldList.size();
        svgWeld = "";
   //     plotModell = 5;  // actual type
        //plotModus = 5;
   //     System.out.println("numberWeld=  " + numberWeld);
      //  if (plotModell == 5) CalcValues.gang[2] = 12;
//////////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < numberWeld; i++) {
            tester = weldList.get(i);
            indicator = tester.getIndicator();
            type = tester.getType();
            user = tester.getUser();
            code = tester.getCode();
        //          System.out.println("153 changsplot  " + indicator + " " + CalcValues.plotIndicator + "  " + code);
            if (indicator == CalcValues.plotIndicator && true) {   //!(code == 30)
                firstPoint = tester.getWeldPointFirst();
                lastPoint = tester.getWeldPointLast();
                middelPoint = tester.getWeldPointMiddel();
                textPoint = tester.getWeldPointTextPoint();
                //    System.out.println("159 old mini  " + firstPoint);
                firstPoint = calcPoint(firstPoint.x, firstPoint.y);
                textPoint = calcPoint(textPoint.x, textPoint.y);
                middelPoint = calcPoint(middelPoint.x, middelPoint.y);
                lastPoint = calcPoint(lastPoint.x, lastPoint.y);
                //      System.out.println("164 new mini  " + firstPoint);
                tester.setWeldPointFirst(firstPoint);
                tester.setWeldPointMiddel(middelPoint);
                tester.setWeldPointLast(lastPoint);
                tester.setWeldPointTextPoint(textPoint);
                tester.setCode(30);
                testerNew = weldList.get(i);
                actualList.add(testerNew);
            }
        }

//////////////////////////////////////////////////////////////////////////////////////////////
        if(plotModell == 4 ) {
//////////////////////////////
            for (int  j= 0; j < numberWeld; j++) {
                tester = weldList.get(j);
                indicator = tester.getIndicator();
                type = tester.getType();
                user = tester.getUser();
                code = tester.getCode();

                if (( indicator == CalcValues.modellIndicator[1]   ||   indicator == CalcValues.modellIndicator[2]   ||   indicator == CalcValues.modellIndicator[3] )    && (code == 30)) {

                    tester.setIndicator(CalcValues.modellIndicator[4]);
                    actualList.add(tester);
                }
            }
        }
        int  numberActual = actualList.size();
        svgWeld = "";
        int ant = svgStringWeld.size();
        int ind = 0;
        //    System.out.println("plotModell  " + this.plotModell + "  "  + numberActual);
        //   plotModell = 5;
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
            type = testerNew.getType();
            ind = i;
            typePlot = testerNew.getPlotType();
            svgInnhold = canv.drawBezier2(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
            svgStringWeld.add(ant + ind, svgInnhold);
            svgWeld = svgWeld + svgStringWeld.get(ant + ind);

            if (punktPlottes) {

                svgInnhold = canv.drawCircle(firstPoint.x, firstPoint.y, 3);
                svgStringCircleFirst.add(ant + ind, svgInnhold);
                svgWeld = svgWeld + svgStringCircleFirst.get(ant + ind);
                svgInnhold = canv.drawCircle(lastPoint.x, lastPoint.y, 3);
                svgStringCircleLast.add(ant + ind, svgInnhold);
                svgWeld = svgWeld + svgStringCircleLast.get(ant + ind);
                svgInnhold = canv.drawCircle(middelPoint.x, middelPoint.y, 3);
                svgStringCircleMiddel.add(ant + ind, svgInnhold);
                svgWeld = svgWeld + svgStringCircleMiddel.get(ant + ind);

            }
            if (textPlottes) {
                svgInnhold = canv.drawText(ident, textPoint.x, textPoint.y);
                svgStringText.add(ant + ind, svgInnhold);
                svgWeld = svgWeld + svgStringText.get(ant + ind);

            }



        }
        //  System.out.println("svgWeld  " + svgWeld);
        //    System.out.println("test ChangePlot " + plotModus + "  " + plotModell);
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

        CalcValues.svgNew  =    svgWeld;    //  + CalcValues.svgSymbol
        //     System.out.println("svgNew = " + svgWeld);
//     System.out.println("ekstra  =  " +  CalcValues.svgSymbol);
        if(plotModell == 4 ){
            CalcValues.svgBuffer = svgWeld;
        }

        new DrawWeldinnString();

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
        if (plotModell == 6 ) { xMove += -300 ; yMove = -130;}
        resultPoint.x = x + xMove;
        resultPoint.y = y + yMove ;
        return resultPoint;
    }
}





