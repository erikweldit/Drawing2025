package com.example.application.weld;


import com.example.application.diverse.camvas.GreetingComponent;
import com.example.application.under.*;
import com.vaadin.flow.component.html.Image;

import java.awt.image.BufferedImage;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import com.vaadin.flow.server.VaadinSession;
/**
 * Calculating of the object for the different drawing types such as text, line, circle ol
 *
 * The class contain many static values too be used in other classes.
 * The class contain all logic connected to generate Arraylist for different kind of grafical
 * object used in the application.
 * The class contain also many static values used i structuring of the whole application.
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 * */
public class CalcValues  {
    public int tabellType = 0;
    public static double[] fScalare =new double[10];
    public static boolean generateImage = false;
    public static String steelL;
    public static String steelR;
    public static String drawing = "";
    public static int selectLeftInt;
    public static int selectRightInt;
    public static int zoomBuildUp= 6;
    public static ArrayList<ExtraBue> weldBue = new ArrayList<>();
    public static String[]  partImage = new String[10];
    public boolean plotBue = false;  // true for hel bue false for kun markering av bue
    public static int startValue = 96;    // Give char a for use as symbols in the weld a-z and A - Z
    public static int numberOfSymbols;
    public static String userIdent;
    BufferedImage buffCopy = new BufferedImage(1600, 1144, 2);
    String actualPath;
    private WeldPoint punkt = new WeldPoint();
    private List<BufferedImage> images = new ArrayList<>();
    public static ArrayList<WeldPoint> weldList = new ArrayList<WeldPoint>();

    public ArrayList<WeldPoint> sveiseListe = new ArrayList<WeldPoint>();
    public static String  userID ;
    public static String pathName ;

    public static int identificator = 96;

    String choosenName ;
    String imageName ;
    boolean generateOnFile = true;
    List<String> actualFiles = new ArrayList<>();
    private Path outPath;
    public static String plotType ="";
    public static int antall;
    public static double[]  vecDouble = new double[35];
    int[]  vec = new int[35];
    public static String comment;

    ////////////////////
    int s = 25;
    boolean plotOK = true;
    boolean teksting;

    boolean tegning;

    public static int xP = 400;

    public static int yP = 350;

    int[] vector = new int[20];
    int nx1;
    int nx2;
    boolean original;
    double factor = 3.77952755906D;
    int[] x1 = new int[15];
    int[] y1 = new int[15];

    int[] x2 = new int[15];

    int[] y2 = new int[15];

    int[] x3 = new int[15];

    int[] y3 = new int[15];

    int[] x4 = new int[15];

    int[] y4 = new int[15];

    int[] x5 = new int[15];

    int[] y5 = new int[15];

    int[] x6 = new int[15];

    int[] y6 = new int[15];

    int[] x7 = new int[15];

    int[] y7 = new int[15];

    int[] x8 = new int[15];

    int[] y8 = new int[15];

    int[] x9 = new int[15];

    int[] y9 = new int[15];

    int[] x10 = new int[15];

    int[] y10 = new int[15];

    int[] x11 = new int[15];

    int[] y11 = new int[15];

    int[] x12 = new int[15];

    int[] y12 = new int[15];

    public static int[] gang = new int[25];

    int listImage = 1;
    int filetVinkel = 90;
    int pointType;

    int pointIndex;

    String resultat = "Standard";

    char valgtChar = 'S';

    int r1;

    int r2;

    int t1 = 2;

    int t2 = 2;

    int t3 = 2;

    int gap1 = 1;

    int fac = 2;
    int facN;

    int face;

    int c;

    int angle;

    int angle1;

    int dxl;

    int dxr;

    int angle2;

    int angle3;

    int bottombs;

    int topbs;

    int tp1 = t1 * 4;

    int tp2 = t2 * 4;

    int tp3 = t3 * 4;

    int gap = gap1 * 4;

    int nr;

    int gapR;

    int tp1R;

    int tp2R;

    int angleR1;

    int angleR2;

    int r3;

    int r4;

    int faceR;

    int cR;

    int index2;

    int teller;

    int kurveteller;

    double scale = 1.0D;

    boolean bue = false;

    int xcentrum;

    int ycentrum;

    int x1centrum;

    int y1centrum;

    int x2centrum;

    int y2centrum;

    int xRUcentrum;

    int yRUcentrum;
    int xRDUcentrum;

    int yRDUcentrum;

    int xRDU1centrum;

    int yRDU1centrum;
    private int xmax;

    int ymax;
    int xradio;
    int yradio;
    //  Graphics g;

    private char typedChar;

    //  public Component scrollPane_Tegn;

    //   public JTextArea textArea_Tegn;

    // private Container panelTegn;

    String stringCopy;

    private boolean dragAllowed;

    private boolean pressAllowed;

    private boolean clickAllowed;

    private boolean moveAllowed;

    boolean activated = false;

    boolean funnetE;

    boolean funnetD;

    boolean funnetM;

    boolean funnetF;

    private int forvs;

    private int forhs;
    public static int plotIndicator = 0;
    public static List<String>  resultatString = new ArrayList<>();

    public static List<ExtraLine> extraLine = new ArrayList<>();

    public static List<ExtraBase> extraBase = new ArrayList<>();
    public static List<ExtraBue> extraBue = new ArrayList<>();

    public static List<ExtraTall> extraTall = new ArrayList<>();

    public static List<ExtraEllipse> extraEllipse = new ArrayList<>();
    public static ArrayList<ExtraLine> weldStroke = new ArrayList<>();
    public static ArrayList<ExtraLine> weldCut = new ArrayList<>();

    public static int [] modellIndicator = new int[10];

    public static int[] zoomX = new int[20];
    public static double[] zoomC = new double[20];
    public static int[] zoomY = new int[20];
    public static int plotModell =0;
    public static double[] zoomF = new double[20];
    public static List<ExtraLine> extraLineTegn = new ArrayList<>();
    public static List<ExtraLine> extraLineTabell = new ArrayList<>();
    public static List<ExtraBue> extraBueTegn = new ArrayList<>();
    public static double zoomIndex = 1.0;
    public static int zoomStorage = 0;
    public static int emptyBuffer;
    public static String svgBuffer = "";
    public static String image = "";
    public static List<ExtraTall> extraTallTegn = new ArrayList<>();

    public static List<ExtraTall> extraTallBase = new ArrayList<>();

    public static List<ExtraEllipse> extraEllipseTegn = new ArrayList<>();

    public static List<ExtraArray> extraArrayTegn = new ArrayList<>();
    public static boolean minimaliz =false;
    public static List<ExtraOval> extraOval = new ArrayList<>();
    public static List<ExtraText> extraText = new ArrayList<>();
    public static List<ExtraComment> extraComment = new ArrayList<>();
    public static double fact ;
    public static ArrayList<WeldPoint> resultListe = new ArrayList<>();
    public static ArrayList<WeldPoint> symbolList = new ArrayList<>();
    public static int modus;
    public static String outSvg ="";
    public static String svgExtra ="";
    public static String startSvg ="";
    public static String outHtml = "";
    public static String stopHtml = "";
    public static String svgNew ="";
    public static String svgSymbol ="";
    public static String svgStop = "Sorry, your browser does not support inline SVG. </svg> \n";
 //   public static String svgStop = "";
    public static int seamTeller = 0 ;
    public static int valgIndeks = 4;
    public static int   placing;
    public static boolean moveNew  = true;
    public static boolean notShowing  = false;
    public static int[] plotInd = new int[20];
    public static int[] bufferId = new int[10];
    public static int[] newAdresses = new int[20];
    public static List<ExtraTall> actualMoveString = new ArrayList<>();
    public static List<Long> actualSaved = new ArrayList<>();
    public static List<ExtraTall> actualMoveStringNew = new ArrayList<>();
    public static String drawType ="";
    ////////////////////////

    /**
     *
     * Constructor with no parameter
     */
    public CalcValues() {

    }

    /**
     * Constructor with parameter
     * @param plotType
     * @param antall number of actual values in this plotType
     * @param vecDouble values from users input give as real values
     * @param comment String contain users text input
     */
    public CalcValues( String plotType, int antall, double[] vecDouble, String comment) {
        this.plotType = plotType;
        this.antall = antall;
        this.vecDouble = vecDouble;
        this.comment = comment;
        this.plotIndicator++ ;
        this.fScalare[0] = Home.getFactor();
        this.fScalare[1] = 1.4* this.fScalare[0];
        this.fScalare[2] = 1.5* this.fScalare[0];

        this.fScalare[3] = 2.8* this.fScalare[0];
        this.fScalare[4] = 3.0* this.fScalare[0];
        this.fScalare[5] = 4.0* this.fScalare[0];
        this.fScalare[6] = 2.0* this.fScalare[0];
        this.fScalare[7] = 1.0* this.fScalare[0];
        this.fScalare[8] = 5.0* this.fScalare[0];
        this.fScalare[9] = 1.4;
        if (minimaliz) {
        s=20;
        } else {
        s = 25;
        }


        startValue = 96;
        numberOfSymbols = 0;
        CalcValues.svgSymbol = "";
        userID =  VaadinSession.getCurrent().getAttribute("tenantUser") != null ?            VaadinSession.getCurrent().getAttribute("tenantUser").toString() :            GreetingComponent.userIdents;
        pathName = "C:\\" + userID + "\\";
        pathName =  userID + "_" ;
        drawType = plotType;
        new ImageStorage();

        //      System.out.println(userID);
        for (int i = 0; i<35 ; i++)
        {
            vec[i] = (int) vecDouble[i];
            //     System.out.println(plotIndicator);
            //            System.out.println("371 vec " + i + " = " + vec[i] );
            // test of values
        };
        nullstilArrays();                 // 665
        transformParametre(plotType);     //1699
        initValues();                     //451 give line number
        initialize();                     //431
        initializsZoomValues();           //376
        transformTeksting(plotType);      // 395
        transformComment(plotType);       // 1571
        transformTabell(plotType);        // 721   lager tabellene
        new CreateAndShowGUI(plotType, antall, vec );
    }

    /**
     *
     * Method for initialization of some commen values for differen plottypes
     * Decide what to generate on screen
     *
     */
    public void initializsZoomValues() {
        zoomX[0] = 100;
        zoomY[0] = 40;
        zoomC[0] = fScalare[1];
        zoomX[7] = -100;
        zoomY[7] = -80;
        zoomC[7] = fScalare[1];
        zoomX[8] = 500;
        zoomY[8] = -80;
        zoomC[8] = fScalare[1];
        zoomX[9] = -100;
        zoomY[9] = 350;
        zoomC[9] = fScalare[1];
        zoomX[10] = 500;
        zoomY[10] = 350;
        zoomC[10] = fScalare[1];
        zoomX[11] = -100;
        zoomY[11] = -85;
        zoomC[11] = fScalare[1];
        zoomX[12] = 200;
        zoomY[12] = 450;
        zoomC[12] =fScalare[5];
        zoomX[13] = 200;
        zoomY[13] = 55;
        zoomC[13] = fScalare[4];
        zoomX[14] = 200;
        zoomY[14] = 55;
        zoomC[14] = fScalare[3];
        zoomX[15] = -100;
        zoomY[15] = -85;
        zoomC[15] = fScalare[1];
        zoomX[16] = 500;
        zoomY[16] = 300;
        zoomC[16] = fScalare[5];
        newAdresses [0] = 0;
        newAdresses [1] = 0;
        newAdresses [2] = 0;
        newAdresses [3] = 0;
        newAdresses [4] = 0;
        newAdresses [5] = 0;
        newAdresses [6] = 0;
        newAdresses [7] = 1;
        newAdresses [8] = 2;
        newAdresses [9] = 3;
        newAdresses [10] = 4;
        newAdresses [11] = 12;
        newAdresses [12] = 34;
        newAdresses [13] = 11;
        newAdresses [14] = 10;
        newAdresses [15] = 13;
        newAdresses [16] = 24;
        newAdresses [17] = 0;
        newAdresses [18] = 0;
        newAdresses [19] = 0;
    }
    public void initialize(){
        if (gang[1] == 1) {
            tegning = true;
        } else {
            tegning = false;
        }
        if (gang[0] == 1) {
            teksting = true;
        } else {
            teksting = false;
        }
        plotInd[gang[2]] = plotIndicator;
        //  System.out.println("test 463  "+ gang[2] + " " + plotIndicator);
    }

    /**
     * Method for initializing of values for different plotTypes
     * Where to place the object on the screen and different values for
     * differenr plottypes
     */
    public void initValues() {
        //       WeldData wListe = new WeldData(sveiseListe);
        //    Graphics2D g2de = (Graphics2D)g;
        int scaler = y1[14];
        //      System.out.println("459  test scaler " + scaler + " h " + y1[14]);  // gir verdien 0
        int copyScaler = scaler;
        int xflytt = 0;
        int yflytt = 0;
        ////////////////
        if (this.gang[7] == 1) {
            this.gang[0] = 0;
            this.gang[1] = 0;
            this.gang[2] = 13;
            this.gang[6] = 1;
        }

        /////////////////////////////////////////////////////////
        int width = 1600;
        int height = 1144;
        int transX = -xP/4;
        int transY = -yP/4;
        //  System.out.println(" 427  " + gang[2] + "  " + y1[14]);
        //      System.out.println("test " + gang[2]);
        if ( gang[2] == 14 ) {
            gang[2] = 1;
   //       s = 20;
            this.fact=fScalare[8];
        }
        if ( gang[2] == 0 && y1[14] == 100  ) {
            width = 800;
            height = 572;
            transX = -xP/4;
            transY = -yP/4 ;
            //     y1[14] = 120;    // avbildes i lite format
        }
        if ( gang[2] == 0 && y1[14] == 160 ) {    // standard
//            width = 800;
//            height = 572;
//            transX = -xP/4-140;
//            transY = -yP/4 -160;
//            //     y1[14] = 150;    // avbildes i lite format
//        }
//        if (this.gang[2] == 1) {
//            width = 168;
            height = 108;
            transX = 0;
            transY = 0;
        }
        //      this.tabellType = this.gang[2];
        if (this.gang[2] == 2) {
            width = 600;
            height = 397;
            transX = -100;
            transY = 0;
        }
        if (this.gang[2] == 3) {
            width = 400;
            height = 280;
            transX = -200;
            transY = -200;
        }
        if (this.gang[2] == 4) {
            width = 280;
            height = 196;
            transX = -270;
            transY = -230;
            this.y1[14] = 70;
        }
        if (this.gang[2] == 5) {
            width = 196;
            height = 140;
            transX = -305;
            transY = -240;
            this.y1[14] = 50;
        }
        if (this.gang[2] == 6) {
            width = 140;
            height = 98;
            transX = -330;
            transY = -270;
            this.y1[14] = 35;
        }
        if (this.gang[2] == 7 || this.gang[2] == 8 || this.gang[2] == 9 || this.gang[2] == 10) {
            width  = 1600;  // 1342
            height = 1144;  // 962
            transX = 0;
            transY = 0;
            this.y1[14] = 150;
        }
        if (this.gang[2] == 11  ) {
            width  = 1600;  // 1341
            height = 1144;  // 961
            transX = 0;
            transY = 0;
            //     this.y1[14] = 120;
        }

        if (this.gang[2] == 12 ) {
            width  = 1600;  // 1341
            height = 1144;  // 961
            transX = 0;
            transY = 0;
            //     this.y1[14] = 120;
        }
        if (this.gang[2] == 15 ) {
            width  = 1600;  // 1341
            height = 1144;  // 961
            transX = 0;
            transY = 0;
            //     this.y1[14] = 120;
        }
        if (this.gang[2] == 16) {
            width  = 1600;  // 1341
            height = 1144;  // 961
            transX = 0;
            transY = 0;
            //     this.y1[14] = 120;
        }
        if (this.gang[2] == 13) {
            width = 1600;  // 1820
            height = 1144;  // 1300
            transX =  -1000 ;
            transY = -700 ;
            //      this.y1[14] = 400;
        }
        if (this.gang[2] == 14) {
            width = 1600;   // 1680
            height = 1144;  // 1200
            transX = -800;
            transY = -700;
         // this.y1[14] = 600;

        }
        if (plotType.equals("fillet") && gang[2] == 12 ) {
            transY += 50;
            transX += -100;
        }
        if (plotType.equals("flanged") && gang[2] == 12 ) {
            transY += 0;
            transX += -150;
        }
        if (plotType.equals("corner")&& gang[2] == 12 ) {
            transY += 600;
            transX += 0;
        }
        if (plotType.equals("corner") && gang[2] == 16 ) {
            transY += 500;
            transX += 0;
        }
        if (plotType.equals("Strap joint" ) || plotType.equals("Cross joint" ) || plotType.equals("On plate" ) || plotType.equals("Lap joint" )  ) {
            this.fact = fScalare[1];
            if ( gang[2] == 0)
                this.fact= fScalare[1];

            if ( gang[2] == 14)
                this.fact= fScalare[8];
            if ( gang[2] == 12){
                this.fact= fScalare[6];
            }
            if ( gang[2] == 12 && plotType.equals("Cross joint" ) ){
                transY += -100;
                this.fact= fScalare[6];
            } {
                this.fact= fScalare[6];
            }

            if ( gang[2] == 11) {
                this.fact = fScalare[1];
            }
            if ( gang[2] == 15) {
                this.fact = fScalare[1];
            }
            if ( gang[2] == 16)
                this.fact= fScalare[6];

        }

    }

    /**
     * Method for remove all old values in basen
     */
    public void nullstilArrays(){
        for ( int i=extraLine.size()-1 ; i >= 0; i--) {
            extraLine.remove(i);
        }
        for ( int i=extraBase.size()-1 ; i >= 0; i--) {
            extraBase.remove(i);
        }
        for ( int i=extraBue.size()-1 ; i >= 0; i--) {
            extraBue.remove(i);
        }
        for ( int i=extraTall.size()-1 ; i >= 0; i--) {
            extraTall.remove(i);
        }
        for ( int i=extraEllipse.size()-1 ; i >= 0; i--) {
            extraEllipse.remove(i);
        }
        for ( int i=extraLineTegn.size()-1 ; i >= 0; i--) {
            extraLineTegn.remove(i);
        }
        for ( int i=extraLineTabell.size()-1 ; i >= 0; i--) {
            extraLineTabell.remove(i);
        }
        for ( int i=extraBueTegn.size()-1 ; i >= 0; i--) {
            extraBueTegn.remove(i);
        }
        for ( int i=extraTallTegn.size()-1 ; i >= 0; i--) {
            extraTallTegn.remove(i);
        }
        for ( int i=extraTallBase.size()-1 ; i >= 0; i--) {
            extraTallBase.remove(i);
        }
        for ( int i=extraEllipseTegn.size()-1 ; i >= 0; i--) {
            extraEllipseTegn.remove(i);
        }
        for ( int i=extraArrayTegn.size()-1 ; i >= 0; i--) {
            extraArrayTegn.remove(i);
        }
        for ( int i=extraOval.size()-1 ; i >= 0; i--) {
            extraOval.remove(i);
        }
        for ( int i=extraText.size()-1 ; i >= 0; i--) {
            extraText.remove(i);
        }
        for ( int i=extraComment.size()-1 ; i >= 0; i--) {
            extraComment.remove(i);
        }

    }

    /**
     *
     * Methor for generate a tabell object from the values the user has
     * given as input
     *
     * @param plotType Actual plott type
     */
    public void transformTabell(String plotType) {
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        int tranX = 0;
        int tranY = 0;
        if ( gang[2] == 11 ) {
            tranX = 750;  // 600
            tranY = 450;  // 350
        }
        if ( gang[2] == 15 ) {
            tranX = 100;  // 100
            tranY = 900;  // 750
        }
        if (plotType.equals("fillet") && gang[2] == 15 ) {
            tranY -= 20;
        }
        if (plotType.equals("fillet") && gang[2] == 11 ) {
            tranY -= 20;
        }
 /*
        int xst = -xP + 120 + tranX;
        int yst = -yP + 90 + tranY ;
        int ystep = 30;
        int xstep = 80;  // 60
        int hstep = 30;
        int tsteg = 15;

    */
        int xst = (-xP + 120 + tranX)*10/14;
        int yst = (-yP + 90 + tranY)*10/14;
        int ystep = 300/14;
        int xstep = 800/14;  // 60
        int hstep = 300/14;
        int tsteg = 150/14;
     //   System.out.println(xst +  "  "+ yst);


        int xBase1 = xst-2;
        int xBase2 = xBase1 + xstep + tsteg;
        int xBase3 = xBase2 + ystep;
        int xBase4 = xBase3 + 2*ystep;
        int xBase5 = xBase4 + 2*ystep;
        int xBase6 = xBase5 + 2*ystep;
        int xBase7 = xBase6 + 2*ystep;
        int xBase8 = xBase7 + 2*ystep;
        int xBase9 = xBase8 + 2*ystep;
        int yBase0 = yst-8 ;
        int yBase1 = yBase0 + hstep;
        int yBase2 = yBase1 + hstep;
        int yBase3 = yBase2 + hstep;
        int yBase4 = yBase3 + hstep;
        int yBase5 = yBase4 + hstep;
        int yBase6 = yBase5 + hstep;
        int yBase7 = yBase6 + hstep;
        int yBase8 = yBase7 + hstep;
        int yBase9 = yBase8 + hstep;
        int yBase10 = yBase9 + hstep;

        if (plotType.equals("overlap")) {
            if ( tabellType == 11 ) {
                xst = (-xP + 120 + tranX) * 10 / 15 + 410;
                yst = (-yP + 90 + tranY) * 10 / 15 + 237;
            }
            if ( tabellType == 15 ) {
                xst = (-xP + 120 + tranX) * 10 / 15 + 130;
                yst = (-yP + 90 + tranY) * 10 / 15 + 500;
            }
            ystep = 300/15;
            xstep = 800/15;  // 60
            hstep = 300/15;
            tsteg = 150/15;
            xBase1 = xst-2;
            xBase2 = xBase1 + xstep + tsteg;
            xBase3 = xBase2 + ystep;
            xBase4 = xBase3 + 2*ystep;
            xBase5 = xBase4 + 2*ystep;
            xBase6 = xBase5 + 2*ystep;
            xBase7 = xBase6 + 2*ystep;
            xBase8 = xBase7 + 2*ystep;
            xBase9 = xBase8 + 2*ystep;
            yBase0 = yst-8 ;
            yBase1 = yBase0 + hstep;
            yBase2 = yBase1 + hstep;
            yBase3 = yBase2 + hstep;
            yBase4 = yBase3 + hstep;
            yBase5 = yBase4 + hstep;
            yBase6 = yBase5 + hstep;
            yBase7 = yBase6 + hstep;
            yBase8 = yBase7 + hstep;
            yBase9 = yBase8 + hstep;
            yBase10 = yBase9 + hstep;

            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
            extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
            extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
            extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

            extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));

            extraText.add(0, new ExtraText("Gap "     , xst, yst+ tsteg ));
            extraText.add(0, new ExtraText("Plate 1 " , xst, yst + ystep + tsteg));
            extraText.add(0, new ExtraText("Plate 2 " , xst, yst + 2*ystep+ tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[0]))).toString(), xst + xstep + tsteg, yst + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[2]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + tsteg          ));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep+ tsteg ));

        }
        if (plotType.equals("butt") || plotType.equals("Butt")) {
            String v3 = "Left side: ";
            xst = (-xP + 120 + tranX)*10/14;
            yst = (-yP + 90 + tranY)*10/14;
            ystep = 300/14;
            xstep = 800/14;  // 60
            hstep = 300/14;
            tsteg = 150/14;
            xBase1 = xst-2;
            xBase2 = xBase1 + xstep + tsteg;
            xBase3 = xBase2 + ystep;
            xBase4 = xBase3 + 2*ystep;
            xBase5 = xBase4 + 2*ystep;
            xBase6 = xBase5 + 2*ystep;
            xBase7 = xBase6 + 2*ystep;
            xBase8 = xBase7 + 2*ystep;
            xBase9 = xBase8 + 2*ystep;
            yBase0 = yst-8 ;
            yBase1 = yBase0 + hstep;
            yBase2 = yBase1 + hstep;
            yBase3 = yBase2 + hstep;
            yBase4 = yBase3 + hstep;
            yBase5 = yBase4 + hstep;
            yBase6 = yBase5 + hstep;
            yBase7 = yBase6 + hstep;
            yBase8 = yBase7 + hstep;
            yBase9 = yBase8 + hstep;
            yBase10 = yBase9 + hstep;


            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
            extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
            extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
            extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

            extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));

            extraText.add(0, new ExtraText("1 Left  side " + "Steel " + steelL    , xst, yst-ystep+ tsteg ));
            extraText.add(0, new ExtraText("Gap "     , xst, yst+ tsteg ));
            extraText.add(0, new ExtraText("Dy " , xst, yst + ystep + tsteg ));
            extraText.add(0, new ExtraText("Plate 1 " , xst, yst + 2*ystep + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[0]))).toString(), xst + xstep+ tsteg, yst + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[2]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst  + tsteg         ));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg  ));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg ));

            if (vec[9] == 2) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));

                extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg ));
                extraText.add(0, new ExtraText("Face " , xst, yst + 4*ystep + tsteg ));

                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));

                extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
            }

            if (vec[9] == 3) {

                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase7   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase7   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase7  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase7  ));


                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));

                extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle2 " , xst, yst + 4*ystep + tsteg ));
                extraText.add(0, new ExtraText("Face "     , xst, yst + 5*ystep + tsteg ));
                extraText.add(0, new ExtraText("Center " , xst, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[5]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[8]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
                extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
            }
            if (vec[9] == 4) {

                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase6   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase6   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase6  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase6  ));


                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));

                extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg ));
                extraText.add(0, new ExtraText("Radius 1 " , xst, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText("Face "     , xst, yst + 5*ystep + tsteg));

                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[4]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));

                extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));

            }
            if (vec[9] == 5) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase9   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase9   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase9  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase9  ));


                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase9,   xBase4 ,  yBase9  ));

                extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText("Radius 1 " , xst, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle 2 "     , xst, yst + 5*ystep + tsteg ));
                extraText.add(0, new ExtraText("Radius 2 "     , xst, yst + 6*ystep + tsteg ));
                extraText.add(0, new ExtraText("Face" , xst, yst + 7*ystep + tsteg ));
                extraText.add(0, new ExtraText("Center "     , xst, yst + 8*ystep + tsteg ));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[4]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[5]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 7*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[8]))).toString(), xst + xstep+ tsteg, yst + 8*ystep + tsteg));
                extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg ));
                extraText.add(0, new ExtraText("° ", xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 7*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 8*ystep + tsteg ));
            }
        }
        if (plotType.equals("fillet")) {

            if ( tabellType  == 11 ) {
                xst = (-xP + 120 + tranX) * 10 / 15 + 410;
                yst = (-yP + 90 + tranY) * 10 / 15 + 237;
            }
            if ( tabellType  == 15 ) {
                xst = (-xP + 120 + tranX) * 10 / 15 + 130;
                yst = (-yP + 90 + tranY) * 10 / 15 + 450;
            }
            ystep = 300/15;
            xstep = 800/15;  // 60
            hstep = 300/15;
            tsteg = 150/15;
            xBase1 = xst-2;
            xBase2 = xBase1 + xstep + tsteg;
            xBase3 = xBase2 + ystep;
            xBase4 = xBase3 + 2*ystep;
            xBase5 = xBase4 + 2*ystep;
            xBase6 = xBase5 + 2*ystep;
            xBase7 = xBase6 + 2*ystep;
            xBase8 = xBase7 + 2*ystep;
            xBase9 = xBase8 + 2*ystep;
            yBase0 = yst-8 ;
            yBase1 = yBase0 + hstep;
            yBase2 = yBase1 + hstep;
            yBase3 = yBase2 + hstep;
            yBase4 = yBase3 + hstep;
            yBase5 = yBase4 + hstep;
            yBase6 = yBase5 + hstep;
            yBase7 = yBase6 + hstep;
            yBase8 = yBase7 + hstep;
            yBase9 = yBase8 + hstep;
            yBase10 = yBase9 + hstep;

            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase4   ));
            extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase4    ));
            extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase4  ));
            extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase4  ));

            extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));

            extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg ));
            extraText.add(0, new ExtraText("Angle " , xst, yst + ystep + tsteg ));
            extraText.add(0, new ExtraText("Plate 1 " , xst, yst + 2*ystep + tsteg));
            extraText.add(0, new ExtraText("Plate 2 " , xst, yst + 3*ystep + tsteg ));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[0]))).toString(), xst + xstep+ tsteg, yst + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[4]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[5]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst     + tsteg      ));
            extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg ));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));

            if (vec[12] == 2) {

                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase1,   yBase6   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase4,   xBase2,   yBase6   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase4,   xBase3,   yBase6  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase4,   xBase4,   yBase6  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));

                extraText.add(0, new ExtraText("Angle 2 "     , xst, yst +4*ystep + tsteg ));
                extraText.add(0, new ExtraText("Face " , xst, yst + 5*ystep + tsteg));

                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst +4*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[10]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));

                extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst   +4*ystep    + tsteg    ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));

            }
            if (vec[12] == 3) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase8   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase8   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase8  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase8  ));


                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));

                extraText.add(0, new ExtraText("Face "     , xst, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle 2" , xst, yst + 5*ystep + tsteg ));
                extraText.add(0, new ExtraText("Angle 3 " , xst, yst + 6*ystep + tsteg ));
                extraText.add(0, new ExtraText("Center " , xst, yst + 7*ystep + tsteg ));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[10]))).toString(), xst + xstep+ tsteg, yst  + 4*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[8]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[11]))).toString(), xst + xstep+ tsteg, yst + 7*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 4*ystep    + tsteg    ));
                extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst +  5*ystep + tsteg ));
                extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 7*ystep + tsteg));
            }
            if (vec[12] == 4) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase7   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase7   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase7  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase7  ));


                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));

                extraText.add(0, new ExtraText("Angle 2 "     , xst, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText("Radius 1" , xst, yst + 5*ystep + tsteg ));
                extraText.add(0, new ExtraText("Face " , xst, yst + 6*ystep + tsteg));

                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst  + 4*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[10]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));

                extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst    + 4*ystep    + tsteg    ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  5*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));

            }
            if (vec[12] == 5) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase10   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase10   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase10  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase10  ));


                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase9,   xBase4 ,  yBase9  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase10,   xBase4 ,  yBase10  ));

                extraText.add(0, new ExtraText("Angle 2 "     , xst, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle 3" , xst, yst + 5*ystep + tsteg ));
                extraText.add(0, new ExtraText("Radius 1" , xst, yst + 6*ystep + tsteg ));
                extraText.add(0, new ExtraText("Radius 2 "     , xst, yst + 7*ystep + tsteg));
                extraText.add(0, new ExtraText("Face" , xst, yst + 8*ystep + tsteg));
                extraText.add(0, new ExtraText("Center " , xst, yst + 9*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst  + 4*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[8]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[9]))).toString(), xst + xstep+ tsteg, yst  + 7*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[10]))).toString(), xst + xstep+ tsteg, yst + 8*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[11]))).toString(), xst + xstep+ tsteg, yst + 9*ystep + tsteg));
                extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst    + 4*ystep    + tsteg    ));
                extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst +  5*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm"   , xst + xstep+ystep+ tsteg, yst    + 7*ystep    + tsteg    ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  8*ystep + tsteg  ));
                extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 9*ystep + tsteg));
            }
        }
        if (plotType.equals("corner")) {
            int yjuster = -110;
            yjuster =0;

            if ( tabellType == 11 ) {
                xst = (-xP + 120 + tranX) * 10 / 15 + 604;
                yst = (-yP + 90 + tranY) * 10 / 15 + 247;
            }
            if ( tabellType == 15 ) {
                xst = (-xP + 120 + tranX) * 10 / 15 + 130;
                yst = (-yP + 90 + tranY) * 10 / 15 + 550;
            }
            ystep = 300/15;
            xstep = 800/15;  // 60
            hstep = 300/15;
            tsteg = 150/15;
            xBase1 = xst-2;
            xBase2 = xBase1 + xstep + tsteg;
            xBase3 = xBase2 + ystep;
            xBase4 = xBase3 + 2*ystep;
            xBase5 = xBase4 + 2*ystep;
            xBase6 = xBase5 + 2*ystep;
            xBase7 = xBase6 + 2*ystep;
            xBase8 = xBase7 + 2*ystep;
            xBase9 = xBase8 + 2*ystep;
            yBase0 = yst-8 ;
            yBase1 = yBase0 + hstep;
            yBase2 = yBase1 + hstep;
            yBase3 = yBase2 + hstep;
            yBase4 = yBase3 + hstep;
            yBase5 = yBase4 + hstep;
            yBase6 = yBase5 + hstep;
            yBase7 = yBase6 + hstep;
            yBase8 = yBase7 + hstep;
            yBase9 = yBase8 + hstep;
            yBase10 = yBase9 + hstep;

            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0 + yjuster,   xBase1,   yBase7 + yjuster  ));
            extraLineTabell.add(0, new ExtraLine(   xBase2 ,    yBase0+ yjuster,   xBase2,   yBase7 + yjuster    ));
            extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0+ yjuster,   xBase3,   yBase7 + yjuster ));
            extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0+ yjuster,   xBase4,   yBase7 + yjuster ));

            extraLineTabell.add(0, new ExtraLine(   xBase1,   yBase0+ yjuster,   xBase4 ,  yBase0 + yjuster));
            extraLineTabell.add(0, new ExtraLine(   xBase1 ,    yBase1+ yjuster,   xBase4,   yBase1 + yjuster  ));
            extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase2+ yjuster,   xBase4,   yBase2 + yjuster  ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3+ yjuster,   xBase4 ,  yBase3 + yjuster ));
            extraLineTabell.add(0, new ExtraLine(   xBase1 ,    yBase4+ yjuster,   xBase4 ,  yBase4 + yjuster ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5+ yjuster,   xBase4 ,  yBase5 + yjuster ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6+ yjuster,   xBase4 ,  yBase6 + yjuster ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7+ yjuster,   xBase4 ,  yBase7 + yjuster ));

            yjuster = 0;   // -110;
            extraText.add(0, new ExtraText("Plate 1 "     , xst, yst + yjuster + tsteg ));
            extraText.add(0, new ExtraText("Plate 2 " , xst, yst + yjuster + ystep + tsteg ));
            extraText.add(0, new ExtraText("Angle " , xst, yst + yjuster + 2*ystep + tsteg));
            extraText.add(0, new ExtraText("Angle L "     , xst, yst + yjuster + 3*ystep + tsteg));
            extraText.add(0, new ExtraText("Angle R " , xst, yst + yjuster + 4*ystep + tsteg));
            extraText.add(0, new ExtraText("dx Left " , xst, yst + yjuster + 5*ystep + tsteg ));
            extraText.add(0, new ExtraText("dx Right " , xst, yst + yjuster + 6*ystep + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[1]))).toString(), xst + xstep+ tsteg, yst + yjuster + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[2]))).toString(), xst + xstep+ tsteg, yst + ystep + yjuster + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[0]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + yjuster + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + yjuster + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[4]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + yjuster + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[5]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + yjuster + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + yjuster + tsteg));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + yjuster    + tsteg       ));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + yjuster  + tsteg));
            extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + yjuster + 2*ystep + tsteg));
            extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + yjuster   + 3*ystep     + tsteg   ));
            extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + yjuster +  4*ystep  + tsteg));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + yjuster + 5*ystep + tsteg));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + yjuster + 6*ystep + tsteg));

        }

        if (plotType.equals("butt")) {
            /*
            xst = -xP + 300 + tranX + tsteg/2;      // 560
            yst = -yP +90 + tranY;
             */
            if (tabellType == 11) {
                xst = (-xP + 300 + tranX + tsteg/2)*10/15 + 30 ;      // 560
                yst = (-yP +90 + tranY)*10/15 + 9 ;
            }
            if (tabellType == 15) {
                xst = (-xP + 300 + tranX + tsteg/2)*10/15 + 2;      // 560
                yst = (-yP +90 + tranY)*10/15 +31;
            }

            xBase1 = xst-2;
            xBase2 = xBase1 + xstep + tsteg;
            xBase3 = xBase2 + ystep;
            xBase4 = xBase3 + 2*ystep;
            xBase5 = xBase4 + 2*ystep;
            xBase6 = xBase5 + 2*ystep;
            xBase7 = xBase6 + 2*ystep;
            xBase8 = xBase7 + 2*ystep;
            xBase9 = xBase8 + 2*ystep;
            yBase0 = yst-8 ;
            yBase1 = yBase0 + hstep;
            yBase2 = yBase1 + hstep;
            yBase3 = yBase2 + hstep;
            yBase4 = yBase3 + hstep;
            yBase5 = yBase4 + hstep;
            yBase6 = yBase5 + hstep;
            yBase7 = yBase6 + hstep;
            yBase8 = yBase7 + hstep;
            yBase9 = yBase8 + hstep;
            yBase10 = yBase9 + hstep;

            String v5 = "";
            if (vec[21] == 1) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));

                extraText.add(0, new ExtraText("2 Right side  " + "Steel " +steelR    , xst, yst-ystep + tsteg ));
                extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg ));
                extraText.add(0, new ExtraText("Dy " , xst, yst + ystep + tsteg));
                extraText.add(0, new ExtraText("Plate 2 " , xst, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[12]))).toString(), xst + xstep+ tsteg, yst + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[13]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst     + tsteg      ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg));
            }
            if (vec[21] == 2) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));

                extraText.add(0, new ExtraText("2 Right side  " + "Steel " +steelR     , xst, yst-ystep + tsteg ));
                extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg));
                extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
                extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText("Face " , xst, yst + 4*ystep + tsteg ));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[19]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep    + tsteg    ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep  + tsteg));
                extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
            }
            if (vec[21] == 3) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase7   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase7   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase7  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase7  ));


                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));

                extraText.add(0, new ExtraText("2 Right side  " + "Steel " +steelR  , xst, yst-ystep + tsteg ));
                extraText.add(0, new ExtraText("Gap "     , xst, yst + 0*ystep + tsteg));
                extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
                extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle 2 " , xst, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText("Face " , xst, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText("Center " , xst, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[17]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[19]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[20]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep   + tsteg     ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep  + tsteg));
                extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
            }
            if (vec[21] == 4) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase6   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase6   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase6  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase6  ));


                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));

                extraText.add(0, new ExtraText("2 Right side  " + "Steel " +steelR   , xst, yst-ystep + tsteg));
                extraText.add(0, new ExtraText("Gap "     , xst, yst + 0*ystep + tsteg));
                extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
                extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg ));
                extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText("Radius " , xst, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText("Face " , xst, yst + 5*ystep + tsteg));
                //       extraText.add(0, new ExtraText("Center " , xst, yst + 9*ystep ));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[16]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[19]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                //       extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[20]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep  + tsteg      ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep + tsteg ));
                extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg));
                //       extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg ));
            }
            if (vec[21] == 5) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase9   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase9   ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase9  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase9  ));


                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase9,   xBase4 ,  yBase9  ));

                extraText.add(0, new ExtraText("2 Right side  " + "Steel " +steelR      , xst, yst-ystep + tsteg));
                extraText.add(0, new ExtraText("Gap "     , xst, yst + 0*ystep + tsteg));
                extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
                extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText("Radius " , xst, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle 2 " , xst, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText("Radius 2 " , xst, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText("Face " , xst, yst + 7*ystep + tsteg ));
                extraText.add(0, new ExtraText("Center " , xst, yst + 8*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[16]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[17]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[18]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[19]))).toString(), xst + xstep+ tsteg, yst + 7*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[20]))).toString(), xst + xstep+ tsteg, yst + 8*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep   + tsteg     ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep + tsteg ));
                extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
                extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 7*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 8*ystep + tsteg ));
            }
        }
        if (plotType.equals("flanged")) {
            if ( tabellType == 11 ) {
                xst = (-xP + 120 + tranX) * 10 / 15 + 414;
                yst = (-yP + 90 + tranY) * 10 / 15 + 237;
            }
            if ( tabellType == 15 ) {
                xst = (-xP + 120 + tranX) * 10 / 15 + 130;
                yst = (-yP + 90 + tranY) * 10 / 15 + 500;
            }
            ystep = 300/15;
            xstep = 800/15;  // 60
            hstep = 300/15;
            tsteg = 150/15;
            xBase1 = xst-2;
            xBase2 = xBase1 + xstep + tsteg;
            xBase3 = xBase2 + ystep;
            xBase4 = xBase3 + 2*ystep;
            xBase5 = xBase4 + 2*ystep;
            xBase6 = xBase5 + 2*ystep;
            xBase7 = xBase6 + 2*ystep;
            xBase8 = xBase7 + 2*ystep;
            xBase9 = xBase8 + 2*ystep;
            yBase0 = yst-8 ;
            yBase1 = yBase0 + hstep;
            yBase2 = yBase1 + hstep;
            yBase3 = yBase2 + hstep;
            yBase4 = yBase3 + hstep;
            yBase5 = yBase4 + hstep;
            yBase6 = yBase5 + hstep;
            yBase7 = yBase6 + hstep;
            yBase8 = yBase7 + hstep;
            yBase9 = yBase8 + hstep;
            yBase10 = yBase9 + hstep;

            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
            extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
            extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
            extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

            extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
            extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
            extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg ));
            extraText.add(0, new ExtraText("Plate 1 " , xst, yst + ystep + tsteg ));
            extraText.add(0, new ExtraText("Radius " , xst, yst + 2*ystep + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[0]))).toString(), xst + xstep+ tsteg, yst + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
            extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[2]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + tsteg       ));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
            extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg ));
        }
    }

    /**
     * Generate a comment object from text input from user
     *
     * @param plotType
     */
    public void transformComment(String plotType) {
        //  System.out.println("comment  " + comment);
        
        /// ////////////////////////////////////
        Point firstPointNew = new Point();
        Point middlePointNew = new Point();
        Point lastPointNew = new Point();
        Point textPointNew = new Point();
        String ident;
        int index;
        String atext;
        int identificator ;
        boolean punktPlottes = false;
        boolean textPlottes = true;
        String textcomment = "";
        firstPointNew.x = 0;
        firstPointNew.y = 0;
        middlePointNew.x = 0;
        middlePointNew.y = 0;
        lastPointNew.x = 0;
        lastPointNew.y = 0;

        int type = gang[2];
        index = 0;
        atext = "0";
        int code = 2;
        String svgTab = "";
        int indi = plotIndicator;
        String user = userID;



        ////////////////////////////////////////
        int xvalue = 0;
        int yvalue = 0;
        if (gang[2] == 0) {
            xvalue = 400;
            yvalue = 450;
        }
        if (gang[2] == 7) {
            xvalue = 20;
            yvalue = 420;
        }
        if (gang[2] == 8) {
            xvalue = 620;
            yvalue = 420;
        }
        if (gang[2] == 9) {
            xvalue = 20;
            yvalue = 850;
        }
        if (gang[2] == 10) {
            xvalue = 620;
            yvalue = 850;
        }
        if (gang[2] == 11) {
            xvalue = 400;
            yvalue = 420;
        }
        if (gang[2] == 12) {
            xvalue = 20;
            yvalue = 850;
        }
        if (gang[2] == 14) {
            xvalue = 20;
            yvalue = 500;
        }
        if (gang[2] == 15) {
            xvalue = 20;
            yvalue = 420;
        }
        if (gang[2] == 16) {
            xvalue = 620;
            yvalue = 850;
        }

        int ant = extraComment.size();
        String identifi = "";
        textPointNew.x = xvalue;
        textPointNew.y = yvalue;
        if ( plotType.equals("Butt") || plotType.equals("butt")){

        //   extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue,  yvalue, plotIndicator ));
            identifi +=  comment;
        }
        if ( plotType.equals("fillet") ){
         //   extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue,  yvalue, plotIndicator ));
            identifi +=  comment;
        }

        if ( plotType.equals("overlap") ){
        //    extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue,  yvalue, plotIndicator ));
            identifi +=  comment;
        }
        if ( plotType.equals("corner") ){
        //    extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue,  yvalue, plotIndicator ));
            identifi +=  comment;
        }
        if ( plotType.equals("flanged") ){
        //    extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue,  yvalue, plotIndicator ));
            identifi +=  comment;
        }

        if ( plotType.equals("Lap joint") ){
        //    extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue, yvalue, plotIndicator ));
            identifi +=  comment;
        }
        if ( plotType.equals("On plate") ){
         //   extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue,  yvalue, plotIndicator ));
            identifi +=  comment;
        }
        if ( plotType.equals("Strap joint") ){
         //   extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue, yvalue, plotIndicator ));
            identifi +=  comment;
        }
        if ( plotType.equals("Cross joint") ){
        //    extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue, yvalue, plotIndicator ));
            identifi +=  comment;
        }
        if ( plotType.equals("Tube on plate 45 degrees") ){
            //    extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue, yvalue, plotIndicator ));
            identifi +=  comment;
        }
        if ( plotType.equals("Tube on plate") ){
            //    extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue, yvalue, plotIndicator ));
            identifi +=  comment;
        }
        if ( plotType.equals("Bolt joint") ){
            //    extraComment.add(ant, new ExtraComment( plotType, gang[2], comment, xvalue, yvalue, plotIndicator ));
            identifi +=  comment;
        }
        WeldPoint punkt1 = new WeldPoint(firstPointNew, middlePointNew, lastPointNew,textPointNew,identifi, punktPlottes,textPlottes, type,plotType, index, atext, code, indi, user, svgTab);
        weldList.add(punkt1);
    }

    /**
     * Generate drawing object for the different drawing element such as line, text, circle and ellipse
     * @param plotType
     */
    public void transformParametre(String plotType) {

        if (plotType.equals("overlap")) {
            listImage = 1;
            gap = fac * vec[0];
            tp1 = fac * vec[1];
            tp2 = fac * vec[2];
            y1[14] = vec[3];
            x1[13] = vec[4];
            gang[0] = vec[5];
            gang[1] = vec[6];
            gang[2] = vec[7];
            gang[3] = vec[8];
            gang[4] = vec[9];
            gang[5] = vec[10];
            gang[6] = vec[11];
            gang[7] = vec[12];
            tabellType = vec[26];
            x1[0] = 3 * s - tp1 / 3;
            x1[1] = -3 * s;
            x1[2] = -3 * s;
            x1[3] = 3 * s;
            x1[4] = 3 * s - tp1 / 3;
            x1[5] = 3 * s;
            x1[6] = 3 * s - tp1 / 3;
            x1[7] = 3 * s - tp1 / 3;
            nx1 = 6;
            y1[0] = 0;
            y1[1] = 0;
            y1[2] = -tp1;
            y1[3] = -tp1;
            y1[4] = -tp1 + tp1 / 3;
            y1[5] = -tp1 + 2 * tp1 / 3;
            y1[6] = -tp1 + 3 * tp1 / 3;
            y1[7] = 0;
            x2[0] = 0;
            x2[1] = 0;
            x2[2] = -6 * s;
            x2[3] = -6 * s - tp2 / 3;
            x2[4] = -6 * s;
            x2[5] = -6 * s - tp2 / 3;
            x2[6] = -6 * s;
            x2[7] = 0;
            nx2 = 5;
            y2[0] = gap;
            y2[1] = gap + tp2;
            y2[2] = gap + tp2;
            y2[3] = gap + tp2 - 1 * tp2 / 4;
            y2[4] = gap + tp2 - 2 * tp2 / 4;
            y2[5] = gap + tp2 - 3 * tp2 / 4;
            y2[6] = gap;
            y2[7] = gap;
            extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
            extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
            extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
            extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
            extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
            extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
            extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
            extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
            extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
            extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
            extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
            extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
            extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
        }
        if (plotType.equals("fillet")) {
            listImage = 1;
            int div = vec[5];
            facN = fac;
            if (vec[5] != 0 && vec[5] <= 40) {
                double facND = 40 * fac / div;
                facN = (int) facND;
            }
            facN = fac;  // nullstiller endring
//        System.out.println(facN + " "+ div);
            gap = facN * vec[0];
            angle = vec[1];
            filetVinkel = vec[1];
            bottombs = facN * vec[2];
            topbs = facN * vec[3];
            tp3 = facN * vec[4];
            tp2 = facN * vec[5];
            angle2 = vec[6];
            r1 = facN * vec[7];
            angle3 = vec[8];
            r2 = facN * vec[9];
            face = facN * vec[10];
            c = facN * vec[11];
            y1[14] = vec[13];
            x1[13] = vec[14];
            gang[0] = vec[15];
            gang[1] = vec[16];
            gang[2] = vec[17];
            gang[3] = vec[18];
            gang[4] = vec[19];
            gang[5] = vec[20];
            gang[6] = vec[21];
            gang[7] = vec[22];
            gang[19] = angle;
            tabellType = vec[26];
            x1[0] = 5 * s;
            x1[1] = -5 * s;
            x1[2] = -5 * s + tp3 / 2;
            x1[3] = -5 * s;
            x1[4] = 5 * s;
            x1[5] = 5 * s - tp3 / 2;
            x1[6] = 5 * s;
            x1[7] = -5 * s;
            nx1 = 6;
            y1[0] = tp3;
            y1[1] = tp3;
            y1[2] = tp3 / 2;
            y1[3] = 0;
            y1[4] = 0;
            y1[5] = tp3 / 2;
            y1[6] = tp3;
            y1[7] = tp3;
            x1[11] = 0;
            y1[11] = 0;

            if (vec[12] == 1) {
                x2[0] = -tp2;
                x2[1] = -tp2;
                x2[2] = 0;
                x2[3] = 0;
                x2[4] = -tp2 / 4;
                x2[5] = -tp2 / 2;
                x2[6] = -3 * tp2 / 4;
                x2[7] = -tp2;
                nx2 = 5;
                y2[0] = -4 * s - gap;
                y2[1] = -gap;
                y2[2] = -gap;
                y2[3] = -4 * s - gap;
                y2[4] = -4 * s - gap + tp2 / 4;
                y2[5] = -4 * s - gap;
                y2[6] = -4 * s - gap + tp2 / 4;
                y2[7] = -4 * s - gap;
                double radius;
                int ang = 30;
                double rot = (ang / 180.0) * Math.PI;
                double tallx;
                double tally;
                for (int i = 0; i < 8; i++) {
                    radius = Math.sqrt((x2[i] + xP / 2) * (x2[i] + xP / 2) + (y2[i] + yP / 2) * (y2[i] + yP / 2));
                    tallx = radius * Math.sin(rot);
                    //  x2[i] = (int) tallx - xP/2;
                    tally = radius * Math.cos(rot);
                    //   y2[i] = (int) tally -yP/2;
                    //   System.out.println(x2[i] + " "  + y2[i]);
                }
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
                //        System.out.println(" " + y2[3] + "  "  + y1[4]);
                //        if ( y2[3]  > y1[4] ) {
                //      	  plotOK = false;
                //        }
            }
            for (int j = 0; j < 7; j++) {
                if (y2[j] > 0) {
                    plotOK = false;
                }
            }
            if (vec[12] == 2) {
                double y1 = (tp2 - face) * Math.tan(Math.PI * angle2 / 180.0D);
                int y1i = (int) y1;
                x2[0] = -face + tp2 / 4;
                x2[1] = -face;
                x2[2] = -face;
                x2[3] = 0;
                x2[4] = tp2 - face;
                x2[5] = tp2 - face;
                x2[6] = tp2 - face - tp2 / 4;
                x2[7] = tp2 - face - tp2 / 2;
                nx2 = 5;
                y2[0] = -4 * s - gap + tp2 / 4;
                y2[1] = -4 * s - gap;
                y2[2] = -gap;
                y2[3] = -gap;
                y2[4] = -y1i - gap;
                y2[5] = -4 * s - gap;
                y2[6] = -4 * s - gap + tp2 / 4;
                y2[7] = -4 * s - gap;
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
                for (int j = 0; j < 7; j++) {
                    if (y2[j] > 0)
                        plotOK = false;
                }
            }
            if (vec[12] == 3) {
                if (face > tp2)
                    face = tp2;
                if (c > tp2 - face)
                    c = tp2 - face;
                int ff = tp2 - c - face / 2;
                if (ff < 0)
                    ff = 0;
                int gg = c - face / 2;
                if (gg < 0)
                    gg = 0;
                double y2d = gg * Math.tan(Math.PI * (angle2) / 180.0D);
                int y2i = (int) y2d;
                double y3d = ff * Math.tan(Math.PI * (angle3) / 180.0D);
                int y3i = (int) y3d;
                x2[0] = -tp2 + c;
                x2[1] = -tp2 + c;
                x2[2] = -tp2 + c;
                x2[3] = -face / 2;
                x2[4] = face / 2;
                x2[5] = c;
                x2[6] = c;
                x2[7] = c;
                nx2 = 5;
                y2[0] = -4 * s - gap;
                y2[1] = -4 * s - gap;
                y2[2] = -y3i - gap;
                y2[3] = -gap;
                y2[4] = -gap;
                y2[5] = -y2i - gap;
                y2[6] = -4 * s - gap;
                y2[7] = -4 * s - gap;
                for (int j = 0; j < 7; j++) {
                    if (y2[j] > 0)
                        plotOK = false;
                }
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
            }
            if (vec[12] == 4) {
                double r1dU = r1 / 1.4142D;
                int r1iU = (int) r1dU;
                r1iU = r1;
                int ff = tp2 - face - r1iU;
                if (ff < 0)
                    ff = 0;
                double y4d = ff * Math.tan(Math.PI * angle2 / 180.0D);
                int y4i = (int) y4d;
                if (r1iU > tp2 - face)
                    r1iU = tp2 - face;
                if (face > tp2)
                    face = tp2;
                x2[0] = -face;
                x2[1] = -face;
                x2[2] = -face;
                x2[3] = 0;
                x2[4] = 0;
                x2[5] = 0;
                x2[6] = 0;
                x2[7] = 0;
                nx2 = 5;
                y2[0] = -4 * s - gap;
                y2[1] = -4 * s - gap;
                y2[2] = -gap;
                y2[3] = -gap;
                y2[4] = -gap;
                y2[5] = -gap;
                y2[6] = -gap;
                y2[7] = -gap;
                x3[0] = r1iU;
                x3[1] = tp2 - face;
                x3[2] = tp2 - face;
                x3[3] = tp2 - face;
                x3[4] = tp2 - face;
                x3[5] = tp2 - face;
                x3[6] = tp2 - face;
                x3[7] = tp2 - face;
                y3[0] = -r1iU - gap;
                y3[1] = -y4i - r1iU - gap;
                y3[2] = -4 * s - gap;
                y3[3] = -4 * s - gap;
                y3[4] = -4 * s - gap;
                y3[5] = -4 * s - gap;
                y3[6] = -4 * s - gap;
                y3[7] = -4 * s - gap;
                x12[7] = 0;
                y12[7] = -gap - r1iU / 2;
                //      xcentrumFU = 0;
                //     ycentrumFU = -gap - r1iU / 2;
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
                extraLine.add(0, new ExtraLine(x3[0], y3[0], x3[1], y3[1]));
                extraLine.add(0, new ExtraLine(x3[1], y3[1], x3[2], y3[2]));
                extraLine.add(0, new ExtraLine(x3[2], y3[2], x3[3], y3[3]));
                extraLine.add(0, new ExtraLine(x3[3], y3[3], x3[4], y3[4]));
                extraLine.add(0, new ExtraLine(x3[4], y3[4], x3[5], y3[5]));
                extraLine.add(0, new ExtraLine(x3[5], y3[5], x3[6], y3[6]));
                extraLine.add(0, new ExtraLine(x3[6], y3[6], x3[7], y3[7]));
                for (int j = 0; j < 7; j++) {
                    if (y2[j] > 0)
                        plotOK = false;
                    if (y3[j] > 0)
                        plotOK = false;
                }
            }
            if (vec[12] == 5) {
                int lenLeft = tp2 - c - face / 2;
                double y5d = (lenLeft - r2) / Math.tan(Math.PI * (90 - angle3) / 180.0D);
                int hLeft = (int) y5d;
                double leftHypd = hLeft / Math.cos(Math.PI * (90 - angle3) / 180.0D);
                int leftHyp = (int) leftHypd;
                double lld = (2 * r1) * Math.sin(Math.PI * (90 - angle3) / 180.0D);
                int ll = (int) lld;
                double id = r1 * 1.0D;
                ll = (int) id;
                double lhd = (2 * r1) * Math.cos(Math.PI * (90 - angle3) / 180.0D);
                int lh = (int) lhd;
                double ld = r2 * 1.0D;
                lh = (int) ld;
                int lenRight = c - face / 2;
                double y6d = (lenRight - r1) / Math.tan(Math.PI * (90 - angle2) / 180.0D);
                int hRight = (int) y6d;
                double rightHypd = hRight / Math.cos(Math.PI * (90 - angle2) / 180.0D);
                int rightHyp = (int) rightHypd;
                double hld = (2 * r2) * Math.sin(Math.PI * (90 - angle2) / 180.0D);
                int hl = (int) hld;
                hl = r1;
                double hhd = (2 * r2) * Math.cos(Math.PI * (90 - angle2) / 180.0D);
                int hh = (int) hhd;
                hh = r1;
                if (ll > lenLeft + face / 2)
                    ll = lenLeft;
                if (hl > lenRight + face / 2)
                    hl = lenRight + face / 2;
                if (ll > lenLeft)
                    ll = lenLeft;
                if (hl > lenRight)
                    hl = lenRight;
                if (lh > hLeft)
                    lh = hLeft;
                if (hh > hRight)
                    hh = hRight;
                x2[0] = -lenLeft - face / 2;
                x2[1] = -lenLeft - face / 2;
                x2[2] = -lenLeft - face / 2;
                x2[3] = -ll - face / 2;
                x2[4] = -ll - face / 2;
                x2[5] = -ll - face / 2;
                x2[6] = -ll - face / 2;
                x2[7] = -ll - face / 2;
                nx2 = 5;
                y2[0] = -4 * s - gap;
                y2[1] = -4 * s - gap;
                y2[2] = -hLeft - gap - r2;
                y2[3] = -lh - gap;
                y2[4] = -lh - gap;
                y2[5] = -lh - gap;
                y2[6] = -lh - gap;
                y2[7] = -lh - gap;
                x3[0] = lenRight + face / 2;
                x3[1] = lenRight + face / 2;
                x3[2] = lenRight + face / 2;
                x3[3] = hl + face / 2;
                x3[4] = hl + face / 2;
                x3[5] = hl + face / 2;
                x3[6] = hl + face / 2;
                x3[7] = hl + face / 2;
                y3[0] = -4 * s - gap;
                y3[1] = -4 * s - gap;
                y3[2] = -hRight - gap - r1;
                y3[3] = -hh - gap;
                y3[4] = -hh - gap;
                y3[5] = -hh - gap;
                y3[6] = -hh - gap;
                y3[7] = -hh - gap;
                x4[0] = -face / 2;
                x4[1] = face / 2;
                x4[2] = face / 2;
                x4[3] = face / 2;
                x4[4] = face / 2;
                x4[5] = face / 2;
                x4[6] = face / 2;
                x4[7] = face / 2;
                y4[0] = -gap;
                y4[1] = -gap;
                y4[2] = -gap;
                y4[3] = -gap;
                y4[4] = -gap;
                y4[5] = -gap;
                y4[6] = -gap;
                y4[7] = -gap;
                x12[5] = -face / 2 - ll / 4;
                y12[5] = -lh / 2 - gap;
                x12[6] = face / 2 + hl / 4;
                y12[6] = -hh / 2 - gap;
                //      xcentrumLDU = -face / 2 - ll / 4;
                //      ycentrumLDU = -lh / 2 - gap;
                //     xcentrumRDU = face / 2 + hl / 4;
                //     ycentrumRDU = -hh / 2 - gap;
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
                extraLine.add(0, new ExtraLine(x3[0], y3[0], x3[1], y3[1]));
                extraLine.add(0, new ExtraLine(x3[1], y3[1], x3[2], y3[2]));
                extraLine.add(0, new ExtraLine(x3[2], y3[2], x3[3], y3[3]));
                extraLine.add(0, new ExtraLine(x3[3], y3[3], x3[4], y3[4]));
                extraLine.add(0, new ExtraLine(x3[4], y3[4], x3[5], y3[5]));
                extraLine.add(0, new ExtraLine(x3[5], y3[5], x3[6], y3[6]));
                extraLine.add(0, new ExtraLine(x3[6], y3[6], x3[7], y3[7]));
                extraLine.add(0, new ExtraLine(x4[0], y4[0], x4[1], y4[1]));
                extraLine.add(0, new ExtraLine(x4[1], y4[1], x4[2], y4[2]));
                extraLine.add(0, new ExtraLine(x4[2], y4[2], x4[3], y4[3]));
                extraLine.add(0, new ExtraLine(x4[3], y4[3], x4[4], y4[4]));
                extraLine.add(0, new ExtraLine(x4[4], y4[4], x4[5], y4[5]));
                extraLine.add(0, new ExtraLine(x4[5], y4[5], x4[6], y4[6]));
                extraLine.add(0, new ExtraLine(x4[6], y4[6], x4[7], y4[7]));
                for (int j = 0; j < 7; j++) {
                    if (y2[j] > 0)
                        plotOK = false;
                    if (y3[j] > 0)
                        plotOK = false;
                    if (y3[j] > 0)
                        plotOK = false;
                }
            }
        }
        if (plotType.equals("corner")) {

            listImage = 1;
            int div = vec[1];
            facN = fac;
            if (vec[1] != 0 && vec[1] <= 10) {
                double facND = 10 * fac / div;
                facN = (int) facND;
            }
            facN = fac;  // nullstiller endring
            angle = vec[0];
            angle1 = vec[3];
            angle2 = vec[4];
            tp1 = facN * vec[1];
            tp2 = facN * vec[2];
            dxl = facN * vec[5];
            dxr = facN * vec[6];
            y1[14] = vec[7];
            x1[13] = vec[8];
            gang[0] = vec[9];
            gang[1] = vec[10];
            gang[2] = vec[11];
            gang[3] = vec[12];
            gang[4] = vec[13];
            gang[5] = vec[14];
            gang[6] = vec[15];
            tabellType = vec[26];
            int length = 6 * s;
            double x0d = length * Math.sin(Math.PI * (angle / 2) / 360.0D);
            int x0i = (int) x0d;
            double y0d = length * Math.cos(Math.PI * (angle / 2) / 360.0D);
            int y0i = (int) y0d;
            double zc5 = (5 * s) / Math.tan(Math.PI * angle / 360.0D);
            int zc0 = (int) zc5;
            double zzc2 = (5 * s) / Math.cos(Math.PI * angle / 360.0D);
            int zc2 = (int) zzc2;
            double zzc1 = dxl / Math.cos(Math.PI * angle / 360.0D);
            int zc1 = (int) zzc1;
            double zzc3 = dxl / Math.sin(Math.PI * angle / 360.0D);
            int zc3 = (int) zzc3;
            double zzc4 = tp1 / Math.cos(Math.PI * angle1 / 180.0D);
            int zc4 = (int) zzc4;
            double zzc5 = zzc4 * Math.cos(Math.PI * (90 + angle1 - angle / 2) / 180.0D);
            int zc6 = (int) zzc5;
            double zzc9 = zzc4 * Math.sin(Math.PI * (90 + angle1 - angle / 2) / 180.0D);
            int zc9 = (int) zzc9;
            double zzc10 = tp1 * Math.cos(Math.PI * angle / 360.0D);
            int zc10 = (int) zzc10;
            double zzc7 = tp1 * Math.sin(Math.PI * angle / 360.0D);
            int zc7 = (int) zzc7;
            double ff = (zc10 / 4);
            int ffi = (int) ff;
            double ff2 = 2.0D * ff;
            int ffi2 = (int) ff2;
            double ff3 = 3.0D * ff;
            int ffi3 = (int) ff3;
            double fff = (zc6 / 4);
            int fffi = (int) fff;
            double ff4 = 2.0D * fff;
            int ffi4 = (int) ff4;
            double ff5 = 3.0D * fff;
            int ffi5 = (int) ff5;
            int yjuster = 0; // -110;
            x1[0] = -5 * s;
            x1[1] = zc3;
            x1[2] = zc3 - zc9;
            x1[3] = -5 * s - zc10;
            x1[4] = -5 * s + ffi3 - zc10;
            x1[5] = -5 * s + ffi2 - zc10;
            x1[6] = -5 * s + ffi - zc10;
            x1[7] = -5 * s;
            nx1 = 6;
            y1[0] = zc0 + yjuster;
            y1[1] = -zc1 + yjuster;
            y1[2] = -zc1 - zc6 + yjuster;
            y1[3] = zc0 - zc7 + yjuster;
            y1[4] = zc0 + ffi - zc7 + yjuster;
            y1[5] = zc0 + ffi4 - zc7 + yjuster;
            y1[6] = zc0 + ffi5 - zc7 + yjuster;
            y1[7] = zc0 + yjuster;
            zzc1 = dxr / Math.cos(Math.PI * angle / 360.0D);
            zc1 = (int) zzc1;
            zzc3 = dxr / Math.sin(Math.PI * angle / 360.0D);
            zc3 = (int) zzc3;
            zzc4 = tp2 / Math.cos(Math.PI * angle2 / 180.0D);
            zc4 = (int) zzc4;
            zzc5 = zzc4 * Math.cos(Math.PI * (90 + angle2 - angle / 2) / 180.0D);
            zc6 = (int) zzc5;
            zzc9 = zzc4 * Math.sin(Math.PI * (90 + angle2 - angle / 2) / 180.0D);
            zc9 = (int) zzc9;
            double y112d = tp2 * Math.sin(Math.PI * (angle / 2) / 360.0D);
            double x112d = tp2 * Math.cos(Math.PI * (angle / 2) / 360.0D);
            int y112 = (int) y112d;
            int x112 = (int) x112d;
            x2[0] = 5 * s;
            x2[1] = -zc3;
            x2[2] = -zc3 + zc9;
            x2[3] = 5 * s + x112;
            x2[4] = 5 * s;
            x2[5] = 5 * s;
            x2[6] = 5 * s;
            x2[7] = 5 * s;
            nx2 = 5;
            y2[0] = zc0 + yjuster;
            y2[1] = -zc1 + yjuster;
            y2[2] = -zc1 - zc6 + yjuster;
            y2[3] = zc0 - y112 + yjuster;
            y2[4] = zc0 + yjuster;
            y2[5] = zc0 + yjuster;
            y2[6] = zc0 + yjuster;
            y2[7] = zc0 + yjuster;

            extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
            extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
            extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
            extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
            extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
            extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
            extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
            extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
            extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
            extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
            extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
            extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
            extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));

        }
        if (plotType.equals("flanged")) {
            listImage = 1;
            int div = vec[1];
            facN = fac;
            if (vec[1] != 0 && vec[1] <= 10) {
                double facND = 10 * fac / div;
                facN = (int) facND;
            }
            facN = fac;  // nullstiller endring
            gap = facN * vec[0];
            tp1 = facN * vec[1];
            r1 = facN * vec[2];
            double r1dFL = r1 * 1.4142D;
            int r1iFL = (int) r1dFL;
            y1[14] = vec[3];
            x1[13] = vec[4];
            gang[0] = vec[5];
            gang[1] = vec[6];
            gang[2] = vec[7];
            gang[3] = vec[8];
            gang[4] = vec[9];
            gang[5] = vec[10];
            gang[6] = vec[11];
            gang[7] = vec[12];
            tabellType = vec[26];
            x1[0] = -gap / 2 - tp1 - r1iFL;
            x1[1] = -4 * s - gap / 2;
            x1[2] = -4 * s - gap / 2 + tp1 / 2;
            x1[3] = -4 * s - gap / 2;
            x1[4] = -gap / 2 - tp1 - r1iFL;
            x1[5] = -gap / 2 - tp1 - r1iFL;
            x1[6] = -gap / 2 - tp1 - r1iFL;
            x1[7] = -gap / 2 - tp1 - r1iFL;
            nx1 = 6;
            y1[0] = r1iFL;
            y1[1] = r1iFL;
            y1[2] = r1iFL + tp1 / 2;
            y1[3] = r1iFL + tp1;
            y1[4] = r1iFL + tp1;
            y1[5] = r1iFL + tp1;
            y1[6] = r1iFL + tp1;
            y1[7] = r1iFL + tp1;
            x2[0] = gap / 2 + tp1 + r1iFL;
            x2[1] = 4 * s + gap / 2;
            x2[2] = 4 * s + gap / 2 - tp1 / 2;
            x2[3] = 4 * s + gap / 2;
            x2[4] = gap / 2 + tp1 + r1iFL;
            x2[5] = gap / 2 + tp1 + r1iFL;
            x2[6] = gap / 2 + tp1 + r1iFL;
            x2[7] = gap / 2 + tp1 + r1iFL;
            nx2 = 5;
            y2[0] = r1iFL;
            y2[1] = r1iFL;
            y2[2] = r1iFL + tp1 / 2;
            y2[3] = r1iFL + tp1;
            y2[4] = r1iFL + tp1;
            y2[5] = r1iFL + tp1;
            y2[6] = r1iFL + tp1;
            y2[7] = r1iFL + tp1;
            x3[0] = -gap / 2;
            x3[1] = -gap / 2 - tp1;
            x3[2] = -gap / 2 - tp1;
            x3[3] = -gap / 2 - tp1;
            x3[4] = -gap / 2 - tp1;
            x3[5] = -gap / 2 - tp1;
            x3[6] = -gap / 2 - tp1;
            x3[7] = -gap / 2 - tp1;
            y3[0] = 0;
            y3[1] = 0;
            y3[2] = 0;
            y3[3] = 0;
            y3[4] = 0;
            y3[5] = 0;
            y3[6] = 0;
            y3[7] = 0;
            x4[0] = gap / 2;
            x4[1] = gap / 2 + tp1;
            x4[2] = gap / 2 + tp1;
            x4[3] = gap / 2 + tp1;
            x4[4] = gap / 2 + tp1;
            x4[5] = gap / 2 + tp1;
            x4[6] = gap / 2 + tp1;
            x4[7] = gap / 2 + tp1;
            y4[0] = 0;
            y4[1] = 0;
            y4[2] = 0;
            y4[3] = 0;
            y4[4] = 0;
            y4[5] = 0;
            y4[6] = 0;
            y4[7] = 0;
            x12[1] = -gap / 2 - tp1;
            y12[1] = r1iFL;
            x12[2] = -gap / 2;
            y12[2] = r1iFL + tp1;
            x12[3] = gap / 2;
            y12[3] = r1iFL + tp1;
            x12[4] = gap / 2 + tp1;
            y12[4] = r1iFL;
            //     xcentrumA = -gap / 2 - tp1;
            //     ycentrumA = r1iFL;
            //     xcentrumB = -gap / 2;
            //     ycentrumB = r1iFL + tp1;
            //     xcentrumC = gap / 2;
            //     ycentrumC = r1iFL + tp1;
            //     xcentrumD = gap / 2 + tp1;
            //    ycentrumD = r1iFL;
            extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
            extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
            extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
            extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
            extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
            extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
            extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
            extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
            extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
            extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
            extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
            extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
            extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
            extraLine.add(0, new ExtraLine(x3[0], y3[0], x3[1], y3[1]));
            extraLine.add(0, new ExtraLine(x3[1], y3[1], x3[2], y3[2]));
            extraLine.add(0, new ExtraLine(x3[2], y3[2], x3[3], y3[3]));
            extraLine.add(0, new ExtraLine(x3[3], y3[3], x3[4], y3[4]));
            extraLine.add(0, new ExtraLine(x3[4], y3[4], x3[5], y3[5]));
            extraLine.add(0, new ExtraLine(x3[5], y3[5], x3[6], y3[6]));
            extraLine.add(0, new ExtraLine(x3[6], y3[6], x3[7], y3[7]));
            extraLine.add(0, new ExtraLine(x4[0], y4[0], x4[1], y4[1]));
            extraLine.add(0, new ExtraLine(x4[1], y4[1], x4[2], y4[2]));
            extraLine.add(0, new ExtraLine(x4[2], y4[2], x4[3], y4[3]));
            extraLine.add(0, new ExtraLine(x4[3], y4[3], x4[4], y4[4]));
            extraLine.add(0, new ExtraLine(x4[4], y4[4], x4[5], y4[5]));
            extraLine.add(0, new ExtraLine(x4[5], y4[5], x4[6], y4[6]));
            extraLine.add(0, new ExtraLine(x4[6], y4[6], x4[7], y4[7]));
        }
        if (plotType.equals("Butt")) {  // blir ikke brukt i denne versjonen
            //       if( vec[2] <=20 ) { s=20;}
            listImage = 0;
            int div = vec[1];
            facN = fac;

            if (vec[1] != 0 && vec[1] <= 40) {

                double facND = 40 * fac / div;
                facN = (int) facND;
            }


            facN = fac;    // nullstiller endring
//        System.out.println(facN + " "+ div);
            gap = facN * vec[0];
            tp1 = facN * vec[1];
            forvs = facN * vec[1];
            tp1 = 0;
            tp2 = facN * vec[2];
            angle = vec[3];
            r1 = facN * vec[4];
            angle2 = vec[5];
            r2 = facN * vec[6];
            face = facN * vec[7];
            c = facN * vec[8];
            y1[14] = vec[10];
            x1[13] = vec[11];
            gang[0] = vec[12];
            gang[1] = vec[13];
            gang[2] = vec[14];
            gang[3] = vec[15];
            gang[4] = vec[16];
            gang[5] = vec[17];
            gang[6] = vec[18];
            gang[7] = vec[19];
            tabellType = vec[26];
            if (vec[9] == 1) {
                x1[0] = -gap / 2 - 5 * s;
                x1[1] = -gap / 2;
                x1[2] = -gap / 2;
                x1[3] = -gap / 2 - 5 * s;
                x1[4] = -gap / 2 - 5 * s;
                x1[5] = -gap / 2 - 5 * s;
                x1[6] = -gap / 2 - 5 * s;
                x1[7] = -gap / 2 - 5 * s;
                y1[0] = -tp1 / 2 - tp2 / 2;
                y1[1] = -tp1 / 2 - tp2 / 2;
                y1[2] = -tp1 / 2 + tp2 / 2;
                y1[3] = -tp1 / 2 + tp2 / 2;
                y1[4] = -tp1 / 2 + tp2 / 2;
                y1[5] = -tp1 / 2 + tp2 / 2;
                y1[6] = -tp1 / 2 + tp2 / 2;
                y1[7] = -tp1 / 2 + tp2 / 2;
                nx1 = 4;
                nx2 = 0;
                x10[0] = -gap / 2 - 4 * s;
                y10[0] = -tp1 / 2;
                x10[1] = tp2;

                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));


            }
            if (vec[9] == 2) {
                int z4 = tp2 - face;
                double z5 = z4 * Math.tan(Math.PI * angle / 180.0D);
                int zz2 = (int) z5;
                x1[0] = -gap / 2 - 5 * s;
                x1[1] = -gap / 2;
                x1[2] = -gap / 2;
                x1[3] = -gap / 2 - zz2;
                x1[4] = -gap / 2 - 5 * s;
                x1[5] = -gap / 2 - 5 * s;
                x1[6] = -gap / 2 - 5 * s;
                x1[7] = -gap / 2 - 5 * s;
                y1[0] = tp1 + face / 2;
                y1[1] = tp1 + face / 2;
                y1[2] = tp1 - face / 2;
                y1[3] = tp1 - z4 - face / 2;
                y1[4] = tp1 - z4 - face / 2;
                y1[5] = tp1 - z4 - face / 2;
                y1[6] = tp1 - z4 - face / 2;
                y1[7] = tp1 - z4 - face / 2;
                nx1 = 5;
                nx2 = 0;
                x9[0] = x1[3];
                y9[0] = y1[3];
                x9[1] = x1[3] - zz2;
                y9[1] = y1[3] - z4;
                x9[2] = -gap / 2;
                y9[2] = y1[2];
                x9[3] = -gap / 2;
                y9[3] = -tp1 - face / 2 - 2 * z4;
                double x77 = (x9[0] + x1[2]) / 2.0D;
                double y77 = (y9[1] + y9[3]) / 3.0D;
                x9[4] = (int) x77;
                y9[4] = (int) y77;
                x10[0] = -gap / 2;
                y10[0] = tp1;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            }
            if (vec[9] == 3) {
                int z1 = tp2 - c - face / 2;
                int z3 = c - face / 2;
                if (z1 < 0)
                    z1 = 0;
                if (z3 < 0)
                    z3 = 0;
                if (c > tp2)
                    c = tp2;
                double z2 = z1 * Math.tan(Math.PI * angle2 / 180.0D);
                int zz = (int) z2;
                double z4 = z3 * Math.tan(Math.PI * angle / 180.0D);
                int zz1 = (int) z4;
                x1[0] = -gap / 2 - 5 * s;
                x1[1] = -gap / 2 - zz;
                x1[2] = -gap / 2;
                x1[3] = -gap / 2;
                x1[4] = -gap / 2 - zz1;
                x1[5] = -gap / 2 - 5 * s;
                x1[6] = -gap / 2 - 5 * s;
                x1[7] = -gap / 2 - 5 * s;
                y1[0] = tp2 - c;
                y1[1] = tp2 - c;
                y1[2] = tp2 - c - z1;
                y1[3] = tp2 - c - z1 - face;
                y1[4] = -c;
                y1[5] = -c;
                y1[6] = -c;
                y1[7] = -c;
                nx1 = 6;
                nx2 = 0;
                //        for( int i = 0; i < 8; i++) {
                //            System.out.println(i + "  " + x1[i] + "  " + y1[i] );
                //     }
                x9[0] = x1[4];
                y9[0] = y1[4];
                x9[1] = x1[4] - zz1;
                y9[1] = y1[4] - z3;
                x9[2] = x1[1];
                y9[2] = y1[1];
                x9[3] = x1[1] - zz;
                y9[3] = y1[1] + z1;
                x9[4] = x1[3];
                y9[4] = y1[3];
                x9[5] = x1[3];
                y9[5] = y1[3] - 2 * z3;
                x9[6] = x1[2];
                y9[6] = y1[2];
                x9[7] = x1[2];
                y9[7] = y1[2] + 2 * z1;
                x9[9] = x9[2];
                y9[9] = y9[1];
                x9[10] = x1[2];
                y9[10] = y9[1];
                double x77 = (x9[0] + x1[3]) / 2.0D;
                double y77 = (y9[0] - z3);
                x9[8] = (int) x77;
                y9[8] = (int) y77;
                double x78 = (x9[2] + x9[6]) / 2.0D;
                double y78 = (y1[1] + z3);
                x9[11] = (int) x78;
                y9[11] = (int) y78;
                x10[0] = -gap / 2 - 4 * s;
                y10[0] = 0;
                x10[1] = tp2;
                x10[2] = -gap / 2;
                y10[2] = 0;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            }
            if (vec[9] == 4) {
                bue = true;
                int z4 = tp2 - face;
                double z5 = (z4 - r1) * Math.tan(Math.PI * angle / 180.0D);
                int zz2 = (int) z5;
                double zzr1 = (2 * r1) * Math.sin(Math.PI * angle / 180.0D);
                int zzr1i = (int) zzr1;
                zzr1i = r1;
                double zzr2 = (2 * r1) * Math.cos(Math.PI * angle / 180.0D);
                int zzr2i = (int) zzr2;
                zzr2i = r1;
                if (zzr2i > zz2)
                    zzr2i = zz2;
                if (zzr1i > z4)
                    zzr1i = z4;
                x1[0] = -gap / 2 - 5 * s;
                x1[1] = -gap / 2;
                x1[2] = -gap / 2;
                x1[3] = -gap / 2;
                x1[4] = -gap / 2;
                x1[5] = -gap / 2;
                x1[6] = -gap / 2;
                x1[7] = -gap / 2;
                y1[0] = tp1 + face / 2;
                y1[1] = tp1 + face / 2;
                y1[2] = tp1 - face / 2;
                y1[3] = tp1 - face / 2;
                y1[4] = tp1 - face / 2;
                y1[5] = tp1 - face / 2;
                y1[6] = tp1 - face / 2;
                y1[7] = tp1 - face / 2;
                xcentrum = -gap / 2 - r1;
                ycentrum = -face / 2;
                x2[0] = -gap / 2 - 5 * s;
                x2[1] = -gap / 2 - zz2 - r1;
                x2[2] = -gap / 2 - zzr2i;
                x2[3] = -gap / 2 - zzr2i;
                x2[4] = -gap / 2 - zzr2i;
                x2[5] = -gap / 2 - zzr2i;
                x2[6] = -gap / 2 - zzr2i;
                x2[7] = -gap / 2 - zzr2i;
                y2[0] = tp1 - tp2 + face / 2;
                y2[1] = tp1 - tp2 + face / 2;
                y2[2] = tp1 - zzr1i - face / 2;
                y2[3] = tp1 - zzr1i - face / 2;
                y2[4] = tp1 - zzr1i - face / 2;
                y2[5] = tp1 - zzr1i - face / 2;
                y2[6] = tp1 - zzr1i - face / 2;
                y2[7] = tp1 - zzr1i - face / 2;
                nx1 = 4;
                nx2 = 0;
                x9[0] = x2[1];
                y9[0] = y2[1];
                x9[1] = x2[1] - -x2[1] + x2[2];
                y9[1] = y2[1] - -y2[1] + y2[2];
                x9[2] = x1[2];
                y9[2] = y1[2];
                x9[3] = x9[2];
                y9[3] = y1[2] - z4 - 2 * zzr2i;
                x9[4] = x9[0];
                y9[4] = y9[0];
                x9[5] = x1[2];
                y9[5] = y9[0];
                double x79 = (x9[0] + x1[2]) / 2.0D;
                double y79 = (y9[0] - 2 * zzr2i);
                x9[6] = (int) x79;
                y9[6] = (int) y79;
                x10[0] = -gap / 2 - 4 * s;
                y10[0] = -tp1 / 2;
                x10[1] = tp2;
                x10[2] = -gap / 2;
                y10[2] = tp1;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
            }
            if (vec[9] == 5) {
                bue = true;
                int z4 = c - face / 2;
                double z5 = (z4 - r2) * Math.tan(Math.PI * angle / 180.0D);
                int zz2 = (int) z5;
                int z9i = tp2 - c - face / 2;
                double zd55 = (z9i - r1) * Math.tan(Math.PI * angle2 / 180.0D);
                int zi5 = (int) zd55;
                x1[0] = -gap / 2 - 5 * s;
                x1[1] = -gap / 2 - 5 * s;
                x1[2] = -gap / 2 - zz2 - r2;
                x1[3] = -gap / 2 - r2;
                x1[4] = -gap / 2 - r2;
                x1[5] = -gap / 2 - r2;
                x1[6] = -gap / 2 - r2;
                x1[7] = -gap / 2 - r2;
                y1[0] = tp1 + c - tp2;
                y1[1] = tp1 + c - tp2;
                y1[2] = tp1 + c - tp2;
                y1[3] = tp1 - face / 2 - r2;
                y1[4] = tp1 - face / 2 - r2;
                y1[5] = tp1 - face / 2 - r2;
                y1[6] = tp1 - face / 2 - r2;
                y1[7] = tp1 - face / 2 - r2;
                x1centrum = -gap / 2 - r2 / 2;
                y1centrum = face / 2 - r2 / 2;
                x2[0] = -gap / 2 - 5 * s;
                x2[1] = -gap / 2 - 5 * s;
                x2[2] = -gap / 2 - zi5 - r1;
                x2[3] = -gap / 2 - r1;
                x2[4] = -gap / 2 - r1;
                x2[5] = -gap / 2 - r1;
                x2[6] = -gap / 2 - r1;
                x2[7] = -gap / 2 - r1;
                y2[0] = tp1 + c;
                y2[1] = tp1 + c;
                y2[2] = tp1 + c;
                y2[3] = tp1 + face / 2 + r1;
                y2[4] = tp1 + face / 2 + r1;
                y2[5] = tp1 + face / 2 + r1;
                y2[6] = tp1 + face / 2 + r1;
                y2[7] = tp1 + face / 2 + r1;
                nx1 = 4;
                nx2 = 0;
                x3[0] = -gap / 2;
                x3[1] = -gap / 2;
                x3[2] = -gap / 2;
                x3[3] = -gap / 2;
                x3[4] = -gap / 2;
                x3[5] = -gap / 2;
                x3[6] = -gap / 2;
                x3[7] = -gap / 2;
                y3[0] = tp1 - face / 2;
                y3[1] = tp1 + face / 2;
                y3[2] = tp1 + face / 2;
                y3[3] = tp1 + face / 2;
                y3[4] = tp1 + face / 2;
                y3[5] = tp1 + face / 2;
                y3[6] = tp1 + face / 2;
                y3[7] = tp1 + face / 2;
                x12[10] = -gap / 2 - r1 / 2;
                y12[10] = -face / 2 + r1 / 2;
                //    x2centrum = -gap / 2 - r1 / 2;
                //     y2centrum = -face / 2 + r1 / 2;
                x9[0] = x1[3];
                y9[0] = y1[3];
                x9[1] = x1[3];
                x9[2] = x1[2];
                y9[2] = y1[2];
                x9[3] = x1[2] - -x1[2] + x1[3];
                y9[3] = y1[2] - -y1[2] + y1[3];
                x9[4] = x1[2];
                y9[4] = y1[2];
                x9[5] = x1[3];
                y9[5] = y1[2];
                y9[1] = y9[3];
                double x71 = (x1[3] + x1[2]) / 2.0D;
                double y71 = (y1[2] - 10);
                x9[6] = (int) x71;
                y9[6] = (int) y71;
                x10[0] = -gap / 2 - 4 * s;
                y10[0] = -tp1 / 2;
                x10[1] = tp2;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
                extraLine.add(0, new ExtraLine(x3[0], y3[0], x3[1], y3[1]));
                extraLine.add(0, new ExtraLine(x3[1], y3[1], x3[2], y3[2]));
                extraLine.add(0, new ExtraLine(x3[2], y3[2], x3[3], y3[3]));
                extraLine.add(0, new ExtraLine(x3[3], y3[3], x3[4], y3[4]));
                extraLine.add(0, new ExtraLine(x3[4], y3[4], x3[5], y3[5]));
                extraLine.add(0, new ExtraLine(x3[5], y3[5], x3[6], y3[6]));
                extraLine.add(0, new ExtraLine(x3[6], y3[6], x3[7], y3[7]));


            }
        }
        if (plotType.equals("butt")) {

            listImage = 1;

            int div = vec[2];
            facN = fac;

            if (vec[2] != 0 && vec[2] <= 40) {
                double facND = 40 * fac / div;
                facN = (int) facND;
            }


            facN = fac;    // nullstiller endring
//        System.out.println(facN + " "+ div);
            gap = facN * vec[0];
            tp1 = facN * vec[1];
            forvs = facN * vec[1];
            tp1 = 0;
            tp2 = facN * vec[2];
            angle = vec[3];
            r1 = facN * vec[4];
            angle2 = vec[5];
            r2 = facN * vec[6];
            face = facN * vec[7];
            c = facN * vec[8];
            y1[14] = vec[10];
            x1[13] = vec[11];
            gapR = facN * vec[12];
            forhs = facN * vec[13];
            tp1R = 0;
            tp2R = facN * vec[14];
            angleR1 = vec[15];
            r3 = facN * vec[16];
            angleR2 = vec[17];
            r4 = facN * vec[18];
            faceR = facN * vec[19];
            cR = facN * vec[20];
            index2 = vec[21];
            y1[14] = vec[22];
            x1[13] = vec[23];
            gang[0] = vec[24];
            gang[1] = vec[25];
            gang[2] = vec[26];
            gang[3] = vec[27];
            gang[4] = vec[28];
            gang[5] = vec[29];
            gang[6] = vec[30];
            gang[7] = vec[31];
            tabellType = vec[26];
            if (vec[9] == 1) {
                System.out.println("butt  1 " + vec[9]);
                int forskyvI = -tp2 / 2 - forvs + forhs;
                x1[0] = -gap / 2 - 5 * s;
                x1[1] = -gap / 2;
                x1[2] = -gap / 2;
                x1[3] = -gap / 2 - 5 * s;
                x1[4] = -gap / 2 - 5 * s;
                x1[5] = -gap / 2 - 5 * s;
                x1[6] = -gap / 2 - 5 * s;
                x1[7] = -gap / 2 - 5 * s;
                y1[0] = -tp1 / 2 - tp2 / 2 + forskyvI;
                y1[1] = -tp1 / 2 - tp2 / 2 + forskyvI;
                y1[2] = -tp1 / 2 + tp2 / 2 + forskyvI;
                y1[3] = -tp1 / 2 + tp2 / 2 + forskyvI;
                y1[4] = -tp1 / 2 + tp2 / 2 + forskyvI;
                y1[5] = -tp1 / 2 + tp2 / 2 + forskyvI;
                y1[6] = -tp1 / 2 + tp2 / 2 + forskyvI;
                y1[7] = -tp1 / 2 + tp2 / 2 + forskyvI;
                nx1 = 4;
                nx2 = 0;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            }
            if (vec[9] == 2) {
                int z4 = tp2 - face;
                double z5 = z4 * Math.tan(Math.PI * angle / 180.0D);
                int zz2 = (int) z5;
                int forskyvY = -face / 2 - forvs + forhs;
                x1[0] = -gap / 2 - 5 * s;
                x1[1] = -gap / 2;
                x1[2] = -gap / 2;
                x1[3] = -gap / 2 - zz2;
                x1[4] = -gap / 2 - 5 * s;
                x1[5] = -gap / 2 - 5 * s;
                x1[6] = -gap / 2 - 5 * s;
                x1[7] = -gap / 2 - 5 * s;
                y1[0] = tp1 + face / 2 + forskyvY;
                y1[1] = tp1 + face / 2 + forskyvY;
                y1[2] = tp1 - face / 2 + forskyvY;
                y1[3] = tp1 - z4 - face / 2 + forskyvY;
                y1[4] = tp1 - z4 - face / 2 + forskyvY;
                y1[5] = tp1 - z4 - face / 2 + forskyvY;
                y1[6] = tp1 - z4 - face / 2 + forskyvY;
                y1[7] = tp1 - z4 - face / 2 + forskyvY;
                nx1 = 5;
                nx2 = 0;
                x9[0] = x1[3];
                y9[0] = y1[3];
                x9[1] = x1[3] - zz2;
                y9[1] = y1[3] - z4;
                x9[2] = -gap / 2;
                y9[2] = y1[2];
                x9[3] = -gap / 2;
                y9[3] = -tp1 - face / 2 - 2 * z4;
                double x77 = (x9[0] + x1[2]) / 2.0D;
                double y77 = (y9[1] + y9[3]) / 3.0D;
                x9[4] = (int) x77;
                y9[4] = (int) y77;
                x10[2] = -gap / 2;
                y10[2] = tp1 + forskyvY;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            }
            if (vec[9] == 3) {  // X
                int z1 = tp2 - (tp2 - c) - face / 2;
                int z3 = c - face / 2;
                int z11 = tp2 - c - face / 2;
                double z2 = z1 * Math.tan(Math.PI * angle / 180.0D);
                int zz1 = (int) z2;
                int forskyvX = -forvs + forhs + -c;
                double z4 = z3 * Math.tan(Math.PI * angle2 / 180.0D);
                int zz = (int) z4;
                x1[0] = -gap / 2 - 5 * s;
                x1[1] = -gap / 2 - zz;
                x1[2] = -gap / 2;
                x1[3] = -gap / 2;
                x1[4] = -gap / 2 - zz1;
                x1[5] = -gap / 2 - 5 * s;
                x1[6] = -gap / 2 - 5 * s;
                x1[7] = -gap / 2 - 5 * s;
                y1[0] = c + forskyvX;
                y1[1] = c + forskyvX;
                y1[2] = c + forskyvX - z11;
                y1[3] = c + forskyvX - z11 - face;
                y1[4] = -(tp2 - c) + forskyvX;
                y1[5] = -(tp2 - c) + forskyvX;
                y1[6] = -(tp2 - c) + forskyvX;
                y1[7] = -(tp2 - c) + forskyvX;
                nx1 = 6;
                nx2 = 0;
                x9[0] = x1[4];
                y9[0] = y1[4];
                x9[1] = x1[4] - zz1;
                y9[1] = y1[4] - z3;
                x9[2] = x1[1];
                y9[2] = y1[1];
                x9[3] = x1[1] - zz;
                y9[3] = y1[1] + z11;
                x9[4] = x1[3];
                y9[4] = y1[3];
                x9[5] = x1[3];
                y9[5] = y1[3] - 2 * z3;
                x9[6] = x1[2];
                y9[6] = y1[2];
                x9[7] = x1[2];
                y9[7] = y1[2] + 2 * z11;
                x9[9] = x9[2];
                y9[9] = y9[1];
                x9[10] = x1[2];
                y9[10] = y9[1];
                double x77 = (x9[0] + x1[3]) / 2.0D;
                double y77 = (y9[0] - z3);
                x9[8] = (int) x77;
                y9[8] = (int) y77;
                double x78 = (x9[2] + x9[6]) / 2.0D;
                double y78 = (y1[1] + z3);
                x9[11] = (int) x78;
                y9[11] = (int) y78;
                x10[0] = -gap / 2 - 4 * s;
                y10[0] = tp1 + forskyvX;
                x10[1] = tp2;
                x10[2] = -gap / 2;
                y10[2] = tp1 + forskyvX;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));  // nederste linje
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            }
            if (vec[9] == 4) {
                bue = true;
                int z4 = tp2 - face;
                double z5 = (z4 - r1) * Math.tan(Math.PI * angle / 180.0D);
                int zz2 = (int) z5;
                double zzr1 = (2 * r1) * Math.sin(Math.PI * angle / 180.0D);
                int zzr1i = (int) zzr1;
                zzr1i = r1;
                double zzr2 = (2 * r1) * Math.cos(Math.PI * angle / 180.0D);
                int zzr2i = (int) zzr2;
                zzr2i = r1;
                int forskyvU = -face / 2 - forvs + forhs;
                if (zzr2i > zz2)
                    zzr2i = zz2;
                if (zzr1i > z4)
                    zzr1i = z4;
                x1[0] = -gap / 2 - 5 * s;
                x1[1] = -gap / 2;
                x1[2] = -gap / 2;
                x1[3] = -gap / 2;
                x1[4] = -gap / 2;
                x1[5] = -gap / 2;
                x1[6] = -gap / 2;
                x1[7] = -gap / 2;
                y1[0] = tp1 + face / 2 + forskyvU;
                y1[1] = tp1 + face / 2 + forskyvU;
                y1[2] = tp1 - face / 2 + forskyvU;
                y1[3] = tp1 - face / 2 + forskyvU;
                y1[4] = tp1 - face / 2 + forskyvU;
                y1[5] = tp1 - face / 2 + forskyvU;
                y1[6] = tp1 - face / 2 + forskyvU;
                y1[7] = tp1 - face / 2 + forskyvU;
                x12[8] = -gap / 2 - r1 / 2;
                y12[8] = -face / 2 + forskyvU;
                //     xcentrum = -gap / 2 - r1 / 2;
                //     ycentrum = -face / 2 + forskyvU;
                x2[0] = -gap / 2 - 5 * s;
                x2[1] = -gap / 2 - zz2 - r1;
                x2[2] = -gap / 2 - zzr2i;
                x2[3] = -gap / 2 - zzr2i;
                x2[4] = -gap / 2 - zzr2i;
                x2[5] = -gap / 2 - zzr2i;
                x2[6] = -gap / 2 - zzr2i;
                x2[7] = -gap / 2 - zzr2i;
                y2[0] = tp1 - tp2 + face / 2 + forskyvU;
                y2[1] = tp1 - tp2 + face / 2 + forskyvU;
                y2[2] = tp1 - zzr1i - face / 2 + forskyvU;
                y2[3] = tp1 - zzr1i - face / 2 + forskyvU;
                y2[4] = tp1 - zzr1i - face / 2 + forskyvU;
                y2[5] = tp1 - zzr1i - face / 2 + forskyvU;
                y2[6] = tp1 - zzr1i - face / 2 + forskyvU;
                y2[7] = tp1 - zzr1i - face / 2 + forskyvU;
                nx1 = 4;
                nx2 = 0;
                x9[0] = x2[1];
                y9[0] = y2[1];
                x9[1] = x2[1] - -x2[1] + x2[2];
                y9[1] = y2[1] - -y2[1] + y2[2];
                x9[2] = x1[2];
                y9[2] = y1[2];
                x9[3] = x9[2];
                y9[3] = y1[2] - z4 - 2 * zzr2i;
                x9[4] = x9[0];
                y9[4] = y9[0];
                x9[5] = x1[2];
                y9[5] = y9[0];
                double x79 = (x9[0] + x1[2]) / 2.0D;
                double y79 = (y9[0] - 2 * zzr2i);
                x9[6] = (int) x79;
                y9[6] = (int) y79;
                x10[0] = -gap / 2 - 4 * s;
                y10[0] = -tp1 / 2;
                x10[1] = tp2;
                x10[2] = -gap / 2;
                y10[2] = tp1 - face / 2;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
            }
            if (vec[9] == 5) {
                bue = true;
                int z4 = tp2 - c - face / 2;
                double z5 = (z4 - r1) * Math.tan(Math.PI * angle / 180.0D);
                int zz2 = (int) z5;
                int forskyvDU = -(tp2 - c) - forvs + forhs;
                int zzr1i = r1;
                int zzr2i = r2;
                int z8i = tp2 - (tp2 - c) - face / 2;
                double zd5 = (z8i - r2) * Math.tan(Math.PI * angle2 / 180.0D);
                int zi5 = (int) zd5;
                x1[0] = -gap / 2 - 5 * s;
                x1[1] = -gap / 2 - 5 * s;
                x1[2] = -gap / 2 - zi5 - r2;
                x1[3] = -gap / 2 - r2;
                x1[4] = -gap / 2 - r2;
                x1[5] = -gap / 2 - r2;
                x1[6] = -gap / 2 - r2;
                x1[7] = -gap / 2 - r2;
                y1[0] = tp1 + (tp2 - c) - tp2 + forskyvDU;
                y1[1] = tp1 + (tp2 - c) - tp2 + forskyvDU;
                y1[2] = tp1 + (tp2 - c) - tp2 + forskyvDU;
                y1[3] = tp1 - face / 2 - r2 + forskyvDU;
                y1[4] = tp1 - face / 2 - r2 + forskyvDU;
                y1[5] = tp1 - face / 2 - r2 + forskyvDU;
                y1[6] = tp1 - face / 2 - r2 + forskyvDU;
                y1[7] = tp1 - face / 2 - r2 + forskyvDU;
                x12[9] = -gap / 2 - r2 / 2;
                y12[9] = face / 2 - r2 / 2 + forskyvDU;
                //       x1centrum = -gap / 2 - r2 / 2;
                //       y1centrum = face / 2 - r2 / 2 + forskyvDU;
                x2[0] = -gap / 2 - 5 * s;
                x2[1] = -gap / 2 - 5 * s;
                x2[2] = -gap / 2 - zz2 - r1;
                x2[3] = -gap / 2 - r1;
                x2[4] = -gap / 2 - r1;
                x2[5] = -gap / 2 - r1;
                x2[6] = -gap / 2 - r1;
                x2[7] = -gap / 2 - r1;
                y2[0] = tp1 + (tp2 - c) + forskyvDU;
                y2[1] = tp1 + (tp2 - c) + forskyvDU;
                y2[2] = tp1 + (tp2 - c) + forskyvDU;
                y2[3] = tp1 + face / 2 + r1 + forskyvDU;
                y2[4] = tp1 + face / 2 + r1 + forskyvDU;
                y2[5] = tp1 + face / 2 + r1 + forskyvDU;
                y2[6] = tp1 + face / 2 + r1 + forskyvDU;
                y2[7] = tp1 + face / 2 + r1 + forskyvDU;
                nx1 = 4;
                nx2 = 0;
                x3[0] = -gap / 2;
                x3[1] = -gap / 2;
                x3[2] = -gap / 2;
                x3[3] = -gap / 2;
                x3[4] = -gap / 2;
                x3[5] = -gap / 2;
                x3[6] = -gap / 2;
                x3[7] = -gap / 2;
                y3[0] = tp1 - face / 2 + forskyvDU;
                y3[1] = tp1 + face / 2 + forskyvDU;
                y3[2] = tp1 + face / 2 + forskyvDU;
                y3[3] = tp1 + face / 2 + forskyvDU;
                y3[4] = tp1 + face / 2 + forskyvDU;
                y3[5] = tp1 + face / 2 + forskyvDU;
                y3[6] = tp1 + face / 2 + forskyvDU;
                y3[7] = tp1 + face / 2 + forskyvDU;
                x2centrum = -gap / 2 - r1 / 2;
                y2centrum = -face / 2 + r1 / 2 + forskyvDU;
                x2[10] = -gap / 2 - r1 / 2;
                y2[10] = -face / 2 + r1 / 2 + forskyvDU;
                x9[0] = x2[1];
                y9[0] = y2[1] + forskyvDU;
                x9[1] = x2[1] - -x2[1] + x2[2];
                y9[1] = y2[1] - -y2[1] + y2[2] + forskyvDU;
                x9[2] = x1[2];
                y9[2] = y1[2] + forskyvDU;
                x9[3] = x9[2];
                y9[3] = y1[2] - z4 - 2 * zzr2i + forskyvDU;
                x9[4] = x9[0];
                y9[4] = y9[0] + forskyvDU;
                x9[5] = x1[2];
                y9[5] = y9[0] + forskyvDU;
                double x79 = (x9[0] + x1[2]) / 2.0D;
                double y79 = (y9[0] - 2 * zzr2i + forskyvDU);
                x9[6] = (int) x79;
                y9[6] = (int) y79;
                x10[0] = -gap / 2 - 4 * s;
                y10[0] = -tp1 / 2 + forskyvDU;
                x10[1] = tp2;
                x10[2] = -gap / 2;
                y10[2] = tp1 + forskyvDU;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
                extraLine.add(0, new ExtraLine(x3[0], y3[0], x3[1], y3[1]));
                extraLine.add(0, new ExtraLine(x3[1], y3[1], x3[2], y3[2]));
                extraLine.add(0, new ExtraLine(x3[2], y3[2], x3[3], y3[3]));
                extraLine.add(0, new ExtraLine(x3[3], y3[3], x3[4], y3[4]));
                extraLine.add(0, new ExtraLine(x3[4], y3[4], x3[5], y3[5]));
                extraLine.add(0, new ExtraLine(x3[5], y3[5], x3[6], y3[6]));
                extraLine.add(0, new ExtraLine(x3[6], y3[6], x3[7], y3[7]));
            }
            if (index2 == 1) {  // høyre side
                int forskyvII = -tp2R / 2;
                x5[0] = gapR / 2 + 5 * s;
                x5[1] = gapR / 2;
                x5[2] = gapR / 2;
                x5[3] = gapR / 2 + 5 * s;
                x5[4] = gapR / 2 + 5 * s;
                x5[5] = gapR / 2 + 5 * s;
                x5[6] = gapR / 2 + 5 * s;
                x5[7] = gapR / 2 + 5 * s;
                y5[0] = tp2R / 2 + tp1R + forskyvII;
                y5[1] = tp2R / 2 + tp1R + forskyvII;
                y5[2] = -tp2R / 2 + tp1R + forskyvII;
                y5[3] = -tp2R / 2 + tp1R + forskyvII;
                y5[4] = -tp2R / 2 + tp1R + forskyvII;
                y5[5] = -tp2R / 2 + tp1R + forskyvII;
                y5[6] = -tp2R / 2 + tp1R + forskyvII;
                y5[7] = -tp2R / 2 + tp1R + forskyvII;

                extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[1], y5[1]));
                extraLine.add(0, new ExtraLine(x5[1], y5[1], x5[2], y5[2]));
                extraLine.add(0, new ExtraLine(x5[2], y5[2], x5[3], y5[3]));
                extraLine.add(0, new ExtraLine(x5[3], y5[3], x5[4], y5[4]));
                extraLine.add(0, new ExtraLine(x5[4], y5[4], x5[5], y5[5]));
                extraLine.add(0, new ExtraLine(x5[5], y5[5], x5[6], y5[6]));
                extraLine.add(0, new ExtraLine(x5[6], y5[6], x5[7], y5[7]));

            }
            if (index2 == 2) {
                double xxc = (tp2R - faceR) / Math.tan(Math.PI * (90 - angleR1) / 180.0D);
                int xxci = (int) xxc;
                int forskyvYY = -faceR / 2;
                x5[0] = gapR / 2 + 5 * s;
                x5[1] = gapR / 2;
                x5[2] = gapR / 2;
                x5[3] = gapR / 2 + xxci;
                x5[4] = gapR / 2 + 5 * s;
                x5[5] = gapR / 2 + 5 * s;
                x5[6] = gapR / 2 + 5 * s;
                x5[7] = gapR / 2 + 5 * s;
                y5[0] = tp1R + faceR / 2 + forskyvYY;
                y5[1] = tp1R + faceR / 2 + forskyvYY;
                y5[2] = tp1R - faceR / 2 + forskyvYY;
                y5[3] = tp1R + faceR / 2 - tp2R + forskyvYY;
                y5[4] = tp1R + faceR / 2 - tp2R + forskyvYY;
                y5[5] = tp1R + faceR / 2 - tp2R + forskyvYY;
                y5[6] = tp1R + faceR / 2 - tp2R + forskyvYY;
                y5[7] = tp1R + faceR / 2 - tp2R + forskyvYY;
                extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[1], y5[1]));
                extraLine.add(0, new ExtraLine(x5[1], y5[1], x5[2], y5[2]));
                extraLine.add(0, new ExtraLine(x5[2], y5[2], x5[3], y5[3]));
                extraLine.add(0, new ExtraLine(x5[3], y5[3], x5[4], y5[4]));
                extraLine.add(0, new ExtraLine(x5[4], y5[4], x5[5], y5[5]));
                extraLine.add(0, new ExtraLine(x5[5], y5[5], x5[6], y5[6]));
                extraLine.add(0, new ExtraLine(x5[6], y5[6], x5[7], y5[7]));
            }
            if (index2 == 3) {
                double xx2d = (c - faceR / 2) * Math.tan(Math.PI * angleR2 / 180.0D);
                int xx2i = (int) xx2d;
                double xx3d = (tp2R - cR - faceR / 2) * Math.tan(Math.PI * angleR1 / 180.0D);
                int xx3i = (int) xx3d;
                int forskyvXX = -cR;
                x5[0] = gapR / 2 + 5 * s;
                x5[1] = gapR / 2 + xx2i;
                x5[2] = gapR / 2;
                x5[3] = gapR / 2;
                x5[4] = gapR / 2 + xx3i;
                x5[5] = gapR / 2 + 5 * s;
                x5[6] = gapR / 2 + 5 * s;
                x5[7] = gapR / 2 + 5 * s;
                y5[0] = tp1R + cR + forskyvXX;
                y5[1] = tp1R + cR + forskyvXX;
                y5[2] = tp1R + faceR / 2 + forskyvXX;
                y5[3] = tp1R - faceR / 2 + forskyvXX;
                y5[4] = tp1R + cR - tp2R + forskyvXX;
                y5[5] = tp1R + cR - tp2R + forskyvXX;
                y5[6] = tp1R + cR - tp2R + forskyvXX;
                y5[7] = tp1R + cR - tp2R + forskyvXX;
                extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[1], y5[1]));
                extraLine.add(0, new ExtraLine(x5[1], y5[1], x5[2], y5[2]));
                extraLine.add(0, new ExtraLine(x5[2], y5[2], x5[3], y5[3]));
                extraLine.add(0, new ExtraLine(x5[3], y5[3], x5[4], y5[4]));
                extraLine.add(0, new ExtraLine(x5[4], y5[4], x5[5], y5[5]));
                extraLine.add(0, new ExtraLine(x5[5], y5[5], x5[6], y5[6]));
                extraLine.add(0, new ExtraLine(x5[6], y5[6], x5[7], y5[7]));
            }
            if (index2 == 4) {
                int z4R = tp2R - faceR;
                double z5R = z4R * Math.tan(Math.PI * angleR1 / 180.0D);
                int zz2R = (int) z5R;
                double zzr1R = (2 * r3) * Math.sin(Math.PI * angleR1 / 180.0D);
                int zzr1iR = (int) zzr1R;
                double zzr2R = (2 * r3) * Math.cos(Math.PI * angleR1 / 180.0D);
                int zzr2iR = (int) zzr2R;
                int forskyvUU = -faceR / 2;
                if (zzr2iR > zz2R)
                    zzr2iR = zz2R;
                if (zzr1iR > z4R)
                    zzr1iR = z4R;
                zzr2iR = r3;
                zzr2iR = r2;
                x5[0] = gapR / 2 + 5 * s;
                x5[1] = gapR / 2;
                x5[2] = gapR / 2;
                x5[3] = gapR / 2;
                x5[4] = gapR / 2;
                x5[5] = gapR / 2;
                x5[6] = gapR / 2;
                x5[7] = gapR / 2;
                y5[0] = tp1R + faceR / 2 + forskyvUU;
                y5[1] = tp1R + faceR / 2 + forskyvUU;
                y5[2] = tp1R - faceR / 2 + forskyvUU;
                y5[3] = tp1R - faceR / 2 + forskyvUU;
                y5[4] = tp1R - faceR / 2 + forskyvUU;
                y5[5] = tp1R - faceR / 2 + forskyvUU;
                y5[6] = tp1R - faceR / 2 + forskyvUU;
                y5[7] = tp1R - faceR / 2 + forskyvUU;
                x6[0] = gapR / 2 + 5 * s;
                x6[1] = gapR / 2 + zz2R;
                x6[2] = gapR / 2 + zzr2iR;
                x6[3] = gapR / 2 + zzr2iR;
                x6[4] = gapR / 2 + zzr2iR;
                x6[5] = gapR / 2 + zzr2iR;
                x6[6] = gapR / 2 + zzr2iR;
                x6[7] = gapR / 2 + zzr2iR;
                y6[0] = tp1R + faceR / 2 - tp2R + forskyvUU;
                y6[1] = tp1R + faceR / 2 - tp2R + forskyvUU;
                y6[2] = tp1R - faceR / 2 - zzr1iR + forskyvUU;
                y6[3] = tp1R - faceR / 2 - zzr1iR + forskyvUU;
                y6[4] = tp1R - faceR / 2 - zzr1iR + forskyvUU;
                y6[5] = tp1R - faceR / 2 - zzr1iR + forskyvUU;
                y6[6] = tp1R - faceR / 2 - zzr1iR + forskyvUU;
                y6[7] = tp1R - faceR / 2 - zzr1iR + forskyvUU;
                x12[13] = gapR / 2 + zzr2iR / 2;
                y12[13] = -faceR / 2 + forskyvUU;
                xRUcentrum = gapR / 2 + zzr2iR / 2;
                yRUcentrum = -faceR / 2 + forskyvUU;
                extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[1], y5[1]));
                extraLine.add(0, new ExtraLine(x5[1], y5[1], x5[2], y5[2]));
                extraLine.add(0, new ExtraLine(x5[2], y5[2], x5[3], y5[3]));
                extraLine.add(0, new ExtraLine(x5[3], y5[3], x5[4], y5[4]));
                extraLine.add(0, new ExtraLine(x5[4], y5[4], x5[5], y5[5]));
                extraLine.add(0, new ExtraLine(x5[5], y5[5], x5[6], y5[6]));
                extraLine.add(0, new ExtraLine(x5[6], y5[6], x5[7], y5[7]));
                extraLine.add(0, new ExtraLine(x6[0], y6[0], x6[1], y6[1]));
                extraLine.add(0, new ExtraLine(x6[1], y6[1], x6[2], y6[2]));
                extraLine.add(0, new ExtraLine(x6[2], y6[2], x6[3], y6[3]));
                extraLine.add(0, new ExtraLine(x6[3], y6[3], x6[4], y6[4]));
                extraLine.add(0, new ExtraLine(x6[4], y6[4], x6[5], y6[5]));
                extraLine.add(0, new ExtraLine(x6[5], y6[5], x6[6], y6[6]));
                extraLine.add(0, new ExtraLine(x6[6], y6[6], x6[7], y6[7]));
            }
            if (index2 == 5) {
                int z4R = tp2R - cR - faceR / 2;
                double z5R = (z4R - r3) * Math.tan(Math.PI * angleR1 / 180.0D);
                int zz2R = (int) z5R;
                int z8R = cR - faceR / 2;
                double z6R = (cR - faceR / 2 - r4) * Math.tan(Math.PI * angleR2 / 180.0D);
                int zz6R = (int) z6R;
                int forskyvDUDU = -cR;
                x5[0] = gapR / 2 + 5 * s;
                x5[1] = gapR / 2 + zz6R + r4;
                x5[2] = gapR / 2 + r4;
                x5[3] = gapR / 2 + r4;
                x5[4] = gapR / 2 + r4;
                x5[5] = gapR / 2 + r4;
                x5[6] = gapR / 2 + r4;
                x5[7] = gapR / 2 + r4;
                y5[0] = tp1R + cR + forskyvDUDU;
                y5[1] = tp1R + cR + forskyvDUDU;
                y5[2] = tp1R + faceR / 2 + r4 + forskyvDUDU;
                y5[3] = tp1R + faceR / 2 + r4 + forskyvDUDU;
                y5[4] = tp1R + faceR / 2 + r4 + forskyvDUDU;
                y5[5] = tp1R + faceR / 2 + r4 + forskyvDUDU;
                y5[6] = tp1R + faceR / 2 + r4 + forskyvDUDU;
                y5[7] = tp1R + faceR / 2 + r4 + forskyvDUDU;
                x12[12] = gapR / 2 + r4 / 2;
                y12[12] = faceR / 2 + forskyvDUDU;
                xRDU1centrum = gapR / 2 + r4 / 2;
                yRDU1centrum = faceR / 2 + forskyvDUDU;
                x6[0] = gapR / 2 + 5 * s;
                x6[1] = gapR / 2 + zz2R + r3;
                x6[2] = gapR / 2 + r3;
                x6[3] = gapR / 2 + r3;
                x6[4] = gapR / 2 + r3;
                x6[5] = gapR / 2 + r3;
                x6[6] = gapR / 2 + r3;
                x6[7] = gapR / 2 + r3;
                y6[0] = tp1R + cR - tp2R + forskyvDUDU;
                y6[1] = tp1R + cR - tp2R + forskyvDUDU;
                y6[2] = tp1R - faceR / 2 - r3 + forskyvDUDU;
                y6[3] = tp1R - faceR / 2 - r3 + forskyvDUDU;
                y6[4] = tp1R - faceR / 2 - r3 + forskyvDUDU;
                y6[5] = tp1R - faceR / 2 - r3 + forskyvDUDU;
                y6[6] = tp1R - faceR / 2 - r3 + forskyvDUDU;
                y6[7] = tp1R - faceR / 2 - r3 + forskyvDUDU;
                x12[14] = gapR / 2 + r3 / 2;
                x12[14] = -faceR / 2 + forskyvDUDU;
                xRDUcentrum = gapR / 2 + r3 / 2;
                yRDUcentrum = -faceR / 2 + forskyvDUDU;
                x7[0] = gapR / 2;
                x7[1] = gapR / 2;
                x7[2] = gapR / 2;
                x7[3] = gapR / 2;
                x7[4] = gapR / 2;
                x7[5] = gapR / 2;
                x7[6] = gapR / 2;
                x7[7] = gapR / 2;
                y7[0] = tp1R - faceR / 2 + forskyvDUDU;
                y7[1] = tp1R + faceR / 2 + forskyvDUDU;
                y7[2] = tp1R + faceR / 2 + forskyvDUDU;
                y7[3] = tp1R + faceR / 2 + forskyvDUDU;
                y7[4] = tp1R + faceR / 2 + forskyvDUDU;
                y7[5] = tp1R + faceR / 2 + forskyvDUDU;
                y7[6] = tp1R + faceR / 2 + forskyvDUDU;
                y7[7] = tp1R + faceR / 2 + forskyvDUDU;
                extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[1], y5[1]));
                extraLine.add(0, new ExtraLine(x5[1], y5[1], x5[2], y5[2]));
                extraLine.add(0, new ExtraLine(x5[2], y5[2], x5[3], y5[3]));
                extraLine.add(0, new ExtraLine(x5[3], y5[3], x5[4], y5[4]));
                extraLine.add(0, new ExtraLine(x5[4], y5[4], x5[5], y5[5]));
                extraLine.add(0, new ExtraLine(x5[5], y5[5], x5[6], y5[6]));
                extraLine.add(0, new ExtraLine(x5[6], y5[6], x5[7], y5[7]));
                extraLine.add(0, new ExtraLine(x6[0], y6[0], x6[1], y6[1]));
                extraLine.add(0, new ExtraLine(x6[1], y6[1], x6[2], y6[2]));
                extraLine.add(0, new ExtraLine(x6[2], y6[2], x6[3], y6[3]));
                extraLine.add(0, new ExtraLine(x6[3], y6[3], x6[4], y6[4]));
                extraLine.add(0, new ExtraLine(x6[4], y6[4], x6[5], y6[5]));
                extraLine.add(0, new ExtraLine(x6[5], y6[5], x6[6], y6[6]));
                extraLine.add(0, new ExtraLine(x6[6], y6[6], x6[7], y6[7]));
                extraLine.add(0, new ExtraLine(x7[0], y7[0], x7[1], y7[1]));
                extraLine.add(0, new ExtraLine(x7[1], y7[1], x7[2], y7[2]));
                extraLine.add(0, new ExtraLine(x7[2], y7[2], x7[3], y7[3]));
                extraLine.add(0, new ExtraLine(x7[3], y7[3], x7[4], y7[4]));
                extraLine.add(0, new ExtraLine(x7[4], y7[4], x7[5], y7[5]));
                extraLine.add(0, new ExtraLine(x7[5], y7[5], x7[6], y7[6]));
                extraLine.add(0, new ExtraLine(x7[6], y7[6], x7[7], y7[7]));
            }
        }
            if (plotType.equals("Cross joint")) {
                if (vec[0] == 0)
                    vec[20] = 0;
                if (vec[0] == 1)
                    vec[20] = 8;
                if (vec[0] == 2)
                    vec[20] = 10;
                if (vec[0] == 3)
                    vec[20] = 12;
                if (vec[0] == 4)
                    vec[20] = 16;
                if (vec[0] == 5)
                    vec[20] = 20;
                if (vec[0] == 6)
                    vec[20] = 25;
                if (vec[0] == 7)
                    vec[20] = 32;
                if (vec[2] == 0)
                    vec[21] = 0;
                if (vec[2] == 1)
                    vec[21] = 8;
                if (vec[2] == 2)
                    vec[21] = 10;
                if (vec[2] == 3)
                    vec[21] = 12;
                if (vec[2] == 4)
                    vec[21] = 16;
                if (vec[2] == 5)
                    vec[21] = 20;
                if (vec[2] == 6)
                    vec[21] = 25;
                if (vec[2] == 7)
                    vec[21] = 32;
                int dim = fac * vec[20];
                int dim2 = fac * vec[21];
                gang[0] = vec[6];
                gang[1] = vec[7];
                gang[2] = vec[8];
                gang[3] = vec[9];
                gang[4] = vec[10];
                gang[5] = vec[11];
                gang[6] = vec[12];
                gang[7] = vec[13];
                tabellType = vec[26];

                x1[13] = vec[3];
                y1[14] = vec[4];
                x1[0] = -4 * s;
                x1[1] = -dim2 / 2;
                x1[2] = -dim2 / 2;
                x1[3] = -4 * s;
                x1[4] = -4 * s;
                x1[5] = -dim2 / 2;
                x1[6] = -dim2 / 2;
                x1[7] = -4 * s;
                nx2 = 5;
                y1[0] = dim / 2;
                y1[1] = dim / 2;
                y1[2] = -dim / 2;
                y1[3] = -dim / 2;
                y1[4] = 1;
                y1[5] = 1;
                y1[6] = -1;
                y1[7] = -1;
                x4[0] = dim2 / 2;
                x4[1] = 4 * s;
                x4[2] = 4 * s;
                x4[3] = dim2 / 2;
                x4[4] = dim2 / 2;
                x4[5] = 4 * s;
                x4[6] = 4 * s;
                x4[7] = dim2 / 2;
                nx2 = 5;
                y4[0] = dim / 2;
                y4[1] = dim / 2;
                y4[2] = -dim / 2;
                y4[3] = -dim / 2;
                y4[4] = 1;
                y4[5] = 1;
                y4[6] = -1;
                y4[7] = -1;
                x2[0] = -dim2 / 2;
                x2[1] = -dim2 / 2;
                x2[2] = -1;
                x2[3] = -1;
                x2[4] = 1;
                x2[5] = 1;
                x2[6] = dim2 / 2;
                x2[7] = dim2 / 2;
                nx2 = 5;
                y2[0] = 3 * s;
                y2[1] = -3 * s;
                y2[2] = -3 * s;
                y2[3] = 3 * s;
                y2[4] = 3 * s;
                y2[5] = -3 * s;
                y2[6] = -3 * s;
                y2[7] = 3 * s;
                x3[0] = -4 * s;
                x3[1] = 4 * s;
                x3[2] = 4 * s;
                x3[3] = -4 * s;
                x3[4] = -4 * s;
                x3[5] = 4 * s;
                x3[6] = 4 * s;
                x3[7] = -4 * s;
                nx2 = 5;
                y3[0] = -4 * s + dim / 2;
                y3[1] = -4 * s + dim / 2;
                y3[2] = -4 * s - dim / 2;
                y3[3] = -4 * s - dim / 2;
                y3[4] = -4 * s + 1;
                y3[5] = -4 * s + 1;
                y3[6] = -4 * s - 1;
                y3[7] = -4 * s - 1;
                x8[0] = -dim2 / 2;
                x8[1] = dim2 / 2;
                x8[2] = 0;
                x8[3] = 0;
                x8[4] = 0;
                x8[5] = 0;
                x8[6] = 0;
                x8[7] = 0;
                nx2 = 5;
                y8[0] = -4 * s - dim2;
                y8[1] = -4 * s - dim2;
                y8[2] = -4 * s - dim / 2 - dim2;
                y8[3] = -4 * s - dim / 2 - dim2 / 2;
                y8[4] = -4 * s;
                y8[5] = -4 * s + 1;
                y8[6] = -4 * s - 1;
                y8[7] = -4 * s - 1;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
                extraLine.add(0, new ExtraLine(x3[0], y3[0], x3[1], y3[1]));
                extraLine.add(0, new ExtraLine(x3[1], y3[1], x3[2], y3[2]));
                extraLine.add(0, new ExtraLine(x3[2], y3[2], x3[3], y3[3]));
                extraLine.add(0, new ExtraLine(x3[3], y3[3], x3[4], y3[4]));
                extraLine.add(0, new ExtraLine(x3[4], y3[4], x3[5], y3[5]));
                extraLine.add(0, new ExtraLine(x3[5], y3[5], x3[6], y3[6]));
                extraLine.add(0, new ExtraLine(x3[6], y3[6], x3[7], y3[7]));
                extraLine.add(0, new ExtraLine(x4[0], y4[0], x4[1], y4[1]));
                extraLine.add(0, new ExtraLine(x4[1], y4[1], x4[2], y4[2]));
                extraLine.add(0, new ExtraLine(x4[2], y4[2], x4[3], y4[3]));
                extraLine.add(0, new ExtraLine(x4[3], y4[3], x4[4], y4[4]));
                extraLine.add(0, new ExtraLine(x4[4], y4[4], x4[5], y4[5]));
                extraLine.add(0, new ExtraLine(x4[5], y4[5], x4[6], y4[6]));
                extraLine.add(0, new ExtraLine(x4[6], y4[6], x4[7], y4[7]));
            }
            if (plotType.equals("Lap joint")) {
                listImage = 1;
                if (vec[0] == 0)
                    vec[20] = 0;
                if (vec[0] == 1)
                    vec[20] = 8;
                if (vec[0] == 2)
                    vec[20] = 10;
                if (vec[0] == 3)
                    vec[20] = 12;
                if (vec[0] == 4)
                    vec[20] = 16;
                if (vec[0] == 5)
                    vec[20] = 20;
                if (vec[0] == 6)
                    vec[20] = 25;
                if (vec[0] == 7)
                    vec[20] = 32;
                if (vec[2] == 0)
                    vec[21] = 0;
                if (vec[2] == 1)
                    vec[21] = 8;
                if (vec[2] == 2)
                    vec[21] = 10;
                if (vec[2] == 3)
                    vec[21] = 12;
                if (vec[2] == 4)
                    vec[21] = 16;
                if (vec[2] == 5)
                    vec[21] = 20;
                if (vec[2] == 6)
                    vec[21] = 25;
                if (vec[2] == 7)
                    vec[21] = 32;
                int dim = fac * vec[20];
                int dim2 = fac * vec[21];
                gang[0] = vec[6];
                gang[1] = vec[7];
                gang[2] = vec[8];
                gang[3] = vec[9];
                gang[4] = vec[10];
                gang[5] = vec[11];
                gang[6] = vec[12];
                gang[7] = vec[13];
                tabellType = vec[26];
                double dimd = 0.3D * (vec[10] + vec[11]) / 2.0D + 1.0D;
                int dimi = (int) dimd;
                vec[12] = dimi;
                dimi = fac * dimi;
                dimi = 0;
                x1[13] = vec[3];
                y1[14] = vec[4];
                x1[0] = -4 * s;
                x1[1] = 4 * s;
                x1[2] = 4 * s;
                x1[3] = -4 * s;
                x1[4] = -4 * s;
                x1[5] = 4 * s;
                x1[6] = 4 * s;
                x1[7] = -4 * s;
                nx2 = 5;
                y1[0] = dim / 2;
                y1[1] = dim / 2;
                y1[2] = -dim / 2;
                y1[3] = -dim / 2;
                y1[4] = 1;
                y1[5] = 1;
                y1[6] = -1;
                y1[7] = -1;
                x2[0] = -6 * s;
                x2[1] = 2 * s;
                x2[2] = 2 * s;
                x2[3] = -6 * s;
                x2[4] = -6 * s;
                x2[5] = 2 * s;
                x2[6] = 2 * s;
                x2[7] = -6 * s;
                nx2 = 5;
                y2[0] = dim2 + dim / 2 + dimi;
                y2[1] = dim2 + dim / 2 + dimi;
                y2[2] = dim / 2 + dimi;
                y2[3] = dim / 2 + dimi;
                y2[4] = dim2 / 2 + dim / 2 + dimi - 1;
                y2[5] = dim2 / 2 + dim / 2 + dimi - 1;
                y2[6] = dim2 / 2 + dim / 2 + dimi + 1;
                y2[7] = dim2 / 2 + dim / 2 + dimi + 1;
                x8[0] = -dim2 / 2;
                x8[1] = dim2 / 2;
                x8[2] = 0;
                x8[3] = -dim / 2;
                x8[4] = dim / 2;
                x8[5] = 0;
                x8[6] = 0;
                x8[7] = 0;
                nx2 = 5;
                y8[0] = -3 * s;
                y8[1] = -3 * s;
                y8[2] = -3 * s - dim / 2;
                y8[3] = -3 * s - dim / 2 - dim + dim / 2;
                y8[4] = -3 * s - dim - dim;
                y8[5] = -3 * s + 1;
                y8[6] = -3 * s - 1;
                y8[7] = -3 * s + dim2 / 2;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));


            }
            if (plotType.equals("On plate")) {
                listImage = 1;
                if (vec[0] == 0)
                    vec[20] = 0;
                if (vec[0] == 1)
                    vec[20] = 8;
                if (vec[0] == 2)
                    vec[20] = 10;
                if (vec[0] == 3)
                    vec[20] = 12;
                if (vec[0] == 4)
                    vec[20] = 16;
                if (vec[0] == 5)
                    vec[20] = 20;
                if (vec[0] == 6)
                    vec[20] = 25;
                if (vec[0] == 7)
                    vec[20] = 32;
                if (vec[2] == 0)
                    vec[21] = 0;
                if (vec[2] == 1)
                    vec[21] = 8;
                if (vec[2] == 2)
                    vec[21] = 10;
                if (vec[2] == 3)
                    vec[21] = 12;
                if (vec[2] == 4)
                    vec[21] = 16;
                if (vec[2] == 5)
                    vec[21] = 20;
                if (vec[2] == 6)
                    vec[21] = 25;
                if (vec[2] == 7)
                    vec[21] = 32;
                int dim = fac * vec[20];
                int dim2 = fac * vec[21];
                gang[0] = vec[6];
                gang[1] = vec[7];
                gang[2] = vec[8];
                gang[3] = vec[9];
                gang[4] = vec[10];
                gang[5] = vec[11];
                gang[6] = vec[12];
                gang[7] = vec[13];
                tabellType = vec[26];
                x1[13] = vec[3];
                y1[14] = vec[4];
                x1[0] = -5 * s;
                x1[1] = 5 * s;
                x1[2] = 5 * s;
                x1[3] = -5 * s;
                x1[4] = -5 * s;
                x1[5] = -5 * s;
                x1[6] = -5 * s;
                x1[7] = -5 * s;
                nx2 = 5;
                y1[0] = 2 * s + dim2;
                y1[1] = 2 * s + dim2;
                y1[2] = 2 * s;
                y1[3] = 2 * s;
                y1[4] = 2 * s + dim2;
                y1[5] = 2 * s + dim2;
                y1[6] = 2 * s + dim2;
                y1[7] = 2 * s + dim2;
                x2[0] = -dim / 2;
                x2[1] = -dim / 2;
                x2[2] = -1;
                x2[3] = -1;
                x2[4] = 1;
                x2[5] = 1;
                x2[6] = dim / 2;
                x2[7] = dim / 2;
                nx2 = 5;
                y2[0] = 2 * s;
                y2[1] = -4 * s;
                y2[2] = -4 * s;
                y2[3] = 2 * s;
                y2[4] = 2 * s;
                y2[5] = -4 * s;
                y2[6] = -4 * s;
                y2[7] = 2 * s;
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            }


            if (plotType.equals("Tube on plate")) {
                listImage = 1;
                if (vec[0] == 0)
                    vec[20] = 0;
                if (vec[0] == 1)
                    vec[20] = 8;
                if (vec[0] == 2)
                    vec[20] = 10;
                if (vec[0] == 3)
                    vec[20] = 12;
                if (vec[0] == 4)
                    vec[20] = 16;
                if (vec[0] == 5)
                    vec[20] = 20;
                if (vec[0] == 6)
                    vec[20] = 25;
                if (vec[0] == 7)
                    vec[20] = 32;
                if (vec[2] == 0)
                    vec[21] = 0;
                if (vec[2] == 1)
                    vec[21] = 8;
                if (vec[2] == 2)
                    vec[21] = 10;
                if (vec[2] == 3)
                    vec[21] = 12;
                if (vec[2] == 4)
                    vec[21] = 16;
                if (vec[2] == 5)
                    vec[21] = 20;
                if (vec[2] == 6)
                    vec[21] = 25;
                if (vec[2] == 7)
                    vec[21] = 32;
                if (vec[5] == 0)
                    vec[23] = 0;
                if (vec[5] == 1)
                    vec[23] = 8;
                if (vec[5] == 2)
                    vec[23] = 10;
                if (vec[5] == 3)
                    vec[23] = 12;
                if (vec[5] == 4)
                    vec[23] = 16;
                if (vec[5] == 5)
                    vec[23] = 20;
                if (vec[5] == 6)
                    vec[23] = 25;
                if (vec[5] == 7)
                    vec[23] = 32;
                int dim = fac * vec[20];
                int dim2 = fac * vec[21];
                int dim3 = fac * vec[23];
                gang[0] = vec[6];
                gang[1] = vec[7];
                gang[2] = vec[8];
                gang[3] = vec[9];
                gang[4] = vec[10];
                gang[5] = vec[11];
                gang[6] = vec[12];
                gang[7] = vec[13];
                tabellType = vec[26];
                x1[13] = vec[3];
                y1[14] = vec[4];
                x1[0] = -5 * s;
                x1[1] = 5 * s;
                x1[2] = 5 * s;
                x1[3] = -5 * s;
                x1[4] = -5 * s;
                x1[5] = -5 * s;
                x1[6] = -5 * s;
                x1[7] = -5 * s;
                nx2 = 5;
                y1[0] = 2 * s + dim2;
                y1[1] = 2 * s + dim2;
                y1[2] = 2 * s;
                y1[3] = 2 * s;
                y1[4] = 2 * s + dim2;
                y1[5] = 2 * s + dim2;
                y1[6] = 2 * s + dim2;
                y1[7] = 2 * s + dim2;
                x2[0] = -dim;
                x2[1] = -dim;
                x2[2] = -dim + dim3;
                x2[3] = -dim + dim3;
                x2[4] = dim;
                x2[5] = dim;
                x2[6] = dim - dim3;
                x2[7] = dim - dim3;
                nx2 = 5;
                y2[0] = 2 * s;
                y2[1] = -3 * s;
                y2[2] = 2 * s;
                y2[3] = -3 * s;
                y2[4] = 2 * s;
                y2[5] = -3 * s;
                y2[6] = 2 * s;
                y2[7] = -3 * s;
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));

                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[7], y2[7]));
                //       extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));

                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2])); // gjentas ikke
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            }
            if (plotType.equals("Tube on plate 45 degrees")) {
                listImage = 1;
                if (vec[0] == 0)
                    vec[20] = 0;
                if (vec[0] == 1)
                    vec[20] = 8;
                if (vec[0] == 2)
                    vec[20] = 10;
                if (vec[0] == 3)
                    vec[20] = 12;
                if (vec[0] == 4)
                    vec[20] = 16;
                if (vec[0] == 5)
                    vec[20] = 20;
                if (vec[0] == 6)
                    vec[20] = 25;
                if (vec[0] == 7)
                    vec[20] = 32;
                if (vec[2] == 0)
                    vec[21] = 0;
                if (vec[2] == 1)
                    vec[21] = 8;
                if (vec[2] == 2)
                    vec[21] = 10;
                if (vec[2] == 3)
                    vec[21] = 12;
                if (vec[2] == 4)
                    vec[21] = 16;
                if (vec[2] == 5)
                    vec[21] = 20;
                if (vec[2] == 6)
                    vec[21] = 25;
                if (vec[2] == 7)
                    vec[21] = 32;
                if (vec[5] == 0)
                    vec[23] = 0;
                if (vec[5] == 1)
                    vec[23] = 8;
                if (vec[5] == 2)
                    vec[23] = 10;
                if (vec[5] == 3)
                    vec[23] = 12;
                if (vec[5] == 4)
                    vec[23] = 16;
                if (vec[5] == 5)
                    vec[23] = 20;
                if (vec[5] == 6)
                    vec[23] = 25;
                if (vec[5] == 7)
                    vec[23] = 32;
                int dim = fac * vec[20];
                int dim2 = fac * vec[21];
                int dim3 = fac * vec[23];
                gang[0] = vec[6];
                gang[1] = vec[7];
                gang[2] = vec[8];
                gang[3] = vec[9];
                gang[4] = vec[10];
                gang[5] = vec[11];
                gang[6] = vec[12];
                gang[7] = vec[13];
                tabellType = vec[26];
                x1[13] = vec[3];
                y1[14] = vec[4];
                x1[0] = -5 * s;
                x1[1] = 5 * s;
                x1[2] = 5 * s;
                x1[3] = -5 * s;
                x1[4] = -5 * s;
                x1[5] = -5 * s;
                x1[6] = -5 * s;
                x1[7] = -5 * s;
                nx2 = 5;
                y1[0] = 2 * s + dim2;
                y1[1] = 2 * s + dim2;
                y1[2] = 2 * s;
                y1[3] = 2 * s;
                y1[4] = 2 * s + dim2;
                y1[5] = 2 * s + dim2;
                y1[6] = 2 * s + dim2;
                y1[7] = 2 * s + dim2;
                x2[0] = -dim;
                x2[1] = -dim + 5 * s;
                x2[2] = -dim + dim3;
                x2[3] = -dim + dim3 + 5 * s;
                x2[4] = dim;
                x2[5] = dim + 5 * s;
                x2[6] = dim - dim3;
                x2[7] = dim - dim3 + 5 * s;
                nx2 = 5;
                y2[0] = 2 * s;
                y2[1] = -3 * s;
                y2[2] = 2 * s;
                y2[3] = -3 * s;
                y2[4] = 2 * s;
                y2[5] = -3 * s;
                y2[6] = 2 * s;
                y2[7] = -3 * s;
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));

                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[7], y2[7]));
                //       extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));

                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2])); // gjentas ikke
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            }

            if (plotType.equals("Bolt joint")) {
                listImage = 1;
                if (vec[0] == 0)
                    vec[20] = 0;
                if (vec[0] == 1)
                    vec[20] = 8;
                if (vec[0] == 2)
                    vec[20] = 10;
                if (vec[0] == 3)
                    vec[20] = 12;
                if (vec[0] == 4)
                    vec[20] = 16;
                if (vec[0] == 5)
                    vec[20] = 20;
                if (vec[0] == 6)
                    vec[20] = 25;
                if (vec[0] == 7)
                    vec[20] = 32;
                if (vec[2] == 0)
                    vec[21] = 0;
                if (vec[2] == 1)
                    vec[21] = 8;
                if (vec[2] == 2)
                    vec[21] = 10;
                if (vec[2] == 3)
                    vec[21] = 12;
                if (vec[2] == 4)
                    vec[21] = 16;
                if (vec[2] == 5)
                    vec[21] = 20;
                if (vec[2] == 6)
                    vec[21] = 25;
                if (vec[2] == 7)
                    vec[21] = 32;
                int dim = fac * vec[20];
                int dim2 = fac * vec[21];
                gang[0] = vec[6];
                gang[1] = vec[7];
                gang[2] = vec[8];
                gang[3] = vec[9];
                gang[4] = vec[10];
                gang[5] = vec[11];
                gang[6] = vec[12];
                gang[7] = vec[13];
                tabellType = vec[26];
                x1[13] = vec[3];
                y1[14] = vec[4];
                x1[0] = -5 * s;
                x1[1] = 5 * s;
                x1[2] = 5 * s;
                x1[3] = -5 * s;
                x1[4] = -5 * s;
                x1[5] = -5 * s;
                x1[6] = -5 * s;
                x1[7] = -5 * s;
                nx2 = 5;
                y1[0] = 2 * s + dim2;
                y1[1] = 2 * s + dim2;
                y1[2] = 2 * s;
                y1[3] = 2 * s;
                y1[4] = 2 * s + dim2;
                y1[5] = 2 * s + dim2;
                y1[6] = 2 * s + dim2;
                y1[7] = 2 * s + dim2;
                x2[0] = -dim / 2;
                x2[1] = -dim / 2;
                x2[2] = -dim;
                x2[3] = -dim;
                x2[4] = dim;
                x2[5] = dim;
                x2[6] = dim / 2;
                x2[7] = dim / 2;
                nx2 = 5;
                y2[0] = 2 * s;
                y2[1] = -4 * s + dim;
                y2[2] = -4 * s + dim;
                y2[3] = -4 * s;
                y2[4] = -4 * s;
                y2[5] = -4 * s + dim;
                y2[6] = -4 * s + dim;
                y2[7] = 2 * s;
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[5]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2])); // gjentas ikke
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
            }
            if (plotType.equals("Strap joint")) {
                listImage = 1;
                if (vec[0] == 0)
                    vec[20] = 0;
                if (vec[0] == 1)
                    vec[20] = 8;
                if (vec[0] == 2)
                    vec[20] = 10;
                if (vec[0] == 3)
                    vec[20] = 12;
                if (vec[0] == 4)
                    vec[20] = 16;
                if (vec[0] == 5)
                    vec[20] = 20;
                if (vec[0] == 6)
                    vec[20] = 25;
                if (vec[0] == 7)
                    vec[20] = 32;
                if (vec[2] == 0)
                    vec[21] = 0;
                if (vec[2] == 1)
                    vec[21] = 8;
                if (vec[2] == 2)
                    vec[21] = 10;
                if (vec[2] == 3)
                    vec[21] = 12;
                if (vec[2] == 4)
                    vec[21] = 16;
                if (vec[2] == 5)
                    vec[21] = 20;
                if (vec[2] == 6)
                    vec[21] = 25;
                if (vec[2] == 7)
                    vec[21] = 32;
                if (vec[5] == 0)
                    vec[23] = 0;
                if (vec[5] == 1)
                    vec[23] = 8;
                if (vec[5] == 2)
                    vec[23] = 10;
                if (vec[5] == 3)
                    vec[23] = 12;
                if (vec[5] == 4)
                    vec[23] = 16;
                if (vec[5] == 5)
                    vec[23] = 20;
                if (vec[5] == 6)
                    vec[23] = 25;
                if (vec[5] == 7)
                    vec[23] = 32;
                int dim = fac * vec[20];
                int dim2 = fac * vec[21];
                gang[0] = vec[6];
                gang[1] = vec[7];
                gang[2] = vec[8];
                gang[3] = vec[9];
                gang[4] = vec[10];
                gang[5] = vec[11];
                gang[6] = vec[12];
                gang[7] = vec[13];
                tabellType = vec[26];
                int dim3 = fac * vec[23];
                double dimd = 0.3D * (vec[20] + vec[21] + vec[23]) / 3.0D + 1.0D;
                int dimi = (int) dimd;
                vec[22] = dimi;
                dimi = fac * dimi;
                dimi = 0;
                x1[13] = vec[3];
                y1[14] = vec[4];
                x1[0] = -4 * s;
                x1[1] = 4 * s;
                x1[2] = 4 * s;
                x1[3] = -4 * s;
                x1[4] = -4 * s;
                x1[5] = 4 * s;
                x1[6] = 4 * s;
                x1[7] = -4 * s;
                nx2 = 5;
                y1[0] = dim / 2;
                y1[1] = dim / 2;
                y1[2] = -dim / 2;
                y1[3] = -dim / 2;
                y1[4] = 1;
                y1[5] = 1;
                y1[6] = -1;
                y1[7] = -1;
                x2[0] = -5 * s;
                x2[1] = 5 * s;
                x2[2] = 5 * s;
                x2[3] = -5 * s;
                x2[4] = -5 * s;
                x2[5] = 5 * s;
                x2[6] = 5 * s;
                x2[7] = -5 * s;
                nx2 = 5;
                y2[0] = dim2 + dim / 2 + dimi;
                y2[1] = dim2 + dim / 2 + dimi;
                y2[2] = dim / 2 + dimi;
                y2[3] = dim / 2 + dimi;
                y2[4] = dim2 / 2 + dim / 2 + dimi - 1;
                y2[5] = dim2 / 2 + dim / 2 + dimi - 1;
                y2[6] = dim2 / 2 + dim / 2 + dimi + 1;
                y2[7] = dim2 / 2 + dim / 2 + dimi + 1;
                x3[0] = -4 * s;
                x3[1] = 4 * s;
                x3[2] = 4 * s;
                x3[3] = -4 * s;
                x3[4] = -4 * s;
                x3[5] = 4 * s;
                x3[6] = 4 * s;
                x3[7] = -4 * s;
                nx2 = 5;
                y3[0] = dim2 + dim / 2 + dim3 + 2 * dimi;
                y3[1] = dim2 + dim / 2 + dim3 + 2 * dimi;
                y3[2] = dim2 + dim / 2 + 2 * dimi;
                y3[3] = dim2 + dim / 2 + 2 * dimi;
                y3[4] = dim2 + dim / 2 + dim3 / 2 + 2 * dimi - 1;
                y3[5] = dim2 + dim / 2 + dim3 / 2 + 2 * dimi - 1;
                y3[6] = dim2 + dim / 2 + dim3 / 2 + 2 * dimi + 1;
                y3[7] = dim2 + dim / 2 + dim3 / 2 + 2 * dimi + 1;
                x8[0] = -dim2 / 2;
                x8[1] = dim2 / 2;
                x8[2] = 0;
                x8[3] = -dim / 2;
                x8[4] = dim / 2;
                x8[5] = 0;
                x8[6] = -dim3 / 2;
                x8[7] = dim3 / 2;
                nx2 = 5;
                y8[0] = -4 * s - dim / 2;
                y8[1] = -4 * s - dim / 2;
                y8[2] = -4 * s - dim / 2 - dim / 2;
                y8[3] = -4 * s - dim / 2 - dim + dim / 2 - dim / 2;
                y8[4] = -4 * s - dim - dim - dim / 2;
                y8[5] = -4 * s + dim2 + dim3 / 2 + dimi - dim / 2;
                y8[6] = -4 * s + dim2 - dim / 2;
                y8[7] = -4 * s + dim2 / 2 - dim / 2;
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[1], y1[1]));
                extraLine.add(0, new ExtraLine(x1[1], y1[1], x1[2], y1[2]));
                extraLine.add(0, new ExtraLine(x1[2], y1[2], x1[3], y1[3]));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[4], y1[4]));
                extraLine.add(0, new ExtraLine(x1[4], y1[4], x1[5], y1[5]));
                extraLine.add(0, new ExtraLine(x1[5], y1[5], x1[6], y1[6]));
                extraLine.add(0, new ExtraLine(x1[6], y1[6], x1[7], y1[7]));
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
                extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
                extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
                extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
                extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
                extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
                extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));
                extraLine.add(0, new ExtraLine(x3[0], y3[0], x3[1], y3[1]));
                extraLine.add(0, new ExtraLine(x3[1], y3[1], x3[2], y3[2]));
                extraLine.add(0, new ExtraLine(x3[2], y3[2], x3[3], y3[3]));
                extraLine.add(0, new ExtraLine(x3[3], y3[3], x3[4], y3[4]));
                extraLine.add(0, new ExtraLine(x3[4], y3[4], x3[5], y3[5]));
                extraLine.add(0, new ExtraLine(x3[5], y3[5], x3[6], y3[6]));
                extraLine.add(0, new ExtraLine(x3[6], y3[6], x3[7], y3[7]));
            }

        }


    /**
     *
     * Generate object for the texting given by the user
     *
     * @param plotType
     */
    public void transformTeksting(String plotType){
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        if (teksting) {
            int tranX = 0;
            int tranY = 0;
            if ( gang[2] == 11 ) {
                tranX = 600;
                tranY = 100;
            }
            if ( gang[2] == 15 ) {
                tranX = 100;
                tranY = 500;
            }

            int xst = -xP + 120 + tranX;
            int yst = -yP + 90 + tranY;
            int ystep = 30;
            int xstep = 80;  // 60
            int hstep = 30;
            int tsteg = 15;

            int xBase1 = xst-2;
            int xBase2 = xBase1 + xstep + tsteg;
            int xBase3 = xBase2 + ystep;
            int xBase4 = xBase3 + 2*ystep;
            int xBase5 = xBase4 + 2*ystep;
            int xBase6 = xBase5 + 2*ystep;
            int xBase7 = xBase6 + 2*ystep;
            int xBase8 = xBase7 + 2*ystep;
            int xBase9 = xBase8 + 2*ystep;
            int yBase0 = yst-12 ;
            int yBase1 = yBase0 + hstep;
            int yBase2 = yBase1 + hstep;
            int yBase3 = yBase2 + hstep;
            int yBase4 = yBase3 + hstep;
            int yBase5 = yBase4 + hstep;
            int yBase6 = yBase5 + hstep;
            int yBase7 = yBase6 + hstep;
            int yBase8 = yBase7 + hstep;
            int yBase9 = yBase8 + hstep;
            int yBase10 = yBase9 + hstep;

            if (plotType.equals("overlap")) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));


                extraText.add(0, new ExtraText("Gap "     , xst, yst+ tsteg ));
                extraText.add(0, new ExtraText("Plate 1 " , xst, yst + ystep + tsteg));
                extraText.add(0, new ExtraText("Plate 2 " , xst, yst + 2*ystep+ tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[0]))).toString(), xst + xstep + tsteg, yst + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[2]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + tsteg          ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep+ tsteg ));

            }
            if (plotType.equals("butt") || plotType.equals("Butt")) {

                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));

                extraText.add(0, new ExtraText("Left side: "     , xst, yst-ystep+ tsteg ));
                extraText.add(0, new ExtraText("Gap "     , xst, yst+ tsteg ));
                extraText.add(0, new ExtraText("Dy " , xst, yst + ystep + tsteg ));
                extraText.add(0, new ExtraText("Plate 1 " , xst, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[0]))).toString(), xst + xstep+ tsteg, yst + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[2]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst  + tsteg         ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg  ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg ));
                if (vec[9] == 2) {
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));

                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));

                    extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Face " , xst, yst + 4*ystep + tsteg ));

                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));

                    extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
                }

                if (vec[9] == 3) {

                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase7   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase7   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase7  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase7  ));


                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));

                    extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText("Angle2 " , xst, yst + 4*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Face "     , xst, yst + 5*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Center " , xst, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[5]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[8]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
                    extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
                }
                if (vec[9] == 4) {

                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase6   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase6   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase6  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase6  ));


                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));

                    extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Radius 1 " , xst, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText("Face "     , xst, yst + 5*ystep + tsteg));

                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[4]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));

                    extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));

                }
                if (vec[9] == 5) {
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase9   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase9   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase9  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase9  ));


                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase9,   xBase4 ,  yBase9  ));

                    extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText("Radius 1 " , xst, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText("Angle 2 "     , xst, yst + 5*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Radius 2 "     , xst, yst + 6*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Face" , xst, yst + 7*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Center "     , xst, yst + 8*ystep + tsteg ));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[4]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[5]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 7*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[8]))).toString(), xst + xstep+ tsteg, yst + 8*ystep + tsteg));
                    extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg ));
                    extraText.add(0, new ExtraText("° ", xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 7*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 8*ystep + tsteg ));
                }
            }
            if (plotType.equals("filet") || plotType.equals("fillet")  ) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase4   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase4    ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase4  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase4  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));

                extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg ));
                extraText.add(0, new ExtraText("Angle " , xst, yst + ystep + tsteg ));
                extraText.add(0, new ExtraText("Plate 1 " , xst, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText("Plate 2 " , xst, yst + 3*ystep + tsteg ));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[0]))).toString(), xst + xstep+ tsteg, yst + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[4]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[5]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst     + tsteg      ));
                extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));

                if (vec[12] == 2) {

                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase1,   yBase6   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase4,   xBase2,   yBase6   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase4,   xBase3,   yBase6  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase4,   xBase4,   yBase6  ));

                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));

                    extraText.add(0, new ExtraText("Angle 2 "     , xst, yst +4*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Face " , xst, yst + 5*ystep + tsteg));

                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst +4*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[10]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));

                    extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst   +4*ystep    + tsteg    ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));

                }
                if (vec[12] == 3) {
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase8   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase8   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase8  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase8  ));


                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));

                    extraText.add(0, new ExtraText("Face "     , xst, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText("Angle 2" , xst, yst + 5*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Angle 3 " , xst, yst + 6*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Center " , xst, yst + 7*ystep + tsteg ));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[10]))).toString(), xst + xstep+ tsteg, yst  + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[8]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[11]))).toString(), xst + xstep+ tsteg, yst + 7*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 4*ystep    + tsteg    ));
                    extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst +  5*ystep + tsteg ));
                    extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 7*ystep + tsteg));
                }
                if (vec[12] == 4) {
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase7   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase7   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase7  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase7  ));


                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));

                    extraText.add(0, new ExtraText("Angle 2 "     , xst, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText("Radius 1" , xst, yst + 5*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Face " , xst, yst + 6*ystep + tsteg));

                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst  + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[10]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));

                    extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst    + 4*ystep    + tsteg    ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  5*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));

                }
                if (vec[12] == 5) {
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase10   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase10   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase10  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase10  ));


                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase9,   xBase4 ,  yBase9  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase10,   xBase4 ,  yBase10  ));

                    extraText.add(0, new ExtraText("Angle 2 "     , xst, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText("Angle 3" , xst, yst + 5*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Radius 1" , xst, yst + 6*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Radius 2 "     , xst, yst + 7*ystep + tsteg));
                    extraText.add(0, new ExtraText("Face" , xst, yst + 8*ystep + tsteg));
                    extraText.add(0, new ExtraText("Center " , xst, yst + 9*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst  + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[8]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[7]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[9]))).toString(), xst + xstep+ tsteg, yst  + 7*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[10]))).toString(), xst + xstep+ tsteg, yst + 8*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[11]))).toString(), xst + xstep+ tsteg, yst + 9*ystep + tsteg));
                    extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst    + 4*ystep    + tsteg    ));
                    extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst +  5*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm"   , xst + xstep+ystep+ tsteg, yst    + 7*ystep    + tsteg    ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  8*ystep + tsteg  ));
                    extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 9*ystep + tsteg));
                }
            }
            if (plotType.equals("corner")) {
                int yjuster = -110;
                yjuster =0;

                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0 + yjuster,   xBase1,   yBase7 + yjuster  ));
                extraLineTabell.add(0, new ExtraLine(   xBase2 ,    yBase0+ yjuster,   xBase2,   yBase7 + yjuster    ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0+ yjuster,   xBase3,   yBase7 + yjuster ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0+ yjuster,   xBase4,   yBase7 + yjuster ));

                extraLineTabell.add(0, new ExtraLine(   xBase1,   yBase0+ yjuster,   xBase4 ,  yBase0 + yjuster));
                extraLineTabell.add(0, new ExtraLine(   xBase1 ,    yBase1+ yjuster,   xBase4,   yBase1 + yjuster  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase2+ yjuster,   xBase4,   yBase2 + yjuster  ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3+ yjuster,   xBase4 ,  yBase3 + yjuster ));
                extraLineTabell.add(0, new ExtraLine(   xBase1 ,    yBase4+ yjuster,   xBase4 ,  yBase4 + yjuster ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5+ yjuster,   xBase4 ,  yBase5 + yjuster ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6+ yjuster,   xBase4 ,  yBase6 + yjuster ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7+ yjuster,   xBase4 ,  yBase7 + yjuster ));

                yjuster = 0;   // -110;
                extraText.add(0, new ExtraText("Plate 1 "     , xst, yst + yjuster + tsteg ));
                extraText.add(0, new ExtraText("Plate 2 " , xst, yst + yjuster + ystep + tsteg ));
                extraText.add(0, new ExtraText("Angle " , xst, yst + yjuster + 2*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle L "     , xst, yst + yjuster + 3*ystep + tsteg));
                extraText.add(0, new ExtraText("Angle R " , xst, yst + yjuster + 4*ystep + tsteg));
                extraText.add(0, new ExtraText("dx Left " , xst, yst + yjuster + 5*ystep + tsteg ));
                extraText.add(0, new ExtraText("dx Right " , xst, yst + yjuster + 6*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[1]))).toString(), xst + xstep+ tsteg, yst + yjuster + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[2]))).toString(), xst + xstep+ tsteg, yst + ystep + yjuster + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[0]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + yjuster + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + yjuster + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[4]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + yjuster + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[5]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + yjuster + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[6]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + yjuster + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + yjuster    + tsteg       ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + yjuster  + tsteg));
                extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + yjuster + 2*ystep + tsteg));
                extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + yjuster   + 3*ystep     + tsteg   ));
                extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + yjuster +  4*ystep  + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + yjuster + 5*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + yjuster + 6*ystep + tsteg));

            }




            if (plotType.equals("butt")) {
                xst = -xP + 300 + tranX + tsteg/2;      // 560
                yst = -yP +90 + tranY;
                xBase1 = xst-2;
                xBase2 = xBase1 + xstep + tsteg;
                xBase3 = xBase2 + ystep;
                xBase4 = xBase3 + 2*ystep;
                xBase5 = xBase4 + 2*ystep;
                xBase6 = xBase5 + 2*ystep;
                xBase7 = xBase6 + 2*ystep;
                xBase8 = xBase7 + 2*ystep;
                xBase9 = xBase8 + 2*ystep;

                String v5 = "";
                if (vec[21] == 1) {
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                    extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
                    extraText.add(0, new ExtraText("Right side: "     , xst, yst-ystep + tsteg ));
                    extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg ));
                    extraText.add(0, new ExtraText("Dy " , xst, yst + ystep + tsteg));
                    extraText.add(0, new ExtraText("Plate 2 " , xst, yst + 2*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[12]))).toString(), xst + xstep+ tsteg, yst + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[13]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst     + tsteg      ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg));
                }
                if (vec[21] == 2) {
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                    extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));

                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraText.add(0, new ExtraText("Right side: "     , xst, yst-ystep + tsteg ));
                    extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg));
                    extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
                    extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg));
                    extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText("Face " , xst, yst + 4*ystep + tsteg ));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[19]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep    + tsteg    ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep  + tsteg));
                    extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
                }
                if (vec[21] == 3) {
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                    extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase7   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase7   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase7  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase7  ));


                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
                    extraText.add(0, new ExtraText("Right side: "     , xst, yst-ystep + tsteg ));
                    extraText.add(0, new ExtraText("Gap "     , xst, yst + 0*ystep + tsteg));
                    extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
                    extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg));
                    extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText("Angle 2 " , xst, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText("Face " , xst, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText("Center " , xst, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[17]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[19]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[20]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep   + tsteg     ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep  + tsteg));
                    extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
                }
                if (vec[21] == 4) {
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                    extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase6   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase6   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase6  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase6  ));


                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                    extraText.add(0, new ExtraText("Right side: "     , xst, yst-ystep + tsteg));
                    extraText.add(0, new ExtraText("Gap "     , xst, yst + 0*ystep + tsteg));
                    extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
                    extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText("Radius " , xst, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText("Face " , xst, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[16]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[19]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep  + tsteg      ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep + tsteg ));
                    extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg));
                }
                if (vec[21] == 5) {

                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                    extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase9   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase9   ));
                    extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase9  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase9  ));


                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));
                    extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase9,   xBase4 ,  yBase9  ));
                    extraText.add(0, new ExtraText("Right side: "     , xst, yst-ystep + tsteg));
                    extraText.add(0, new ExtraText("Gap "     , xst, yst + 0*ystep + tsteg));
                    extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
                    extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg));
                    extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText("Radius " , xst, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText("Angle 2 " , xst, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText("Radius 2 " , xst, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText("Face " , xst, yst + 7*ystep + tsteg ));
                    extraText.add(0, new ExtraText("Center " , xst, yst + 8*ystep + tsteg));
                    



                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[16]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[17]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[18]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[19]))).toString(), xst + xstep+ tsteg, yst + 7*ystep + tsteg));
                    extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[20]))).toString(), xst + xstep+ tsteg, yst + 8*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep   + tsteg     ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep + tsteg ));
                    extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
                    extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 7*ystep + tsteg ));
                    extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 8*ystep + tsteg ));
                }
            }
            if (plotType.equals("flanged")) {
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));
                extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
                extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
                extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));

                extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
                extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));

                extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg ));
                extraText.add(0, new ExtraText("Plate 1 " , xst, yst + ystep + tsteg ));
                extraText.add(0, new ExtraText("Radius " , xst, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[0]))).toString(), xst + xstep+ tsteg, yst + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[2]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + tsteg       ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
                extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg ));
            }
        }
        double scaler = y1[14] / 100.0D;


        /////////////////////////////////////////////////////////////////////////////////////////////////
        if (vec[9] == 5)
            x1[0] = x1[1];
// her tegnes planken som fillet står på opp
  //      for (int i = 0; i <8;i++){
   //         System.out.println(x1[i] + "   " + y1[i] +  "  " +  i);
   //     }
        if (plotType.equals("fillet")) {
            /*
            double angle = 45.0;
            double[] radius = new double[8];
            for (int u = 0; u<8; u++) {
                double value = x1[u]*x1[u] + y1[u]*y1[u];
                radius[u] = Math.sqrt(value);
                double valx =  radius[u] * Math.cos(angle);
                double valy =  radius[u] * Math.sin(angle);
                x1[u] = (int) valx;
                y1[u] = (int) valy;
            }

             */
            extraBase.add(0, new ExtraBase(x1[1], y1[1], x1[2], y1[2]));
            extraBase.add(0, new ExtraBase(x1[2], y1[2], x1[3], y1[3]));
            extraBase.add(0, new ExtraBase(x1[3], y1[3], x1[4], y1[4]));
            extraBase.add(0, new ExtraBase(x1[4], y1[4], x1[5], y1[5]));
            extraBase.add(0, new ExtraBase(x1[5], y1[5], x1[6], y1[6]));
            extraBase.add(0, new ExtraBase(x1[6], y1[6], x1[7], y1[7]));
        }
        if (plotType.equals("overlap") &&
                tegning) {
            int dd = vec[1]/3;
            int dd3 = vec[1];
            if (gap > 0) {
                extraLineTegn.add(0, new ExtraLine(x1[0] + dd, y1[0], x1[0] + 6 * dd, y1[0]));
                extraLineTegn.add(0, new ExtraLine(x1[0] + dd, y1[0] + gap, x1[0] + 6 * dd, y1[0] + gap));
                extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[0]))).toString(), x1[0] + 7 * dd, y1[0] + 2 * gap / 3));
                extraArrayTegn.add(0, new ExtraArray(x1[0] + 3 * dd, y1[0] - 3 * dd, x1[0] + 3 * dd, y1[0], 4, 4));
                extraArrayTegn.add(0, new ExtraArray(x1[0] + 3 * dd, y1[0] + gap + 3 * dd, x1[0] + 3 * dd, y1[0] + gap, 4, 4));
            }
        }
        if (plotType.equals("corner")) {

            if (tegning) {
                int dd = vec[1]/3;
                int dd3 = vec[1];
                int yjuster = 0;  // -110
                extraTallTegn.add(0,new ExtraTall(  vec[0]+"°",(x1[0] + x2[0])/2, y1[0] + yjuster +10*dd ));
                extraTallTegn.add(0,new ExtraTall(  (vec[0]+ vec[3] + vec[4])+"°",x2[1], y1[1] - 4*dd + yjuster + 9*dd ));
                extraTallTegn.add(0,new ExtraTall(  vec[3]+"°",(x1[2]- x1[1])*2, (y1[2] - y1[1])*2  + yjuster ));
                extraTallTegn.add(0,new ExtraTall(   vec[4]+"°",(x2[2]- x2[1])*2, (y1[2] - y1[1])*2 + yjuster ));
                double pod1 = (4 * dd) * Math.sin(Math.PI * ((90 - vec[1]) / 2) / 180.0D);
                int poi1 = (int)pod1;
                double pod3 = (4 * dd) * Math.cos(Math.PI * ((90 - vec[1]) / 2) / 180.0D);
                int poi3 = (int)pod3;
                double pod1x = dd * Math.sin(Math.PI * ((90 - vec[1]) / 2) / 180.0D);
                int poi1x = (int)pod1x;
                double pod3x = dd * Math.cos(Math.PI * ((90 - vec[1]) / 2) / 180.0D);
                int poi3x = (int)pod3x;
                extraLineTegn.add(0, new ExtraLine(x1[0] - poi1x, y1[0] + poi3x , x1[0] - poi1, y1[0] + poi3));
                extraLineTegn.add(0, new ExtraLine(x2[0] + poi1x, y2[0] + poi3x , x2[0] + poi1, y2[0]  + poi3));
                x11[12] = x1[0] - poi3;
                y11[12] = y1[0] + poi3 ;
                x11[13] = x2[0] + poi3;
                y11[13] = y2[0] + poi3 ;
                int ddd = 2 * poi3;
                if ( plotBue) {
                    extraBueTegn.add(0, new ExtraBue(x11[12], y11[12] + ddd / 8, (x11[12] + x11[13]) / 2, y11[12] + ddd, x11[13], y11[13] + ddd / 8));
                } else {
                    extraLineTegn.add(0, new ExtraLine(x11[12], y11[12] + ddd / 8,x11[12]+ddd/4, y11[12] + ddd / 4 ));
                    extraLineTegn.add(0, new ExtraLine(x11[13], y11[13] + ddd / 8,x11[13]- ddd/4, y11[13] + ddd / 4 ));
                }
                x11[14] = (x1[2] - x1[1]) * 4;
                y11[14] = (y1[2] - y1[1]) * 4 + yjuster;
                x11[13] = (x2[2] - x2[1]) * 4;
                y11[13] = (y2[2] - y2[1]) * 4  + yjuster;
                if ( plotBue) {
                    extraBueTegn.add(0, new ExtraBue(x11[14], y11[14] - ddd / 8, (x11[14] + x11[13]) / 2, y11[14] - ddd, x11[13], y11[13] - ddd / 8));
                } else {
                    extraLineTegn.add(0, new ExtraLine(x11[14], y11[14] - ddd / 8,x11[14] + ddd/4, y11[14] - ddd / 4 ));
                    extraLineTegn.add(0, new ExtraLine(x11[13], y11[13] - ddd / 8,x11[13]-ddd/4, y11[13] - ddd / 4 ));
                }
                double dxld = (fac * vec[5]) * Math.sin(Math.PI * (vec[0] / 2) / 180.0D);
                double dyld = (fac * vec[5]) * Math.cos(Math.PI * (vec[0] / 2) / 180.0D);
                int dxli = (int)dxld;
                int dyli = (int)dyld;
                extraLineTegn.add(0, new ExtraLine((x1[2] - x1[1]) * 2, (y1[2] - y1[1]) * 2  + yjuster, (x1[2] - x1[1]) * 4, (y1[2] - y1[1]) * 4  + yjuster));
                extraLineTegn.add(0, new ExtraLine((x2[2] - x2[1]) * 2, (y2[2] - y2[1]) * 2  + yjuster, (x2[2] - x2[1]) * 4, (y2[2] - y2[1]) * 4  + yjuster));
            }
        }
        if (plotType.equals("flanged")) {
            if (tegning) {
                extraTallTegn.add(0, new ExtraTall("r" + vec[2], x4[0] + 3 * vec[1], y4[0] + 2 * vec[1]));
                int dd = vec[1];
                if (gap > 0) {
                    extraLineTegn.add(0, new ExtraLine(x3[0], y3[0] - dd, x3[0], y3[0] - 6 * dd));
                    extraLineTegn.add(0, new ExtraLine(x4[0], y4[0] - dd, x4[0], y4[0] - 6 * dd));
                    extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[0]))).toString(), x3[0] + gap / 2, y3[0] - 7 * dd));
                    extraArrayTegn.add(0, new ExtraArray(x3[0] - 3 * dd, y3[0] - 4 * dd, x3[0], y3[0] - 4 * dd, 4, 4));
                    extraArrayTegn.add(0, new ExtraArray(x4[0] + 3 * dd, y4[0] - 4 * dd, x4[0], y4[0] - 4 * dd, 4, 4));
                }
            }
        }

        if (plotType.equals("fillet") || plotType.equals("filet")) {
            int angle = vec[1];
            int ddd = fac * vec[5];
            double xc = ddd * Math.cos(Math.PI * angle / 180.0D);
            double yc = ddd * Math.sin(Math.PI * angle / 180.0D);
            int xci = (int)xc;
            int yci = (int)yc;
            if ( !plotOK) {
                plotOK =  true;
            }
            String v1 = "1   ";
            extraTallBase.add(0, new ExtraTall(v1, x1[2] + 30, y1[2]));
            vec[1] = 90;   // sette inn endring for å skrive ut fast vinkel 90 grader.
            if (vec[12] == 1) {
                int dd = (fac * vec[5])/3;
                int dd3 = fac * vec[5];
                v1 = "2   ";
                extraTall.add(0, new ExtraTall(v1, x2[5], y2[6] + 20));
                if (tegning) {
                    extraTallTegn.add(0,new ExtraTall(  vec[1]+"°"  , x2[3]+ dd/2 ,  y2[3]- dd/2  ));
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(x2[1] - dd, y2[2], x2[1] - 2 * dd, y2[2]));
                        extraLineTegn.add(0, new ExtraLine(x2[1] - dd, y2[1] + gap, x2[1] - 2 * dd, y2[1] + gap));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(gap / 2))).toString(), x2[1] + dd/8 - 4 * s, y2[1] + dd / 3));
                        extraArrayTegn.add(0, new ExtraArray(x2[1] - 3 * dd / 2, y2[1] - dd / 2, x2[1] - 3 * dd / 2, y2[1], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x2[1] - 3 * dd / 2, y2[1] + gap + dd / 2, x2[1] - 3 * dd / 2, y2[1] + gap, 4, 4));
                    }
                    if (angle != 90 && angle != 0) {
                        double pod = dd * Math.tan(Math.PI * (90 - angle) / 180.0D);
                        int poi = (int)pod;
                        double pod0 = (dd / 4) * Math.tan(Math.PI * (90 - angle) / 180.0D);
                        int poi0 = (int)pod0;
                        extraLineTegn.add(0, new ExtraLine(x2[3] + dd / 4, y2[3] - dd / 4, x2[3] + dd / 4, y2[3] - dd));
                        extraLineTegn.add(0, new ExtraLine(x2[3] + dd / 4, y2[3] - dd / 4, x2[3] + dd, y2[3] - poi));
                    } else {
                        extraLineTegn.add(0, new ExtraLine(x2[3] + dd / 4, y2[3] - dd / 4, x2[3] + dd, y2[3] - dd / 4));
                        extraLineTegn.add(0, new ExtraLine(x2[3] + dd / 4, y2[3] - dd / 4, x2[3] + dd / 4, y2[3] - dd));
                    }
                    if (vec[2] > 0) {
                        extraTallTegn.add(0, new ExtraTall("a" + vec[2], x2[1] - dd / 2, y2[2] - dd / 4));
                    }
                    if (vec[3] > 0) {
                        extraTallTegn.add(0, new ExtraTall("a" + vec[3], x2[3] + dd / 2, y2[2] - dd / 4));
                    }
                }
            }
            if (vec[12] == 2) {
                int dd = (fac * vec[5])/3;
                int dd3 = fac * vec[5];
                v1 = "2   ";
                extraTall.add(0, new ExtraTall(v1, x2[7], y2[6] + 20));
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[7] + 5, y2[7]));
                if (tegning) {
                    double xnede = (x2[4] - y2[5] / 2);
                    int xnedei = (int)xnede;
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[6]) + "°", x2[4] + dd / 16, y2[4] - dd / 4));
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[1]) + "°", x2[5] + dd / 2, y2[5] - dd / 2));
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(x2[2] - 2 * dd, y2[3], x2[1] - 4 * dd, y2[3]));
                        extraLineTegn.add(0, new ExtraLine(x2[2] - 2 * dd, y2[3] + gap, x2[2] - 4 * dd, y2[3] + gap));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(gap / 2))).toString(), x2[2] - 2 * dd , y2[3] + dd / 4));
                        extraArrayTegn.add(0, new ExtraArray(x2[2] - 3 * dd, y2[3] - dd / 2, x2[1] - 3 * dd, y2[3], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x2[2] - 3 * dd, y2[3] + gap + dd / 2, x2[2] - 3 * dd, y2[3] + gap, 4, 4));
                    }
                    double pod1 = dd * Math.tan(Math.PI * vec[6] / 180.0D);
                    int poi1 = (int)pod1;
                    double pod10 = (dd / 4) * Math.tan(Math.PI * vec[6] / 180.0D);
                    int poi10 = (int)pod10;
                    extraLineTegn.add(0, new ExtraLine(x2[4] + dd / 4, y2[4] - poi10, x2[4] + dd, y2[4] - poi1));
                    if (angle != 90 && angle != 0) {
                        double pod = dd * Math.tan(Math.PI * (90 - angle) / 180.0D);
                        int poi = (int)pod;
                        double pod0 = (dd / 4) * Math.tan(Math.PI * (90 - angle) / 180.0D);
                        int poi0 = (int)pod0;
                        extraLineTegn.add(0, new ExtraLine(x2[5] + dd / 4, y2[5] - dd / 4, x2[5] + dd / 4, y2[5] - dd));
                        extraLineTegn.add(0, new ExtraLine(x2[5] + dd / 4, y2[5] - dd / 4, x2[5] + dd, y2[5] - poi));
                    } else {
                        extraLineTegn.add(0, new ExtraLine(x2[5] + dd / 4, y2[5] - dd / 4, x2[5] + dd, y2[5] - dd / 4));
                        extraLineTegn.add(0, new ExtraLine(x2[5] + dd / 4, y2[5] - dd / 4, x2[5] + dd / 4, y2[5] - dd));
                    }
                    if (face > 0) {
                        extraLineTegn.add(0, new ExtraLine(x2[3], y2[3] + gap + tp1 + dd / 2, x2[3], y2[3] + gap + tp1 + dd));
                        extraLineTegn.add(0, new ExtraLine(x2[2], y2[2] + gap + tp1 + dd / 2, x2[2], y2[2] + gap + tp1 + dd));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(face / 2))).toString(), x2[3] + dd / 16, y2[3] + gap + tp1 + 5*dd/4));
                        extraArrayTegn.add(0, new ExtraArray(x2[2] - dd / 2, y2[2] + gap + tp1 + 3 * dd / 4, x2[2], y2[2] + gap + tp1 + 3 * dd / 4, 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x2[3] + dd / 2, y2[3] + gap + tp1 + 3 * dd / 4, x2[3], y2[3] + gap + tp1 + 3 * dd / 4, 4, 4));
                    }
                    if (vec[2] > 0) {
                        extraTallTegn.add(0, new ExtraTall("a" + vec[2], x2[1] - dd / 2, y2[5] + dd));
                    }
                    if (vec[3] > 0) {
                        extraTallTegn.add(0, new ExtraTall("a" + vec[3], x2[3] + 3 * dd / 2, y2[5] + dd));
                    }
                }
            }
            if (vec[12] == 3) {
                v1 = "2   ";
                int dd = (fac * vec[5])/3;
                int dd3 = fac * vec[5];
                extraTall.add(0, new ExtraTall(v1, x2[4], y2[5] - 1 * dd3 / 2));
                extraLine.add(0, new ExtraLine(x2[7], y2[7], x2[7] - dd3 / 4, y2[7] + dd3 / 4));
                extraLine.add(0, new ExtraLine(x2[7] - dd3 / 4, y2[7] + dd3 / 4, x2[7] - dd3 / 2, y2[7]));
                extraLine.add(0, new ExtraLine(x2[7] - dd3 / 2, y2[7], x2[7] - 3 * dd3 / 4, y2[7] + dd3 / 4));
                extraLine.add(0, new ExtraLine(x2[7] - 3 * dd3 / 4, y2[7] + dd3 / 4, x2[0], y2[0]));
                if (tegning) {
                    double xnede = (x2[6] - y2[6] / 2);
                    int xnedei = (int)xnede;
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[8]) + "°", x2[2] - dd / 2, y2[4] - dd / 2));
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[6]) + "°", x2[5] + dd / 4, y2[5] - dd / 4));
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[1]) + "°", x2[6] + dd / 2, y2[6] - dd / 2));
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(x2[2] - 2 * dd, y2[3], x2[1] - 3 * dd, y2[3]));
                        extraLineTegn.add(0, new ExtraLine(x2[2] - 2 * dd, y2[3] + gap, x2[2] - 3 * dd, y2[3] + gap));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(gap / 2))).toString(), x2[2] - 2 * dd , y2[3] + dd / 3));
                        extraArrayTegn.add(0, new ExtraArray(x2[2] - 5 * dd / 2, y2[3] - dd / 2, x2[1] - 5 * dd / 2, y2[3], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x2[2] - 5 * dd / 2, y2[3] + gap + dd / 2, x2[2] - 5 * dd / 2, y2[3] + gap, 4, 4));
                    }
                    double pod1 = (dd / 2) * Math.tan(Math.PI * vec[6] / 180.0D);
                    int poi1 = (int)pod1;
                    double pod11 = (dd / 8) * Math.tan(Math.PI * vec[6] / 180.0D);
                    int poi11 = (int)pod11;
                    //        g2d.drawLine(x2[5] + dd / 8, y2[5] - poi11, x2[5] + dd / 2, y2[5] - poi1);
                    extraLineTegn.add(0, new ExtraLine(x2[5] + dd / 8, y2[5] - poi11, x2[5] + dd / 2, y2[5] - poi1));
                    double pod2 = (dd / 2) * Math.tan(Math.PI * vec[8] / 180.0D);
                    int poi2 = (int)pod2;
                    double pod22 = (dd / 8) * Math.tan(Math.PI * vec[8] / 180.0D);
                    int poi22 = (int)pod22;
                    extraLineTegn.add(0, new ExtraLine(x2[2] - dd / 8, y2[2] - poi22, x2[2] - dd / 2, y2[2] - poi2));
                    extraLineTegn.add(0, new ExtraLine(x2[3] + face / 2, y2[3], x2[3] + face / 2, y2[7] + dd / 16));
                    if (angle != 90 && angle != 0) {
                        double pod = dd * Math.tan(Math.PI * (90 - angle) / 180.0D);
                        int poi = (int)pod;
                        double pod0 = (dd / 4) * Math.tan(Math.PI * (90 - angle) / 180.0D);
                        int poi0 = (int)pod0;
                        extraLineTegn.add(0, new ExtraLine(x2[6] + dd / 4, y2[6] - dd / 4, x2[6] + dd / 4, y2[6] - dd));
                        extraLineTegn.add(0, new ExtraLine(x2[6] + dd / 4, y2[6] - dd / 4, x2[6] + dd, y2[6] - poi));
                    } else {
                        extraLineTegn.add(0, new ExtraLine(x2[6] + dd / 4, y2[6] - dd / 4, x2[6] + dd, y2[6] - dd / 4));
                        extraLineTegn.add(0, new ExtraLine(x2[6] + dd / 4, y2[6] - dd / 4, x2[6] + dd / 4, y2[6] - dd));
                    }
                    if (face > 0) {
                        extraLineTegn.add(0, new ExtraLine(x2[3], y2[3] + gap + tp1 + dd / 2, x2[3], y2[3] + gap + tp1 + dd));
                        extraLineTegn.add(0, new ExtraLine(x2[4], y2[4] + gap + tp1 + dd / 2, x2[4], y2[4] + gap + tp1 + dd));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(face / 2))).toString(), x2[3] + dd / 16, y2[3] + gap + tp1 + 5*dd/4));
                        extraArrayTegn.add(0, new ExtraArray(x2[3] - dd / 2, y2[3] + gap + tp1 + 3 * dd / 4, x2[3], y2[3] + gap + tp1 + 3 * dd / 4, 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x2[4] + dd / 2, y2[4] + gap + tp1 + 3 * dd / 4, x2[4], y2[3] + gap + tp1 + 3 * dd / 4, 4, 4));
                    }
                    if (vec[2] > 0) {
                        extraTallTegn.add(0, new ExtraTall("a" + vec[2], x2[1] - dd, y2[5] - dd / 4));
                    }
                    if (vec[3] > 0) {
                        extraTallTegn.add(0, new ExtraTall("a" + vec[3], x2[5] + dd, y2[5] - dd / 4));
                    }
                }
            }
            if (vec[12] == 4) {
                v1 = "2   ";
                int dd = (fac * vec[5])/3;
                int dd3 = fac * vec[5];
                extraTall.add(0, new ExtraTall(v1, x3[4] - dd3 / 2, y3[4] + dd3/4));
                extraLine.add(0, new ExtraLine(x3[3], y3[3], x3[3] - dd3 / 4, y3[3] + dd3 / 4));
                extraLine.add(0, new ExtraLine(x3[3] - dd3 / 4, y3[3] + dd3 / 4, x3[3] - dd3 / 2, y3[2]));
                extraLine.add(0, new ExtraLine(x3[3] - dd3 / 2, y3[3], x3[3] - 3 * dd3 / 4, y3[3] + dd3 / 4));
                extraLine.add(0, new ExtraLine(x3[3] - 3 * dd3 / 4, y3[3] + dd3 / 4, x2[0], y2[0]));
                if (tegning) {
                    double xnede = (x3[1] - y3[2] / 2);
                    int xnedei = (int)xnede;
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[1]) + "°", x3[3] + dd / 2, y3[3] - dd / 2));
                    extraTallTegn.add(0, new ExtraTall("r" + vec[7], x2[3] + dd / 16, y2[2] - dd / 4));
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[6]) + "°", x3[1] + dd / 16, y3[1] - dd / 8));
                    double pod1 = (dd / 2) * Math.tan(Math.PI * vec[6] / 180.0D);
                    int poi1 = (int)pod1;
                    double pod13 = (dd / 8) * Math.tan(Math.PI * vec[6] / 180.0D);
                    int poi13 = (int)pod13;
                    extraLineTegn.add(0, new ExtraLine(x3[1] + dd / 8, y3[1] - poi13, x3[1] + dd / 2, y3[1] - poi1));
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(x2[2] - 3 * dd, y2[2], x2[2] - 2 * dd, y2[2]));
                        extraLineTegn.add(0, new ExtraLine(x2[2] - 3 * dd, y2[2] + gap, x2[2] - 2 * dd, y2[2] + gap));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(gap / 2))).toString(), x2[2] - 4 * dd / 2, y2[2] + dd / 3));
                        extraArrayTegn.add(0, new ExtraArray(x2[2] - 5 * dd / 2, y2[2] - dd / 2, x2[2] - 5 * dd / 2, y2[2], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x2[2] - 5 * dd / 2, y2[2] + gap + dd / 2, x2[2] - 5 * dd / 2, y2[2] + gap, 4, 4));
                    }
                    if (angle != 90 && angle != 0) {
                        double pod = dd * Math.tan(Math.PI * (90 - angle) / 180.0D);
                        int poi = (int)pod;
                        double pod0 = (dd / 4) * Math.tan(Math.PI * (90 - angle) / 180.0D);
                        int poi0 = (int)pod0;
                        extraLineTegn.add(0, new ExtraLine(x3[3] + dd / 4, y3[3] - dd / 4, x3[3] + dd / 4, y3[3] - dd));
                        extraLineTegn.add(0, new ExtraLine(x3[3] + dd / 4, y3[3] - dd / 4, x3[3] + dd, y3[3] - poi));
                    } else {
                        extraLineTegn.add(0, new ExtraLine(x3[3] + dd / 4, y3[3] - dd / 4, x3[3] + dd, y3[3] - dd / 4));
                        extraLineTegn.add(0, new ExtraLine(x3[3] + dd / 4, y3[3] - dd / 4, x3[3] + dd / 4, y3[3] - dd));
                    }
                    if (face > 0) {
                        extraLineTegn.add(0, new ExtraLine(x2[3], y2[3] + gap + tp1 + dd / 2, x2[3], y2[3] + gap + tp1 + dd));
                        extraLineTegn.add(0, new ExtraLine(x2[2], y2[2] + gap + tp1 + dd / 2, x2[2], y2[2] + gap + tp1 + dd));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(face / 2))).toString(), x2[3] + dd / 16, y2[3] + gap + tp1 + 5*dd/4));
                        extraArrayTegn.add(0, new ExtraArray(x2[2] - dd / 2, y2[2] + gap + tp1 + 3 * dd / 4, x2[2], y2[2] + gap + tp1 + 3 * dd / 4, 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x2[3] + dd / 2, y2[3] + gap + tp1 + 3 * dd / 4, x2[3], y2[3] + gap + tp1 + 3 * dd / 4, 4, 4));
                    }
                    if (vec[2] > 0) {
                        extraTallTegn.add(0, new ExtraTall("a" + vec[2], x2[1] - dd / 2, y2[2] - dd / 4));
                    }
                    if (vec[3] > 0) {
                        extraTallTegn.add(0, new ExtraTall("a" + vec[3], x2[5] + 3 * dd / 2, y2[2] - dd / 4));
                    }
                }
            }
            if (vec[12] == 5) {
                v1 = "2   ";
                int dd = (fac * vec[5])/3;
                int dd3 = fac * vec[5];
                extraTall.add(0, new ExtraTall(v1, dd3 / 4, y3[0] + dd3/4));
                extraLine.add(0, new ExtraLine(x3[0], y3[0], x3[0] - dd3 / 4, y3[0] + dd3 / 4));
                extraLine.add(0, new ExtraLine(x3[0] - dd3 / 4, y3[0] + dd3 / 4, x3[0] - dd3 / 2, y3[0]));
                extraLine.add(0, new ExtraLine(x3[0] - dd3 / 2, y3[0], x3[0] - 3 * dd3 / 4, y3[0] + dd3 / 4));
                extraLine.add(0, new ExtraLine(x3[0] - 3 * dd3 / 4, y3[0] + dd3 / 4, x2[0], y2[0]));
                if (tegning) {
                    double xnede = (x3[2] - y3[1] / 2);
                    int xnedei = (int)xnede;
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[1]) + "°", x3[1] + dd / 2, y3[1] - dd / 2));
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[8]) + "°", x2[2] - dd / 2, y3[2] - dd / 2));
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[6]) + "°", x3[2] + dd / 8, y3[2] - dd / 2));
                    extraTallTegn.add(0, new ExtraTall("r" + vec[9], x4[1] + dd / 8, y4[1] - dd / 4));
                    extraTallTegn.add(0, new ExtraTall("r" + vec[7], x4[0] - dd / 4, y4[0] - dd / 4));
                    double pod1 = (dd / 2) * Math.tan(Math.PI * vec[6] / 180.0D);
                    int poi1 = (int)pod1;
                    double pod14 = (dd / 8) * Math.tan(Math.PI * vec[6] / 180.0D);
                    int poi14 = (int)pod14;
                    extraLineTegn.add(0, new ExtraLine(x3[2] + dd / 8, y3[2] - poi14, x3[2] + dd / 2, y3[2] - poi1));
                    double pod2 = (dd / 2) * Math.tan(Math.PI * vec[8] / 180.0D);
                    int poi2 = (int)pod2;
                    double pod24 = (dd / 8) * Math.tan(Math.PI * vec[8] / 180.0D);
                    int poi24 = (int)pod24;
                    extraLineTegn.add(0, new ExtraLine(x2[2] - dd / 8, y2[2] - poi24, x2[2] - dd / 2, y2[2] - poi2));
                    extraLineTegn.add(0, new ExtraLine(x4[0] + face / 2, y4[0], x4[0] + face / 2, y4[0] - dd));
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(x4[0] - 3 * dd, y4[0], x4[0] - 2 * dd, y4[0]));
                        extraLineTegn.add(0, new ExtraLine(x4[0] - 3 * dd, y4[0] + gap, x4[0] - 2 * dd, y4[0] + gap));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(gap / 2))).toString(), x4[0] - 2 * dd , y4[0] + dd / 3));
                        extraArrayTegn.add(0, new ExtraArray(x4[0] - 5 * dd / 2, y4[0] - dd / 2, x4[0] - 5 * dd / 2, y4[0], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x4[1] - 5 * dd / 2, y4[1] + gap + dd / 2, x4[1] - 5 * dd / 2, y4[1] + gap, 4, 4));
                    }
                    if (angle != 90 && angle != 0) {
                        double pod = dd * Math.tan(Math.PI * (90 - angle) / 180.0D);
                        int poi = (int)pod;
                        double pod0 = (dd / 4) * Math.tan(Math.PI * (90 - angle) / 180.0D);
                        int poi0 = (int)pod0;
                        extraLineTegn.add(0, new ExtraLine(x3[1] + dd / 4, y3[1] - dd / 4, x3[1] + dd / 4, y3[1] - dd));
                        extraLineTegn.add(0, new ExtraLine(x3[1] + dd / 4, y3[1] - dd / 4, x3[1] + dd, y3[1] - poi));
                    } else {
                        extraLineTegn.add(0, new ExtraLine(x3[1] + dd / 4, y3[1] - dd / 4, x3[1] + dd, y3[1] - dd / 4));
                        extraLineTegn.add(0, new ExtraLine(x3[1] + dd / 4, y3[1] - dd / 4, x3[1] + dd / 4, y3[1] - dd));
                    }
                    if (face > 0) {
                        extraLineTegn.add(0, new ExtraLine(x4[0], y4[0] + gap + tp1 + dd / 2, x4[0], y4[0] + gap + tp1 + dd));
                        extraLineTegn.add(0, new ExtraLine(x4[1], y4[1] + gap + tp1 + dd / 2, x4[1], y4[1] + gap + tp1 + dd));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(face / 2))).toString(), x4[0] + dd / 16, y4[0] + gap + tp1 + 5*dd/4));
                        extraArrayTegn.add(0, new ExtraArray(x4[0] - dd / 2, y4[0] + gap + tp1 + 3 * dd / 4, x4[0], y4[0] + gap + tp1 + 3 * dd / 4, 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x4[1] + dd / 2, y4[1] + gap + tp1 + 3 * dd / 4, x4[1], y4[1] + gap + tp1 + 3 * dd / 4, 4, 4));
                    }
                    if (vec[2] > 0) {
                        extraTallTegn.add(0, new ExtraTall("a" + vec[2], x2[1] - dd, y2[2] - dd / 4));
                    }
                    if (vec[3] > 0) {
                        extraTallTegn.add(0, new ExtraTall("a" + vec[3], x2[5] + 3 * dd / 2, y2[5] - dd / 4));
                    }
                }
            }
        }

        if (plotType.equals("Butt") || plotType.equals("butt")) {
            int dd = (fac * vec[2])/3;
            int dd3 = fac* vec[2];
            String v1 = "1   ";
            if ( !plotOK) {
            }
            plotOK =  true;
            if (vec[9] == 1) {
                extraTall.add(0, new ExtraTall(v1, x1[3] + dd3 / 4, y1[3] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x1[3], y1[3], x1[3] + dd3 / 4, y1[3] - dd3 / 4));
                extraLine.add(0, new ExtraLine(x1[3] + dd3 / 4, y1[3] - dd3 / 4, x1[3], y1[3] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x1[3], y1[3] - dd3 / 2, x1[3] + dd3 / 4, y1[3] - 3 * dd3 / 4));
                extraLine.add(0, new ExtraLine(x1[3] + dd3 / 4, y1[3] - 3 * dd3 / 4, x1[0], y1[0]));
                if (tegning) {
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(-vec[0], s / 2, -vec[0], s));
                        extraArrayTegn.add(0, new ExtraArray(-vec[0]- s/ 2,  3 * s/ 4, -vec[0],  3 * s/ 4, 4, 4));
                    }
                }
            }
            if (vec[9] == 2) {  // dette er Y
                extraTall.add(0, new ExtraTall(v1, x1[0] + dd3 / 4, y1[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[0] + dd3 / 4, y1[0] - dd3 / 4));
                extraLine.add(0, new ExtraLine(x1[0] + dd3 / 4, y1[0] - dd3 / 4, x1[0], y1[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x1[0], y1[0] - dd3 / 2, x1[0] + dd3 / 4, y1[0] - 3 * dd3 / 4));
                extraLine.add(0, new ExtraLine(x1[0] + dd3 / 4, y1[0] - 3 * dd3 / 4, x1[7], y1[7]));
                if (tegning) {
                    extraTallTegn.add(0, new ExtraTall(String.valueOf(vec[3]) + "°", x1[3] - dd / 1, y1[3] - dd / 4));
                    double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - vec[3]) / 180.0D);
                    int poi1 = (int)pod1;
                    double pod0 = (dd / 8) * Math.tan(Math.PI * (90 - vec[3]) / 180.0D);
                    int poi0 = (int)pod0;
                    extraLineTegn.add(0, new ExtraLine(x1[3] - dd / 8, y1[3] - poi0, x1[3] - dd / 2, y1[3] - poi1));
                    x11[0] = x1[3] - dd / 2;
                    y11[0] = y1[3] - dd;
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(-vec[0], s / 2, -vec[0], s));
                        extraArrayTegn.add(0, new ExtraArray(-vec[0]- s/ 2,  3 * s/ 4, -vec[0],  3 * s/ 4, 4, 4));
                    }
                    if (face > 0) {
                        extraLineTegn.add(0, new ExtraLine(x1[0] - dd / 4, y1[0], x1[0] - 3 * dd / 4, y1[0]));
                        extraLineTegn.add(0, new ExtraLine(x1[0] - dd / 4, y1[2], x1[0] - 3 * dd / 4, y1[2]));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(face / 2))).toString(), x1[0] - dd-dd/6, y1[0] + dd / 16));
                        extraArrayTegn.add(0, new ExtraArray(x1[0] - dd / 2, y1[2] - dd / 2, x1[0] - dd / 2, y1[2], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x1[0] - dd / 2, y1[0] + dd / 2, x1[0] - dd / 2, y1[0], 4, 4));
                    }
                }
            }
            if (vec[9] == 3) {  // dette er X

                extraTall.add(0, new ExtraTall(v1, x1[0] + dd3 / 4, y1[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[0] + dd3 / 4, y1[0] - dd3 / 4));

               extraLine.add(0, new ExtraLine(x1[0]+ dd3 / 4, y1[0] - dd3 / 4, x1[0], y1[0]- dd3 / 2 ));

                extraLine.add(0, new ExtraLine(x1[0], y1[0] - dd3 / 2, x1[0] + dd3 / 4, y1[0] - 3 * dd3 / 4));
               extraLine.add(0, new ExtraLine(x1[0] + dd3 / 4, y1[0] - 3 * dd3 / 4, x1[7], y1[7]));
                if (tegning) {
                    extraTallTegn.add(0, new ExtraTall(vec[3] + "°", x9[0] - dd / 1, y9[8] + dd3 / 3));
                    extraTallTegn.add(0, new ExtraTall(vec[5] + "°", x9[2] - dd / 1, y9[3] - dd3 / 4));
                    x11[1] = x9[0] - dd / 2;
                    y11[1] = y9[0] - dd;
                    x11[2] = x9[2] - dd / 2;
                    y11[2] = y9[2] + dd;
                    double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - vec[3]) / 180.0D);
                    int poi1 = (int)pod1;
                    double pod0 = (dd / 8) * Math.tan(Math.PI * (90 - vec[3]) / 180.0D);
                    int poi0 = (int)pod0;
                    extraLineTegn.add(0, new ExtraLine(x1[4] - dd / 8, y1[4] - poi0, x1[4] - dd / 2, y1[4] - poi1));
                    double pod2 = (dd / 2) * Math.tan(Math.PI * (90 - vec[5]) / 180.0D);
                    int poi2 = (int)pod2;
                    double pod20 = (dd / 8) * Math.tan(Math.PI * (90 - vec[5]) / 180.0D);
                    int poi20 = (int)pod20;
                    extraLineTegn.add(0, new ExtraLine(x1[1] - dd / 8, y1[1] + poi20, x1[1] - dd / 2, y1[1] + poi2));
                    extraLineTegn.add(0, new ExtraLine(x1[2], y1[2] - face / 2, x1[0], y1[2] - face / 2));
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(-vec[0], s / 2, -vec[0], s));
                        extraArrayTegn.add(0, new ExtraArray(-vec[0]- s/ 2,  3 * s/ 4, -vec[0],  3 * s/ 4, 4, 4));
                    }
                    if (face > 0) {
                        extraLineTegn.add(0, new ExtraLine(x1[0] - dd / 4, y1[2], x1[0] - 3 * dd / 4, y1[2]));
                        extraLineTegn.add(0, new ExtraLine(x1[0] - dd / 4, y1[3], x1[0] - 3 * dd / 4, y1[3]));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(face / 2))).toString(), x1[0] - dd, y1[2] + dd / 16));
                        extraArrayTegn.add(0, new ExtraArray(x1[0] - dd / 2, y1[3] - dd / 2, x1[0] - dd / 2, y1[3], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x1[0] - dd / 2, y1[2] + dd / 2, x1[0] - dd / 2, y1[2], 4, 4));
                    }
                }
            }
            if (vec[9] == 4) {
                extraTall.add(0, new ExtraTall(v1, x1[0] + dd3 / 4, y1[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x1[0], y1[0], x1[0] + dd3 / 4, y1[0] - dd3 / 4));
                extraLine.add(0, new ExtraLine(x1[0] + dd3 / 4, y1[0] - dd3 / 4, x1[0], y1[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x1[0], y1[0] - dd3 / 2, x1[0] + dd3 / 4, y1[0] - 3 * dd3 / 4));
                extraLine.add(0, new ExtraLine(x1[0] + dd3 / 4, y1[0] - 3 * dd3 / 4, x2[0], y2[0]));

                if (tegning) {
                    extraTallTegn.add(0, new ExtraTall(vec[3] + "°", x2[1] - dd / 1, y2[1] - dd / 4));
                    extraTallTegn.add(0, new ExtraTall("r" + vec[4], x1[3] - dd , y1[3] - dd / 8));
                    double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - vec[3]) / 180.0D);
                    int poi1 = (int)pod1;
                    double pod0 = (dd / 8) * Math.tan(Math.PI * (90 - vec[3]) / 180.0D);
                    int poi0 = (int)pod0;
                    extraLineTegn.add(0, new ExtraLine(x2[1] - dd / 8, y2[1] - poi0, x2[1] - dd / 2, y2[1] - poi1));
                    x11[3] = x2[1] - dd / 2;
                    y11[3] = y2[1] - dd;
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(-vec[0], s / 2, -vec[0], s));
                        extraArrayTegn.add(0, new ExtraArray(-vec[0]- s/ 2,  3 * s/ 4, -vec[0],  3 * s/ 4, 4, 4));
                    }
                    if (face > 0) {
                        extraLineTegn.add(0, new ExtraLine(x1[0] - dd / 4, y1[0], x1[0] - 3 * dd / 4, y1[0]));
                        extraLineTegn.add(0, new ExtraLine(x1[0] - dd / 4, y1[2], x1[0] - 3 * dd / 4, y1[2]));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(face / 2))).toString(), x1[0] - dd -dd/6, y1[0] + dd / 16));
                        extraArrayTegn.add(0, new ExtraArray(x1[0] - dd / 2, y1[2] - dd / 2, x1[0] - dd / 2, y1[2], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x1[0] - dd / 2, y1[0] + dd / 2, x1[0] - dd / 2, y1[0], 4, 4));
                    }
                }

            }
            if (vec[9] == 5) {  // venstre tegning
                extraTall.add(0, new ExtraTall(v1, x2[0] + dd3 / 4, y2[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[0] + dd3 / 4, y2[0] - dd3 / 4));
                extraLine.add(0, new ExtraLine(x2[0] + dd3 / 4, y2[0] - dd3 / 4, x2[0], y2[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x2[0], y2[0] - dd3 / 2, x2[0] + dd3 / 4, y2[0] - 3 * dd3 / 4));
                extraLine.add(0, new ExtraLine(x2[0] + dd3 / 4, y2[0] - 3 * dd3 / 4, x1[0], y1[0]));
                if (tegning) {
                    extraTallTegn.add(0, new ExtraTall("r" + vec[4], x3[1] - dd / 2-dd/2, y3[1] - dd / 5));
                    extraTallTegn.add(0, new ExtraTall("r" + vec[6], x3[0] - dd / 2-dd/2, y3[0] + dd / 2));
                    extraTallTegn.add(0, new ExtraTall(vec[3] + "°", x2[2] - dd / 1, y9[6]+ 1 * dd3 / 8 ));
                    extraTallTegn.add(0, new ExtraTall(vec[5] + "°", x2[2] - dd / 1, y1[2] + 5 * dd3 / 4));
                    x11[4] = x1[2] - dd / 2;
                    y11[4] = y1[2] - dd;
                    x11[5] = x2[2] - dd / 2;
                    y11[5] = y2[2] + dd;
                    double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - vec[3]) / 180.0D);
                    int poi1 = (int)pod1;
                    double pod10 = (dd / 8) * Math.tan(Math.PI * (90 - vec[3]) / 180.0D);
                    int poi10 = (int)pod10;
                    extraLineTegn.add(0, new ExtraLine(x2[2] - dd / 8, y2[2] + poi10, x2[2] - dd / 2, y2[2] + poi1));
                    double pod2 = (dd / 2) * Math.tan(Math.PI * (90 - vec[5]) / 180.0D);
                    int poi2 = (int)pod2;
                    double pod20 = (dd / 8) * Math.tan(Math.PI * (90 - vec[5]) / 180.0D);
                    int poi20 = (int)pod20;
                    extraLineTegn.add(0, new ExtraLine(x1[2] - dd / 8, y1[2] - poi20, x1[2] - dd / 2, y1[2] - poi2));
                    extraLineTegn.add(0, new ExtraLine(x3[0], y3[0] + face / 2, x1[0], y3[0] + face / 2));
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(-vec[0], s / 2, -vec[0], s));
                        extraArrayTegn.add(0, new ExtraArray(-vec[0]- s/ 2,  3 * s/ 4, -vec[0],  3 * s/ 4, 4, 4));
                    }
                    if (face > 0) {
                        extraLineTegn.add(0, new ExtraLine(x1[0] - dd / 4, y3[2] - face, x1[0] - 3 * dd / 4, y3[2] - face));
                        extraLineTegn.add(0, new ExtraLine(x1[0] - dd / 4, y3[2], x1[0] - 3 * dd / 4, y3[2]));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(face / 2))).toString(), x1[0] - dd -dd/6, y3[0] + dd / 16));
                        extraArrayTegn.add(0, new ExtraArray(x1[0] - dd / 2, y3[2] - dd / 2, x1[0] - dd / 2, y3[0], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x1[0] - dd / 2, y3[0] + dd / 2, x1[0] - dd / 2, y3[1], 4, 4));
                    }
                }
            }
        }
        if (plotType.equals("butt")) {
            int dd = (fac * vec[14])/3;
            int dd3 =  fac * vec[14];
            String v1 = "2   ";
            if (vec[21] == 1) {
                extraTall.add(0, new ExtraTall(v1, x5[0] - dd3 / 4, y5[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[0] + dd3 / 4, y5[0] - dd3 / 4));
                extraLine.add(0, new ExtraLine(x5[0] + dd3 / 4, y5[0] - dd3 / 4, x5[0], y5[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x5[0], y5[0] - dd3 / 2, x5[0] + dd3 / 4, y5[0] - 3 * dd3 / 4));
                extraLine.add(0, new ExtraLine(x5[0] + dd3 / 4, y5[0] - 3 * dd3 / 4, x5[7], y5[7]));
                if (tegning) {
                    if (gap > 0) {
                        int f = -forvs + forhs;
                        if (f > 0)
                            f = -f;
                        extraLineTegn.add(0, new ExtraLine(vec[12], s / 2, vec[12], s));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[0] + vec[12]))).toString(), vec[12]+s/4,  s / 2));
                        extraArrayTegn.add(0, new ExtraArray(vec[12] + s/ 2,  3 * s/ 4, vec[12],  3 * s/ 4, 4, 4));
                    }
                }
            }
            if (vec[21] == 2) {  // Y
                extraTall.add(0, new ExtraTall(v1, x5[0] - dd3 / 4, y5[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[0] + dd3 / 4, y5[0] - dd3 / 4));
                extraLine.add(0, new ExtraLine(x5[0] + dd3 / 4, y5[0] - dd3 / 4, x5[0], y5[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x5[0], y5[0] - dd3 / 2, x5[0] + dd3 / 4, y5[0] - 3 * dd3 / 4));
                extraLine.add(0, new ExtraLine(x5[0] + dd3 / 4, y5[0] - 3 * dd3 / 4, x5[7], y5[7]));
                if (tegning) {
                    extraTallTegn.add(0, new ExtraTall(vec[15] + "°", x5[2] + 3*dd3/4 , y5[3] - dd / 4));
                    double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - vec[3]) / 180.0D);
                    int poi1 = (int)pod1;
                    double pod10 = (dd / 8) * Math.tan(Math.PI * (90 - vec[3]) / 180.0D);
                    int poi10 = (int)pod10;
                    extraLineTegn.add(0, new ExtraLine(x5[3] + dd / 8, y5[3] - poi10, x5[3] + dd / 2, y5[3] - poi1));
                    x11[6] = x5[3] + dd / 2;
                    y11[6] = y5[3] - dd;
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(vec[12], s / 2, vec[12], s));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[0] + vec[12]))).toString(), vec[12]+s/4,  s / 2));
                        extraArrayTegn.add(0, new ExtraArray(vec[12] + s/ 2,  3 * s/ 4, vec[12],  3 * s/ 4, 4, 4));
                    }
                    if (faceR > 0) {
                        extraLineTegn.add(0, new ExtraLine(x5[0] + dd / 4 + s, y5[0], x5[0] + 3 * dd / 4 + s, y5[0]));
                        extraLineTegn.add(0, new ExtraLine(x5[0] + dd / 4 + s, y5[2], x5[0] + 3 * dd / 4 + s, y5[2]));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(faceR / 2))).toString(), x5[0] + dd+ s, y5[0] + dd / 16));
                        extraArrayTegn.add(0, new ExtraArray(x5[0] + dd / 2 + s, y5[2] - dd / 2, x5[0] + dd / 2 + s, y5[2], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x5[0] + dd / 2 + s, y5[0] + dd / 2, x5[0] + dd / 2 + s, y5[0], 4, 4));
                    }
                    if (vec[9] == 2) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y5[3] - dd ));

                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[0], y11[0] - dd / 8, (x11[0] + x11[6]) / 2, y11[0] - dd / 2, x11[6], y11[6] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[0], y11[0] - dd / 8,x11[0]+dd/8, y11[0] - dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine( x11[6], y11[6] - dd / 8, x11[6]-dd/8, y11[6] - dd / 4));
                        }
                    }
                    if (vec[9] == 3) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", x5[3] - dd / 4, y5[4] - dd ));

                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[1], y11[1] - dd / 8, (x11[1] + x11[6]) / 2, y11[1] - dd / 2, x11[6], y11[6] - dd / 4));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[1], y11[1] - dd / 8,x11[1]+dd/8, y11[1] - dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine(x11[6], y11[6] - dd / 8, x11[6]-dd/8, y11[6] - dd / 4 ));
                        }
                    }
                    if (vec[9] == 4) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y5[3] - dd ));

                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[3], y11[3] - dd / 8, (x11[3] + x11[6]) / 2, y11[3] - dd / 2, x11[6], y11[6] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[3], y11[3] - dd / 8,x11[3]+dd/8, y11[3] - dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine(x11[6], y11[6] - dd / 8, x11[6]-dd/8, y11[6] - dd / 4 ));
                        }
                    }
                    if (vec[9] == 5) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y9[4] - dd));

                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[4], y11[4] - dd / 8, (x11[4] + x11[6]) / 2, y11[4] - dd / 2, x11[6], y11[6] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[4], y11[4] - dd / 8,x11[4]+dd/8, y11[4] - dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine(x11[6], y11[6] - dd / 8, x11[6]-dd/8, y11[6] - dd / 4 ));
                        }
                    }
                }
            }
            if (vec[21] == 3) {  // X
                extraTall.add(0, new ExtraTall(v1, x5[0] - dd3 / 4, y5[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[0] + dd3 / 4, y5[0] - dd3 / 4));
                extraLine.add(0, new ExtraLine(x5[0] + dd3 / 4, y5[0] - dd3 / 4, x5[0], y5[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x5[0], y5[0] - dd3 / 2, x5[0] + dd3 / 4, y5[0] - 3 * dd3 / 4));
                extraLine.add(0, new ExtraLine(x5[0] + dd3 / 4, y5[0] - 3 * dd3 / 4, x5[7], y5[7]));
                if (tegning) {
                    extraTallTegn.add(0, new ExtraTall(vec[17] + "°", x5[1] + dd / 2, y5[1] + dd / 2));
                    extraTallTegn.add(0, new ExtraTall(vec[15] + "°", x5[4] + dd / 2, y5[4] - dd / 2));
                    double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - vec[17]) / 180.0D);
                    int poi1 = (int)pod1;
                    double pod10 = (dd / 8) * Math.tan(Math.PI * (90 - vec[17]) / 180.0D);
                    int poi10 = (int)pod10;
                    extraLineTegn.add(0, new ExtraLine(x5[1] + dd / 8, y5[1] + poi10, x5[1] + dd / 2, y5[1] + poi1));
                    double pod2 = (dd / 2) * Math.tan(Math.PI * (90 - vec[15]) / 180.0D);
                    int poi2 = (int)pod2;
                    double pod20 = (dd / 8) * Math.tan(Math.PI * (90 - vec[15]) / 180.0D);
                    int poi20 = (int)pod20;
                    extraLineTegn.add(0, new ExtraLine(x5[4] + dd / 8, y5[4] - poi20, x5[4] + dd / 2, y5[4] - poi2));
                    extraLineTegn.add(0, new ExtraLine(x5[2], y5[2] - face / 2, x5[0], y5[2] - face / 2));
                    x11[7] = x5[4] + dd / 2;
                    y11[7] = y5[4] - dd;
                    x11[8] = x5[1] + dd / 2;
                    y11[8] = y5[1] + dd;
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(vec[12], s / 2, vec[12], s));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[0] + vec[12]))).toString(), vec[12]+s/4,  s / 2));
                        extraArrayTegn.add(0, new ExtraArray(vec[12] + s/ 2,  3 * s/ 4, vec[12],  3 * s/ 4, 4, 4));
                    }
                    if (faceR > 0) {
                        extraLineTegn.add(0, new ExtraLine(x5[0] + dd / 4 + s, y5[3], x5[0] + 3 * dd / 4 + s, y5[3]));
                        extraLineTegn.add(0, new ExtraLine(x5[0] + dd / 4 + s, y5[2], x5[0] + 3 * dd / 4 + s, y5[2]));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(faceR / 2))).toString(), x5[0] + dd + s, y5[2] + dd / 16));
                        extraArrayTegn.add(0, new ExtraArray(x5[0] + dd / 2 + s, y5[2] - dd / 2, x5[0] + dd / 2 + s, y5[3], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x5[0] + dd / 2 + s, y5[2]+dd/2, x5[0] + dd / 2 + s, y5[2], 4, 4));
                    }

                    if (vec[9] == 2) {
                       extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y5[4] - dd ));
                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[0], y11[0] - dd / 8, (x11[0] + x11[7]) / 2, y11[0] - dd / 2, x11[7], y11[7] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[0], y11[0] - dd / 8, x11[0]+dd/8, y11[0] - dd / 4));
                            extraLineTegn.add(0, new ExtraLine(x11[7], y11[7] - dd / 8, x11[7]-dd/8, y11[7] - dd / 4 ));
                        }
                    }
                    if (vec[9] == 3) {
                        ;
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y5[4] - dd ));  // øverste
                        extraTallTegn.add(0, new ExtraTall((vec[17] + vec[5]) + "°", 0, y5[1] + 2*dd - dd/4 ));
                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[1], y11[1] - dd / 8, (x11[1] + x11[7]) / 2, y11[1] - dd / 2, x11[7], y11[7] - dd / 8));
                            extraBueTegn.add(0, new ExtraBue(x11[2], y11[2] + dd / 8, (x11[2] + x11[8]) / 2, y11[2] + dd / 2, x11[8], y11[8] + dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[1], y11[1] - dd / 8,x11[1]+dd/8, y11[1] - dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine(x11[7], y11[7] - dd / 8 , x11[7]-dd/8, y11[7] - dd / 4));
                            extraLineTegn.add(0, new ExtraLine( x11[2], y11[2] + dd / 8, x11[2]+dd/8, y11[2] + dd / 4));
                            extraLineTegn.add(0, new ExtraLine(x11[8], y11[8] + dd / 8, x11[8]-dd/8, y11[8] + dd / 4 ));
                        }
                    }
                    if (vec[9] == 4) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y5[4]  ));

                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[3], y11[3] - dd / 8, (x11[3] + x11[7]) / 2, y11[3] - dd / 2, x11[7], y11[7] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[3], y11[3] - dd / 8,x11[3]+dd/8, y11[3] - dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine(x11[7], y11[7] - dd / 8, x11[7]-dd/8, y11[7] - dd / 4 ));
                        }
                    }
                    if (vec[9] == 5) {
           //             extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y9[4] - dd ));
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y5[1] + 2*dd + dd/2 ));

                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[4], y11[4] - dd / 8, (x11[4] + x11[7]) / 2, y11[4] - dd / 2, x11[7], y11[7] - dd / 8));
                            extraBueTegn.add(0, new ExtraBue(x11[5], y11[5] + dd / 8, (x11[5] + x11[8]) / 2, y11[5] + dd / 2, x11[8], y11[8] + dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine( x11[4], y11[4] - dd / 8,x11[4]+ dd/8, y11[4] - dd / 4));
                            extraLineTegn.add(0, new ExtraLine(x11[7], y11[7] - dd / 8, x11[7] - dd/9, y11[7] - dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine( x11[5], y11[5] + dd / 8, x11[5] + dd/8, y11[5] + dd / 4));
                            extraLineTegn.add(0, new ExtraLine(x11[8], y11[8] + dd / 8, x11[8]-dd/8, y11[8] + dd / 4 ));
                        }
                    }
                }
            }
            if (vec[21] == 4) {
                extraTall.add(0, new ExtraTall(v1, x5[0] - dd3 / 4, y5[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[0] + dd3 / 4, y5[0] - dd3 / 4));
                extraLine.add(0, new ExtraLine(x5[0] + dd3 / 4, y5[0] - dd3 / 4, x5[0], y5[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x5[0], y5[0] - dd3 / 2, x5[0] + dd3 / 4, y5[0] - 3 * dd3 / 4));
                extraLine.add(0, new ExtraLine(x5[0] + dd3 / 4, y5[0] - 3 * dd3 / 4, x6[0], y6[0]));
                if (tegning) {
                    extraTallTegn.add(0, new ExtraTall("r" + vec[16], x5[2] + dd / 2, y5[2] - dd / 16));
                    extraTallTegn.add(0, new ExtraTall(vec[15] + "°", x6[1] + dd / 2, y6[1] - dd / 4));
                    double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - vec[15]) / 180.0D);
                    int poi1 = (int)pod1;
                    double pod10 = (dd / 8) * Math.tan(Math.PI * (90 - vec[15]) / 180.0D);
                    int poi10 = (int)pod10;
                    extraLineTegn.add(0, new ExtraLine(x6[1] + dd / 8, y6[1] - poi10, x6[1] + dd / 2, y6[1] - poi1));
                    x11[9] = x6[1] + dd / 2;
                    y11[9] = y6[1] - dd;
                    if (gap > 0) {
                        extraLineTegn.add(0, new ExtraLine(vec[12], s / 2, vec[12], s));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[0] + vec[12]))).toString(), vec[12]+s/4,  s / 2));
                        extraArrayTegn.add(0, new ExtraArray(vec[12] + s/ 2,  3 * s/ 4, vec[12],  3 * s/ 4, 4, 4));
                    }
                    if (faceR > 0) {
                        extraLineTegn.add(0, new ExtraLine(x5[0] + dd / 4 + s, y5[0], x5[0] + 3 * dd / 4 + s, y5[0]));
                        extraLineTegn.add(0, new ExtraLine(x5[0] + dd / 4 + s, y5[2], x5[0] + 3 * dd / 4 + s, y5[2]));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(faceR / 2))).toString(), x5[0] + dd + s, y5[0] + dd / 16));
                        extraArrayTegn.add(0, new ExtraArray(x5[0] + dd / 2 + s, y5[2] - dd / 2, x5[0] + dd / 2 + s, y5[2], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x5[0] + dd / 2 + s, y5[0] + dd / 2, x5[0] + dd / 2 + s, y5[0], 4, 4));
                    }
                    if (vec[9] == 2) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y6[1] - dd ));

                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[0], y11[0] - dd / 8, (x11[0] + x11[9]) / 2, y11[0] - dd / 2, x11[9], y11[9] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine( x11[0], y11[0] - dd / 8,x11[0]+dd/8, y11[0] - dd / 4));
                            extraLineTegn.add(0, new ExtraLine(x11[9], y11[9] - dd / 8,x11[9] - dd/8, y11[9] - dd / 4 ));
                        }
                    }
                    if (vec[9] == 3) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y6[1] - dd ));

                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[1], y11[1] - dd / 8, (x11[1] + x11[9]) / 2, y11[1] - dd / 2, x11[9], y11[9] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[1], y11[1] - dd / 8, x11[1]+dd/8, y11[1] - dd / 4  ));
                            extraLineTegn.add(0, new ExtraLine(x11[9], y11[9] - dd / 8,x11[9]-dd/8, y11[9] - dd / 4 ));
                        }
                    }
                    if (vec[9] == 4) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y6[1] - dd ));

                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[3], y11[3] - dd / 8, (x11[3] + x11[9]) / 2, y11[3] - dd / 2, x11[9], y11[9] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[3], y11[3] - dd / 8,x11[3]+dd/8, y11[3] - dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine( x11[9], y11[9] - dd / 8, x11[9]-dd/8, y11[9] - dd / 4 ));
                        }
                    }
                    if (vec[9] == 5) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y6[1] - dd ));

                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[4], y11[4] - dd / 8, (x11[4] + x11[9]) / 2, y11[4] - dd / 2, x11[9], y11[9] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[4], y11[4] - dd / 8, x11[4]+dd/8, y11[4] - dd / 4));
                            extraLineTegn.add(0, new ExtraLine(x11[9], y11[9] - dd / 8, x11[9]-dd/8, y11[9] - dd / 4 ));
                        }
                    }
                }
            }
            if (vec[21] == 5) {
                extraTallTegn.add(0, new ExtraTall(v1, x5[0] - dd3 / 4, y5[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[0] + dd3 / 4, y5[0] - dd3 / 4));
                extraLine.add(0, new ExtraLine(x5[0] + dd3 / 4, y5[0] - dd3 / 4, x5[0], y5[0] - dd3 / 2));
                extraLine.add(0, new ExtraLine(x5[0], y5[0] - dd3 / 2, x5[0] + dd3 / 4, y5[0] - 3 * dd3 / 4));
                extraLine.add(0, new ExtraLine(x5[0] + dd3 / 4, y5[0] - 3 * dd3 / 4, x6[0], y6[0]));
                if (tegning) {
                    extraTallTegn.add(0, new ExtraTall("r" + vec[16], x7[0] + dd3 / 4, y6[1] + dd3 / 2));
                    extraTallTegn.add(0, new ExtraTall("r" + vec[18], x7[0] + dd3 / 4, y5[1] - dd3 / 3));
                    extraTallTegn.add(0, new ExtraTall(vec[17] + "°", x5[1] + dd / 2, y5[1] + dd / 2));
                    extraTallTegn.add(0, new ExtraTall(vec[15] + "°", x6[1] + dd / 2, y6[1] - dd / 4));
                    double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - vec[17]) / 180.0D);
                    int poi1 = (int)pod1;
                    double pod10 = (dd / 8) * Math.tan(Math.PI * (90 - vec[17]) / 180.0D);
                    int poi10 = (int)pod10;
                    extraLineTegn.add(0, new ExtraLine(x5[1] + dd / 8, y5[1] + poi10, x5[1] + dd / 2, y5[1] + poi1));
                    double pod2 = (dd / 2) * Math.tan(Math.PI * (90 - vec[15]) / 180.0D);
                    int poi2 = (int)pod2;
                    double pod20 = (dd / 8) * Math.tan(Math.PI * (90 - vec[15]) / 180.0D);
                    int poi20 = (int)pod20;
                    extraLineTegn.add(0, new ExtraLine(x6[1] + dd / 8, y6[1] - poi20, x6[1] + dd / 2, y6[1] - poi2));
                    x11[10] = x6[1] + dd / 2;
                    y11[10] = y6[1] - dd;
                    x11[11] = x5[1] + dd / 2;
                    y11[11] = y5[1] + dd;
                    extraLineTegn.add(0, new ExtraLine(x7[0], y7[0] + vec[19], x5[0], y7[0] + vec[19]));
                    if (gap > 0) {

                        //       extraLineTegn.add(0, new ExtraLine(x7[0], y5[0] + dd / 2, x7[0], y5[0] + 1 * dd));
                        //      extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[0] + vec[12]))).toString(), x7[0], y5[0] + 1 * dd / 2));
                        //      extraArrayTegn.add(0, new ExtraArray(x7[0] + dd / 2, y5[1] + 3 * dd / 4, x7[0], y5[1] + 3 * dd / 4, 4, 4));
                        extraLineTegn.add(0, new ExtraLine(vec[12], s / 2, vec[12], s));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[0] + vec[12]))).toString(), vec[12]+s/4,  s / 2));
                        extraArrayTegn.add(0, new ExtraArray(vec[12] + s/ 2,  3 * s/ 4, vec[12],  3 * s/ 4, 4, 4));
                    }
                    if (faceR > 0) {
                        extraLineTegn.add(0, new ExtraLine(x5[0] + dd / 4 +s, y7[0], x5[0] + 3 * dd / 4 + s, y7[0]));
                        extraLineTegn.add(0, new ExtraLine(x5[0] + dd / 4 + s, y7[1], x5[0] + 3 * dd / 4 + s, y7[1]));
                        extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[19] ))).toString(), x5[0] + dd + s, y7[0] + dd / 16));
                        extraArrayTegn.add(0, new ExtraArray(x5[0] + dd / 2 + s, y7[1] - dd / 2, x5[0] + dd / 2 + s, y7[0], 4, 4));
                        extraArrayTegn.add(0, new ExtraArray(x5[0] + dd / 2 + s, y7[0] + dd / 2, x5[0] + dd / 2 + s, y7[1], 4, 4));
                    }
                    if (vec[9] == 2) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y6[1] -dd ));
                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[0], y11[0] - dd / 8, (x11[0] + x11[10]) / 2, y11[0] - dd / 2, x11[10], y11[10] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine( x11[0], y11[0] - dd / 8, x11[0]+dd/8, y11[0] - dd / 4));
                            extraLineTegn.add(0, new ExtraLine(x11[10], y11[10] - dd / 8, x11[10]-dd/8, y11[10] - dd / 4 ));
                        }
                    }
                    if (vec[9] == 3) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y6[1] - dd));
                        extraTallTegn.add(0, new ExtraTall((vec[17] + vec[5]) + "°", 0, y5[1] + dd+dd/4 ));
                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[1], y11[1] - dd / 8, (x11[1] + x11[10]) / 2, y11[1] - dd / 2, x11[10], y11[10] - dd / 8));
                            extraBueTegn.add(0, new ExtraBue(x11[2], y11[2] + dd / 8, (x11[2] + x11[11]) / 2, y11[2] + dd / 2, x11[11], y11[11] + dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine( x11[1], y11[1] - dd / 8, x11[1]+dd/8, y11[1] - dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine(x11[10], y11[10] - dd / 8, x11[10]-dd/8, y11[10] - dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine( x11[2], y11[2] + dd / 8,x11[2]+dd/8, y11[2] + dd / 4));
                            extraLineTegn.add(0, new ExtraLine(x11[11], y11[11] + dd / 8, x11[11]- dd/8, y11[11] + dd / 4 ));
                        }

                    }
                    if (vec[9] == 4) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y6[1] - dd ));
                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[3], y11[3] - dd / 8, (x11[3] + x11[10]) / 2, y11[3] - dd / 2, x11[10], y11[10] - dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine( x11[3], y11[3] - dd / 8,x11[3]+dd/8, y11[3] - dd / 4));
                            extraLineTegn.add(0, new ExtraLine( x11[10], y11[10] - dd / 8, x11[10] - dd/8, y11[10] - dd / 4 ));
                        }
                    }
                    if (vec[9] == 5) {
                        extraTallTegn.add(0, new ExtraTall((vec[15] + vec[3]) + "°", 0, y6[1] - dd ));  // buegrader
                        extraTallTegn.add(0, new ExtraTall((vec[17] + vec[5]) + "°", 0, y5[1] + dd +dd/4 +s));
                        if ( plotBue) {
                            extraBueTegn.add(0, new ExtraBue(x11[4], y11[4] - dd / 8, (x11[4] + x11[10]) / 2, y11[4] - dd / 2, x11[10], y11[10] - dd / 8));
                            extraBueTegn.add(0, new ExtraBue(x11[5], y11[5] + dd / 8, (x11[5] + x11[11]) / 2, y11[5] + dd / 2, x11[11], y11[11] + dd / 8));
                        } else {
                            extraLineTegn.add(0, new ExtraLine(x11[5], y11[5] + dd / 8, x11[5] + dd/8, y11[5] + dd / 4));
                            extraLineTegn.add(0, new ExtraLine( x11[11], y11[11] + dd / 8, x11[11] - dd/8, y11[11] + dd / 4 ));
                            extraLineTegn.add(0, new ExtraLine(x11[4], y11[4] - dd / 8, x11[4] + dd/8, y11[4] - dd / 4  ));
                            extraLineTegn.add(0, new ExtraLine( x11[10], y11[10] - dd / 8,x11[10]- dd/8, y11[10] - dd / 4  ));
                        }
                    }

                }
            }
        }
/*
        extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[1], y2[1]));
        extraLine.add(0, new ExtraLine(x2[1], y2[1], x2[2], y2[2]));
        extraLine.add(0, new ExtraLine(x2[2], y2[2], x2[3], y2[3]));
        extraLine.add(0, new ExtraLine(x2[3], y2[3], x2[4], y2[4]));
        extraLine.add(0, new ExtraLine(x2[4], y2[4], x2[5], y2[5]));
        extraLine.add(0, new ExtraLine(x2[5], y2[5], x2[6], y2[6]));
        extraLine.add(0, new ExtraLine(x2[6], y2[6], x2[7], y2[7]));

        extraLine.add(0, new ExtraLine(x3[0], y3[0], x3[1], y3[1]));
        extraLine.add(0, new ExtraLine(x3[1], y3[1], x3[2], y3[2]));
        extraLine.add(0, new ExtraLine(x3[2], y3[2], x3[3], y3[3]));
        extraLine.add(0, new ExtraLine(x3[3], y3[3], x3[4], y3[4]));
        extraLine.add(0, new ExtraLine(x3[4], y3[4], x3[5], y3[5]));
        extraLine.add(0, new ExtraLine(x3[5], y3[5], x3[6], y3[6]));
        extraLine.add(0, new ExtraLine(x3[6], y3[6], x3[7], y3[7]));

        extraLine.add(0, new ExtraLine(x4[0], y4[0], x4[1], y4[1]));
        extraLine.add(0, new ExtraLine(x4[1], y4[1], x4[2], y4[2]));
        extraLine.add(0, new ExtraLine(x4[2], y4[2], x4[3], y4[3]));
        extraLine.add(0, new ExtraLine(x4[3], y4[3], x4[4], y4[4]));
        extraLine.add(0, new ExtraLine(x4[4], y4[4], x4[5], y4[5]));
        extraLine.add(0, new ExtraLine(x4[5], y4[5], x4[6], y4[6]));
        extraLine.add(0, new ExtraLine(x4[6], y4[6], x4[7], y4[7]));





 */

        if (plotType.equals("flanged")) {
            extraBue.add(0, new ExtraBue(x3[1], y3[1], x12[1], y12[1], x1[0], y1[0]));
            extraBue.add(0, new ExtraBue(x3[0], y3[1], x12[2], y12[2], x1[4], y1[4]));
            extraBue.add(0, new ExtraBue(x4[0], y4[0], x12[3], y12[3], x2[4], y2[4]));
            extraBue.add(0, new ExtraBue(x4[1], y4[1], x12[4], y12[4],x2[0], y2[0]));
            String v30 = "1 ";
            extraTall.add(0, new ExtraTall(v30, x1[2] + 20, y1[2] + 5));
            v30 = "2 ";
            extraTall.add(0, new ExtraTall(v30, x2[2] - 20, y2[2] + 5));
        }

        if (plotType.equals("fillet") && vec[12] == 5) {
            extraBue.add(0, new ExtraBue(x2[3], y2[3], x12[5], y12[5], x4[0], y4[0]));
            extraBue.add(0, new ExtraBue(x3[3], y3[3], x12[6], y12[6],x4[1], y4[1]));
        }

        if (plotType.equals("fillet") && vec[12] == 4) {
            extraBue.add(0, new ExtraBue(x2[3], y2[3], x12[7], y12[7], x3[0], y3[0]));
        }

        if (bue) {
            if ((plotType.equals("Butt") || plotType.equals("butt")) && vec[9] == 4) {
                double r11 = r1 * 1.4142D / fac;
                int r11i = (int)r11;
                extraBue.add(0, new ExtraBue(x2[2], y2[2], x12[8], y12[8], x1[2], y1[2]));
            }

            if ((plotType.equals("Butt") || plotType.equals("butt")) && vec[9] == 5) {
                double r11 = r1 * 1.4142D / fac;
                int r11i = (int)r11;
                extraBue.add(0, new ExtraBue(x3[0], y3[0], x12[9], y12[9], x1[3], y1[3]));  // venstre side øverst
                extraLine.add(0, new ExtraLine(x3[0], y3[0], x3[1], y3[1]));
                extraLine.add(0, new ExtraLine(x3[1], y3[1], x3[2], y3[2]));
                extraLine.add(0, new ExtraLine(x3[2], y3[2], x3[3], y3[3]));
                extraLine.add(0, new ExtraLine(x3[3], y3[3], x3[4], y3[4]));
                extraLine.add(0, new ExtraLine(x3[4], y3[4], x3[5], y3[5]));
                extraLine.add(0, new ExtraLine(x3[5], y3[5], x3[6], y3[6]));
                extraLine.add(0, new ExtraLine(x3[6], y3[6], x3[7], y3[7]));
                extraBue.add(0, new ExtraBue(x3[1], y3[1], x2centrum, y2centrum, x2[3], y2[3]));
            }
        }
        if (index2 == 4) {
            double r11 = r1 * 1.4142D / fac;
            int r11i = (int)r11;
            extraBue.add(0, new ExtraBue(x5[2], y5[2], xRUcentrum, yRUcentrum, x6[2], y6[2]));
        }
        if (index2 == 5) {
            extraBue.add(0, new ExtraBue(x5[2], y5[2], xRDU1centrum, yRDU1centrum, x7[1], y7[1]));  // høyre side nederst
            extraBue.add(0, new ExtraBue(x6[2], y6[2], xRDUcentrum, yRDUcentrum, x7[0], y7[0]));  // høyre side øverst
        }

        extraLine.add(0, new ExtraLine(x5[0], y5[0], x5[1], y5[1]));
        extraLine.add(0, new ExtraLine(x5[1], y5[1], x5[2], y5[2]));
        extraLine.add(0, new ExtraLine(x5[2], y5[2], x5[3], y5[3]));
        extraLine.add(0, new ExtraLine(x5[3], y5[3], x5[4], y5[4]));
        extraLine.add(0, new ExtraLine(x5[4], y5[4], x5[5], y5[5]));
        extraLine.add(0, new ExtraLine(x5[5], y5[5], x5[6], y5[6]));
        extraLine.add(0, new ExtraLine(x5[6], y5[6], x5[7], y5[7]));

        extraLine.add(0, new ExtraLine(x6[0], y6[0], x6[1], y6[1]));
        extraLine.add(0, new ExtraLine(x6[1], y6[1], x6[2], y6[2]));
        extraLine.add(0, new ExtraLine(x6[2], y6[2], x6[3], y6[3]));
        extraLine.add(0, new ExtraLine(x6[3], y6[3], x6[4], y6[4]));
        extraLine.add(0, new ExtraLine(x6[4], y6[4], x6[5], y6[5]));
        extraLine.add(0, new ExtraLine(x6[5], y6[5], x6[6], y6[6]));
        extraLine.add(0, new ExtraLine(x6[6], y6[6], x6[7], y6[7]));

        extraLine.add(0, new ExtraLine(x7[0], y7[0], x7[1], y7[1]));
        extraLine.add(0, new ExtraLine(x7[1], y7[1], x7[2], y7[2]));
        extraLine.add(0, new ExtraLine(x7[2], y7[2], x7[3], y7[3]));
        extraLine.add(0, new ExtraLine(x7[3], y7[3], x7[4], y7[4]));
        extraLine.add(0, new ExtraLine(x7[4], y7[4], x7[5], y7[5]));
        extraLine.add(0, new ExtraLine(x7[5], y7[5], x7[6], y7[6]));
        extraLine.add(0, new ExtraLine(x7[6], y7[6], x7[7], y7[7]));

        if (plotType.equals("Lap joint")) {
            int i;
            for (i = 0; i < 8 * s; i += 20) {
                extraBue.add(0, new ExtraBue(x2[0] + i, y2[0], x2[0] + i + 10, y2[6] - 1, x2[3] + i, y2[3]));
            }
            for (i = 0; i < 8 * s; i += 20) {
                extraBue.add(0, new ExtraBue(x1[0] + i, y1[0], x1[0] + i + 10, 0, x1[3] + i, y1[3]));

            }
            int radius10 = (int) (fact*x8[1]);
            extraEllipse.add(0, new ExtraEllipse(x8[2], y8[7], radius10,  radius10));
            int radius11 = (int) (fact*x8[4]);
            extraEllipse.add(0, new ExtraEllipse(x8[2], y8[2], radius11,  radius11));
            extraLine.add(0, new ExtraLine(x8[0], y8[7], x8[0] - 5, y8[7]));
            extraLine.add(0, new ExtraLine(x8[1], y8[7], x8[1] + 5, y8[7]));
            extraLine.add(0, new ExtraLine(x8[3], y8[2], x8[3] - 5, y8[2]));
            extraLine.add(0, new ExtraLine(x8[4], y8[2], x8[4] + 5, y8[2]));
            extraLine.add(0, new ExtraLine(x8[0], y8[7] - 1, x8[0] - 5, y8[7] - 1));
            extraLine.add(0, new ExtraLine(x8[1], y8[7] - 1, x8[1] + 5, y8[7] - 1));
            extraLine.add(0, new ExtraLine(x8[3], y8[2] - 1, x8[3] - 5, y8[2] - 1));
            extraLine.add(0, new ExtraLine(x8[4], y8[2] - 1, x8[4] + 5, y8[2] - 1));

            if ( gang[0] == 1 ) {

                int xstep = 110;
                int ystep = 20;
                extraText.add(0, new ExtraText("Dimension1 "     , x1[2] - 5*ystep, y1[2] - ystep));
                extraText.add(0, new ExtraText("Dimension2 " , x1[2]- 5*ystep, y2[1] + 20 ));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[20]))).toString(),x1[2]+ xstep- 3*ystep, y1[2] - ystep));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[21]))).toString(), x1[2]  + xstep- 3*ystep, y2[1] + 20 ));
                extraText.add(0, new ExtraText(" mm" , x1[2] + xstep + ystep- 3*ystep, y1[2] - ystep  ));
                extraText.add(0, new ExtraText(" mm" , x1[2] + xstep + ystep- 3*ystep, y2[1] + 20 ));
            }
        }

        if (plotType.equals("Strap joint")) {
            int i;
            for (i = 0; i < 8 * s; i += 20) {
                extraBue.add(0, new ExtraBue(x1[0] + i, y1[0], x1[0] + i + 10, 0, x1[3] + i, y1[3]));
            }
            for (i = 0; i < 10 * s; i += 20) {
                extraBue.add(0, new ExtraBue(x2[0] + i, y2[0], x2[0] + i + 10, y2[4] + 1, x2[3] + i, y2[3]));
            }
            for (i = 0; i < 8 * s; i += 20) {
                extraBue.add(0, new ExtraBue(x3[0] + i, y3[0], x3[0] + i + 10, y3[4] + 1, x1[3] + i, y3[3]));
            }
            int radius1 = (int) (fact*x8[1]);
            extraEllipse.add(0, new ExtraEllipse(x8[2], y8[7],  radius1, radius1));
            int radius2 = (int) (fact*x8[4]);
            extraEllipse.add(0, new ExtraEllipse(x8[2], y8[2], radius2, radius2));
            int radius3 = (int) (fact*x8[7]);
            extraEllipse.add(0, new ExtraEllipse(x8[2], y8[5], radius3, radius3));
            extraLine.add(0, new ExtraLine(x8[0], y8[7], x8[0] - 5, y8[7]));
            extraLine.add(0, new ExtraLine(x8[1], y8[7], x8[1] + 5, y8[7]));
            extraLine.add(0, new ExtraLine(x8[3], y8[2], x8[3] - 5, y8[2]));
            extraLine.add(0, new ExtraLine(x8[4], y8[2], x8[4] + 5, y8[2]));
            extraLine.add(0, new ExtraLine(x8[6], y8[5], x8[6] - 5, y8[5]));
            extraLine.add(0, new ExtraLine(x8[7], y8[5], x8[7] + 5, y8[5]));
            extraLine.add(0, new ExtraLine(x8[0], y8[7] - 1, x8[0] - 5, y8[7] - 1));
            extraLine.add(0, new ExtraLine(x8[1], y8[7] - 1, x8[1] + 5, y8[7] - 1));
            extraLine.add(0, new ExtraLine(x8[3], y8[2] - 1, x8[3] - 5, y8[2] - 1));
            extraLine.add(0, new ExtraLine(x8[4], y8[2] - 1, x8[4] + 5, y8[2] - 1));
            extraLine.add(0, new ExtraLine(x8[6], y8[5] - 1, x8[6] - 5, y8[5] - 1));
            extraLine.add(0, new ExtraLine(x8[7], y8[5] - 1, x8[7] + 5, y8[5] - 1));
            if ( gang[0] == 1 ) {


                int xstep = 110;
                int ystep = 20;
                extraText.add(0, new ExtraText("Dimension2 "     , x8[4] + 20, y8[7]));
                extraText.add(0, new ExtraText("Dimension1 " ,  x8[4] + 20, y8[2]));
                extraText.add(0, new ExtraText("Dimension3 " , x8[4] + 20, y8[5]));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[21]))).toString(),x8[4] + 40+ xstep , y8[7]));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[20]))).toString(), x8[4] + 40 + xstep, y8[2] ));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[23]))).toString(), x8[4] + 40 + xstep, y8[5]));
                extraText.add(0, new ExtraText(" mm" ,x8[4] + 40+ xstep + ystep, y8[7]   ));
                extraText.add(0, new ExtraText(" mm" , x8[4] + 40+ xstep + ystep, y8[2] ));
                extraText.add(0, new ExtraText(" mm" , x8[4] + 40 + xstep+ystep, y8[5] ));
            }
        }
        if (plotType.equals("On plate")) {
            for (int i = 0; i < 6 * s; i += 20) {
                extraBue.add(0, new ExtraBue(x2[1], y2[1] + i, 0, y2[1] + i + 10, x2[7], y2[1] + i));
            }
            if ( gang[0] == 1 ) {
                int xstep = 110;
                int ystep = 20;
                extraText.add(0, new ExtraText("Dimension1 "     ,x1[1]- 4*ystep, y2[2] + 10));
                extraText.add(0, new ExtraText("Dimension2 " , x1[1]- 4*ystep, y1[1] + 2*ystep));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[20]))).toString(),x1[1]- 3*ystep+ xstep , y2[2] + 10));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[21]))).toString(), x1[1]- 3*ystep  + xstep, y1[1] + 2*ystep));
                extraText.add(0, new ExtraText(" mm" , x1[1]+ ystep + xstep - 3*ystep, y2[2] + 10 ));
                extraText.add(0, new ExtraText(" mm" , x1[1]+ ystep + xstep - 3*ystep,  y1[1] + 2*ystep));
            }
        }
        if (plotType.equals("Bolt joint")) {
            extraTall.add(0, new ExtraTall("1"    ,x2[6]- vec[23]/2, y2[6] - 4*vec[23]/2));
            extraTall.add(0, new ExtraTall("2"    ,x1[0]+ 4*vec[23], y1[0] - 4*vec[23]/2 ));
            if (gang[0] == 1 ) {
                int xstep = vec[21];
           //     extraTall.add(0, new ExtraTall("mm"     ,x1[1]+ 3*xstep, y1[1] - vec[21]/2));
           //     extraTall.add(0, new ExtraTall("Ø" , x2[5]+ xstep, y2[5]- 2*vec[23]/2 ));
                extraTall.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[21]))).toString() + " mm",x1[1] + xstep , y1[1]- vec[21]/2 )) ;
                extraTall.add(0, new ExtraTall(("Ø" + new StringBuilder(String.valueOf(vec[20]))).toString(), x2[5] + 2*xstep, y2[5] ));
            }
        }
        if (plotType.equals("Tube on plate")) {
            extraTall.add(0, new ExtraTall("1"     ,x2[0]+ vec[23]/2, y2[0] - vec[23]/2));
            extraTall.add(0, new ExtraTall("1"    ,x2[6]+ vec[23]/2, y2[6] - vec[23]/2));
            extraTall.add(0, new ExtraTall("2"    ,x1[0]+ vec[23], y1[0] - vec[23]/2));
            if (gang[0] == 1 ) {
                int ystep = 20;
                int xstep = vec[21];
                extraLine.add(0, new ExtraLine(x2[1], y2[1]-ystep, x2[0], y2[1] - 2*ystep));
                extraLine.add(0, new ExtraLine(x2[5], y2[5]-ystep, x2[5], y2[5]- 2*ystep));
         //       extraText.add(0, new ExtraText("Ø"     ,x1[1]+ xstep, y1[1] ));
          //      extraTall.add(0, new ExtraTall("mm"     ,x1[1]+ 3*xstep, y1[1]-xstep/2 ));
          //      extraTall.add(0, new ExtraTall("Ø" , - xstep, y2[5]- 2*xstep ));
          //      extraTall.add(0, new ExtraTall("t=" , x1[2] +xstep, y1[2]- 2*xstep ));
                extraTall.add(0, new ExtraTall((new StringBuilder("Ø" + String.valueOf(vec[21]))).toString() + " mm",x1[1] + 2*xstep , y1[1])) ;
                extraTall.add(0, new ExtraTall((new StringBuilder( "ø" + String.valueOf(vec[20]))).toString(), 0, y2[5]-2*xstep ));
                extraTall.add(0, new ExtraTall((new StringBuilder("t = " + String.valueOf(vec[23]))).toString(), x1[2] + 2*xstep, y1[2]- 2*xstep ));
            }
        }
        if (plotType.equals("Tube on plate 45 degrees")) {
            extraTall.add(0, new ExtraTall("1"     ,x2[0]+ 5*vec[23]/4, y2[0] - vec[23]/2));
            extraTall.add(0, new ExtraTall("1"    ,x2[6]+ 5*vec[23]/4, y2[6] - vec[23]/2));
            extraTall.add(0, new ExtraTall("2"    ,x1[0]+ vec[23], y1[0] - vec[23]/2));
            if (gang[0] == 1 ) {
                int ystep = 20;
                int xstep = vec[21];
                extraLine.add(0, new ExtraLine(x2[1], y2[1]-ystep, x2[1], y2[1]- 2*ystep));
                extraLine.add(0, new ExtraLine(x2[5], y2[5]-ystep, x2[5], y2[5]- 2*ystep));
            //    extraTall.add(0, new ExtraTall("mm"     ,x1[1]+ 3*xstep, y1[1]-xstep/2 ));
            //    extraTall.add(0, new ExtraTall("Ø" , x2[3] + xstep, y2[3]- 2*xstep  ));
            //    extraTall.add(0, new ExtraTall("t=" , x1[2] +xstep, y1[2]- 2*xstep ));
                extraTall.add(0, new ExtraTall((new StringBuilder(String.valueOf(vec[21]))).toString() + " mm",x1[1] + xstep , y1[1] - xstep/2)) ;
                extraTall.add(0, new ExtraTall((new StringBuilder("Ø" + String.valueOf(vec[20]))).toString(), x2[1], y2[3]-2*xstep  ));
                extraTall.add(0, new ExtraTall((new StringBuilder("t = " + String.valueOf(vec[23]))).toString(), x1[2] +2*xstep, y1[2] - 2*xstep ));
            }
        }
        if (plotType.equals("Cross joint")) {
            int i;
            for (i = 0; i < 4 * s; i += 20) {
                extraBue.add(0, new ExtraBue(x1[0] + i, y1[0], x1[0] + i + 10, 0, x1[3] + i, y1[3]));
            }
            for (i = 0; i < 4 * s; i += 20) {
                extraBue.add(0, new ExtraBue(x4[0] + i, y4[0], x4[0] + i + 10, 0, x4[3] + i, y4[3]));
            }
            for (i = 0; i < 6 * s; i += 20) {
                extraBue.add(0, new ExtraBue(x2[1], y2[1] + i, 0, y2[1] + i + 10, x2[7], y2[1] + i));
            }
            for (i = 0; i < 8 * s; i += 20) {
                extraBue.add(0, new ExtraBue(x3[0] + i, y3[0], x3[0] + i + 10, y3[1], x3[0] + i, y3[2]));
            }

            int radius = (int) (fact*x8[1]);
            extraEllipse.add(0, new ExtraEllipse(x8[0]+x8[1], y8[3], radius, radius));
            extraLine.add(0, new ExtraLine(x8[1], y8[3], x8[1] + 5, y8[3]));
            extraLine.add(0, new ExtraLine(x8[0], y8[3], x8[0] - 5, y8[3]));
            extraLine.add(0, new ExtraLine(x8[1], y8[3] - 1, x8[1] + 5, y8[3] - 1));
            extraLine.add(0, new ExtraLine(x8[0], y8[3] - 1, x8[0] - 5, y8[3] - 1));

            if ( gang[0] == 1 ) {
                int xstep = 110;
                int ystep = 20;
                extraText.add(0, new ExtraText("Dimension2 "     ,  x3[1]- 4*ystep, y2[4] + 10- 8*ystep));
                extraText.add(0, new ExtraText("Dimension1 " , x3[1]-4*ystep, y3[1] + 3*ystep));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[21]))).toString(), x3[1]- 3*ystep+ xstep , y2[4] + 10 - 8*ystep));
                extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(vec[20]))).toString(),  x3[1]- 3*ystep  + xstep, y3[1] + 3*ystep));
                extraText.add(0, new ExtraText(" mm" ,  x3[1]- 3*ystep + xstep + ystep, y2[4] + 10 - 8*ystep ));
                extraText.add(0, new ExtraText(" mm" ,  x3[1] - 3*ystep + xstep + 2*ystep, y3[1] + 3*ystep));
            }
        }

        if (plotType.equals("corner")) {
            String v0 = " 1 ";
            extraTall.add(0, new ExtraTall(v0, x1[0] + vec[1] / 4, y1[0] - 2 * vec[1]));
            v0 = " 2 ";
            extraTall.add(0, new ExtraTall(v0, x2[0] - vec[2], y2[0] - 2 * vec[2]));
            extraLine.add(0, new ExtraLine(x2[0], y2[0], x2[0] + 5, y2[0] - vec[2]));
            extraLine.add(0, new ExtraLine(x2[0] + 5, y2[0] - vec[2], x2[3], y2[3]));
        }
        if (plotType.equals("overlap")) {
            String v0 = " 1 ";
            extraTall.add(0, new ExtraTall(v0, x1[4] - 20, y1[4] + 10));
            v0 = " 2 ";
            extraTall.add(0, new ExtraTall(v0, x2[4] + 20, y2[4] + 5));
        }
        if( gang[2] == 13) {
            gang[6] = 0;
            original = true;
        }
        if( gang[2] == 14) {
            original= true;
        }
        gang[22] = x1[13];
        gang[21] = y1[14];
    }







}






