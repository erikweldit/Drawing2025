package com.example.application.app;


import com.example.application.under.ExtraLine;
import com.example.application.weld.CalcValues;

import java.util.ArrayList;


public class DataHandlerLine {



    public static void processCurvePoints(String jsonData) {
        ArrayList<ExtraLine> weldStroke = new ArrayList<>();

        int[] tellerSitat = new int[30];
        int[] tellerStart = new int[4];
        int[] tellerSlutt = new int[4];
        int[] tellerValue = new int[4];
        int indSitat = 0;
        int indStart = 0;

        int istart = 0;
        int islutt = 0;
        weldStroke = CalcValues.weldStroke;
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

        for ( int i = 0 ;i < 4; i++) {
            //        tellerValue[i] = Integer.parseInt(jD.substring(tellerStart[i],tellerSlutt[i]));
            double tall = Double.parseDouble(jD.substring(tellerStart[i],tellerSlutt[i]));
            tellerValue[i] = (int) tall;
            //      System.out.print(tellerValue[i] + "  ");
        }
        //    System.out.println();
        //  MouseLine.telleValue = tellerValue;



        weldStroke.add(0, new ExtraLine(tellerValue[0],tellerValue[1],tellerValue[2],tellerValue[3]));
        CalcValues.weldStroke = weldStroke;
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


}



