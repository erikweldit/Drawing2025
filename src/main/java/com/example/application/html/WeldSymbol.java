package com.example.application.html;





/**
 * Generate string with svg code for actual welding string
 */
public class WeldSymbol {


    String color1 = "black";
    String color2 = "blue";
    String color3 = "green";
    int strokeWidth3 = 1;
    int strokeWidth1 = 1;
    public static String actualColor;
    public static int actualSize;
    public static int width;
    public static int height;
    public static int wLow;
    public static int wUp;
    public static int hLow;
    public static int hUp;
    public static int typeSymbol;
    public String svgInnhold;

    public WeldSymbol(){

    }

    public WeldSymbol(int typeSymbol, int width, int height  ) {
        this.width = width;
        this.height = height;
        this.typeSymbol = typeSymbol;
        actualColor = color3;
        actualSize = strokeWidth1;
        String svgInnhold = "";
        choseSymbol(typeSymbol,width, height);

    }


    public WeldSymbol(String Symbol, int width, int height , int tull ) {
        this.width = width;
        this.height = height;
        this.typeSymbol = giveInteger(Symbol);
        actualColor = color3;
        actualSize = strokeWidth1;
        String svgInnhold = "";
        choseSymbol(typeSymbol,width, height);

    }
    public void setStroke(int i1 ){
        actualSize = i1;
    }
    public void setColor(String color){
        actualColor = color;
    }
    public String choseSymbol(int typeSymbol, int width, int height){
        int i1 = width;
        int j1 = height;
        int trin = 5;
        svgInnhold = "<defs> \n " ;
        svgInnhold += " <marker id = 'circle' markerWidth = '0' markerHeight = '0' refX = '0' refY = '0' > " +
                " <circle cx = '0' cy = '0' r= '0' /> \n " +
                "</marker> \n";
        svgInnhold += " <marker id = 'arrow' markerWidth = '4' markerHeight = '4' refX = '2' refY = '2' orient = 'auto' > \n" +
                " <path d = 'M 0 0 L 4 2 L 0 4 z' fill = ' " + color1 + " ' /> \n" +
                "</marker> \n";
        svgInnhold += "</defs>\n " ;
        if (typeSymbol == 0) {  svgInnhold += "";}

        if (typeSymbol == 1) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+9*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;

            svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //  System.out.println(svgInnhold);
        }
        if (typeSymbol == 2) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 2
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +8*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // b 2
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 3) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + (j1+trin) + "' x2='" + (i1+20*trin) + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-dasharray = '" + trin + "'  /> \n" ;  // stiplet
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 3
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // c 3
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 4) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +10*trin)  + "' y2='" + (j1-1*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // d 4
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // e 4
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // f 4
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 5) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + (j1+trin) + "' x2='" + (i1+20*trin) + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-dasharray = '" + trin + "'  /> \n" ;  // stiplet
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  //  5

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // h 5

            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 6) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +8*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  //  i  6

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // j 6

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +8*trin)  + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  //  i  6

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // j 6
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 7) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + (j1+trin) + "' x2='" + (i1+20*trin) + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-dasharray = '" + trin + "'  /> \n" ;  // stiplet
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 2
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +8*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // b 2
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 2
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +8*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // b 2
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+1*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  //  k  7

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+1*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // l 7

            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 8) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 3
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // c 3
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +10*trin)  + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // m  8

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +13*trin)  + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // n 8
            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 9) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + (j1+trin) + "' x2='" + (i1+20*trin) + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-dasharray = '" + trin + "'  /> \n" ;  // stiplet
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 3
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // c 3
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +10*trin)  + "' y2='" + (j1+1*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // o  9

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+1*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // p 9
            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 10) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + (j1+trin) + "' x2='" + (i1+20*trin) + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-dasharray = '" + trin + "'  /> \n" ;  // stiplet

            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // q  10

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1- 2*trin) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // r 10
            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 11) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // s  11

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1- 2*trin) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // t 11

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 +10*trin)  + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // u  11

            svgInnhold += "<line x1='" + (i1 +10*trin) + "' y1=' " + (j1+2*trin) + "' x2='" + (i1 +12*trin)  + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // v 11

            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }

        if (typeSymbol == 12) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-9*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;

            svgInnhold += "<line x1='" + (i1 -11*trin) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            svgInnhold += "<line x1='" + (i1 -11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 -11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 -9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 -9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //  System.out.println(svgInnhold);
        }
        if (typeSymbol == 13) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 2
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -8*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // b 2
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            //   svgInnhold += "<line x1='" + (i1 -11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 -11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 -9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 -9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 14) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + (j1+trin) + "' x2='" + (i1-20*trin) + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-dasharray = '" + trin + "'  /> \n" ;  // stiplet
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 3
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // c 3
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 15) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -10*trin)  + "' y2='" + (j1-1*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // d 4
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 -9*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // e 4
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // f 4
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 16) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + (j1+trin) + "' x2='" + (i1-20*trin) + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-dasharray = '" + trin + "'  /> \n" ;  // stiplet
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  //  5

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 -11*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // h 5

            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 17) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -8*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  //  i  6

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // j 6

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -8*trin)  + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  //  i  6

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // j 6
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 18) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + (j1+trin) + "' x2='" + (i1-20*trin) + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-dasharray = '" + trin + "'  /> \n" ;  // stiplet
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 2
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -8*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // b 2
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 2
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -8*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // b 2
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -9*trin)  + "' y2='" + (j1+1*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  //  k  7

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -11*trin)  + "' y2='" + (j1+1*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // l 7

            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 19) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 3
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // c 3
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -10*trin)  + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // m  8

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -13*trin)  + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // n 8
            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 20) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + (j1+trin) + "' x2='" + (i1-20*trin) + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-dasharray = '" + trin + "'  /> \n" ;  // stiplet
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // a 3
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // c 3
            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;


            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -10*trin)  + "' y2='" + (j1+1*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // o  9

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -11*trin)  + "' y2='" + (j1+1*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // p 9
            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 21) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + (j1+trin) + "' x2='" + (i1-20*trin) + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-dasharray = '" + trin + "'  /> \n" ;  // stiplet

            //      svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + j1 + "' x2='" + (i1+20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // q  10

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1- 2*trin) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // r 10
            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        if (typeSymbol == 22) {
            svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1+2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' " +
                    "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

            svgInnhold += "<line x1='" + (i1 ) + "' y1=' " + j1 + "' x2='" + (i1-20*trin) + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -10*trin)  + "' y2='" + (j1-2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // s  11

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1- 2*trin) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // t 11

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1) + "' x2='" + (i1 -10*trin)  + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // u  11

            svgInnhold += "<line x1='" + (i1 -10*trin) + "' y1=' " + (j1+2*trin) + "' x2='" + (i1 -12*trin)  + "' y2='" + (j1) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;  // v 11

            //   svgInnhold += "<line x1='" + (i1 +11*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +11*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   svgInnhold += "<line x1='" + (i1 +9*trin) + "' y1=' " + (j1-trin) + "' x2='" + (i1 +9*trin)  + "' y2='" + (j1+trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' />\n" ;
            //   System.out.println(svgInnhold);
        }
        return svgInnhold;
    }
public int giveInteger(String Symbol){
        String atext;
        atext = Symbol;
        int number = 0;
    switch ( atext ) {
        case "0" :
            //   svgInnhold = sym1.choseSymbol(0, a1, a2);
            //  tester.setSymbol(svgInnhold);
            break;
        case "1":
            number = 1;
            break;
        case "2" :
            number = 2;
            break;
        case "3" :
            number = 3;
            break;
        case "4" :
            number = 4;
            break;
        case "5" :
            number = 5;
            break;
        case "6" :
            number = 6;
            break;
        case "7" :
            number = 7;
            break;
        case "8" :
            number = 8;
            break;
        case "9" :
            number = 9;
            break;
        case "10" :
            number = 10;
            break;
        case "11" :
            number = 11;
        case "12" :
            number = 12;
            break;
        case "13" :
            number = 13;
            break;
        case "14" :
            number = 14;
            break;
        case "15" :
            number = 15;
        case "16" :
            number = 16;
            break;
        case "17" :
            number = 17;
            break;
        case "18" :
            number = 18;
            break;
        case "19" :
            number = 19;
            break;
        case "20" :
            number = 20;
            break;
        case "21" :
            number = 21;
            break;
        case "22" :
            number = 22;
            break;
        default :  break;
    }

        return number;
}


}


