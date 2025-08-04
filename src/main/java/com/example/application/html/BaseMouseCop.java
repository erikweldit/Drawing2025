package com.example.application.html;




import com.example.application.Mouse.*;
import com.example.application.images.Thym1;
import com.example.application.under.*;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.example.application.weld.Home;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;


import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.auth.AnonymousAllowed;


import java.awt.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/** Klassen brukes for å lese inn koordinatene til musen på skjermen
 * Det er tre muligheter
 * 1. generering av ny streng. Dette krever tre museklikk
 * 2. sletting av en streng.  Dette krever ett museklikk.
 * 3. flytting av en streng eller endring av formen. Dette krever to museklikk.
 *
 *  @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route(value = "Imagecop", layout = MainLayoutDraw.class)
//@PreserveOnRefresh
@PageTitle("Weld IT AS - Drawing welding string")
@CssImport("./../frontend/themes/my-theme/styles.css")
//@Push
/**
 * Definerer et tegneområde
 * Lytter etter museklikk
 * Justerer koordinatene for musen etter plottype
 * 3 klikk skal generere kurve ved kall til classe MouseDraw
 * 1 klikk genererer kall til klasse MouseMove eller MouseRelease
 */
public class BaseMouseCop extends VerticalLayout {
    String url ="BaseMouseCop.class";
    String plotType;
    int antall;
    int xP;
    int big = 5;
    int yP;
    int modus;
    int plotModell;
    int[] zoomX = new int[20];
    double[] zoomC = new double[20];
    int[] zoomY = new int[20];
    double[] zoomF = new double[20];
    List<ExtraLine> extraLine = new ArrayList<>();
    List<ExtraBase> extraBase = new ArrayList<>();

    List<ExtraBue> extraBue = new ArrayList<>();

    List<ExtraTall> extraTall = new ArrayList<>();

    List<ExtraEllipse> extraEllipse = new ArrayList<>();

    List<ExtraLine> extraLineTegn = new ArrayList<>();
    List<ExtraLine> extraLineTabell = new ArrayList<>();
    List<ExtraBue> extraBueTegn = new ArrayList<>();

    List<ExtraTall> extraTallTegn = new ArrayList<>();

    List<ExtraTall> extraTallBase = new ArrayList<>();

    List<ExtraEllipse> extraEllipseTegn = new ArrayList<>();

    List<ExtraArray> extraArrayTegn = new ArrayList<>();

    List<ExtraOval> extraOval = new ArrayList<>();
    List<ExtraText> extraText = new ArrayList<>();
    List<ExtraComment> extraComment = new ArrayList<>();
    List<ExtraBue> clickBue = new ArrayList<>();
    List<ExtraOval> clickOval = new ArrayList<>();
    List<ExtraEllipse> clickEllipse = new ArrayList<>();
    List<ExtraLine> clickLine = new ArrayList<>();
    List<ExtraTall> clickTall = new ArrayList<>();

    String outSvg;

    public ArrayList<WeldPoint> weldList = new ArrayList<>();
    final Cursor cursor = Cursor.getDefaultCursor();
    final Cursor cursorHand = new Cursor(12);
    final Cursor cursorCross = new Cursor(1);
    final Cursor cursorMove = new Cursor(13);
    Cursor cursorWait = new Cursor(3);
    private WeldPoint punkt1 = new WeldPoint();

    private Point firstPointNew = new Point();
    private Point lastPointNew = new Point();
    private Point middelPointNew = new Point();
    private Point textPoint = new Point();
    private Point movePointNew = new Point();
    private Point toPointNew = new Point();
    private String ident;
    int kurveteller;
    int teller;
    private boolean punktPlottes;
    private boolean textPlottes;

    int[] gang = new int[25];
    int[] vec = new int[35];
    int x;
    int y;
    int xCoordinate;
    int yCoordinate;
    Boolean tegning;
    Boolean teksting;
    double fact;

    List<String> svgStringNew = new ArrayList<>();
    int ant;
    String svg;
    String svgInnhold;
    String svgStop;
    String svgWeld;
    String svgSymbol;
    double zoomIndex;
    int plotModus;
    Thym1 result =  new Thym1();;
    int zoomStorage =0;
    boolean moveNew;
    private int[] newAdresses = new int[20];

    public BaseMouseCop() {
        this.plotType = CalcValues.plotType;
        //this.antall = antall;
        this.gang = CalcValues.gang;
        this.moveNew = CalcValues.moveNew;
        this.extraOval = CalcValues.extraOval;
        this.extraText = CalcValues.extraText;
        this.extraBase = CalcValues.extraBase;
        this.extraLine = CalcValues.extraLine;
        this.extraBue = CalcValues.extraBue;
        this.extraTall = CalcValues.extraTall;
        this.extraEllipse = CalcValues.extraEllipse;
        this.extraLineTegn = CalcValues.extraLineTegn;
        this.extraLineTabell = CalcValues.extraLineTabell;
        this.extraBueTegn = CalcValues.extraBueTegn;
        this.extraTallTegn = CalcValues.extraTallTegn;
        this.extraArrayTegn = CalcValues.extraArrayTegn;
        this.extraTallBase = CalcValues.extraTallBase;
        this.extraEllipseTegn = CalcValues.extraEllipseTegn;
        this.extraComment = CalcValues.extraComment;
        this.xP = CalcValues.xP;
        this.yP = CalcValues.yP;
        this.fact = CalcValues.fact;
        this.outSvg = CalcValues.outSvg;
        this.svgStop = CalcValues.svgStop;
        this.svgWeld = CalcValues.svgNew;
        this.svgSymbol = CalcValues.svgSymbol;
        this.zoomX = CalcValues.zoomX;
        this.zoomY = CalcValues.zoomY;
        this.zoomC = CalcValues.zoomC;
        this.newAdresses = CalcValues.newAdresses;
        CalcValues.valgIndeks = 1;
        int nr = CalcValues.weldList.size();
        modus = 0;
        createHeader();
        com.vaadin.flow.component.button.Button button = new com.vaadin.flow.component.button.Button("");
        button.setHeight("860px");
        button.setWidth("1200px%");

        Button myButton = new Button("Draw string");
        myButton.addClassName("my-button");

        Button myButtonLine = new Button("Draw line");
        myButton.addClassName("my-button");

        Button myButtonDelete = new Button("Delete string");
        myButtonDelete.addClassName("my-button");

        Button myButtonMove = new Button("Move string");
        myButtonMove.addClassName("my-button");

        Button myButtonSymbol = new Button("Welding symbol");
        myButtonSymbol.addClassName("my-button");

        Button myButtonSave = new Button("Placing");
        myButtonSave.addClassName("my-button");

        if (CalcValues.emptyBuffer > 0 ) {
            new EmptyBuffer();
        }

        Button myButtonZoom = new Button("String zoom up");
        myButtonZoom.addClassName("my-button");
        NumberField zoom = new NumberField();
        zoom.setWidth("100px");


        if(CalcValues.zoomIndex <= 100) {
            //    CalcValues.zoomIndex = CalcValues.zoomC[gang[2]];
        }
        double iii = CalcValues.zoomIndex;
        zoom.setValue(iii);
        zoom.setClearButtonVisible(true);

        NumberField resturer = new NumberField();
        double ii =  (double)  this.newAdresses[gang[2]];

        resturer.setValue(ii);
        resturer.setClearButtonVisible(true);
        resturer.setWidth("100px");
        NumberField alternativtPlot = new NumberField();


        alternativtPlot.setValue(iii);
        alternativtPlot.setClearButtonVisible(true);
        alternativtPlot.setWidth("100px");

        Select<String> zoomValue = new Select<>();
        zoomValue.setItems("small centered picture",
                "1 - 4 picture left upper",
                "2 - 4 picture right upper",
                "3 - 4 picture left lower",
                "4 - 4 picture right lower&finishing" );
        //       "5 - picture left upper with table in 2",
        //      "6 - picture left upper with table in 3");
        String defaultValue = "small centered picture";
        if (CalcValues.plotModell == 1 ) { defaultValue =  "1 - 4 picture left upper";}
        if (CalcValues.plotModell == 2 ) { defaultValue =  "2 - 4 picture right upper";}
        if (CalcValues.plotModell == 3 ) { defaultValue =  "3 - 4 picture left lower";}
        if (CalcValues.plotModell == 4 ) { defaultValue =  "4 - 4 picture right lower&finishing";}
        if (CalcValues.plotModell == 5 ) { defaultValue =  "5 - picture left upper with table in 2";}
        if (CalcValues.plotModell == 6 ) { defaultValue =  "6 - picture left upper with table in 3";}
        defaultValue = "small centered picture";
        zoomValue.setValue(defaultValue);
        zoomValue.setWidth("200px");

/*
        Select<String> selectPlaceButt = new Select<>();
        //   selectPlaceButt.setLabel("Choose plot - type");
        selectPlaceButt.setItems("Single picture - zoomable ", "Single picture - big",
                "2 picture vertical left",
                "2 picture vertical right&finishing",
                "2 picture horizontal upper",
                "2 picture horizontal lower&finishing",
                "4 picture left upper", "4 picture right upper",
                "4 picture left lower", "4 picture right lower&finishing");
        selectPlaceButt.setValue("Single picture - zoomable ");
        selectPlaceButt.setWidth("210px");
        //   }
*/

        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        addClickListener(event -> {
         /*
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    // Oppdater UI-komponenter på riktig t4råd
                    UI.getCurrent().access(() -> {
                        UI.getCurrent().navigate("/Image");
                    //    Notification.show("Siden oppdateres automatisk hvert 1. sekund");
                    });
                }
            }, 0, 1000); // Start umiddelbart, og gjenta hver 1. sekund (5000 millisekunder)

*/
            x = event.getClientX();
            y = event.getClientY();
            // angir koordinatene til valgboksene

            boolean valgModus = false;
            if (x >= 230 && x <= 335 && y >= 60 && y <= 110) {
                modus = 1;
                valgModus = true;  // indikerer skifte av modus punktt skal ikke tegnes
                UI.getCurrent().getPage().setLocation("drawline");
                // resultBue();

            }
            if (x >= 340 && x <= 440 && y >= 60 && y <= 110) {
                modus = 2;
                valgModus = true;
            }
            if (x >= 450 && x <= 550 && y >= 60 && y <= 110) {
                modus = 3;
                valgModus = true;
            }
            if (x >= 565 && x <= 670 && y >= 60 && y <= 110) {
                modus = 4;
                valgModus = true;
            }
            //      if ( gang[2] == 0 ) {
            if (x >= 785 && x <= 900 && y >= 60 && y <= 110) {
                modus = 5;
                valgModus = true;
                //      Button zoomIn = new Button("Zoom inn", e -> zoom(1.2));
                zoom(2.0);
                if (gang[2] == 0) {
                    double tall = 3.0;   //(zoom.getValue() + 0.5)*10 ;
                    int itall = (int) tall;
                    itall = itall/10;
                    tall = (double) itall ;
                    tall = 6;
                    //  System.out.println( CalcValues.zoomIndex);
                    CalcValues.zoomIndex = CalcValues.zoomBuildUp;
                    //    System.out.println(" test zoom " +  tall);
                    //     System.out.println("hallo all  " + modus + "  " +zoomIndex);
                    //     zoomValue.setValue("small centered picture");
                    String typetPlace = zoomValue.getValue();

                    //    System.out.println("hallo all " + modus + typetPlace);
                    if (typetPlace.equals("small centered picture"))  plotModus = 0;
                    if (typetPlace.equals ("1 - 4 picture left upper"))  plotModus = 1;
                    if (typetPlace.equals("2 - 4 picture right upper"))   plotModus = 2;
                    if (typetPlace.equals("3 - 4 picture left lower"))   plotModus = 3;
                    if (typetPlace.equals("4 - 4 picture right lower&finishing"))  plotModus = 4;
                    if (typetPlace.equals("5 - picture left upper with table in 2"))  plotModus = 5;
                    if (typetPlace.equals("6 - picture left upper with table in 3"))  plotModus = 6;
                    plotModell = plotModus;
                    //       System.out.println("hallo all 335  " + modus + "  " + plotModus + "  " + typetPlace + "  " + plotModell);
                    //      CalcValues.plotModell = plotModell;



                }
                //      System.out.println(CalcValues.zoomIndex);
                UI.getCurrent().getPage().setLocation("/zoommenue" );
            }

            if (x >= 1130 && x <= 1200 && y >= 60 && y <= 110) {
                modus = 6;
                valgModus = true;
                CalcValues.zoomIndex =  1.4;
                //       System.out.println("hallo all " + modus + "  " +zoomStorage);
                int oldPlotIndicator = CalcValues.plotIndicator;
                //    plotModell = 1;
                String typetPlace = zoomValue.getValue();
                if (typetPlace.equals("small centered picture"))  plotModus = 0;
                if (typetPlace.equals ("1 - 4 picture left upper"))  plotModus = 1;
                if (typetPlace.equals("2 - 4 picture right upper"))   plotModus = 2;
                if (typetPlace.equals("3 - 4 picture left lower"))   plotModus = 3;
                if (typetPlace.equals("4 - 4 picture right lower&finishing"))  plotModus = 4;
                if (typetPlace.equals("5 - picture left upper with table in 2"))  plotModus = 5;
                if (typetPlace.equals("6 - picture left upper with table in 3"))  plotModus = 6;
                CalcValues.plotModell = plotModus;
                typetPlace = zoomValue.getValue();
                //         CalcValues.plotModell = typetPlace;
                new ChangePlot2(plotModell, oldPlotIndicator);
                UI.getCurrent().getPage().setLocation("/thymeleaf-example");
            }


            if (x >= 1910 && x <= 1010 && y >= 60 && y <= 110) {
                modus = 7;
                valgModus = true;
            }

            if (x >= 910 && x <= 1100 && y >= 60 && y <= 110) {
                modus = 8;
                valgModus = true;
                String typetPlace = zoomValue.getValue();
                if (typetPlace.equals("small centered picture"))  plotModus = 0;
                if (typetPlace.equals ("1 - 4 picture left upper"))  plotModus = 1;
                if (typetPlace.equals("2 - 4 picture right upper"))   plotModus = 2;
                if (typetPlace.equals("3 - 4 picture left lower"))   plotModus = 3;
                if (typetPlace.equals("4 - 4 picture right lower&finishing"))  plotModus = 4;
                if (typetPlace.equals("5 - picture left upper with table in 2"))  plotModus = 5;
                if (typetPlace.equals("6 - picture left upper with table in 3"))  plotModus = 6;
            }

            if (x >= 690 && x <= 775 && y >= 60 && y <= 110) {
                modus = 10;
                valgModus = true;
                //      new DrawLineView();
                UI.getCurrent().getPage().setLocation("line");
            }
            /*
                if (x >= 1065 && x <= 1175 && y >= 60 && y <= 94) {
                    modus = 9;
                    valgModus = true;
                    //       System.out.println("hallo all " + zoomStorage);
                    //         System.out.println("extern  " + zoomStorage);
                    // rutine for lagring inn her
                    double iv = alternativtPlot.getValue();
                    int ivi = (int) iv;
                    plotModus = ivi;
                    //    new ChangePlot(plotModus);
                }
*/
            //  }
            //           System.out.println(" 452 ujustert " + x + " " + y + " " + modus + "  " + valgModus + " " + + gang[2]);
            ///////////////////  justering av plassering av sveisestrenger
            int xjust = 37;
            int yjust = 25;
            if (gang[2] == 0) { //gir centrum 600, 430
                xjust += -273;
                yjust += -130;  // -72
            }
            if (gang[2] == 7) { //gir centrum 600, 430
                xjust += -271;
                yjust += -130;  // -72
            }
            if (gang[2] == 8) { //gir centrum 600, 430
                xjust += -271;
                yjust += -133;  // -72
            }
            if (gang[2] == 9) { //gir centrum 600, 430
                xjust += -271;
                yjust += -130;  // -72
            }
            if (gang[2] == 10) { //gir centrum 600, 430
                xjust += -271;
                yjust += -130;  // -72
            }
            if (gang[2] == 11) { //gir centrum 600, 430
                xjust += -271;
                yjust += -130;  // -72
            }
            if (gang[2] == 12) { //gir centrum 600, 430   // må justeres
                xjust += -271;
                yjust += -130;  // -72
            }
            if (gang[2] == 14) { //gir centrum 600, 430
                xjust += -273;
                yjust +=  -130;  // -72  -130
            }
            if (gang[2] == 15) { //gir centrum 600, 430
                xjust += -273;
                yjust += -130;  // -72
            }
            if (gang[2] == 16) { //gir centrum 600, 430  // må justeres
                xjust += -270;
                yjust += -130;  // -72
            }
            // ekstra  justering fr flytting
            if (gang[2] == 8) { //gir centrum 600, 430
                xjust += 0; //-600;
                yjust += 0;
            }

            /////////////
            x = x + xjust;
            y = y + yjust;

            //          System.out.println(" justert for test  " + x + " " + y + " " + modus + "  " + valgModus + " " + + gang[2]);

            //        if (!valgModus) {

            if (!valgModus) {
                valgModus = false;

                if (modus == 1) {   // generate new string krever 3 klikk
/*
                    teller++;

                    if (teller == 1) {
                        firstPointNew = new Point(x, y);
                    }
                    if (teller == 2) {
                        middelPointNew = new Point(x, y);
                    }
                    if (teller == 3) {
                        lastPointNew = new Point(x, y);
                        teller = 0;
                        resultDraw(firstPointNew, middelPointNew, lastPointNew);
                    }
 */
                    //            System.out.println("jeg er her i mousebase");
                    //           UI.getCurrent().getPage().setLocation("drawline");
                    //         UI.getCurrent().getPage().setLocation("mousebue");
                    //           firstPointNew =   DataHandlerLineExtra.getFirstPoint();
                    //           middelPointNew =  DataHandlerLineExtra.getMiddelPoint();
                    //            lastPointNew =    DataHandlerLineExtra.getLastPoint();

                    //    lastPointNew =  new Point(x, y);


                    //      teller = 0;
                    //       resultDraw(firstPointNew, middelPointNew, lastPointNew);


                }

                if (modus == 3) {  // delete string krever ett punkt
                    Point deletePointNew = new Point(x, y);
                    resultDelete(deletePointNew);
                }

                if (modus == 4) {  // delete string krever ett punkt
                    Point symbolPointNew = new Point(x, y);
                    //        System.out.println("for call  " + symbolPointNew);
                    resultSymbol(symbolPointNew);
                }

                if (modus == 2) {  // move string krever to punkt fra og til
                    antall++;
                    if (antall == 1) {
                        movePointNew = new Point(x, y);
                        if(moveNew){
                            toPointNew = movePointNew;
                            resultMove(movePointNew, toPointNew);
                            antall = 0;
                        }
                    }
                    if (antall == 2) {
                        toPointNew = new Point(x, y);
                        resultMove(movePointNew, toPointNew);
                        antall = 0;
                    }
                }

            }


        });
        boolean noOption = true;
        if (plotType.equals("On plate") || plotType.equals("Lap joint") ||plotType.equals("Strap joint") || plotType.equals("Cross joint") ) {
            noOption = false;
        }

        //    if ( (gang[2] == 14 || gang[2] == 0 ) && noOption) {
        //             if ( (gang[2] == 14 || gang[2] == 0 ) && noOption && CalcValues.notShowing) {
        if ( (!CalcValues.notShowing || gang[2] == 0 ) && noOption && !CalcValues.minimaliz) {
            add(
                    new HorizontalLayout(
                            myButton,
                            myButtonMove,
                            myButtonDelete,
                            myButtonSymbol,
                            myButtonLine,
                            myButtonZoom,
                            //       zoom,
                            zoomValue,
                            myButtonSave
                            //         resturer
                    )
            );
        } else {
            add(
                    new HorizontalLayout(
                            myButton,
                            myButtonMove,
                            myButtonDelete,
                            myButtonSymbol,
                            myButtonLine,
                            myButtonZoom
                    )
            );
        }
/////////////////////////////////thymeleafkomponenter
        // Opprett et Div-element for å vise Thymeleaf-innhold
        Div thymeleafContent = new Div();

        // Hent Thymeleaf-templaten og legg til i Div-elementet
        //    System.out.println("basem =  "+ CalcValues.svgNew);
        thymeleafContent.getElement().setProperty("innerHTML", getThymeleafTemplate(this.outSvg + this.svgWeld + CalcValues.svgBuffer ));
        CalcValues.svgBuffer = "";
        // Legg til Div-elementet i layouten
        add(thymeleafContent);

        //    System.out.println("outputiførcall  " + x + "  "  + y);


    }

    /**
     * Localicate the position for symbol
     *
     * @param symbolPointNew
     */
    private void resultSymbol(Point symbolPointNew) {
        Point symbolPoint = symbolPointNew;
        new MouseSymbol(symbolPoint);
        //  System.out.println(" vi er her ");

    }

    /** Localicate the position for delete point
     *
     * @param deletePointNew
     */

    public void resultDelete(Point deletePointNew) {
        new MouseReleased(deletePointNew);
        //   System.out.println(" vi er her " + deletePointNew);

        //    repaint();
    }

    /**
     * Location for move point
     *
     * @param movePointNew
     * @param toPointNew
     */

    public void resultMove(Point movePointNew, Point toPointNew) {
        //     System.out.println(modus + "   call resultMove  " + movePointNew + "  " + toPointNew );
        new MouseMoved(movePointNew, toPointNew);

        // repaint();
    }

    public void resultBue() {
        //     System.out.println(modus + "   call resultMove  " + movePointNew + "  " + toPointNew );
        new MouseBue();
        // repaint();
    }
    /** localication for new weld string
     * generated as bezier kurve
     * @param firstPointNew
     * @param middelPointNew
     * @param lastPointNew
     */
    public void resultDraw(Point firstPointNew, Point middelPointNew, Point lastPointNew) {
        //     System.out.println(modus + "   call resultDraw  " + firstPointNew + "  " + middelPointNew + "  " + lastPointNew);
        clickLine.add(0, new ExtraLine(firstPointNew.x, firstPointNew.y, middelPointNew.x, middelPointNew.y));
        kurveteller++;
        int code = 1;
        textPoint = new Point((firstPointNew.x + lastPointNew.x) / 2, (firstPointNew.y + lastPointNew.y) / 2);
        punktPlottes = true;
        textPlottes = true;
        int index = 0;
        int indicator = CalcValues.plotIndicator;
        String aText ="";
        String svgTab = "";
        String user = CalcValues.userID;
        CalcValues.numberOfSymbols += 1;
        ident = "" + CalcValues.numberOfSymbols;
        WeldPoint punkt1 = new WeldPoint(firstPointNew, middelPointNew, lastPointNew, textPoint, ident, punktPlottes, textPlottes, gang[2], plotType, index, aText,code,indicator, user, svgTab);
        clickBue.add(0, new ExtraBue(firstPointNew.x, firstPointNew.y, middelPointNew.x, middelPointNew.y, lastPointNew.x, lastPointNew.y));

        if (punktPlottes) {
            clickOval.add(0, new ExtraOval(middelPointNew.x, middelPointNew.y, big, big));
            clickOval.add(0, new ExtraOval(firstPointNew.x, firstPointNew.y, big, big));
            clickOval.add(0, new ExtraOval(lastPointNew.x, lastPointNew.y, big, big));

        }
        if (textPlottes) {
            clickTall.add(0, new ExtraTall(ident, textPoint.x, textPoint.y));
            clickOval.add(0, new ExtraOval(textPoint.x, textPoint.y, big + 0, big + 0));
        }


        weldList.add(punkt1);
        CalcValues.weldList.add(punkt1);   // legger inn ny sveisestreng og de legges i dataene
        //       System.out.println("sveisestreng " + weldList.size());
        //       String extra = newSvgOut();

        //     thymeleafContent.getElement().setProperty("outerHTML", getThymeleafTemplate(extra));
        //     add(thymeleafContent);

        new MousDraw(firstPointNew, middelPointNew, lastPointNew, textPoint, ident);
        //  repaint();
        //  new Thym1();
        //getThymeleafTemplate(outSvg);
    }

    /**
     * Metode for generating of drawing on flay
     * Not in use i current version
     * @return
     */
    public String newSvgOut() {
        String outSvgNew;  // =  outSvg;
        var canv = new svg();
        canv.setColor("red");
        //nå er det lest inn tre punkter og de må tegnes
        String svgStop = canv.svgEnd();
        int xjust = 0;
        int yjust = 0;
        if (gang[2] == 14) { //gir centrum 600, 430
            xjust = -273;
            yjust = -131;  // -72
        }
        double factor = 1.0;
        ant = svgStringNew.size();
        ExtraEllipse hellips = new ExtraEllipse();
        for (int j = 0; j < this.clickEllipse.size(); j++) {
            hellips = this.clickEllipse.get(j);
            int i1 = (int) factor * (hellips.getFirstX()) + xjust;
            int j1 = (int) factor * (hellips.getFirstY()) + yjust;
            int i2 = (int) factor * Math.abs(hellips.getLastX());
            int j2 = (int) factor * Math.abs(hellips.getLastY());

            svgInnhold = canv.drawEllipse(i1, j1, i2, j2);
            svgStringNew.add(ant + j, svgInnhold);
        }

        ant = svgStringNew.size();
        ExtraTall htall = new ExtraTall();
        for (int m = 0; m < this.clickTall.size(); m++) {
            htall = this.clickTall.get(m);
            int i1 = (int) factor * (htall.getFirstX() + xjust);
            int j1 = (int) factor * (htall.getFirstY() + yjust);
            String testTall = htall.getLastString();
            svgInnhold = canv.drawText(testTall, i1, j1);
            svgStringNew.add(ant + m, svgInnhold);
        }

        ant = svgStringNew.size();
        ExtraBue hbue = new ExtraBue();
        for (int k = 0; k < this.clickBue.size(); k++) {
            hbue = this.clickBue.get(k);
            int i1 = (int) factor * (hbue.getFirstX() + xjust);
            int j1 = (int) factor * (hbue.getFirstY() + yjust);
            int i2 = (int) factor * (hbue.getLastX() + xjust);
            int j2 = (int) factor * (hbue.getLastY() + yjust);
            int k2 = (int) factor * (hbue.getFirstZ() + xjust);
            int k3 = (int) factor * (hbue.getLastZ() + yjust);
            svgInnhold = canv.drawBezier2(i1, j1, i2, j2, k2, k3);
            svgStringNew.add(ant + k, svgInnhold);
        }

        ant = svgStringNew.size();
        ExtraLine hline = new ExtraLine();
        for (int i = 0; i < this.clickLine.size(); i++) {
            hline = this.clickLine.get(i);
            int i1 = (int) factor * (hline.getFirstX() + xjust);
            int j1 = (int) factor * (hline.getFirstY() + yjust);
            int i2 = (int) factor * (hline.getLastX() + xjust);
            int j2 = (int) factor * (hline.getLastY() + yjust);
            if (!(i1 == 0 && j1 == 0 && i2 == 0 && j2 == 0)) {
                svgInnhold = canv.drawLine(i1, j1, i2, j2);
                svgStringNew.add(i + 1, svgInnhold);
            }

        }

        ant = svgStringNew.size();
        ExtraOval hoval = new ExtraOval();
        for (int i = 0; i < this.clickOval.size(); i++) {
            hoval = this.clickOval.get(i);
            int i1 = (int) factor * (hoval.getFirstX() + xjust);
            int j1 = (int) factor * (hoval.getFirstY() + yjust);
            int i2 = (int) factor * (hoval.getLastX());
            int j2 = (int) factor * (hoval.getLastY());
            if (!(i1 == 0 && j1 == 0 && i2 == 0)) {
                svgInnhold = canv.drawCircle(i1, j1, i2);
                svgStringNew.add(i + 1, svgInnhold);
            }

        }

        // samler opp tekst i streng
        svg = " ";
        for (int k = 0; k < svgStringNew.size(); k++) {
            svg = svg + svgStringNew.get(k);
            //       System.out.println(svgStringNew.get(k));
        }
//    System.out.println(svgStringNew.size());
        CalcValues.svgNew = svg;
        return svg;
    }

    public String getThymeleafTemplate(String outSvg) {
        String outSvgNew = outSvg;
        teller = 0;
        antall = 0;
        ////////////////////////////
        return outSvg + svgStop;


    }

    /**
     * Metode for lasting av siden
     * not in use only for desktop version
     *
     * @param url
     */

    public static void loadPageNew (String url){
        try {
            // Åpner URL-adressen i standardnettleseren
            Desktop.getDesktop().browse(new URI(url));
            //         System.out.println("Siden lastes automatisk: " + url);
        } catch (Exception e) {
            //    System.err.println("Feil ved lasting av siden: " + e.getMessage());
        }
    }
    private void zoom(double scale) {
        UI.getCurrent().getPage().executeJs("document.body.style.zoom = $0", scale);
    }
    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");
        // Menyvalgene
        // RouterLink home = new RouterLink("Hjem", Home.class);
        com.vaadin.flow.component.html.Image imga = new Image("icons/logo.png", "logo");
        imga.setWidth("40px");
        imga.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );

        Button myButton = new Button("Finished zooming");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> { UI.getCurrent().getPage().setLocation("Image");} );

        Button     myButttonDraw = new Button("Draw string");
        myButttonDraw.addClassName("my-button");
        myButttonDraw.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoommenue0"); } );

        Button myButtonMove = new Button("Move string " );
        myButtonMove.addClassName("my-button");
        myButtonMove.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoommenue4"); } );

        myButton = new Button("Move symbol");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  UI.getCurrent().getPage().setLocation("zoommenue4S"); } );

        Button myButtonDelete = new Button("Delete string");
        myButtonDelete.addClassName("my-button");
        myButtonDelete.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoommenue2");  } );

        Button myButtonZoom = new Button("Finhishng zooming");
        myButtonZoom.addClassName("my-button");
        myButtonZoom.addClickListener(click -> {
            CalcValues.zoomIndex = 1.4;
            UI.getCurrent().getPage().setLocation("Image");} );

        Button myButtonSymbol = new Button("Welding Symbol");
        myButtonSymbol.addClassName("my-button");
        myButtonSymbol.addClickListener(click -> { UI.getCurrent().getPage().setLocation("zoommenue3");  } );

        Button myButtonLine = new Button("Drawing line");
        myButtonLine.addClassName("my-button");
        myButtonLine.addClickListener(click -> {  UI.getCurrent().getPage().setLocation("zoommenue1"); } );

        Button myButtonPlace = new Button("Placing");
        myButtonPlace.addClassName("my-button");
        myButtonPlace.addClickListener(click -> {  new ChangePlot(1,1); } );
        // Legg menyvalgene i en horisontal layout
        HorizontalLayout menuBar = new HorizontalLayout(imga,  myButttonDraw,   myButtonMove ,  myButtonDelete , myButtonSymbol, myButtonLine , myButtonZoom );
        menuBar.setSpacing(true);
        //   menuBar.getStyle().set("margin-left", "auto"); // Skyver menyen til høyre

        // Topplinje med tittel og meny
        HorizontalLayout header = new HorizontalLayout(title, menuBar);
        header.setWidthFull();
        header.setAlignItems(FlexComponent.Alignment.CENTER);
        header.setPadding(true);
        //      header.getStyle().set("background", "#333").set("color", "white");
        //      addToNavbar(header); // Legger det til i toppen
    }
}






