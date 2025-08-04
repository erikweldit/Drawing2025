package com.example.application.Mouse;




import com.example.application.html.svg;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;



/**
 * Generate string of svg code for weldPoint on printing page
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 *
 */

public class EmptyBuffer {
    Point firstPoint = new Point();
    Point middelPoint = new Point();
    Point lastPoint = new Point();
    Point textPoint = new Point();
    String ident;
    boolean punktPlottes;
    boolean textPlottes;
    int numberWeld;
    int indicator;
    WeldPoint tester = new WeldPoint();
    public ArrayList<WeldPoint> weldList = new ArrayList<>();

    private ArrayList<WeldPoint> actualList = new ArrayList<>();
    String svgInnhold;
    String svgWeld;
    int type;
    String typePlot;
    List<String> svgStringWeld = new ArrayList<>();
    List<String> svgStringCircleFirst = new ArrayList<>();
    List<String> svgStringCircleLast = new ArrayList<>();
    List<String> svgStringCircleMiddel = new ArrayList<>();
    List<String> svgStringText = new ArrayList<>();
    String user;

    public EmptyBuffer() {
        String outSvgNew;  // =  outSvg;
        var canv = new svg();
        canv.setColor("red");

        String svgStop = canv.svgEnd();

        this.weldList = CalcValues.weldList;
        numberWeld = weldList.size();


        for (int i = 0; i < numberWeld; i++) {
            tester = weldList.get(i);
            indicator = tester.getIndicator();
            type = tester.getType();
            user = tester.getUser();
            /*
            if (indicator == CalcValues.plotIndicator) {
            } else {
                actualList.add(tester);
            }

             */
            if (CalcValues.emptyBuffer == 12) {
                CalcValues.emptyBuffer = 0;
                if ((type == 7 || type == 8 || type == 11 || type == 12) && user.equals(CalcValues.userID)) {
                } else {
                    actualList.add(tester);
                }
            }
            if (CalcValues.emptyBuffer == 10) {
                CalcValues.emptyBuffer = 0;
                if ((type == 7 || type == 8 || type == 9 || type == 11 || type == 15 || type == 10) && user.equals(CalcValues.userID)) {
                } else {
                    actualList.add(tester);
                }
            }
            if (CalcValues.emptyBuffer == 16) {
                CalcValues.emptyBuffer = 0;
                if ((type == 7 || type == 9 || type == 15 || type == 16) && user.equals(CalcValues.userID)) {
                } else {
                    actualList.add(tester);
                }
            }

        }
        CalcValues.weldList = actualList;
    }
}


