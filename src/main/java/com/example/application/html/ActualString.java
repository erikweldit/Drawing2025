package com.example.application.html;


import com.example.application.Mouse.MakeMovePossible;
import com.example.application.under.*;
import com.example.application.views.list.MainLayoutFile;
import com.example.application.weld.CalcValues;
import com.example.application.weld.ImageStorage;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.application.weld.CalcValues.*;


/**
 * Genererer tegningene som en svg-kode
 * @retur outSvg  som er en streng for gir hele svg koden unntatt avslutningsn
 * Legger verdier inn i statiske variable
 * CalcValues.outSvg
 * CalcValues.endSvg
 * CalcValues.outHtml
 * CalcValues.stopHtml
 *
 */
@AnonymousAllowed
@Route(value = "/actual", layout = MainLayoutFile.class)
@PageTitle("Weld IT AS - Actual weld drawing")

public  class ActualString extends VerticalLayout {

    String plotType;
    int antall;
    int xP;
    int plotModell;
    int yP;
    List<ExtraLine> extraLine = new ArrayList<>();
    List<ExtraBase> extraBase = new ArrayList<>();

    List<ExtraBue> extraBue = new ArrayList<>();

    List<ExtraTall> extraTall = new ArrayList<>();

    List<ExtraEllipse> extraEllipse = new ArrayList<>();

    List<ExtraLine> extraLineTegn = new ArrayList<>();
    List<ExtraLine> extraLineTabell = new ArrayList<>();
    List<ExtraBue> extraBueTegn = new ArrayList<>();

    List<ExtraTall> extraTallTegn = new ArrayList<>();

    List<ExtraTall> extraTallBase = new ArrayList<>();
    List<ExtraTall> actualMoveString = new ArrayList<>();
    List<ExtraTall> actualMoveStringNew = new ArrayList<>();

    List<ExtraEllipse> extraEllipseTegn = new ArrayList<>();

    List<ExtraArray> extraArrayTegn = new ArrayList<>();

    List<ExtraOval> extraOval = new ArrayList<>();
    List<ExtraText> extraText = new ArrayList<>();
    List<ExtraComment> extraComment = new ArrayList<>();
    List<String> svgString = new ArrayList<>();
    List<String> svgString0 = new ArrayList<>();
    List<String> svgString1 = new ArrayList<>();
    List<String> svgString2 = new ArrayList<>();
    List<String> svgString3 = new ArrayList<>();

    List<String> svgString4 = new ArrayList<>();
    List<String> svgString5 = new ArrayList<>();
    List<String> svgString6 = new ArrayList<>();
    ArrayList<WeldPoint> weldList = new ArrayList<>();
    String svgString7 ;
    String svgString8 ;
    List<String> svgString9 = new ArrayList<>();
    int[] gang = new int[25];



    int[] vec = new int[35];
    public  String actualString;
    Boolean tegning;
    Boolean teksting;


    double fact;
    double zoomIndex;

    public static int transX;
    public static int transY;
    public static double factor;

    public ActualString()  {
    //    new MakeMovePossible();
        this.plotType = CalcValues.plotType;
        this.gang = CalcValues.gang;
        this.extraOval = CalcValues.extraOval;
        this.extraText = CalcValues.extraText;
        this.extraBase = CalcValues.extraBase;
        this.extraLine = CalcValues.extraLine;
        this.extraBue = CalcValues.extraBue;
        this.extraTall = CalcValues.extraTall;
        this.extraEllipse = CalcValues.extraEllipse;
        this.extraLineTegn = CalcValues.extraLineTegn;
        this.extraLineTabell = CalcValues.extraLineTabell;
        this.extraBueTegn = CalcValues.extraBueTegn;
        this.extraTallTegn = CalcValues.extraTallTegn;
        this.extraArrayTegn = CalcValues.extraArrayTegn;
        this.extraTallBase = CalcValues.extraTallBase;
        this.extraEllipseTegn = CalcValues.extraEllipseTegn;
        this.extraComment = CalcValues.extraComment;
        this.weldList = CalcValues.weldList;
        this.plotModell = CalcValues.plotModell;
        //this.actualMoveString = CalcValues.actualMoveString;
        //this.actualMoveStringNew = CalcValues.actualMoveStringNew;
        this.xP = CalcValues.xP;
        this.yP = CalcValues.yP;
        this.fact = CalcValues.fact;
        this.zoomIndex = CalcValues.zoomIndex;
 //     System.out.println("inn actualString");

        svgNew= "";

        if (this.gang[1] == 1) {
            tegning = true;
        } else {
            tegning = false;
        }
        if (this.gang[0] == 1) {
            teksting = true;
        } else {
            teksting = false;
        }
    //    System.out.println("out actualString");
       CalcValues.drawing = getActualString();
    }
    public  String getActualString() {
        actualString =  getThymeleafTemplate();
        return actualString;
    }
    public String getThymeleafTemplate() {
 //       System.out.println("getActualString inn ");
        transX = 0; ;
        transY = 0;
        factor = fScalare[2];
        ImageStorage imageOut = new ImageStorage();
        if(gang[2] == 0 ) {
            //   transX = 100;  // 200;
            // transY = 40 ; // 140 ;
            //   factor = 1.5;
            factor = CalcValues.zoomIndex;
            transX = 200;  // 200;
            transY = (int) factor*50;
        }

        double ffactur = fScalare[1];
        if (gang[2] == 17){
            ffactur = fScalare[2];
            gang[2] = 7;
        }
        if (gang[2] == 18){
            ffactur = fScalare[2];
            gang[2] = 8;
        }
        if (gang[2] == 19){
            ffactur = fScalare[2];
            gang[2] = 9;
        }
        if (gang[2] == 20){
            ffactur = fScalare[2];
            gang[2] = 10;
        }
        if(gang[2] == 7 ) {
            transX = -100;
            transY = -80;
            factor = ffactur;
        }
        if(gang[2] == 8 ) {
            transX = 500;  //800;
            transY = -80;
            factor = ffactur;

        }
        if(gang[2] == 9 ) {
            transX = -100;
            transY = 350;   //572;
            factor = ffactur;
        }
        if(gang[2] == 10 ) {
            transX = 500;  //800;
            transY = 350 ; //572;
            factor = ffactur;
        }

        if(gang[2] == 11 ) {
            transX = -100;
            transY = -85;
            factor = fScalare[1];
        }
        if(gang[2] == 12 ) {
            transX = 200;
            transY = 450 ;   //572;
            factor = fScalare[5];
            teksting = false;
            tegning = false;
        }
        if(gang[2] == 15 ) {
            transX = -100;
            transY = -85;
            factor = fScalare[1];
        }
        if(gang[2] == 16 ) {
            transX = 500;  //800;
            transY = 300;
            factor = fScalare[5];
            teksting = false;
            tegning = false;
        }
        if(gang[2] == 14 ) {
            transX = 200;  //200;
            transY = 55 ; // 195;
            factor = fScalare[3];
        }
        if(gang[2] == 13 ) {
            transX = 200;  //200;
            transY = 55 ; // 195;
            factor = fScalare[8];
        }



        if (plotType.equals("Strap joint" ) || plotType.equals("Cross joint" ) || plotType.equals("On plate" ) || plotType.equals("Lap joint" )  ) {
            factor = fact;
        }
        if (plotType.equals("flanged" ) && gang[2] == 12 ) {
            transY = 250 -this.yP;   //572;
        }
        if (plotType.equals("overlap" ) && gang[2] == 12 ) {
            transY = 350 -this.yP;   //572;
            transX = 300;
        }
        if (plotType.equals("Cross joint" ) && gang[2] == 12 ) {
            transY = 450 -this.yP;   //572;

        }
        if (plotType.equals("Cross joint" ) && gang[2] == 16 ) {
            transY = 450 -this.yP;   //572;

        }
        if (plotType.equals("Lap joint" ) && gang[2] == 12 ) {
            transY = 650 -this.yP;   //572;
        }
        if (plotType.equals("On plate" ) && gang[2] == 12 ) {
            transY = 150 -this.yP;   //572;
        }
        if (plotType.equals("Strap joint" ) && gang[2] == 12 ) {
            transY = 550 -this.yP;   //572;
        }


// System.out.println("test " + gang[2]);
        // Thymeleaf-templaten i denne metoden kan være mer kompleks
        // Her er et enkelt eksempel
        int x = 1200;
        int y = 860;
        int wLow = 0;
        int wUp = 1200;
        int hLow = 0;
        int hUp = 860;
        String color1 = "black";
        String color2 = "green";
        String color3 = "red";
        int strokWidth3 = 3;
        int strokWidth1 = 1;
        int xr = 50;
        int yr = 50;
        if ( gang[2] == 160 ) {  //feil skal være 16
            wLow = 600;
            wUp = 1200;
            hLow = 0;
            hUp = 860;
        }
        if ( gang[2] == 120 ) { //ok  skal være 12
            wLow = 0;
            wUp = 1200;
            hLow = 430;
            hUp = 860;
        }
        //PointRotate rot = new PointRotate(10,20,30);
        var canv = new svg(x,y,wLow, hLow, wUp, hUp);

        canv.setColor(color1);
        canv.setStroke(strokWidth1);
        String htmlCode =   " <!DOCTYPE html> \n " +
                " <html lang='en' xmlns:th='http://www.thymeleaf.org'>  \n " +
                "  <head>  \n " +
                "   <meta charset='UTF-8'> \n " +
                "  <meta name='viewport' content='width=device-width, initial-scale=1.0'>  \n " +
                " <title>htmx Click Example</title>  \n " +
                "  <script src='https://unpkg.com/htmx.org@1.5.0/dist/htmx.js'></script>  \n " +
                " </head>  \n " +
                "  <body>  \n " ;
        String xmlCode = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.0//EN\" \n" +
                "         \"http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd\">";

        String scriptCode = " <script th:inline = 'javascript' > \n " +
                " window.addEventListener('DOMContentLoaded', function() { \n " +
                "  htmx.defineExtension('getCoords', function(event) { \n " +
                "      var x = event.detail.x; \n " +
                "     var y = event.detail.y; \n " +
                "     return { x: x, y: y }; \n " +
                "  }); \n " +
                " }); \n  " +
                " </script> \n " ;
        String mouse1Code =
                "  <div hx-post='/handleClick' hx-trigger= 'click' hx-target='#result' hx-ext='getCoords'>  \n " ;
        String mouse2Code =  "    </div>  \n " +
                "    <div id='result'></div>  \n " ;
        String script2Code =  "    <script th:inline='javascript'>  \n " +
                "        function getCoords(event) {  \n " +
                "            var x = event.clientX;  \n " +
                "            var y = event.clientY;  \n " +
                "            return { x: x, y: y };  \n " +
                "        }  \n " +
                "    </script>  \n ";
        String htmlcode4 = " <!DOCTYPE html>  \n " +
                "<html xmlns:th='http://www.thymeleaf.org'>  \n " +
                "<head>  \n " +
                "   <title>Mouse Movement Capture</title>  \n " +
                "    <script src='https://unpkg.com/htmx.org@1.8.0'></script>  \n " +
                "</head>  \n " +
                "<body> \n " +
                "   <div id='mouseArea' style='border: 1px solid black; width: 100%; height: 100%;'  \n " +
                "       hx-trigger='mousemove from:body'  \n " +
                "      hx-post='/captureMouseMovement'  \n " +
                "      hx-vals='javascript:return {x: event.clientX, y: event.clientY}'>  \n " ;
        String htmlcode5 =  "  </div> \n " ;

        String htmlEndCode =  "</body>  \n " +
                "</html>  \n ";

        String svgInnhold;
        //      String svgStart = "<svg height='" + y + "'" + " width='" + x + "' xmls='http://www.w3.org/2000/svg ' >";
        String svgStart = canv.initializeSvg(x,y);
        //      svgString.add(0, svgStart);
        //     svgInnhold = canv.drawRect(xr, yr, wUp, hUp);
        //      svgString.add(0, svgInnhold);
        //     String svgInnhold = canv.drawLine(0, 0, 300, 300);
        //      svgString.add(0, svgInnhold);
        int ant;
        // rektangel

        ant = svgString.size();
        svgInnhold = canv.drawLine(0, 0, 0, 0);
        svgString.add(ant, svgInnhold);
    /*
        svgInnhold = canv.drawLine(0, 0, 1200, 0);
        svgString.add(ant, svgInnhold);
        svgInnhold = canv.drawLine(0, 860, 1200, 860);
        svgString.add(ant+1, svgInnhold);
        svgInnhold = canv.drawLine(0, 0, 0, 860);
        svgString.add(ant+2, svgInnhold);
        svgInnhold = canv.drawLine(1200, 0, 1200, 860);
        svgString.add(ant+3, svgInnhold);

        svgInnhold = canv.drawLine(0, 430, 1200, 430);
        svgString.add(ant+4, svgInnhold);
        svgInnhold = canv.drawLine(600, 0, 600, 860);
        svgString.add(ant+5, svgInnhold);

        svgInnhold = canv.drawCircle(300, 215, 5);
        svgString.add(ant+6, svgInnhold);

        svgInnhold = canv.drawCircle(900, 215, 5);
        svgString.add(ant+7, svgInnhold);
        svgInnhold = canv.drawCircle(300, 645, 5);
        svgString.add(ant+8, svgInnhold);
        svgInnhold = canv.drawCircle(900, 645, 5);
        svgString.add(ant+9, svgInnhold);




        svgInnhold = canv.test();
        svgString.add(ant+10, svgInnhold);
        svgInnhold = canv.mouseCoordinats();
        svgString.add(ant+11, svgInnhold);
        svgInnhold = canv.testMove();
        svgString.add(ant+12, svgInnhold);

*/
        String svgStop = canv.svgEnd();

        String svg;

        ant = svgString.size();
        ExtraLine hline = new ExtraLine();
        for (int i = 0; i < this.extraLine.size(); i++) {
            hline = this.extraLine.get(i);
            int i1 = (int) (hline.getFirstX()*factor + this.xP + transX);
            int j1 = (int)  (hline.getFirstY()*factor + this.yP + transY);
            int i2 = (int) (hline.getLastX()*factor + this.xP + transX);
            int j2 = (int) (hline.getLastY()*factor + this.yP + transY);
            if (!(i1 == 0 && j1 == 0 && i2 == 0 && j2 == 0)) {
                svgInnhold = canv.drawLine(i1,j1,i2,j2);
                svgString.add(i+1, svgInnhold);
            }

        }
//
        ant = svgString.size();
        ExtraBue hbue = new ExtraBue();
        for (int k = 0; k < this.extraBue.size(); k++) {
            hbue = this.extraBue.get(k);
            int i1 = (int) (hbue.getFirstX()*factor + this.xP + transX);
            int j1 = (int) (hbue.getFirstY()*factor + this.yP+ transY);
            int i2 = (int) (hbue.getLastX()*factor + this.xP+ transX);
            int j2 = (int) (hbue.getLastY()*factor + this.yP+ transY);
            int k2 = (int) (hbue.getFirstZ()*factor + this.xP+ transX);
            int k3 = (int) (hbue.getLastZ()*factor + this.yP+ transY);
            svgInnhold = canv.drawBezier2(i1, j1, i2, j2, k2, k3);
            svgString.add(ant+k, svgInnhold);
        }
        ant = svgString.size();
        ExtraEllipse hellips = new ExtraEllipse();
        for (int j = 0; j < this.extraEllipse.size(); j++) {
            hellips = this.extraEllipse.get(j);
            int i1 = (int) (hellips.getFirstX()*factor + this.xP + transX);
            int j1 = (int) (hellips.getFirstY()*factor + this.yP + transY);
            int i2 = Math.abs(hellips.getLastX());
            int j2 = Math.abs(hellips.getLastY());
            svgInnhold = canv.drawEllipse(i1, j1, i2, j2);
            svgString.add(ant+j, svgInnhold);
        }
/*
        ant = svgString.size();
        ExtraTall htall = new ExtraTall();
        for (int m = 0; m < this.extraTall.size(); m++) {
            htall = this.extraTall.get(m);
            int i1 = (int) (htall.getFirstX()*factor + this.xP+ transX);
            int j1 = (int) (htall.getFirstY()*factor + this.yP+ transY);
            String testTall = htall.getLastString();
            svgInnhold = canv.drawText(testTall, i1, j1);
            svgString.add(ant+m, svgInnhold);
            actualMoveStringNew.add(m, new ExtraTall(testTall,i1,j1));
        }


 */

//

        if ( teksting) {
            ant = svgString.size();
            ExtraLine uline = new ExtraLine();
            for (int i = 0; i < this.extraLineTabell.size(); i++) {
                uline = this.extraLineTabell.get(i);
                int i1 = (int) (uline.getFirstX()*factor + this.xP+ transX);
                int j1 = (int) (uline.getFirstY()*factor + this.yP+ transY);
                int i2 = (int) (uline.getLastX()*factor + this.xP+ transX);
                int j2 =(int) ( uline.getLastY()*factor + this.yP + transY);
                svgInnhold = canv.drawLine(i1, j1, i2, j2);
                svgString.add(ant+i, svgInnhold);

            }

            ant = svgString.size();
            ExtraText etall = new ExtraText();
            for (int m = 0; m < this.extraText.size(); m++) {
                etall = this.extraText.get(m);
                int i1 = (int) (etall.getFirstX()*factor + this.xP + transX);
                int j1 = (int) (etall.getFirstY()*factor + this.yP + transY);
                String testTall = etall.getLastString();
                svgInnhold = canv.drawText(testTall, i1, j1);
                svgString.add(ant+m, svgInnhold);
            }

        }
/*
        if ( gang[6] == 1 ) {
            ant = svgString.size();
            ExtraComment fline = new ExtraComment();
            canv.setColor(color2);
            for (int ic = 0; ic < this.extraComment.size(); ic++) {
                fline = this.extraComment.get(ic);
                int i1 =  fline.getFirstX();
                int j1 =  fline.getFirstY();
                int i2 =  fline.getType();
                String st1 = fline.getFirstString();
                String st2 = fline.getLastString();
                svgInnhold = canv.drawText(st2, i1, j1);
                svgString.add(ant+ic, svgInnhold);
            }
        }


 */

        if (tegning ) {

            ant = svgString.size();
            ExtraLine kline = new ExtraLine();
            canv.setColor(color2);
            for (int i = 0; i < this.extraLineTegn.size(); i++) {
                kline = this.extraLineTegn.get(i);
                int i1 = (int) (kline.getFirstX()*factor + this.xP + transX);
                int j1 = (int) (kline.getFirstY()*factor + this.yP + transY);
                int i2 = (int) (kline.getLastX()*factor + this.xP + transX);
                int j2 = (int) (kline.getLastY()*factor + this.yP + transY);
                svgInnhold = canv.drawLine(i1, j1, i2, j2);
                svgString.add(ant+i, svgInnhold);
            }

            ant = svgString.size();
            ExtraArray aline = new ExtraArray();
            for (int j = 0; j < this.extraArrayTegn.size(); j++) {
                aline = this.extraArrayTegn.get(j);
                int i1 = (int) (aline.getFirstX()*factor + this.xP + transX);
                int j1 = (int) (aline.getFirstY()*factor + this.yP + transY);
                int i2 = (int) (aline.getLastX()*factor + this.xP + transX);
                int j2 = (int) (aline.getLastY()*factor + this.yP + transY);
                int k1 = aline.getFirstZ();
                int k2 = aline.getLastZ();

// mangler vinkel for pil
                svgInnhold = canv.drawArrow(i1, j1, i2, j2, k1, k2);
                //       g2d.drawLine(i1, j1, i2, j2);
                svgString.add(ant+j, svgInnhold);
            }

            ant = svgString.size();
            ExtraBue kbue = new ExtraBue();
            for (int k = 0; k < this.extraBueTegn.size(); k++) {
                kbue = this.extraBueTegn.get(k);
                int i1 = (int) (kbue.getFirstX()*factor + this.xP + transX);
                int j1 = (int) (kbue.getFirstY()*factor + this.yP + transY);
                int i2 = (int) (kbue.getLastX()*factor + this.xP + transX);
                int j2 = (int) (kbue.getLastY()*factor + this.yP + transY);
                int k2 = (int) (kbue.getFirstZ()*factor + this.xP + transX);
                int k3 = (int) (kbue.getLastZ()*factor + this.yP + transY);
                svgInnhold = canv.drawBezier2(i1, j1, i2, j2, k2, k3);
                svgString.add(ant+k, svgInnhold);
            }
/*
            ant = svgString.size();
            ExtraTall ltall = new ExtraTall();
            for (int m = 0; m < this.extraTallTegn.size(); m++) {
                ltall = this.extraTallTegn.get(m);
                int i1 = (int) (ltall.getFirstX()*factor + this.xP + transX);
                int j1 = (int) (ltall.getFirstY()*factor + this.yP + transY);
                String testTall = ltall.getLastString();
                svgInnhold = canv.drawText(testTall, i1, j1);
                svgString.add(ant+m, svgInnhold);
                actualMoveString.add(m, new ExtraTall(testTall,i1,j1));
            }


 */



        }

        // grunnplanken start
        ant = svgString.size();
        ExtraBase bline = new ExtraBase();
        canv.setColor(color1);
        for (int i = 0; i < this.extraBase.size(); i++) {
            bline = this.extraBase.get(i);
            int i1 = (int) (bline.getFirstX()*factor  + this.xP+ transX);
            int j1 = (int) (bline.getFirstY() *factor+ this.yP + transY);
            int i2 = (int) (bline.getLastX() *factor + this.xP + transX);
            int j2 = (int) (bline.getLastY()*factor + this.yP + transY);
            svgInnhold = canv.drawLine(i1, j1, i2, j2);
            svgString.add(ant+i, svgInnhold);
        }
        ant = svgString.size();
        ExtraTall btall = new ExtraTall();
        for (int mm = 0; mm < this.extraTallBase.size(); mm++) {
            btall = this.extraTallBase.get(mm);
            int i1 = (int) (btall.getFirstX()*factor + this.xP + transX);
            int j1 = (int) (btall.getFirstY()*factor + this.yP + transY);
            String testTall = btall.getLastString();
            svgInnhold = canv.drawText(testTall, i1, j1);
            svgString.add(ant+mm, svgInnhold);

        }

        // grunnplanken slutt
   //     System.out.println("anta  " + CalcValues.weldList.size());
            ant = svgString.size();
            canv.setColor(color1);
             WeldPoint point = new WeldPoint();
             Point pp = new Point();
            for (int m = 0; m < CalcValues.weldList.size()-1  ; m++) {

                point = CalcValues.weldList.get(m);
       //     System.out.println(m + "  "  + point.getIndicator());

                pp = point.getWeldPointTextPoint();
       //       System.out.println("intern  " + pp.x + "  " + pp.y);
                int i1 = (int) (pp.x*factor + this.xP + transX);  // tranX
                int j1 = (int) (pp.y*factor + this.yP + transY);   // tranY//
                pp.x = i1;
                pp.y = j1;
                point.setWeldPointTextPoint(pp);
         //       point.setIndicator(CalcValues.plotIndicator);
          //      String testTall = point.getWeldPointText();
         //       svgInnhold = canv.drawText(testTall, i1, j1);
         //     System.out.println("ggg   " + svgInnhold);
         //     svgString.add(ant+m, svgInnhold);
            }

        CalcValues.actualMoveString = this.actualMoveString;
        CalcValues.actualMoveStringNew = this.actualMoveStringNew;

// if (gang[2] == 11 || gang[2] == 12 || gang[2] == 15  || gang[2] == 16  ) {
        if (gang[2] == 11 || gang[2] == 15   ) {
            if (gang[2] == 11) {
                transX = -200;  //800;
                transY = -80 - this.yP;
                factor = fScalare[1];
            }
            if (gang[2] == 12) {
                transX = 300;  //800;
                transY = 415 - this.yP; //572;
                factor = fScalare[7];
            }
            if (gang[2] == 15) {
                transX = -100;
                transY = -200 - this.yP;   //572;
                factor = fScalare[1];
            }
            if (gang[2] == 16) {
                transX = 600;  //800;
                transY = 415 - this.yP; //572;
                factor = fScalare[7];
            }

            ExtraLine hlineT = new ExtraLine();
            ant = svgString.size();
            //   g2d.setColor(Color.BLACK);
            for (int i = 0; i < this.extraLineTabell.size(); i++) {
                hlineT = this.extraLineTabell.get(i);
                int i1 = (int) (hlineT.getFirstX()*factor + this.xP + transX);
                int j1 = (int) (hlineT.getFirstY()*factor + this.yP + transY);
                int i2 = (int) (hlineT.getLastX()*factor + this.xP + transX);
                int j2 = (int) (hlineT.getLastY()*factor + this.yP + transY);
                svgInnhold = canv.drawLine(i1, j1, i2, j2);
                svgString.add(ant+i, svgInnhold);

                //        g2d.drawLine(i1, j1, i2, j2);

            }
            //     g2d.setColor(Color.BLUE);
            ExtraText htallT = new ExtraText();
            ant = svgString.size();
            for (int m = 0; m < this.extraText.size(); m++) {
                htallT = this.extraText.get(m);
                int i1 = (int) (htallT.getFirstX()*factor + this.xP + transX);
                int j1 = (int) (htallT.getFirstY()*factor + this.yP + transY);
                String testTallT = htallT.getLastString();
                //         g2d.drawString(testTall, i1, j1);
                svgInnhold = canv.drawText(testTallT, i1, j1);
                svgString.add(ant+m, svgInnhold);
            }
        }
        // samler opp tekst i streng
        svg = " ";
        for (int k = 0; k < svgString.size(); k++) {
            svg = svg + svgString.get(k);
        }

        String svgEnd = canv.svgEnd();

        if(gang[2] == 7 ) {
            imageOut.setSvgString7(svg);
        }
        if ( gang[2] == 8 ) {
            imageOut.setSvgString8(svg);
        }
        if(gang[2] == 9 ) {
            imageOut.setSvgString9(svg);
        }
        if ( gang[2] == 10 )  {
            imageOut.setSvgString10(svg);
        }
        if(gang[2] == 11 ) {
            imageOut.setSvgString11(svg);
        }
        if ( gang[2] == 12 ) {
            imageOut.setSvgString12(svg);
        }
        if(gang[2] == 15 ) {
            imageOut.setSvgString15(svg);
        }
        if ( gang[2] == 16 ) {
            imageOut.setSvgString16(svg);
        }
        if(gang[2] == 0 ) {
            imageOut.setSvgString0(svg);
        }
        if ( gang[2] == 14 ) {
            imageOut.setSvgString14(svg);
        }

        // svg = svgString7 + svgString8;
        ant = svg.length();
        //      System.out.println(" svgString78 = " + ant);

        int kk = svgString.size();
        svgString.add(kk,canv.svgEnd());

        //  System.out.println(" xmlcode  "  + xmlCode);
        //    System.out.println(" sciptcode   "  +  scriptCode);
        //    System.out.println(" htmlcode   "  + htmlCode);
        //    System.out.println(" mous1code   "  + mouse1Code);
        //    System.out.println(" mouse2code   "  + mouse2Code);
        //    System.out.println(" sript2code   "  + script2Code);
        //    System.out.println(" htmlendcode   "  + htmlEndCode);
        //  System.out.println("length = " + imageOut.getSvgString().length());
        svg = imageOut.getSvgString();
        String stopHtml =  svgEnd + htmlEndCode ;
        String outHtml = htmlCode + svgStart + svg ;  // +  mouse1Code   +  mouse2Code +  script2Code ;
        String outHtmlNew = htmlcode4 + svgStart + svg + htmlcode5 + stopHtml;   // svgStart +
        String outSvg =  svgStart + svg  ;
        String outChoose = svgStart +   svg + svgEnd  +  mouse1Code +mouse2Code + scriptCode + script2Code   ;
        //  System.out.println(" \n_______\n"  + outHtmlNww  );
        //  System.out.println(" \n_______\n"  + outSvg);
        CalcValues.outSvg =  svgStart + svg ;
        startSvg = svg;
        CalcValues.outHtml = outHtml;
        CalcValues.stopHtml = stopHtml;
        svgNew = "";
   //     System.out.println(outHtmlNew);
   //     System.out.println(CalcValues.startSvg);
  //      System.out.println(outHtmlNew);
  //      return  outHtmlNew ;
  //      System.out.println("svgStart \n " + svgStart);
return outSvg ;

    }
    public static int getTransX() {
        return transX;
    }

    public static int getTransY() {
        return transY;
    }

    public static double getFactor() {
        return factor;
    }
}







