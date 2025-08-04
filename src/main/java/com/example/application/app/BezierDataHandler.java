package com.example.application.app;


import com.example.application.Mouse.MouseMoved;

public class BezierDataHandler {

    // Metode som behandler kurvepunktene
    public static void processCurvePoints(String jsonData) {

        int[] tellerSitat = new int[30];
        int[] tellerStart = new int[8];
        int[] tellerSlutt = new int[8];
        int[] tellerValue = new int[8];
        int indSitat = 0;
        int indStart = 0;
        int antkk = 0;
        int antall = 24;
        int istart = 0;
        int islutt = 0;

        // Her kan du parse JSON-dataen og utføre nødvendige handlinger
        //       System.out.println("Behandler oppdaterte punkter: " + jsonData);
        //     System.out.println("antall = " + jsonData.length());
// Behandler oppdaterte punkter: [{"cx":"13","cy":"24"},{"cx":"250","cy":"100"},{"cx":"400","cy":"250"}]
        String jD = jsonData.trim();
//System.out.println(indSitat + "  " + indStart + "  " + jsonData);
        for (int k=0 ; k < jD.length(); k++){

            char kk = jD.charAt(k);
            if ( kk== '[' ){
                istart = k;
            }
            if ( kk== ']' ){
                islutt = k;
            }
            if (kk == ',') {
                antkk++;
                if ( antkk <= 6 ) {
                    antall = k;
                }
            }
        }

        for (int i = istart ; i<antall; i++){
            char j = jD.charAt(i);

            if (j == '"') {
                tellerSitat[indSitat] = i;
                indSitat ++;
            }
            if (j == ':') {
                tellerStart[indStart] = i;
                indStart ++;
            }
        }
        for ( int i = 0 ; i < indStart; i++) {
            tellerStart[i] +=2;
        }




//////////// /



        for (int ik = islutt +10 ; ik<jD.length(); ik++){
            char j = jD.charAt(ik);
            //       System.out.print(" start " + ik + "  "  +  j);
            if (j == ':') {
                tellerStart[indStart] = ik;
                tellerStart[indStart] += 2;
                //        System.out.println(" \n " + indStart + " " + tellerStart[indStart] + "  " + j + "  " + ik + "  " + jD.charAt(ik + 2));
                indStart++;
                for (int ikk = ik + 2; ikk < jD.length(); ikk++) {
                    char jj = jD.charAt(ikk);
                    if (jj == '"') {
                        tellerSitat[indSitat] = ikk;
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

  //      System.out.println(jD);

        for ( int i = 0 ;i < 8; i++) {
            //  tellerValue[i] = Integer.parseInt(jD.substring(tellerStart[i],tellerSlutt[i]));
            double tall = Double.parseDouble(jD.substring(tellerStart[i],tellerSlutt[i]));
            tellerValue[i] = (int) tall;
       //         System.out.print(tellerValue[i] + " b ");
        }
        //    System.out.println();

        MouseMoved.telleValue = tellerValue;
        // Eksempel på hvordan du kan lagre eller bruke dataen
        // Du kan også parse jsonData til et JSON-objekt hvis ønskelig
    }
}


