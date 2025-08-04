package com.example.application.Mouse;


import com.example.application.html.svg;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.UI;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;



/**
 * Generate string of svg kode for the actual weldPoint
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class ChangePlotCopy {
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

    public ChangePlotCopy(int plotModus, int oldPlotIndicator) {
        this.oldPlotIndicator = oldPlotIndicator;
        this.modellIndicator = CalcValues.modellIndicator;
        this.zoomStorage = CalcValues.zoomStorage;
        this.zoomX = CalcValues.zoomX;
        this.zoomY = CalcValues.zoomY;
        this.zoomC = CalcValues.zoomC;
        this.plotModell = CalcValues.plotModell;
        this.newAdresses = CalcValues.newAdresses;
        this.zoomIndex = CalcValues.zoomIndex;
        this.plotModus = plotModell;
        this.weldList = CalcValues.weldList;
        newIndex = 0;
        zoomC[13] = 1.5;
        for (int i = 7; i < 17; i++) {
            if (newAdresses[i] == plotModus) {
                newIndex = i;
            }
        }
        zoomNew = zoomC[newIndex];
        //       System.out.println("stat subroutine  zoomNew " + zoomNew + "   newIndex  " + newIndex + " plotModus  " + plotModus);
        String outSvgNew;  // =  outSvg;
        var canv = new svg();
        canv.setColor("red");
        String svgStop = canv.svgEnd();


        //       System.out.println("justert inn " + i + "  " +  textPoint);
        double iii = zoomNew / this.zoomIndex;
        iii = 1.0;
        //      System.out.println("test  " + zoomNew + "  " + zoomIndex + "  " + iii);
        double ixx;
        int ix;
        double iyy;
        int iy;
        int code;
        double fact = zoomNew / this.zoomIndex;
        int indeks = (int) zoomIndex;
        //      System.out.println("test for indeks "+ indeks);
        int[] ivalues = new int[15];
        if (indeks >= 15) {
            indeks = 14;
        }
        if (indeks <= 0) {
            indeks = 0;
        }
        double[] facValues = new double[15];

        //     System.out.println(zoomNew + "  " + this.zoomIndex);


        ivalues[0] = -5;
        ivalues[1] = -15;
        ivalues[2] = -35;
        ivalues[3] = -57;
        ivalues[4] = -84;
        ivalues[5] = -115;
        ivalues[6] = -120;
        ivalues[7] = -143;
        ivalues[8] = -165;
        ivalues[9] = -205;
        ivalues[10] = -210;
        ivalues[11] = -240;
        ivalues[12] = -300;
        ivalues[13] = -310;
        ivalues[14] = -330;

        facValues[0] = 1.0;
        facValues[1] = 1.48;
        facValues[2] = 0.75;
        facValues[3] = 0.50;
        facValues[4] = 0.37;
        facValues[5] = 0.29;
        facValues[6] = 0.25;
        facValues[7] = 0.22;
        facValues[8] = 0.19;
        facValues[9] = 0.16;
        facValues[10] = 0.15;
        facValues[11] = 0.14;
        facValues[12] = 0.13;
        facValues[13] = 0.12;
        facValues[14] = 0.11;

        double factor = facValues[indeks];
        int iFact = ivalues[indeks];
        numberWeld = weldList.size();
        svgWeld = "";
//////////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < numberWeld; i++) {
            tester = weldList.get(i);
            indicator = tester.getIndicator();
            type = tester.getType();
            user = tester.getUser();
            code = tester.getCode();

            if (indicator == CalcValues.plotIndicator && !(code == 30)) {
                firstPoint = tester.getWeldPointFirst();
                lastPoint = tester.getWeldPointLast();
                middelPoint = tester.getWeldPointMiddel();
                textPoint = tester.getWeldPointTextPoint();

                firstPoint = calcPoint(firstPoint.x, firstPoint.y, factor, iFact);
                textPoint = calcPoint(textPoint.x, textPoint.y, factor, iFact);
                middelPoint = calcPoint(middelPoint.x, middelPoint.y, factor, iFact);
                lastPoint = calcPoint(lastPoint.x, lastPoint.y, factor, iFact);
                tester.setWeldPointFirst(firstPoint);
                tester.setWeldPointMiddel(middelPoint);
                tester.setWeldPointLast(lastPoint);
                tester.setWeldPointTextPoint(textPoint);
                tester.setCode(30);
                testerNew = weldList.get(i);
                //    actualList.add(testerNew);
                int ant = svgStringWeld.size();
                int ind = 0;
                //   if ( testerNew.getCode() == 30 && plotModell == 4)



                firstPoint = testerNew.getWeldPointFirst();
                middelPoint = testerNew.getWeldPointMiddel();
                lastPoint = testerNew.getWeldPointLast();
                textPoint = testerNew.getWeldPointTextPoint();
                ident = testerNew.getWeldPointText();
                punktPlottes = testerNew.getWeldPointPlottes();
                textPlottes = testerNew.getWeldTextPlottes();
                type = testerNew.getType();
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

                //      CalcValues.svgNew += svgWeld + CalcValues.svgSymbol;

            }
        }

        modellIndicator[plotModell] = indicator ;
 //      CalcValues.modellIndicator[plotModell] = indicator;
//System.out.println("test ChangePlot " + plotModus + "  " + plotModell);
        if(plotModell == 1 ) { CalcValues.gang[2] =17;}
        if(plotModell == 2 ) { CalcValues.gang[2] =18;}
        if(plotModell == 3 ) { CalcValues.gang[2] =19;}
        if(plotModell == 4 ) { CalcValues.gang[2] =20;}
        svgWeld = "";
        numberWeld = weldList.size();
        // System.// out.println("ttt  " + plotModell + "  " numberWeld);
        if(plotModell == 4 ) {
//////////////////////////////
            for (int  j= 0; j < numberWeld; j++) {
                tester = weldList.get(j);
                indicator = tester.getIndicator();
                type = tester.getType();
                user = tester.getUser();
                code = tester.getCode();

                if (( indicator == CalcValues.modellIndicator[1]   ||   indicator == CalcValues.modellIndicator[2]   ||   indicator == CalcValues.modellIndicator[3] )    && (code == 30)) {
                //    System.out.println("int  " + indicator + " " + code);
                    firstPoint = tester.getWeldPointFirst();
                    lastPoint = tester.getWeldPointLast();
                    middelPoint = tester.getWeldPointMiddel();
                    textPoint = tester.getWeldPointTextPoint();


                    int antt= svgStringWeld.size();
                    int inf = 0;
                    System.out.println("numbe1" + antt + "  " + svgWeld);
                    svgInnhold = canv.drawBezier2(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
                    svgStringWeld.add(antt+ inf, svgInnhold);
                    svgWeld = svgWeld + svgStringWeld.get(antt+ inf);
                    System.out.println("numbe2 " + antt + "  " + svgWeld + "  " + punktPlottes);
                    if (punktPlottes) {
                        svgInnhold = canv.drawCircle(firstPoint.x, firstPoint.y, 3);
                        svgStringCircleFirst.add(antt+ inf, svgInnhold);
                        svgWeld = svgWeld + svgStringCircleFirst.get(antt+ inf);
                        svgInnhold = canv.drawCircle(lastPoint.x, lastPoint.y, 3);
                        svgStringCircleLast.add(antt+ inf, svgInnhold);
                        svgWeld = svgWeld + svgStringCircleLast.get(antt+ inf);
                        svgInnhold = canv.drawCircle(middelPoint.x, middelPoint.y, 3);
                        svgStringCircleMiddel.add(antt+ inf, svgInnhold);
                        svgWeld = svgWeld + svgStringCircleMiddel.get(antt+ inf);

                    }
                    if (textPlottes) {
                        svgInnhold = canv.drawText(ident, textPoint.x, textPoint.y);
                        svgStringText.add(antt+ inf, svgInnhold);
                        svgWeld = svgWeld + svgStringText.get(antt+ inf);

                    }
                }



            }


//////////////////////////
        }

        CalcValues.svgNew += svgWeld + CalcValues.svgSymbol;
        if (CalcValues.valgIndeks == 1) {
            UI.getCurrent().getPage().setLocation("ImageLast");
        }
        if (CalcValues.valgIndeks == 2) {
            UI.getCurrent().getPage().setLocation("Image");
        }

    }
    private Point calcPoint(int x, int y, double factor, int iFact){
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
        resultPoint.x = xNewi + xOrigo + xMove;
        resultPoint.y = yNewi + yOrigo + iFact + yMove ;
        return resultPoint;
    }
}





