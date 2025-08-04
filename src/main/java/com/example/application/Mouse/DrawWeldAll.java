package com.example.application.Mouse;




import com.example.application.html.svg;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.UI;



import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.application.weld.CalcValues.gang;


/**
 * Generate string of svg kode for the actual weldPoint
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class DrawWeldAll {
    Point firstPoint = new Point();
    Point middelPoint = new Point();
    Point lastPoint = new Point();
    Point textPoint = new Point();
    String ident;
    boolean punktPlottes;
    boolean textPlottes;
    int numberWeld;
    WeldPoint tester = new WeldPoint();
    public ArrayList<WeldPoint> weldList = new ArrayList<>();
    private ArrayList<WeldPoint> actualList = new ArrayList<>();
    String svgInnhold;
    String svgWeld;
    String user;
    int type;
    int actualType;
    int indicator;
    String typePlot;
    String testUser;
    List<String> svgStringWeld = new ArrayList<>();
    List<String> svgStringCircleFirst = new ArrayList<>();
    List<String> svgStringCircleLast = new ArrayList<>();
    List<String> svgStringCircleMiddel = new ArrayList<>();
    List<String> svgStringText= new ArrayList<>();

    public DrawWeldAll() {
        String outSvgNew;  // =  outSvg;
        var canv = new svg();
        canv.setColor("red");
        actualType = gang[2];
        String svgStop = canv.svgEnd();
        testUser = CalcValues.userID;
        this.weldList = CalcValues.weldList;
        numberWeld = weldList.size();
        if(numberWeld == 0) {return;}
        svgWeld = "";
        for ( int i=0; i<numberWeld; i++) {
            tester = weldList.get(i);
            indicator = tester.getIndicator();
            type = tester.getType();
            user = tester.getUser();
            if (actualType == 10) {
                type = tester.getType();
                user = tester.getUser();
                if (( type == 7 || type ==8 || type == 9 )&& user.equals(testUser)){
                    actualList.add(tester);
                }
                //    System.out.println("samler opp " +i + "  " + " " + type + "  "  + user);
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

            //       System.out.println(" test1inn  " + indicator + "  "  + CalcValues.plotIndicator );



            svgInnhold = canv.drawBezier2(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);

            svgStringWeld.add(ant + ind, svgInnhold);
            svgWeld = svgWeld + svgStringWeld.get(ant + ind);

            if (punktPlottes ) {
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
            if (textPlottes ) {
                svgInnhold = canv.drawText(ident, textPoint.x, textPoint.y);
                svgStringText.add(ant + ind, svgInnhold);
                svgWeld = svgWeld + svgStringText.get(ant + ind);

            }
        }





        CalcValues.svgNew = svgWeld + CalcValues.svgSymbol;
        if (CalcValues.valgIndeks == 1) {
            UI.getCurrent().getPage().setLocation("ImageLast");
        }
        if (CalcValues.valgIndeks == 2) {
            UI.getCurrent().getPage().setLocation("Image");
        }

    }

}







