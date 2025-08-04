package com.example.application.app;



import com.example.application.under.ExtraBue;
import com.example.application.weld.CalcValues;

import java.awt.*;

import java.util.ArrayList;


public class DataHandlerLineExtra {
    private Point firstPoint;
    private Point middelPoint;
    private Point lastPoint;


    public static void processCurvePoints(String jsonData) {
        //  ArrayList<ExtraLine> weldStroke = new ArrayList<>();
        ArrayList<ExtraBue> weldBue = new ArrayList<>();
        int[] tellerSitat = new int[30];
        int[] tellerStart = new int[6];
        int[] tellerSlutt = new int[6];
        int[] tellerValue = new int[6];
        int indSitat = 0;
        int indStart = 0;

        int istart = 0;
        int islutt = 0;
        weldBue = CalcValues.weldBue;
        // Metode som behandler kurvepunktene

//System.out.println(indSitat + "  " + indStart + "  " + jsonData);
        String jD = jsonData;

        for (int k=0 ; k < jD.length(); k++){

            char kk = jD.charAt(k);
            if ( kk== '{' ){
                istart = k;
            }
            if ( kk== '}' ){
                islutt = k;
            }
        }

//////////// /



        for (int ik = 0 ; ik<jD.length(); ik++){
            char j = jD.charAt(ik);
            //       System.out.print(" start " + ik + "  "  +  j);
            if (j == ':') {

                tellerStart[indStart] = ik;
                tellerStart[indStart] += 1;
                //    System.out.println(" \n t " + indStart + " " + tellerStart[indStart] + "  " + j + "  " + ik + "  " + jD.charAt(ik + 1));
                indStart++;
                for (int ikk = ik + 1; ikk < jD.length(); ikk++) {
                    char jj = jD.charAt(ikk);
                    if (jj == ',' || jj == '}') {
                        tellerSitat[indSitat] = ikk;
                        //      System.out.println(" \n s" + indSitat + " " + tellerSlutt[indSitat] + "  " + jj + "  " + ikk + "  " + jD.charAt(ikk));
                        indSitat++;
                        break;
                    }
                }
            }

        }

        for (int ii=0; ii < indStart; ii++){
            for (int jj=0; jj < indSitat; jj++){
                if (tellerSitat[jj] >= tellerStart[ii]) {
                    tellerSlutt[ii] =  tellerSitat[jj];
                    break;
                }
            }
        }

        ///////
        //     System.out.println("islutt  " + islutt + "  " + jD.length());

        for ( int i = 0 ;i < 6; i++) {
            //        tellerValue[i] = Integer.parseInt(jD.substring(tellerStart[i],tellerSlutt[i]));
            double tall = Double.parseDouble(jD.substring(tellerStart[i],tellerSlutt[i]));
            tellerValue[i] = (int) tall;
            //      System.out.print(tellerValue[i] + "  ");
        }
        //    System.out.println();
        //  MouseLine.telleValue = tellerValue;


        //    Point firstPoint = new Point(tellerValue[0],tellerValue[1]);
        //    Point middelPoint = new Point(tellerValue[2],tellerValue[3]);
        //      Point lastPoint = new Point(tellerValue[4],tellerValue[5]);

        //    System.out.println("enter datahandlerlineextra");
        //    System.out.println(tellerValue[0]+ "  " + tellerValue[1]+ "  " + tellerValue[2]+ "  " + tellerValue[3]+ "  " + tellerValue[4]+ "  " + tellerValue[5]);
        weldBue.add(0, new ExtraBue(tellerValue[0],tellerValue[1],tellerValue[2],tellerValue[3],tellerValue[4],tellerValue[5]));
        CalcValues.weldBue = weldBue;
        //      weldList.set(foundIndex, tester);   // setter inn nye verdier
        //      CalcValues.weldList = weldList;   // setter inn nye verdier
        //   System.out.println(weldStroke.size());
        // Her kan du parse JSON-dataen og utføre nødvendige handlinger
        //      System.out.println("Behandler oppdaterte punkter: " + jsonData);
        //     System.out.println("antall = " + jsonData.length());
        // Behandler oppdaterte punkter: {"startX":27,"startY":208,"endX":201,"endY":113}
        //   String jD = jsonData.trim();

        // Eksempel på hvordan du kan lagre eller bruke dataen
        // Du kan også parse jsonData til et JSON-objekt hvis ønskelig
    }
    /*
public Point getFirstPoint() {
        return firstPoint;
}
    public Point getLastPoint() {
        return lastPoint;
    }

     */


}




