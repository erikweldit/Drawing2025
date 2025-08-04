package com.example.application.Mouse;
import com.example.application.html.WeldSymbol;
import com.example.application.html.svg;
import com.example.application.under.WeldPoint;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import static com.example.application.weld.CalcValues.gang;
/**
 * Generate string of svg kode for the actual weldPoint code without circles
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route(value = "drawingsave" , layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Drawing line ")
public class DrawWeldSave {
    Point firstPoint = new Point();
    Point middelPoint = new Point();
    Point lastPoint = new Point();
    Point textPoint = new Point();
    String ident;
    boolean punktPlottes;
    boolean textPlottes;
    int numberWeld;
    WeldPoint tester = new WeldPoint();
    String aText = "0";
    int a1 = 0;
    int a2 = 0;
    int a3 = 0;

    WeldSymbol sym1 = new WeldSymbol(aText, a1, a2, a1);
    WeldSymbol sym2 = new WeldSymbol(a1, a1, a2);

    public ArrayList<WeldPoint> weldList = new ArrayList<>();
    private ArrayList<WeldPoint> actualList = new ArrayList<>();
    String svgInnhold;
    String svgWeld;
    String user;
    String svgTab = " ";
    int type;
    int indicator;
    String typePlot;
    int code;
    List<String> svgStringWeld = new ArrayList<>();
    List<String> svgStringCircleFirst = new ArrayList<>();
    List<String> svgStringCircleLast = new ArrayList<>();
    List<String> svgStringCircleMiddel = new ArrayList<>();
    List<String> svgStringText = new ArrayList<>();

    public DrawWeldSave() {
        String outSvgNew;  // =  outSvg;
        var canv = new svg();
        //     System.out.println("inn DrawWeldinnString ");

        String svgStop = canv.svgEnd();

        this.weldList = CalcValues.weldList;
        numberWeld = weldList.size();
        svgWeld = "";
        //  CalcValues.svgNew = "";
        for (int i = 0; i < numberWeld; i++) {
            tester = weldList.get(i);
            indicator = tester.getIndicator();
            type = tester.getType();
            user = tester.getUser();
            code = tester.getCode();
            if (indicator == CalcValues.plotIndicator) {
                actualList.add(0, tester);
            }
            if (gang[2] == 12) {
                if ((type == 7 || type == 8 || type == 11) && user.equals(CalcValues.userID)) {
                    actualList.add(0, tester);
                }
            }
            if (gang[2] == 10) {
                if ((type == 7 || type == 8 || type == 9 || type == 11 || type == 15) && user.equals(CalcValues.userID)) {
                    actualList.add(0, tester);
                }
            }
            if (gang[2] == 16) {
                if ((type == 7 || type == 9 || type == 15) && user.equals(CalcValues.userID)) {
                    actualList.add(0, tester);
                }
            }
        }

        int ant = svgStringWeld.size();
        for (int ind = 0; ind < actualList.size(); ind++) {
            tester = actualList.get(ind);
            svgTab = tester.getSymbol();
            firstPoint = tester.getWeldPointFirst();
            middelPoint = tester.getWeldPointMiddel();
            lastPoint = tester.getWeldPointLast();
            textPoint = tester.getWeldPointTextPoint();
            ident = tester.getWeldPointText();
            punktPlottes = tester.getWeldPointPlottes();
            textPlottes = tester.getWeldTextPlottes();
            type = tester.getType();
            typePlot = tester.getPlotType();
            String ident = tester.getWeldPointText();
            aText = tester.getAString();
            tester.setAString(aText);
            int code = tester.getCode();
            if (code == 1) {
                svgWeld += canv.drawBezier2(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
                svgWeld += canv.drawText(ident, textPoint.x, textPoint.y);
            }
            if (code == 3) {
                svgWeld += canv.drawBezier2(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
            }

            if (code == 2) {
                svgWeld += canv.drawText(ident, textPoint.x, textPoint.y);
                int tall = sym1.giveInteger(aText);
                String textNew = sym2.choseSymbol(tall, textPoint.x, textPoint.y);
                tester.setSymbol(textNew);
                svgWeld += textNew;
            }
/*
            if (punktPlottes && ( code == 1 || code == 3)) {
                svgWeld += canv.drawCircle(firstPoint.x, firstPoint.y, 3);
                svgWeld += canv.drawCircle(lastPoint.x, lastPoint.y, 3);
                svgWeld += canv.drawCircle(middelPoint.x, middelPoint.y, 3);
            }
            ;}

 */
            CalcValues.svgNew = svgWeld + CalcValues.svgSymbol;

        }

    }
}






