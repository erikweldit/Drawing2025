package com.example.application.Mouse;



import com.example.application.html.WeldSymbol;
import com.example.application.html.svg;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.application.weld.CalcValues.gang;


/**
 * Generate string for actual welding symbol
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
public class DrawWeldingSymbol {
    Point firstPoint = new Point();

    String ident;
    int numberWeld;
    WeldPoint tester = new WeldPoint();
    public ArrayList<WeldPoint> weldList = new ArrayList<WeldPoint>();
    String svgInnhold;
    String svgSymbol;
    int type;
    int a1;
    int a2;
    int indicator;
    int code;
    String atext = "";
    String user;
    private ArrayList<WeldPoint> actualList = new ArrayList<>();
    List<String> svgStringSymbol = new ArrayList<>();
    List<String> svgStringCircleSymbol = new ArrayList<>();
    String aText = "0";

    int a3 = 0;

    WeldSymbol sym2 = new WeldSymbol(atext, a1,a2, a1);
    WeldSymbol sym1 = new WeldSymbol(a1, a1,a2);
    public DrawWeldingSymbol() {
        String outSvgSymbbol;  // =  outSvg;
        var canv = new svg();
        canv.setColor("red");
      // System.out.println("inn DrawWeldingSymbol ");
        String svgStop = canv.svgEnd();
        //   CalcValues.svgSymbol = "";
        this.weldList = CalcValues.weldList;
        numberWeld =weldList.size();
        svgSymbol = "";
        svgInnhold= "";
        //     System.out.println(" number of  " + numberWeld);
        for ( int i=0; i<numberWeld; i++) {
            tester = weldList.get(i);
            indicator = tester.getIndicator();
            type = tester.getType();
            user = tester.getUser();
            if (indicator == CalcValues.plotIndicator) {
                actualList.add(tester);
            }
            if (gang[2] == 12) {
                if (( type == 7 || type ==8 || type == 11  )&& user.equals(CalcValues.userID)){
                    actualList.add(tester);
                }
            }
            if (gang[2] == 10) {
                if (( type == 7 || type ==8 || type == 9 || type == 11 || type == 15  )&& user.equals(CalcValues.userID)){
                    actualList.add(tester);
                }
            }
            if (gang[2] == 16) {
                if (( type == 7 || type ==9 || type == 15  )&& user.equals(CalcValues.userID)){
                    actualList.add(tester);
                }
            }
        }
 //       System.out.println("drawweldingsymbol  " + weldList.size()  + "  "  + actualList.size());


        int ant = svgStringSymbol.size();
        for (int ind = 0; ind < actualList.size(); ind++){
            tester = actualList.get(ind);
            code = tester.getCode();
            indicator = tester.getIndicator();
    //        System.out.println("draw  " + code + "  " + tester.getWeldPointText() + "  "  + tester.getAString());
            if ( code == 2 ) {   // code = 2 angir at dette er et symbol code = 1 angir e streng  // && indicator == CalcValues.plotIndicator
                Point ppTest = tester.getWeldPointTextPoint();
                a1 = ppTest.x;
                a2 = ppTest.y;
                ident = tester.getWeldPointText();
                atext = tester.getAString();
                switch ( atext ) {
                    case "0" :
                    //   svgInnhold = sym1.choseSymbol(0, a1, a2);
                     //  tester.setSymbol(svgInnhold);
                        break;
                    case "1" :
                        svgInnhold = sym1.choseSymbol(1, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "2" :
                        svgInnhold = sym1.choseSymbol(2, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "3" :
                        svgInnhold = sym1.choseSymbol(3, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "4" :
                        svgInnhold = sym1.choseSymbol(4, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "5" :
                        svgInnhold = sym1.choseSymbol(5, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "6" :
                        svgInnhold = sym1.choseSymbol(6, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "7" :
                        svgInnhold = sym1.choseSymbol(7, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "8" :
                        svgInnhold = sym1.choseSymbol(8, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "9" :
                        svgInnhold = sym1.choseSymbol(9, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "10" :
                        svgInnhold = sym1.choseSymbol(10, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "11" :
                        svgInnhold = sym1.choseSymbol(11, a1, a2);
                        tester.setSymbol(svgInnhold);
                    case "12" :
                        svgInnhold = sym1.choseSymbol(12, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "13" :
                        svgInnhold = sym1.choseSymbol(13, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "14" :
                        svgInnhold = sym1.choseSymbol(14, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "15" :
                        svgInnhold = sym1.choseSymbol(15, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "16" :
                        svgInnhold = sym1.choseSymbol(16, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "17" :
                        svgInnhold = sym1.choseSymbol(17, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "18" :
                        svgInnhold = sym1.choseSymbol(18, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "19" :
                        svgInnhold = sym1.choseSymbol(19, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "20" :
                        svgInnhold = sym1.choseSymbol(20, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "21" :
                        svgInnhold = sym1.choseSymbol(21, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    case "22" :
                        svgInnhold = sym1.choseSymbol(22, a1, a2);
                        tester.setSymbol(svgInnhold);
                        break;
                    default :  break;
                }

            }


        }
  //      System.out.println("out DrawWeldingSymbol");
        new DrawWeldinnString();
    }

}




