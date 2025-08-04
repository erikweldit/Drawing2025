package com.example.application.diverse.camvas;




import com.example.application.Mouse.DrawWeldingSymbol;
import com.example.application.diverse.SymbolTable;
import com.example.application.under.WeldPoint;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;



import java.util.ArrayList;
/**
 *
 * Gives opportunities to choose weld symbol
 * and generate svg kode for the actual symbol
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route(value = "symbol", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Change welding identificators")
public class NewSymbol extends VerticalLayout {
    public ArrayList<WeldPoint> weldList = new ArrayList<>();
    int antall;
    int maxAntall = 40;
    WeldPoint wPoint = new WeldPoint();
    TextArea textArea00;
    TextArea textArea01;
    TextArea textArea02;
    TextArea textArea03;
    TextArea textArea04;
    TextArea textArea05;
    TextArea textArea06;
    TextArea textArea07;
    TextArea textArea08;
    TextArea textArea09;
    TextArea textArea010;
    TextArea textArea011;
    TextArea textArea012;
    TextArea textArea013;
    TextArea textArea014;
    TextArea textArea015;
    TextArea textArea016;
    TextArea textArea017;
    TextArea textArea018;
    TextArea textArea019;
    TextArea textArea020;
    TextArea textArea021;
    TextArea textArea022;
    TextArea textArea023;
    TextArea textArea024;
    TextArea textArea025;
    TextArea textArea026;
    TextArea textArea027;
    TextArea textArea028;
    TextArea textArea029;
    TextArea textArea030;
    TextArea textArea031;
    TextArea textArea032;
    TextArea textArea033;
    TextArea textArea034;
    TextArea textArea035;
    TextArea textArea036;
    TextArea textArea037;
    TextArea textArea038;
    TextArea textArea039;
    TextArea textInd000;
    TextArea textInd001;

    TextArea textInd002;
    TextArea textInd003;
    TextArea textInd004;
    TextArea textInd005;
    TextArea textInd006;
    TextArea textInd007;
    TextArea textInd008;
    TextArea textInd009;
    TextArea textInd0010;
    TextArea textInd0011;
    TextArea textInd0012;
    TextArea textInd0013;
    TextArea textInd0014;
    TextArea textInd0015;
    TextArea textInd0016;
    TextArea textInd0017;
    TextArea textInd0018;
    TextArea textInd0019;
    TextArea textInd0020;
    TextArea textInd0021;
    TextArea textInd0022;
    TextArea textInd0023;
    TextArea textInd0024;
    TextArea textInd0025;
    TextArea textInd0026;
    TextArea textInd0027;
    TextArea textInd0028;
    TextArea textInd0029;
    TextArea textInd0030;
    TextArea textInd0031;
    TextArea textInd0032;
    TextArea textInd0033;
    TextArea textInd0034;
    TextArea textInd0035;
    TextArea textInd0036;
    TextArea textInd0037;
    TextArea textInd0038;
    TextArea textInd0039;
    int testValue = CalcValues.plotIndicator;
    public NewSymbol() {
        this.weldList = CalcValues.weldList;
        antall = weldList.size();
        if (antall == 0) {
            noString();
        } else {
            if (antall >= maxAntall ) antall = maxAntall;
            new SymbolTable();
            showString();
        }

    }



    private void showString() {
        String out = "Possible welding string";
        String outOld = "Old";
        String outNew = "Give new";
        String outInd = "Index";

        TextArea textAreaNoString = new TextArea();
        textAreaNoString.setWidth("250px");
        textAreaNoString.setMinHeight("40px");
        textAreaNoString.setMaxHeight("40px");
        //   textAreaNoString.setLabel("");
        textAreaNoString.setValue(out );
        Button addButton = new Button("Generate new string symbol");
        addButton.setWidth("400px");
        addButton.addThemeVariants(ButtonVariant.LUMO_LARGE);
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Image img = new Image("images/symboltabell.png", "Symbol table");
        img.setWidth("460px");

        HorizontalLayout hl0A = new HorizontalLayout(textAreaNoString, addButton );
        // hl0A.setDefaultVComponentAlignment(Alignment.AUTO);
        add(hl0A);
///

        TextArea textArea0B = new TextArea();
        textArea0B.setWidth("100px");
        textArea0B.setMinHeight("50px");
        textArea0B.setMaxHeight("50px");
        textArea0B.setLabel(outOld);
        //     textArea0B.setValue(out0);
        TextArea textArea00B = new TextArea();
        textArea00B = new TextArea();
        textArea00B.setWidth("100px");
        textArea00B.setMinHeight("50px");
        textArea00B.setMaxHeight("50px");
        textArea00B.setLabel(outNew);
        //    textArea00B.setValue(out0);

        TextArea textInd000B = new TextArea();
        textInd000B = new TextArea();
        textInd000B.setWidth("100px");
        textInd000B.setMinHeight("50px");
        textInd000B.setMaxHeight("50px");
        textInd000B.setLabel(outInd);
        //   textInd000B.setValue(ind0s);


        HorizontalLayout hl0B = new HorizontalLayout(textArea0B, textArea00B,textInd000B);
        hl0B.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        //     add(hl0B);
        ///

        //   setSizeFull();
        //  VerticalLayout vl = new VerticalLayout(hl0A );
        //  HorizontalLayout vs = new HorizontalLayout(img );
        //add( vs);
        for ( int i= 0 ; i < antall; i++) {
            if ( i == 0) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out0 = wPoint.getWeldPointText();
                    TextArea textArea0 = new TextArea();
                    textArea0.setWidth("100px");
                    textArea0.setMinHeight("50px");
                    textArea0.setMaxHeight("50px");
                    textArea0.setLabel(outOld);
                    textArea0.setValue(out0);

                    textArea00 = new TextArea();
                    textArea00.setWidth("100px");
                    textArea00.setMinHeight("50px");
                    textArea00.setMaxHeight("50px");
                    textArea00.setLabel(outNew);
                    textArea00.setValue(out0);

                    String ind0s = wPoint.getAString();
                    textInd000 = new TextArea();
                    textInd000.setWidth("100px");
                    textInd000.setMinHeight("50px");
                    textInd000.setMaxHeight("50px");
                    textInd000.setLabel(outInd);
                    textInd000.setValue(ind0s);


                    HorizontalLayout hl0 = new HorizontalLayout(textArea0, textArea00,textInd000);
                    hl0.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl0);
                }
            }
            if ( i == 1) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out1 = wPoint.getWeldPointText();
                    TextArea textArea1 = new TextArea();
                    textArea1.setWidth("100px");
                    textArea1.setMinHeight("30px");
                    textArea1.setMaxHeight("30px");
                    //      textArea1.setLabel(outOld);
                    textArea1.setValue(out1);


                    textArea01 = new TextArea();
                    textArea01.setWidth("100px");
                    textArea01.setMinHeight("30px");
                    textArea01.setMaxHeight("30px");
                    //     textArea01.setLabel(outNew);
                    textArea01.setValue(out1);

                    String ind0s = wPoint.getAString();
                    textInd001 = new TextArea();
                    textInd001.setWidth("100px");
                    textInd001.setMinHeight("30px");
                    textInd001.setMaxHeight("30px");
                    textInd001.setValue(ind0s);

                    HorizontalLayout hl01 = new HorizontalLayout(textArea1, textArea01, textInd001);
                    hl01.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl01);
                }
            }
            if ( i == 2) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out2 = wPoint.getWeldPointText();
                    TextArea textArea2 = new TextArea();
                    textArea2.setWidth("100px");
                    textArea2.setMinHeight("30px");
                    textArea2.setMaxHeight("30px");
                    //     textArea2.setLabel(outOld);
                    textArea2.setValue(out2);


                    textArea02 = new TextArea();
                    textArea02.setWidth("100px");
                    textArea02.setMinHeight("30px");
                    textArea02.setMaxHeight("30px");
                    //       textArea02.setLabel(outNew);
                    textArea02.setValue(out2);
                    String ind0s = wPoint.getAString();
                    textInd002 = new TextArea();
                    textInd002.setWidth("100px");
                    textInd002.setMinHeight("30px");
                    textInd002.setMaxHeight("30px");
                    textInd002.setValue(ind0s);

                    HorizontalLayout hl02 = new HorizontalLayout(textArea2, textArea02, textInd002);
                    hl02.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl02);
                    //            add(vl, hl0A,  hl02, vs);
                }
            }
            if ( i == 3) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out3 = wPoint.getWeldPointText();
                    TextArea textArea3 = new TextArea();
                    textArea3.setWidth("100px");
                    textArea3.setMinHeight("30px");
                    textArea3.setMaxHeight("30px");
                    //     textArea3.setLabel(outOld);
                    textArea3.setValue(out3);


                    textArea03 = new TextArea();
                    textArea03.setWidth("100px");
                    textArea03.setMinHeight("30px");
                    textArea03.setMaxHeight("30px");
                    //      textArea03.setLabel(outNew);
                    textArea03.setValue(out3);
                    String ind0s = wPoint.getAString();
                    textInd003 = new TextArea();
                    textInd003.setWidth("100px");
                    textInd003.setMinHeight("30px");
                    textInd003.setMaxHeight("30px");
                    textInd003.setValue(ind0s);
                    HorizontalLayout hl03 = new HorizontalLayout(textArea3, textArea03, textInd003);
                    hl03.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl03);
                }
            }
            if ( i == 4) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out4 = wPoint.getWeldPointText();
                    TextArea textArea4 = new TextArea();
                    textArea4.setWidth("100px");
                    textArea4.setMinHeight("30px");
                    textArea4.setMaxHeight("30px");
                    //    textArea4.setLabel(outOld);
                    textArea4.setValue(out4);


                    textArea04 = new TextArea();
                    textArea04.setWidth("100px");
                    textArea04.setMinHeight("30px");
                    textArea04.setMaxHeight("30px");
                    //    textArea04.setLabel(outNew);
                    textArea04.setValue(out4);
                    String ind0s = wPoint.getAString();
                    textInd004 = new TextArea();
                    textInd004.setWidth("100px");
                    textInd004.setMinHeight("30px");
                    textInd004.setMaxHeight("30px");
                    textInd004.setValue(ind0s);
                    HorizontalLayout hl04 = new HorizontalLayout(textArea4, textArea04, textInd004);
                    hl04.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl04);
                }
            }
            if ( i == 5) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out5 = wPoint.getWeldPointText();
                    TextArea textArea5 = new TextArea();
                    textArea5.setWidth("100px");
                    textArea5.setMinHeight("30px");
                    textArea5.setMaxHeight("30px");
                    //     textArea5.setLabel(outOld);
                    textArea5.setValue(out5);


                    textArea05 = new TextArea();
                    textArea05.setWidth("100px");
                    textArea05.setMinHeight("30px");
                    textArea05.setMaxHeight("30px");
                    //      textArea05.setLabel(outNew);
                    textArea05.setValue(out5);
                    String ind0s = wPoint.getAString();
                    textInd005 = new TextArea();
                    textInd005.setWidth("100px");
                    textInd005.setMinHeight("30px");
                    textInd005.setMaxHeight("30px");
                    textInd005.setValue(ind0s);
                    HorizontalLayout hl05 = new HorizontalLayout(textArea5, textArea05, textInd005);
                    hl05.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl05);
                }
            }
            if ( i == 6) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out6 = wPoint.getWeldPointText();
                    TextArea textArea6 = new TextArea();
                    textArea6.setWidth("100px");
                    textArea6.setMinHeight("30px");
                    textArea6.setMaxHeight("30px");
                    //    textArea6.setLabel(outOld);
                    textArea6.setValue(out6);


                    textArea06 = new TextArea();
                    textArea06.setWidth("100px");
                    textArea06.setMinHeight("30px");
                    textArea06.setMaxHeight("30px");
                    //        textArea06.setLabel(outNew);
                    textArea06.setValue(out6);
                    String ind0s = wPoint.getAString();
                    textInd006 = new TextArea();
                    textInd006.setWidth("100px");
                    textInd006.setMinHeight("30px");
                    textInd006.setMaxHeight("30px");
                    textInd006.setValue(ind0s);
                    HorizontalLayout hl06 = new HorizontalLayout(textArea6, textArea06, textInd006);
                    hl06.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl06);
                }
            }
            if ( i == 7) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out7 = wPoint.getWeldPointText();
                    TextArea textArea7 = new TextArea();
                    textArea7.setWidth("100px");
                    textArea7.setMinHeight("30px");
                    textArea7.setMaxHeight("30px");
                    //     textArea7.setLabel(outOld);
                    textArea7.setValue(out7);


                    textArea07 = new TextArea();
                    textArea07.setWidth("100px");
                    textArea07.setMinHeight("30px");
                    textArea07.setMaxHeight("30px");
                    //       textArea07.setLabel(outNew);
                    textArea07.setValue(out7);
                    String ind0s = wPoint.getAString();
                    textInd007 = new TextArea();
                    textInd007.setWidth("100px");
                    textInd007.setMinHeight("30px");
                    textInd007.setMaxHeight("30px");
                    textInd007.setValue(ind0s);
                    HorizontalLayout hl07 = new HorizontalLayout(textArea7, textArea07, textInd007);
                    hl07.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl07);
                }
            }
            if ( i == 8) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out8 = wPoint.getWeldPointText();
                    TextArea textArea8 = new TextArea();
                    textArea8.setWidth("100px");
                    textArea8.setMinHeight("30px");
                    textArea8.setMaxHeight("30px");
                    //       textArea8.setLabel(outOld);
                    textArea8.setValue(out8);


                    textArea08 = new TextArea();
                    textArea08.setWidth("100px");
                    textArea08.setMinHeight("30px");
                    textArea08.setMaxHeight("30px");
                    //      textArea08.setLabel(outNew);
                    textArea08.setValue(out8);
                    String ind0s = wPoint.getAString();
                    textInd008 = new TextArea();
                    textInd008.setWidth("100px");
                    textInd008.setMinHeight("30px");
                    textInd008.setMaxHeight("30px");
                    textInd008.setValue(ind0s);
                    HorizontalLayout hl08 = new HorizontalLayout(textArea8, textArea08, textInd008);
                    hl08.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl08);
                }
            }
            if ( i == 9) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out9 = wPoint.getWeldPointText();
                    TextArea textArea9 = new TextArea();
                    textArea9.setWidth("100px");
                    textArea9.setMinHeight("30px");
                    textArea9.setMaxHeight("30px");
                    //    textArea9.setLabel(outOld);
                    textArea9.setValue(out9);


                    textArea09 = new TextArea();
                    textArea09.setWidth("100px");
                    textArea09.setMinHeight("30px");
                    textArea09.setMaxHeight("30px");
                    //     textArea09.setLabel(outNew);
                    textArea09.setValue(out9);
                    String ind0s = wPoint.getAString();
                    textInd009 = new TextArea();
                    textInd009.setWidth("100px");
                    textInd009.setMinHeight("30px");
                    textInd009.setMaxHeight("30px");
                    textInd009.setValue(ind0s);
                    HorizontalLayout hl09 = new HorizontalLayout(textArea9, textArea09, textInd009);
                    hl09.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl09);
                }
            }
            if ( i == 10) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out10 = wPoint.getWeldPointText();
                    TextArea textArea10 = new TextArea();
                    textArea10.setWidth("100px");
                    textArea10.setMinHeight("30px");
                    textArea10.setMaxHeight("30px");
                    //      textArea10.setLabel(outOld);
                    textArea10.setValue(out10);


                    textArea010 = new TextArea();
                    textArea010.setWidth("100px");
                    textArea010.setMinHeight("30px");
                    textArea010.setMaxHeight("30px");
                    //    textArea010.setLabel(outNew);
                    textArea010.setValue(out10);
                    String ind0s = wPoint.getAString();
                    textInd0010 = new TextArea();
                    textInd0010.setWidth("100px");
                    textInd0010.setMinHeight("30px");
                    textInd0010.setMaxHeight("30px");
                    textInd0010.setValue(ind0s);
                    HorizontalLayout hl010 = new HorizontalLayout(textArea10, textArea010, textInd0010);
                    hl010.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl010);
                }
            }
            if ( i == 11) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out11 = wPoint.getWeldPointText();
                    TextArea textArea11 = new TextArea();
                    textArea11.setWidth("100px");
                    textArea11.setMinHeight("30px");
                    textArea11.setMaxHeight("30px");
                    //      textArea11.setLabel(outOld);
                    textArea11.setValue(out11);


                    textArea011 = new TextArea();
                    textArea011.setWidth("100px");
                    textArea011.setMinHeight("30px");
                    textArea011.setMaxHeight("30px");
                    //     textArea011.setLabel(outNew);
                    textArea011.setValue(out11);
                    String ind0s = wPoint.getAString();
                    textInd0011 = new TextArea();
                    textInd0011.setWidth("100px");
                    textInd0011.setMinHeight("30px");
                    textInd0011.setMaxHeight("30px");
                    textInd0011.setValue(ind0s);
                    HorizontalLayout hl011 = new HorizontalLayout(textArea11, textArea011, textInd0011);
                    hl011.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl011);
                }
            }
            if ( i == 12) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out12 = wPoint.getWeldPointText();
                    TextArea textArea12 = new TextArea();
                    textArea12.setWidth("100px");
                    textArea12.setMinHeight("30px");
                    textArea12.setMaxHeight("30px");
                    //    textArea12.setLabel(outOld);
                    textArea12.setValue(out12);


                    textArea012 = new TextArea();
                    textArea012.setWidth("100px");
                    textArea012.setMinHeight("30px");
                    textArea012.setMaxHeight("30px");
                    //    textArea012.setLabel(outNew);
                    textArea012.setValue(out12);
                    String ind0s = wPoint.getAString();
                    textInd0012 = new TextArea();
                    textInd0012.setWidth("100px");
                    textInd0012.setMinHeight("30px");
                    textInd0012.setMaxHeight("30px");
                    textInd0012.setValue(ind0s);
                    HorizontalLayout hl012 = new HorizontalLayout(textArea12, textArea012, textInd0012);
                    hl012.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl012);
                }
            }
            if ( i == 13) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out13 = wPoint.getWeldPointText();
                    TextArea textArea13 = new TextArea();
                    textArea13.setWidth("100px");
                    textArea13.setMinHeight("30px");
                    textArea13.setMaxHeight("30px");
                    //     textArea13.setLabel(outOld);
                    textArea13.setValue(out13);


                    textArea013 = new TextArea();
                    textArea013.setWidth("100px");
                    textArea013.setMinHeight("30px");
                    textArea013.setMaxHeight("30px");
                    //     textArea013.setLabel(outNew);
                    textArea013.setValue(out13);
                    String ind0s = wPoint.getAString();
                    textInd0013 = new TextArea();
                    textInd0013.setWidth("100px");
                    textInd0013.setMinHeight("30px");
                    textInd0013.setMaxHeight("30px");
                    textInd0013.setValue(ind0s);
                    HorizontalLayout hl013 = new HorizontalLayout(textArea13, textArea013,  textInd0013);
                    hl013.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl013);
                }
            }
            if ( i == 14) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out14 = wPoint.getWeldPointText();
                    TextArea textArea14 = new TextArea();
                    textArea14.setWidth("100px");
                    textArea14.setMinHeight("30px");
                    textArea14.setMaxHeight("30px");
                    //     textArea14.setLabel(outOld);
                    textArea14.setValue(out14);


                    textArea014 = new TextArea();
                    textArea014.setWidth("100px");
                    textArea014.setMinHeight("30px");
                    textArea014.setMaxHeight("30px");
                    //       textArea014.setLabel(outNew);
                    textArea014.setValue(out14);
                    String ind0s = wPoint.getAString();
                    textInd0014 = new TextArea();
                    textInd0014.setWidth("100px");
                    textInd0014.setMinHeight("30px");
                    textInd0014.setMaxHeight("30px");
                    textInd0014.setValue(ind0s);
                    HorizontalLayout hl014 = new HorizontalLayout(textArea14, textArea014,  textInd0014);
                    hl014.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl014);
                }
            }
            if ( i == 15) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out15 = wPoint.getWeldPointText();
                    TextArea textArea15 = new TextArea();
                    textArea15.setWidth("100px");
                    textArea15.setMinHeight("30px");
                    textArea15.setMaxHeight("30px");
                    //     textArea15.setLabel(outOld);
                    textArea15.setValue(out15);


                    textArea015 = new TextArea();
                    textArea015.setWidth("100px");
                    textArea015.setMinHeight("30px");
                    textArea015.setMaxHeight("30px");
                    //     textArea015.setLabel(outNew);
                    textArea015.setValue(out15);
                    String ind0s = wPoint.getAString();
                    textInd0015 = new TextArea();
                    textInd0015.setWidth("100px");
                    textInd0015.setMinHeight("30px");
                    textInd0015.setMaxHeight("30px");
                    textInd0015.setValue(ind0s);
                    HorizontalLayout hl015 = new HorizontalLayout(textArea15, textArea015,  textInd0015);
                    hl015.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl015);
                }
            }
            if ( i == 16) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out16 = wPoint.getWeldPointText();
                    TextArea textArea16 = new TextArea();
                    textArea16.setWidth("100px");
                    textArea16.setMinHeight("30px");
                    textArea16.setMaxHeight("30px");
                    //  textArea16.setLabel(outOld);
                    textArea16.setValue(out16);


                    textArea016 = new TextArea();
                    textArea016.setWidth("100px");
                    textArea016.setMinHeight("30px");
                    textArea016.setMaxHeight("30px");
                    //   textArea016.setLabel(outNew);
                    textArea016.setValue(out16);
                    String ind0s = wPoint.getAString();
                    textInd0016 = new TextArea();
                    textInd0016.setWidth("100px");
                    textInd0016.setMinHeight("30px");
                    textInd0016.setMaxHeight("30px");
                    textInd0016.setValue(ind0s);
                    HorizontalLayout hl016 = new HorizontalLayout(textArea16, textArea016,  textInd0016);
                    hl016.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl016);
                }
            }
            if ( i == 17) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out17 = wPoint.getWeldPointText();
                    TextArea textArea17 = new TextArea();
                    textArea17.setWidth("100px");
                    textArea17.setMinHeight("30px");
                    textArea17.setMaxHeight("30px");
                    //      textArea17.setLabel(outOld);
                    textArea17.setValue(out17);


                    textArea017 = new TextArea();
                    textArea017.setWidth("100px");
                    textArea017.setMinHeight("30px");
                    textArea017.setMaxHeight("30px");
                    //     textArea017.setLabel(outNew);
                    textArea017.setValue(out17);
                    String ind0s = wPoint.getAString();
                    textInd0017 = new TextArea();
                    textInd0017.setWidth("100px");
                    textInd0017.setMinHeight("30px");
                    textInd0017.setMaxHeight("30px");
                    textInd0017.setValue(ind0s);
                    HorizontalLayout hl017 = new HorizontalLayout(textArea17, textArea017,  textInd0017);
                    hl017.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl017);
                }
            }
            if ( i == 18) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out18 = wPoint.getWeldPointText();
                    TextArea textArea18 = new TextArea();
                    textArea18.setWidth("100px");
                    textArea18.setMinHeight("30px");
                    textArea18.setMaxHeight("30px");
                    //       textArea18.setLabel(outOld);
                    textArea18.setValue(out18);


                    textArea018 = new TextArea();
                    textArea018.setWidth("100px");
                    textArea018.setMinHeight("30px");
                    textArea018.setMaxHeight("30px");
                    //    textArea018.setLabel(outNew);
                    textArea018.setValue(out18);
                    String ind0s = wPoint.getAString();
                    textInd0018 = new TextArea();
                    textInd0018.setWidth("100px");
                    textInd0018.setMinHeight("30px");
                    textInd0018.setMaxHeight("30px");
                    textInd0018.setValue(ind0s);
                    HorizontalLayout hl018 = new HorizontalLayout(textArea18, textArea018,  textInd0018);
                    hl018.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl018);
                }
            }
            if ( i == 19) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out19 = wPoint.getWeldPointText();
                    TextArea textArea19 = new TextArea();
                    textArea19.setWidth("100px");
                    textArea19.setMinHeight("30px");
                    textArea19.setMaxHeight("30px");
                    //   textArea19.setLabel(outOld);
                    textArea19.setValue(out19);


                    textArea019 = new TextArea();
                    textArea019.setWidth("100px");
                    textArea019.setMinHeight("30px");
                    textArea019.setMaxHeight("30px");
                    //     textArea019.setLabel(outNew);
                    textArea019.setValue(out19);
                    String ind0s = wPoint.getAString();
                    textInd0019 = new TextArea();
                    textInd0019.setWidth("100px");
                    textInd0019.setMinHeight("30px");
                    textInd0019.setMaxHeight("30px");
                    textInd0019.setValue(ind0s);
                    HorizontalLayout hl019 = new HorizontalLayout(textArea19, textArea019,  textInd0019);
                    hl019.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl019);
                }
            }
            if ( i == 20) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out20 = wPoint.getWeldPointText();
                    TextArea textArea20 = new TextArea();
                    textArea20.setWidth("100px");
                    textArea20.setMinHeight("30px");
                    textArea20.setMaxHeight("30px");
                    //    textArea20.setLabel(outOld);
                    textArea20.setValue(out20);


                    textArea020 = new TextArea();
                    textArea020.setWidth("100px");
                    textArea020.setMinHeight("30px");
                    textArea020.setMaxHeight("30px");
                    //   textArea020.setLabel(outNew);
                    textArea020.setValue(out20);
                    String ind0s = wPoint.getAString();
                    textInd0020 = new TextArea();
                    textInd0020.setWidth("100px");
                    textInd0020.setMinHeight("30px");
                    textInd0020.setMaxHeight("30px");
                    textInd0020.setValue(ind0s);
                    HorizontalLayout hl020 = new HorizontalLayout(textArea20, textArea020,  textInd0020);
                    hl020.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl020);
                }
            }
            if ( i == 21) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out21 = wPoint.getWeldPointText();
                    TextArea textArea21 = new TextArea();
                    textArea21.setWidth("100px");
                    textArea21.setMinHeight("30px");
                    textArea21.setMaxHeight("30px");
                    //   textArea21.setLabel(outOld);
                    textArea21.setValue(out21);


                    textArea021 = new TextArea();
                    textArea021.setWidth("100px");
                    textArea021.setMinHeight("30px");
                    textArea021.setMaxHeight("30px");
                    //    textArea021.setLabel(outNew);
                    textArea021.setValue(out21);
                    String ind0s = wPoint.getAString();
                    textInd0021 = new TextArea();
                    textInd0021.setWidth("100px");
                    textInd0021.setMinHeight("30px");
                    textInd0021.setMaxHeight("30px");
                    textInd0021.setValue(ind0s);
                    HorizontalLayout hl021 = new HorizontalLayout(textArea21, textArea021,  textInd0021);
                    hl021.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl021);
                }
            }
            if ( i == 22) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out22 = wPoint.getWeldPointText();
                    TextArea textArea22 = new TextArea();
                    textArea22.setWidth("100px");
                    textArea22.setMinHeight("30px");
                    textArea22.setMaxHeight("30px");
                    //    textArea22.setLabel(outOld);
                    textArea22.setValue(out22);


                    textArea022 = new TextArea();
                    textArea022.setWidth("100px");
                    textArea022.setMinHeight("30px");
                    textArea022.setMaxHeight("30px");
                    //    textArea022.setLabel(outNew);
                    textArea022.setValue(out22);
                    String ind0s = wPoint.getAString();
                    textInd0022 = new TextArea();
                    textInd0022.setWidth("100px");
                    textInd0022.setMinHeight("30px");
                    textInd0022.setMaxHeight("30px");
                    textInd0022.setValue(ind0s);
                    HorizontalLayout hl022 = new HorizontalLayout(textArea22, textArea022,  textInd0022);
                    hl022.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl022);
                }
            }
            if ( i == 23) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out23 = wPoint.getWeldPointText();
                    TextArea textArea23 = new TextArea();
                    textArea23.setWidth("100px");
                    textArea23.setMinHeight("30px");
                    textArea23.setMaxHeight("30px");
                    //   textArea23.setLabel(outOld);
                    textArea23.setValue(out23);


                    textArea023 = new TextArea();
                    textArea023.setWidth("100px");
                    textArea023.setMinHeight("30px");
                    textArea023.setMaxHeight("30px");
                    //   textArea023.setLabel(outNew);
                    textArea023.setValue(out23);
                    String ind0s = wPoint.getAString();
                    textInd0023 = new TextArea();
                    textInd0023.setWidth("100px");
                    textInd0023.setMinHeight("30px");
                    textInd0023.setMaxHeight("30px");
                    textInd0023.setValue(ind0s);
                    HorizontalLayout hl023 = new HorizontalLayout(textArea23, textArea023,  textInd0023);
                    hl023.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl023);
                }
            }
            if ( i == 24) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue ) {
                    String out24 = wPoint.getWeldPointText();
                    TextArea textArea24 = new TextArea();
                    textArea24.setWidth("100px");
                    textArea24.setMinHeight("30px");
                    textArea24.setMaxHeight("30px");
                    //     textArea24.setLabel(outOld);
                    textArea24.setValue(out24);


                    textArea024 = new TextArea();
                    textArea024.setWidth("100px");
                    textArea024.setMinHeight("30px");
                    textArea024.setMaxHeight("30px");
                    //  textArea024.setLabel(outNew);
                    textArea024.setValue(out24);
                    String ind0s = wPoint.getAString();
                    textInd0024 = new TextArea();
                    textInd0024.setWidth("100px");
                    textInd0024.setMinHeight("30px");
                    textInd0024.setMaxHeight("30px");
                    textInd0024.setValue(ind0s);
                    HorizontalLayout hl024 = new HorizontalLayout(textArea24, textArea024,  textInd0024);
                    hl024.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl024);
                }
            }
            if ( i == 25) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue ) {
                    String out25 = wPoint.getWeldPointText();
                    TextArea textArea25 = new TextArea();
                    textArea25.setWidth("100px");
                    textArea25.setMinHeight("30px");
                    textArea25.setMaxHeight("30px");
                    //    textArea25.setLabel(outOld);
                    textArea25.setValue(out25);


                    textArea025 = new TextArea();
                    textArea025.setWidth("100px");
                    textArea025.setMinHeight("30px");
                    textArea025.setMaxHeight("30px");
                    //   textArea025.setLabel(outNew);
                    textArea025.setValue(out25);
                    String ind0s = wPoint.getAString();
                    textInd0025 = new TextArea();
                    textInd0025.setWidth("100px");
                    textInd0025.setMinHeight("30px");
                    textInd0025.setMaxHeight("30px");
                    textInd0025.setValue(ind0s);
                    HorizontalLayout hl025 = new HorizontalLayout(textArea25, textArea025,  textInd0025);
                    hl025.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl025);
                }
            }
            if ( i == 26) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out26 = wPoint.getWeldPointText();
                    TextArea textArea26 = new TextArea();
                    textArea26.setWidth("100px");
                    textArea26.setMinHeight("30px");
                    textArea26.setMaxHeight("30px");
                    //   textArea26.setLabel(outOld);
                    textArea26.setValue(out26);


                    textArea026 = new TextArea();
                    textArea026.setWidth("100px");
                    textArea026.setMinHeight("30px");
                    textArea026.setMaxHeight("30px");
                    //    textArea026.setLabel(outNew);
                    textArea026.setValue(out26);
                    String ind0s = wPoint.getAString();
                    textInd0026 = new TextArea();
                    textInd0026.setWidth("100px");
                    textInd0026.setMinHeight("30px");
                    textInd0026.setMaxHeight("30px");
                    textInd0026.setValue(ind0s);
                    HorizontalLayout hl026 = new HorizontalLayout(textArea26, textArea026,  textInd0026);
                    hl026.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl026);
                }
            }
            if ( i == 27) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out27 = wPoint.getWeldPointText();
                    TextArea textArea27 = new TextArea();
                    textArea27.setWidth("100px");
                    textArea27.setMinHeight("30px");
                    textArea27.setMaxHeight("30px");
                    //   textArea27.setLabel(outOld);
                    textArea27.setValue(out27);


                    textArea027 = new TextArea();
                    textArea027.setWidth("100px");
                    textArea027.setMinHeight("30px");
                    textArea027.setMaxHeight("30px");
                    //     textArea027.setLabel(outNew);
                    textArea027.setValue(out27);
                    String ind0s = wPoint.getAString();
                    textInd0027 = new TextArea();
                    textInd0027.setWidth("100px");
                    textInd0027.setMinHeight("30px");
                    textInd0027.setMaxHeight("30px");
                    textInd0027.setValue(ind0s);
                    HorizontalLayout hl027 = new HorizontalLayout(textArea27, textArea027,  textInd0027);
                    hl027.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl027);
                }
            }
            if ( i == 28) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out28 = wPoint.getWeldPointText();
                    TextArea textArea28 = new TextArea();
                    textArea28.setWidth("100px");
                    textArea28.setMinHeight("30px");
                    textArea28.setMaxHeight("30px");
                    //     textArea28.setLabel(outOld);
                    textArea28.setValue(out28);


                    textArea028 = new TextArea();
                    textArea028.setWidth("100px");
                    textArea028.setMinHeight("30px");
                    textArea028.setMaxHeight("30px");
                    //     textArea028.setLabel(outNew);
                    textArea028.setValue(out28);
                    String ind0s = wPoint.getAString();
                    textInd0028 = new TextArea();
                    textInd0028.setWidth("100px");
                    textInd0028.setMinHeight("30px");
                    textInd0028.setMaxHeight("30px");
                    textInd0028.setValue(ind0s);
                    HorizontalLayout hl028 = new HorizontalLayout(textArea28, textArea028,  textInd0028);
                    hl028.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl028);
                }
            }
            if ( i == 29) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out29 = wPoint.getWeldPointText();
                    TextArea textArea29 = new TextArea();
                    textArea29.setWidth("100px");
                    textArea29.setMinHeight("30px");
                    textArea29.setMaxHeight("30px");
                    //   textArea29.setLabel(outOld);
                    textArea29.setValue(out29);


                    textArea029 = new TextArea();
                    textArea029.setWidth("100px");
                    textArea029.setMinHeight("30px");
                    textArea029.setMaxHeight("30px");
                    //    textArea029.setLabel(outNew);
                    textArea029.setValue(out29);
                    String ind0s = wPoint.getAString();
                    textInd0029 = new TextArea();
                    textInd0029.setWidth("100px");
                    textInd0029.setMinHeight("30px");
                    textInd0029.setMaxHeight("30px");
                    textInd0029.setValue(ind0s);
                    HorizontalLayout hl029 = new HorizontalLayout(textArea29, textArea029,  textInd0029);
                    hl029.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl029);
                }
            }
            if ( i == 30) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out30 = wPoint.getWeldPointText();
                    TextArea textArea30 = new TextArea();
                    textArea30.setWidth("100px");
                    textArea30.setMinHeight("30px");
                    textArea30.setMaxHeight("30px");
                    //  textArea30.setLabel(outOld);
                    textArea30.setValue(out30);


                    textArea030 = new TextArea();
                    textArea030.setWidth("100px");
                    textArea030.setMinHeight("30px");
                    textArea030.setMaxHeight("30px");
                    //   textArea030.setLabel(outNew);
                    textArea030.setValue(out30);
                    String ind0s = wPoint.getAString();
                    textInd0030 = new TextArea();
                    textInd0030.setWidth("100px");
                    textInd0030.setMinHeight("30px");
                    textInd0030.setMaxHeight("30px");
                    textInd0030.setValue(ind0s);
                    HorizontalLayout hl030 = new HorizontalLayout(textArea30, textArea030,  textInd0030);
                    hl030.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl030);
                }
            }
            if ( i == 31) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out31 = wPoint.getWeldPointText();
                    TextArea textArea31 = new TextArea();
                    textArea31.setWidth("100px");
                    textArea31.setMinHeight("30px");
                    textArea31.setMaxHeight("30px");
                    //    textArea31.setLabel(outOld);
                    textArea31.setValue(out31);


                    textArea031 = new TextArea();
                    textArea031.setWidth("100px");
                    textArea031.setMinHeight("30px");
                    textArea031.setMaxHeight("30px");
                    //  textArea031.setLabel(outNew);
                    textArea031.setValue(out31);
                    String ind0s = wPoint.getAString();
                    textInd0031 = new TextArea();
                    textInd0031.setWidth("100px");
                    textInd0031.setMinHeight("30px");
                    textInd0031.setMaxHeight("30px");
                    textInd0031.setValue(ind0s);
                    HorizontalLayout hl031 = new HorizontalLayout(textArea31, textArea031,  textInd0031);
                    hl031.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl031);
                }
            }
            if ( i == 32) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out32 = wPoint.getWeldPointText();
                    TextArea textArea32 = new TextArea();
                    textArea32.setWidth("100px");
                    textArea32.setMinHeight("30px");
                    textArea32.setMaxHeight("30px");
                    //    textArea32.setLabel(outOld);
                    textArea32.setValue(out32);


                    textArea032 = new TextArea();
                    textArea032.setWidth("100px");
                    textArea032.setMinHeight("30px");
                    textArea032.setMaxHeight("30px");
                    //   textArea032.setLabel(outNew);
                    textArea032.setValue(out32);
                    String ind0s = wPoint.getAString();
                    textInd0032 = new TextArea();
                    textInd0032.setWidth("100px");
                    textInd0032.setMinHeight("30px");
                    textInd0032.setMaxHeight("30px");
                    textInd0032.setValue(ind0s);
                    HorizontalLayout hl032 = new HorizontalLayout(textArea32, textArea032,  textInd0032);
                    hl032.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl032);
                }
            }
            if ( i == 33) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out33 = wPoint.getWeldPointText();
                    TextArea textArea33 = new TextArea();
                    textArea33.setWidth("100px");
                    textArea33.setMinHeight("30px");
                    textArea33.setMaxHeight("30px");
                    //  textArea33.setLabel(outOld);
                    textArea33.setValue(out33);


                    textArea033 = new TextArea();
                    textArea033.setWidth("100px");
                    textArea033.setMinHeight("30px");
                    textArea033.setMaxHeight("30px");
                    //    textArea033.setLabel(outNew);
                    textArea033.setValue(out33);
                    String ind0s = wPoint.getAString();
                    textInd0033 = new TextArea();
                    textInd0033.setWidth("100px");
                    textInd0033.setMinHeight("30px");
                    textInd0033.setMaxHeight("30px");
                    textInd0033.setValue(ind0s);
                    HorizontalLayout hl033 = new HorizontalLayout(textArea33, textArea033,  textInd0033);
                    hl033.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl033);
                }
            }
            if ( i == 34) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out34 = wPoint.getWeldPointText();
                    TextArea textArea34 = new TextArea();
                    textArea34.setWidth("100px");
                    textArea34.setMinHeight("30px");
                    textArea34.setMaxHeight("30px");
                    //     textArea34.setLabel(outOld);
                    textArea34.setValue(out34);


                    textArea034 = new TextArea();
                    textArea034.setWidth("100px");
                    textArea034.setMinHeight("30px");
                    textArea034.setMaxHeight("30px");
                    //    textArea034.setLabel(outNew);
                    textArea034.setValue(out34);
                    String ind0s = wPoint.getAString();
                    textInd0034 = new TextArea();
                    textInd0034.setWidth("100px");
                    textInd0034.setMinHeight("30px");
                    textInd0034.setMaxHeight("30px");
                    textInd0034.setValue(ind0s);
                    HorizontalLayout hl034 = new HorizontalLayout(textArea34, textArea034,  textInd0034);
                    hl034.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl034);
                }
            }
            if ( i == 35) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out35 = wPoint.getWeldPointText();
                    TextArea textArea35 = new TextArea();
                    textArea35.setWidth("100px");
                    textArea35.setMinHeight("30px");
                    textArea35.setMaxHeight("30px");
                    //     textArea34.setLabel(outOld);
                    textArea35.setValue(out35);


                    textArea035 = new TextArea();
                    textArea035.setWidth("100px");
                    textArea035.setMinHeight("30px");
                    textArea035.setMaxHeight("30px");
                    //    textArea034.setLabel(outNew);
                    textArea035.setValue(out35);
                    String ind0s = wPoint.getAString();
                    textInd0035 = new TextArea();
                    textInd0035.setWidth("100px");
                    textInd0035.setMinHeight("30px");
                    textInd0035.setMaxHeight("30px");
                    textInd0035.setValue(ind0s);
                    HorizontalLayout hl035 = new HorizontalLayout(textArea35, textArea035,  textInd0035);
                    hl035.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl035);
                }
            }
            if ( i == 36) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out36 = wPoint.getWeldPointText();
                    TextArea textArea36 = new TextArea();
                    textArea36.setWidth("100px");
                    textArea36.setMinHeight("30px");
                    textArea36.setMaxHeight("30px");
                    //   textArea36.setLabel(outOld);
                    textArea36.setValue(out36);


                    textArea036 = new TextArea();
                    textArea036.setWidth("100px");
                    textArea036.setMinHeight("30px");
                    textArea036.setMaxHeight("30px");
                    //   textArea036.setLabel(outNew);
                    textArea036.setValue(out36);
                    String ind0s = wPoint.getAString();
                    textInd0036 = new TextArea();
                    textInd0036.setWidth("100px");
                    textInd0036.setMinHeight("30px");
                    textInd0036.setMaxHeight("30px");
                    textInd0036.setValue(ind0s);
                    HorizontalLayout hl036 = new HorizontalLayout(textArea36, textArea036,  textInd0036);
                    hl036.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl036);
                }
            }
            if ( i == 37) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out37 = wPoint.getWeldPointText();
                    TextArea textArea37 = new TextArea();
                    textArea37.setWidth("100px");
                    textArea37.setMinHeight("30px");
                    textArea37.setMaxHeight("30px");
                    //  textArea37.setLabel(outOld);
                    textArea37.setValue(out37);


                    textArea037 = new TextArea();
                    textArea037.setWidth("100px");
                    textArea037.setMinHeight("30px");
                    textArea037.setMaxHeight("30px");
                    //    textArea037.setLabel(outNew);
                    textArea037.setValue(out37);
                    String ind0s = wPoint.getAString();
                    textInd0037 = new TextArea();
                    textInd0037.setWidth("100px");
                    textInd0037.setMinHeight("30px");
                    textInd0037.setMaxHeight("30px");
                    textInd0037.setValue(ind0s);
                    HorizontalLayout hl037 = new HorizontalLayout(textArea37, textArea037,  textInd0037);
                    hl037.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl037);
                }
            }
            if ( i == 38) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out38 = wPoint.getWeldPointText();
                    TextArea textArea38 = new TextArea();
                    textArea38.setWidth("100px");
                    textArea38.setMinHeight("30px");
                    textArea38.setMaxHeight("30px");
                    //   textArea38.setLabel(outOld);
                    textArea38.setValue(out38);


                    textArea038 = new TextArea();
                    textArea038.setWidth("100px");
                    textArea038.setMinHeight("30px");
                    textArea038.setMaxHeight("30px");
                    //    textArea038.setLabel(outNew);
                    textArea038.setValue(out38);
                    String ind0s = wPoint.getAString();
                    textInd0038 = new TextArea();
                    textInd0038.setWidth("100px");
                    textInd0038.setMinHeight("30px");
                    textInd0038.setMaxHeight("30px");
                    textInd0038.setValue(ind0s);
                    HorizontalLayout hl038 = new HorizontalLayout(textArea38, textArea038,  textInd0038);
                    hl038.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl038);
                }
            }
            if ( i == 39) {
                wPoint = this.weldList.get(i);
                if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                    String out39 = wPoint.getWeldPointText();
                    TextArea textArea39 = new TextArea();
                    textArea39.setWidth("100px");
                    textArea39.setMinHeight("30px");
                    textArea39.setMaxHeight("30px");
                    //   textArea39.setLabel(outOld);
                    textArea39.setValue(out39);


                    textArea039 = new TextArea();
                    textArea039.setWidth("100px");
                    textArea039.setMinHeight("30px");
                    textArea039.setMaxHeight("30px");
                    //   textArea039.setLabel(outNew);
                    textArea039.setValue(out39);
                    String ind0s = wPoint.getAString();
                    textInd0039 = new TextArea();
                    textInd0039.setWidth("100px");
                    textInd0039.setMinHeight("30px");
                    textInd0039.setMaxHeight("30px");
                    textInd0039.setValue(ind0s);
                    HorizontalLayout hl039 = new HorizontalLayout(textArea39, textArea039,  textInd0039);
                    hl039.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
                    add(hl039);
                }
            }
        }
        VerticalLayout vv = new VerticalLayout(img);
        add(vv);
        addButton.addClickListener(click -> {

            WeldPoint temp= new WeldPoint();
            String newTemp;
            String newInd;
          //  add(img);
            for ( int j= 0 ; j < antall; j++) {
                if ( j == 0) {
                    wPoint = this.weldList.get(j);
                    if ((wPoint.getCode() == 2 || wPoint.getCode() == 20   ) && wPoint.getIndicator() == testValue) {
                        newTemp = textArea00.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd000.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                        //      System.out.println("newTemp "+ newTemp + "  newInd  " + newInd);
                    }
                }
                if ( j == 1) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea01.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd001.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 2) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea02.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd002.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 3) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea03.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd003.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 4) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea04.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd004.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 5) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea05.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd005.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 6) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea06.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd006.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 7) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea07.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd007.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 8) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea08.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd008.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 9) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea09.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd009.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 10) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea010.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0010.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 11) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2 && wPoint.getIndicator() == testValue) {
                        newTemp = textArea011.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0011.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 12) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue ) {
                        newTemp = textArea012.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0012.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 13) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea013.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0013.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 14) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea014.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0014.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 15) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea015.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0015.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 16) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea016.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0016.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 17) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea017.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0017.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 18) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue ) {
                        newTemp = textArea018.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0018.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 19) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea019.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0019.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }

                if ( j == 20) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea020.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0020.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 21) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea021.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0021.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 22) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea022.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0022.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 23) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea023.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0023.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 24) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea024.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0024.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 25) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea025.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0025.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 26) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea026.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0026.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 27) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea027.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0027.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 28) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea028.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0028.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 29) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea029.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0029.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 30) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea030.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0030.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 31) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea031.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0031.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 32) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea032.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0032.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 33) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea033.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0033.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 34) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea034.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0034.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 35) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea035.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0035.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 36) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea036.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0036.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 37) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea037.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0037.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 38) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue) {
                        newTemp = textArea038.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0038.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }
                if ( j == 39) {
                    wPoint = this.weldList.get(j);
                    if (wPoint.getCode() == 2  && wPoint.getIndicator() == testValue ) {
                        newTemp = textArea039.getValue();
                        wPoint.setWeldText(newTemp);
                        newInd = textInd0039.getValue();
                        wPoint.setAString(newInd);
                        temp = weldList.set(j, wPoint);
                    }
                }


            CalcValues.weldList = weldList;
            new DrawWeldingSymbol();
            //    new DrawWeldinnString();
            //       new BaseMouse();
            }
            CalcValues.weldList = weldList;
            new DrawWeldingSymbol();

        });
    }
    /**
     * No symbol is available
     */
    private void noString() {
        String out = "No weld string is generated";
        TextArea textAreaNoString = new TextArea();
        textAreaNoString.setWidth("500px");
        textAreaNoString.setMinHeight("30px");
        textAreaNoString.setMaxHeight("30px");
        textAreaNoString.setLabel("");
        textAreaNoString.setValue(out );
        add(textAreaNoString);
    }
}




