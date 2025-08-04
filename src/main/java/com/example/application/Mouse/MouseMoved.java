package com.example.application.Mouse;


import com.example.application.images.BezierViewR;
import com.example.application.images.SvgDraggableTextView;
import com.example.application.under.ExtraComment;
import com.example.application.under.ExtraTall;
import com.example.application.under.WeldPoint;
import com.example.application.weld.CalcValues;
import com.example.application.menu.ZoomMenue5;
import com.example.application.menu.ZoomMenue6;
import com.example.application.menu.ZoomImage6;
import com.vaadin.flow.component.UI;

import java.awt.*;
import java.util.ArrayList;

/**
 * Moving an old point to new point after locating it
 *
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */


public class MouseMoved {
    public static ExtraTall foundType ;
    public static ExtraTall  originalType ;
    int big = 5;
    boolean moveNew;
    int enterType;
    public static int foundIndex;
    Point toPointNew = new Point();
    Point movedPoint = new Point();
    Boolean entered;
    public ArrayList<WeldPoint> weldList = new ArrayList<>();
    public static WeldPoint tester = new WeldPoint();
    public static int enterTypeNew;
    public static int[] telleValue = new int[8];
    Point point = new Point();
    public static ExtraComment test ;
    public static ExtraTall testTall;

    public MouseMoved(Point movedPoint, Point toPointNew) {
     //   new MakeMovePossible();
        this.movedPoint = movedPoint;
        this.toPointNew = toPointNew;
        this.weldList = CalcValues.weldList;
        this.moveNew = CalcValues.moveNew;
        this.entered = false;
     //   System.out.println("inn mouseMoved  ");
        if (weldList.size() >= 1) {                   // kan ikke flytte element i tom liste
            enterType = 0;
            foundIndex = 0;
            entered = false;

            for (int i = 0; i < weldList.size(); i++) {
                if (!entered) {
                    tester = weldList.get(i);
                    point = tester.getWeldPointFirst();
                    if ((movedPoint.x <= (point.x + big)) && (movedPoint.x >= (point.x - big))) {
                        if ((movedPoint.y <= (point.y + big)) && (movedPoint.y >= (point.y - big))) {
                            enterType = 1;
                            foundIndex = i;
                            entered = true;
                        }
                    }
                }
            }
            for (int j = 0; j < weldList.size(); j++) {
                if (!entered) {
                    tester = weldList.get(j);
                    point = tester.getWeldPointLast();
                    if ((movedPoint.x <= (point.x + big)) && (movedPoint.x >= (point.x - big))) {
                        if ((movedPoint.y <= (point.y + big)) && (movedPoint.y >= (point.y - big))) {
                            enterType = 3;
                            foundIndex = j;
                            entered = true;
                        }
                    }
                }
            }
            for (int l = 0; l < weldList.size(); l++) {
                if (!entered) {
                    tester = weldList.get(l);
                    point = tester.getWeldPointMiddel();
                    if ((movedPoint.x <= (point.x + big)) && (movedPoint.x >= (point.x - big))) {
                        if ((movedPoint.y <= (point.y + big)) && (movedPoint.y >= (point.y - big))) {
                            enterType = 2;
                            foundIndex = l;
                            entered = true;
                        }
                    }
                }
            }
            for (int m = 0; m < weldList.size(); m++) {
                if (!entered) {
                    tester = weldList.get(m);
                    point = tester.getWeldPointTextPoint();
       //             System.out.println(movedPoint + "  " +  point);
                    if ((movedPoint.x <= (point.x + big)) && (movedPoint.x >= (point.x - big))) {
                        if ((movedPoint.y <= (point.y + big)) && (movedPoint.y >= (point.y - big))) {
                            enterType = 4;
                            foundIndex = m;
                            entered = true;
                        }
                    }
                }
            }
            /*
            for (int  n = 0; n < weldList.size(); n++) {
                if (!entered) {
                    tester = weldList.get(n);
                    point = tester.getWeldPointTextPoint();
                    if ((movedPoint.x <= (point.x + big)) && (movedPoint.x >= (point.x - big))) {
                        if ((movedPoint.y <= (point.y + big)) && (movedPoint.y >= (point.y - big))) {
                            enterType = 5;
                            foundIndex = n;
                            entered = true;
                        }
                    }
                }
            }

             */


            // enterType indikerer punktType indeks 1, 2 , 3 eller 4
            // foundIndex indeksen til aktuelt punkt i weldList
            //       System.out.println("endelig funnet punkt " + entered + "  " + foundIndex + "  type " + enterType);
            if (entered) {
      //          System.out.println("mouseMoved " + entered + " " + enterType + "  " +  foundIndex);
                tester = weldList.get(foundIndex);
                if (enterType == 1) {
                    tester.setWeldPointFirst(toPointNew);
                }
                if (enterType == 2 && tester.getCode() != 3) {
                    tester.setWeldPointMiddel(toPointNew);
                }
                if (enterType == 3) {
                    tester.setWeldPointLast(toPointNew);
                }
                if (enterType == 4) {
                    tester.setWeldPointTextPoint(toPointNew);
                    String test = tester.getWeldPointText();
                    if (test.substring(0, 1).equals(".")) {
                    } else {
                        int a1 = toPointNew.x;
                        int a2 = toPointNew.y;
                    }
                    weldList.set(foundIndex, tester);   // setter inn nye verdier
                    CalcValues.weldList = weldList;   // setter inn nye verdier
                }
                if (moveNew) {
                    enterTypeNew = enterType;
                    new MouseReleased(movedPoint);
                    if (CalcValues.valgIndeks == 1) {
                  ///      new BezierViewR();
                        UI.getCurrent().getPage().setLocation("mover");
                    }
                    if (CalcValues.valgIndeks == 2) {
                  //      new BezierViewR();
                        UI.getCurrent().getPage().setLocation("mover");
                    }
                    if (CalcValues.valgIndeks == 3) {
                   //     new ZoomMenue5();
                        UI.getCurrent().getPage().setLocation("zoommenue5");
                    }
                    if (CalcValues.valgIndeks == 4) {
                        //     new ZoomMenue5();
                        UI.getCurrent().getPage().setLocation("zoomimage5");
                    }
                } else {
                    new DrawWeldinnString();
                }
            }
        }

        //////////////////////////////////////////////////////////
        if ( CalcValues.extraComment.size() > 0 ) {
            System.out.println("MoueMoved  extraComment");
            enterType = 0;
            foundIndex = 0;
            entered = false;
            for ( int l= 0 ; l < CalcValues.extraComment.size() ; l++ ) {
                test = CalcValues.extraComment.get(l);
                int x = test.getFirstX();
                int y = test.getFirstY();
                if ((movedPoint.x <= (x + big)) && (movedPoint.x >= (x - big))) {
                    if ((movedPoint.y <= (y + big)) && (movedPoint.y >= (y - big))) {
                        enterType = 5;
                        foundIndex = l;
                        entered = true;
                        enterTypeNew = enterType;
                        //      System.out.println(" funnet 1 " + CalcValues.extraComment.size());
                        CalcValues.extraComment.remove(l);
                        //       System.out.println(" funnet 2 " + CalcValues.extraComment.size());
                    }
                }


            }


            if (entered) {
                //     System.out.println(enterTypeNew);

                if (CalcValues.valgIndeks == 1) {
                //    new SvgDraggableTextView();
                    UI.getCurrent().getPage().setLocation("movercomment");
                }
                if (CalcValues.valgIndeks == 2) {
                //    new SvgDraggableTextView();
                    UI.getCurrent().getPage().setLocation("movercomment");
                }
                if (CalcValues.valgIndeks == 3) {
               //    new ZoomMenue6();
          //          UI.getCurrent().getPage().setLocation("zoommenue6");
                }


            }
        }
        ////////////////////////
        if ( CalcValues.actualMoveString.size() > 0 ) {
            enterType = 0;
            foundIndex = 0;
            entered = false;
            for ( int ll = 0 ; ll < CalcValues.actualMoveString.size() ; ll++ ) {
                testTall = CalcValues.actualMoveString.get(ll);
                int x = testTall.getFirstX();
                int y = testTall.getFirstY();
                //        String uu = testTall.getLastString();
                //       System.out.println("x " + x + " y "  +  y + "  "  +  movedPoint.x + "  "  +  movedPoint.y +  "  " + big + "  " + ll + "   "  + uu  );
                if ((movedPoint.x <= (x + big)) && (movedPoint.x >= (x - big))) {
                    if ((movedPoint.y <= (y + big)) && (movedPoint.y >= (y - big))) {
                        enterType = 6;
                        foundIndex = ll;
                        entered = true;
                        enterTypeNew = enterType;
                        foundType = testTall;
                        ExtraTall extra = CalcValues.extraTallTegn.get(ll);
                        String str = extra.getLastString();
                        int x1 = extra.getFirstX();
                        int y1 = extra.getFirstY();
                        originalType = new ExtraTall(str, x1, y1);
                        CalcValues.extraTallTegn.set(ll, new ExtraTall("", x1, y1));
                    }
                }
            }

            for ( int ll = CalcValues.actualMoveString.size()-1 ; ll > CalcValues.actualMoveString.size() ; ll-- ) {
                CalcValues.actualMoveString.remove(ll);
            }
            if (entered) {
                //      System.out.println(enterTypeNew);
                if (CalcValues.valgIndeks == 1) {
             //       new SvgDraggableTextView();
                    UI.getCurrent().getPage().setLocation("movercomment");
                }
                if (CalcValues.valgIndeks == 2) {
              //      new SvgDraggableTextView();
                    UI.getCurrent().getPage().setLocation("movercomment");
                }
                if (CalcValues.valgIndeks == 3) {
               //     new ZoomMenue6();
        //            UI.getCurrent().getPage().setLocation("zoommenue6");
                }



            }
        }

        /////////////////////////////////////////////////
        if ( CalcValues.actualMoveStringNew.size() > 0 ) {
            enterType = 0;
            foundIndex = 0;
            entered = false;
            for ( int l= 0 ; l < CalcValues.actualMoveStringNew.size() ; l++ ) {
                testTall = CalcValues.actualMoveStringNew.get(l);
                int x = testTall.getFirstX();
                int  y = testTall.getFirstY();
                if ((movedPoint.x <= (x + big)) && (movedPoint.x >= (x - big))) {
                    if ((movedPoint.y <= (y + big)) && (movedPoint.y >= (y - big))) {
                        enterType = 7;
                        foundIndex = l;
                        entered = true;
                        enterTypeNew = enterType;
                        foundType = testTall;
                        ExtraTall extra = CalcValues.extraTall.get(l);
                        String str = extra.getLastString();
                        int x1 = extra.getFirstX();
                        int y1 = extra.getFirstY();

                        CalcValues.extraTall.set(l, new ExtraTall("", x1, y1));
                    }
                }
            }
            for ( int ll = CalcValues.actualMoveStringNew.size()-1 ; ll > CalcValues.actualMoveStringNew.size() ; ll-- ) {
                CalcValues.actualMoveStringNew.remove(ll);
            }
            if (entered) {
                //      System.out.println(enterTypeNew);
                if (CalcValues.valgIndeks == 1) {
                    new SvgDraggableTextView();
                    UI.getCurrent().getPage().setLocation("movercomment");
                }
                if (CalcValues.valgIndeks == 2) {
                    new SvgDraggableTextView();
                    UI.getCurrent().getPage().setLocation("movercomment");
                }
                if (CalcValues.valgIndeks == 3) {
          //          new ZoomMenue6();
       //             UI.getCurrent().getPage().setLocation("zoommenue6");
             //       new SvgDraggableTextView();
                    UI.getCurrent().getPage().setLocation("zoommenue4");
                }
                if (CalcValues.valgIndeks == 4) {
           //        new ZoomImage6();
                    //             UI.getCurrent().getPage().setLocation("zoommenue6");
            //        new SvgDraggableTextView();
                    UI.getCurrent().getPage().setLocation("zoomimage0");
                }


            }
        }

        /////////////////////////////////////////////////

    }
    public static int getFoundIndex() {
        return foundIndex;
    }
    public static ExtraComment getTest() { return test; }
    public static ExtraTall getFoundType() { return foundType;}
    public static ExtraTall getOriginalType() { return originalType; }
}









