package com.example.application.Mouse;


import com.example.application.html.svg;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Generate string of svg kode for the actual weldPoint
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class ChangePlot {
    Point resultPoint = new Point();
    int[] zoomX = new int[20];
    double[] zoomC = new double[20];
    int[] zoomY = new int[20];
    double[] zoomF = new double[20];
    int[] newAdresses = new int[20];
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

    public ChangePlot(int plotModus, int oldPlotIndicator) {
        this.oldPlotIndicator = oldPlotIndicator;
        this.modellIndicator = CalcValues.modellIndicator;
        this.zoomStorage = CalcValues.zoomStorage;
        this.zoomX = CalcValues.zoomX;
        this.zoomY = CalcValues.zoomY;
        this.zoomC = CalcValues.zoomC;
        this.plotModell = CalcValues.plotModell;
        this.newAdresses = CalcValues.newAdresses;
        this.zoomIndex = CalcValues.zoomIndex;
        this.plotModus = plotModus;
        this.weldList = CalcValues.weldList;
        newIndex = 0;
        zoomC[13] = 1.5;
        for (int i = 7; i < 17; i++) {
            if (newAdresses[i] == plotModell) {
                newIndex = i;
            }
        }
        zoomNew = zoomC[newIndex];
        //    System.out.println("stat subroutine  zoomNew " + zoomNew + "   newIndex  " + newIndex + " plotModus  " + plotModus + " " + plotModell);
        String outSvgNew;  // =  outSvg;
        var canv = new svg();
        canv.setColor("red");
        String svgStop = canv.svgEnd();
    //    System.out.println("inn ChangePlot  ");

        //       System.out.println("justert inn " + i + "  " +  textPoint);
        double iii = zoomNew / this.zoomIndex;
        iii = 1.0;
        //     System.out.println("test  " + zoomNew + "  " + zoomIndex + "  " + iii);
        double ixx;
        int ix;
        double iyy;
        int iy;
        int code;
        double fact = zoomNew / this.zoomIndex;
        int indeks = (int) zoomIndex;
        //   System.out.println("test for indeks "+ indeks);
        int[] ivalues = new int[15];
        if (indeks >= 15) {
            indeks = 14;
        }
        if (indeks <= 0) {
            indeks = 0;
        }
        double[] facValues = new double[15];

        //     System.out.println(zoomNew + "  " + this.zoomIndex);


        ivalues[0] = 0;
        ivalues[1] = -13;
        ivalues[2] = -35;
        ivalues[3] = -57;
        ivalues[4] = -72;
        ivalues[5] = -96;
        ivalues[6] = -107;
        ivalues[7] = -136;
        ivalues[8] = -150;
        ivalues[9] = -190;
        ivalues[10] = -215;
        ivalues[11] = -240;
        ivalues[12] = -240;
        ivalues[13] = -260;
        ivalues[14] = -289;

        facValues[0] = 1.00;
        facValues[1] = 1.40;
        facValues[2] = 0.70;
        facValues[3] = 0.45;
        facValues[4] = 0.35;
        facValues[5] = 0.29;
        facValues[6] = 0.24;
        facValues[7] = 0.20;
        facValues[8] = 0.18;
        facValues[9] = 0.15;
        facValues[10] = 0.13;
        facValues[11] = 0.12;
        facValues[12] = 0.13;
        facValues[13] = 0.12;
        facValues[14] = 0.10;
        //       System.out.println(" changeplot 139  " + CalcValues.plotType );
        if (CalcValues.plotType.equals("butt") || CalcValues.plotType.equals("Butt")){
            facValues[6] = 0.34;
            ivalues[6] = -157;
        }
        if (CalcValues.plotType.equals("fillet")){
            facValues[6] = 0.37;
            ivalues[6] = -45;
        }
        if (CalcValues.plotType.equals("corner")){
            facValues[4] = 0.43;
            ivalues[4] = -45;
        }
        if (CalcValues.plotType.equals("flanged")){
            facValues[4] = 0.52;
            ivalues[4] = -10;
        }
        if (CalcValues.plotType.equals("overlap")){
            facValues[4] = 0.51;
            ivalues[4] = -10;
        }
        double factor = facValues[indeks];
        int iFact = ivalues[indeks];
        numberWeld = weldList.size();
        svgWeld = "";
        //plotModell = 5;
        //plotModus = 5;
//////////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < numberWeld; i++) {
            tester = weldList.get(i);
            indicator = tester.getIndicator();
            type = tester.getType();
            user = tester.getUser();
            code = tester.getCode();
            //      System.out.println("153 changsplot  " + indicator + " " + CalcValues.plotIndicator + "  " + code);
            if (indicator == CalcValues.plotIndicator && true) {   //!(code == 30)
                firstPoint = tester.getWeldPointFirst();
                lastPoint = tester.getWeldPointLast();
                middelPoint = tester.getWeldPointMiddel();
                textPoint = tester.getWeldPointTextPoint();
                //    System.out.println("159 old mini  " + firstPoint);
                firstPoint = calcPoint(firstPoint.x, firstPoint.y, factor, iFact);
                textPoint = calcPoint(textPoint.x, textPoint.y, factor, iFact);
                middelPoint = calcPoint(middelPoint.x, middelPoint.y, factor, iFact);
                lastPoint = calcPoint(lastPoint.x, lastPoint.y, factor, iFact);
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

        if(plotModell == 1 ) { CalcValues.gang[2] =7;}
        if(plotModell == 2 ) { CalcValues.gang[2] =8;}
        if(plotModell == 3 ) { CalcValues.gang[2] =9;}
        if(plotModell == 4 ) { CalcValues.gang[2] =10;}
        if(plotModell == 5 ) { CalcValues.gang[2] =11;}
        if(plotModell == 6 ) { CalcValues.gang[2] =12;}
        CalcValues.plotModell = plotModell;

//////////////////////////

        CalcValues.svgNew  =    svgWeld;    //  + CalcValues.svgSymbol
        //     System.out.println("svgNew = " + svgWeld);
//     System.out.println("ekstra  =  " +  CalcValues.svgSymbol);
        if(plotModell == 4 ){
            CalcValues.svgBuffer = svgWeld;
        }

        new DrawWeldinnString();

        /*
        if (CalcValues.valgIndeks == 1) {
            UI.getCurrent().getPage().setLocation("ImageLast");
        }
        if (CalcValues.valgIndeks == 2) {
            UI.getCurrent().getPage().setLocation("Image");
        }

         */
    }
    private Point calcPoint(int x, int y, double factor, int iFact){
        //   System.out.println(factor);
        int xOrigo = 600;
        int yOrigo = 360 - iFact;
        int ix = x - xOrigo ;
        int iy = y - yOrigo;
        Point resultPoint = new Point();
        double rOld = Math.sqrt(ix*ix + iy*iy);
        double f = factor;
        double sinA = iy/rOld;
        double cosA = ix/rOld;
        double rNew = f*rOld;
        double yNew = sinA*rNew;
        double xNew = cosA*rNew;
        int yNewi = (int) yNew;
        int xNewi = (int) xNew;
        int xMove = 0;
        int yMove = 0;
        if (plotModell == 4 ) { xMove = 300 ; yMove = 300;}
        if (plotModell == 3 ) { xMove = -300 ; yMove = 300;}
        if (plotModell == 2 ) { xMove = 300 ; yMove = -130;}
        if (plotModell == 1 ) { xMove = -300 ; yMove = -130;}
        if (plotModell == 5 ) { xMove = -300 ; yMove = -130;}
        if (plotModell == 6 ) { xMove = -300 ; yMove = -130;}
        resultPoint.x = xNewi + xOrigo + xMove;
        resultPoint.y = yNewi + yOrigo + iFact + yMove ;
        return resultPoint;
    }
}




