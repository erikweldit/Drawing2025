package com.example.application.Mouse;




import com.example.application.under.ExtraSymbol;
import com.example.application.under.WeldData;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import java.awt.*;
/** Klassen fjerner en sveisestreng fra samlingen gitt i weldList
 * Konstruktør  MouseReleased(Point releasedPoint) hvor
 * Point releasedPoint er det elementet som skal fjernes fra listen
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
public class MouseReleased {


    int indeks5 = -1;
    int indeks6;
    int big = 5;
    boolean teksting;

    boolean tegning;

    String plotSort;
    Point lastPointNew;
    Point firstPointNew;
    Point middelPointNew;
    String actualPath;
    private WeldPoint punkt = new WeldPoint();

    private List<BufferedImage> images = new ArrayList<>();

    public ArrayList<WeldPoint> weldList = new ArrayList<>();

    public ArrayList<WeldPoint> sveiseListe = new ArrayList<>();

    public ArrayList<WeldPoint> oldListe = new ArrayList<>();

    private WeldData sveis = new WeldData(sveiseListe);

    public List<ExtraSymbol> symbolListe = new ArrayList<>();


    boolean dragAllowed = false;
    boolean pressAllowed = false;

    boolean clickAllowed = false;
    boolean moveAllowed = false;
    Point firstPoint = new Point();
    Point middelPoint = new Point();
    Point lastPoint = new Point();
    Point releasedPoint = new Point();
    Point toPointNew = new Point();
    int enterTypeOldOld = 0;
    WeldPoint tester = new WeldPoint();
    Point point = new Point();

    int enterType = 0;
    Boolean entered = Boolean.valueOf(false);
    int foundIndex = -1;
    boolean lesFirst = true;
    List<Integer> enterTypeOldNew = new ArrayList<>();

    List<Integer> enterTypeOldIndeks = new ArrayList<>();

    List<Integer> enterTypeIndeks = new ArrayList<>();
    boolean moveNew;
    public MouseReleased(Point releasedPoint) {
        this.releasedPoint = releasedPoint;
        this.moveNew = CalcValues.moveNew;
        var can = new CalcValues();
        this.weldList = can.weldList;
    //    System.out.println("inn MouseReleased  ");
        enterTypeIndeks.add(0, Integer.valueOf(0));
// må søke gjennem alle punktene i sveiselisten for å lokalisere det aktuelle som skal ligge innenfor sirkelen med radius big
        int numberEl = weldList.size();
        if (numberEl >= 1) {
            enterTypeOldNew.add(0, Integer.valueOf(0));
            enterTypeOldIndeks.add(0, Integer.valueOf(0));
            entered = Boolean.valueOf(false);
            for (int i = 0; i < weldList.size(); i++) {
                if (!entered.booleanValue()) {
                    tester = weldList.get(i);
                    point = tester.getWeldPointFirst();
                    if (releasedPoint.x <= (point.x + big) && releasedPoint.x >= (point.x - big) &&
                            releasedPoint.y <= (point.y + big) && releasedPoint.y >= (point.y - big)) {
                        enterType = 1;
                        entered = Boolean.valueOf(true);
                        foundIndex = i;
                        moveAllowed = true;
                        //         System.out.println(" gert funnet indeks " + foundIndex + "  " + enterType);
                    }
                }

            }
            entered = Boolean.valueOf(false);
            for (int j = 0; j < weldList.size(); j++) {
                if (!entered.booleanValue()) {
                    tester = weldList.get(j);
                    point = tester.getWeldPointLast();
                    if (releasedPoint.x <= (point.x + big) && releasedPoint.x >= (point.x - big) &&
                            releasedPoint.y <= (point.y + big) && releasedPoint.y >= (point.y - big)) {
                        enterType = 3;
                        entered = Boolean.valueOf(true);
                        foundIndex = j;
                        moveAllowed = true;
                        //            System.out.println("  gert funnet indeks  " + foundIndex + "  " + enterType );
                    }
                }
            }

            entered = Boolean.valueOf(false);
            for (int l = 0; l < weldList.size(); l++) {
                if (!entered.booleanValue()) {
                    tester = weldList.get(l);
                    point = tester.getWeldPointMiddel();
                    if (releasedPoint.x <= (point.x + big) && releasedPoint.x >= (point.x - big) &&
                            releasedPoint.y <= (point.y + big) && releasedPoint.y >= (point.y - big)) {
                        enterType = 2;
                        entered = Boolean.valueOf(true);
                        foundIndex = l;
                        moveAllowed = true;
                        //             System.out.println("  gert funnet indeks  " + foundIndex + "  " + enterType );
                    }
                }
            }
            entered = Boolean.valueOf(false);
            for (int m = 0; m < weldList.size(); m++) {
                if (!entered.booleanValue()) {
                    tester = weldList.get(m);
                    point = tester.getWeldPointTextPoint();
                    if (releasedPoint.x <= (point.x + big) && releasedPoint.x >= (point.x - big) &&
                            releasedPoint.y <= (point.y + big) && releasedPoint.y >= (point.y - big)) {
                        enterType = 4;
                        entered = Boolean.valueOf(true);
                        foundIndex = m;
                        moveAllowed = true;
                        //            System.out.println("  gert funnet indeks  " + foundIndex + "  " + enterType );
                    }
                }
            }

            //      System.out.println("  gert funnet indeks avsluttet " + foundIndex + "  " + enterType );
            int enterTypeOld = enterType;
            Point flyttePointNew = new Point();
            int pointTeller = 0;


            if (pointTeller <= 1) {
                //flyttePointNew.x = e.getX();
                //flyttePointNew.y = e.getY();
                pointTeller++;
            }
            enterTypeOldOld = ((Integer) enterTypeOldNew.get(0)).intValue();
            if (enterTypeOldOld <= 0) {
                enterTypeOldOld = enterTypeOldOld;
            }
            Point malPoint = new Point();
            int indeks = 0;
            int indeks2 = 0;
            if (enterTypeOldIndeks.size() == 2) {
                indeks5 = enterTypeOldIndeks.get(0);
                foundIndex = ((Integer) enterTypeOldIndeks.get(0)).intValue();
                enterTypeIndeks.add(0, Integer.valueOf(foundIndex));
            }
            enterTypeOldIndeks.size();
            if (enterTypeOldNew.size() == 2) {
                indeks6 = enterTypeOldNew.get(0);
                indeks2 = 0;
            }
            if (enterTypeOldNew.size() == 1) {
                indeks = ((Integer) enterTypeOldNew.get(0)).intValue();
                indeks2 = 0;
            }

            if (moveAllowed)
                indeks5 = foundIndex;

     //       System.out.println("før  " + weldList.size() );

            if ( indeks5 >= 0 ) {;
                for (int j = 0; j < weldList.size(); j++) {
                    if (j < indeks5) {
                        oldListe.add(weldList.get(j));
                    }
                    if (j > indeks5) {
                        oldListe.add(weldList.get(j));
                    }
                }
                int last =  CalcValues.weldList.size();
                CalcValues.weldList.remove(last-1);
          //      System.out.println("mellom " + weldList.size() );
                CalcValues.weldList = oldListe;
          //      System.out.println("etter " + weldList.size() );
            }

            if(moveNew) {
                new DrawWeldinnString();
            } else {
                //         new DrawWeldinnString();
            }
        }
    }
}






