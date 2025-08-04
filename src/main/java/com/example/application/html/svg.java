package com.example.application.html;


/**
 *Genererer elementee i en svg fil
 *Konstruktøren bestemmer størrelsen til filen
 *svg(int width, int height, int wLow, int hLow, int wUp, int hUp)
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class svg {
    String color1 = "black";
    String color2 = "blue";
    String color3 = "red";
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

    public svg() {

    }

    public svg(int width, int height, int wLow, int hLow, int wUp, int hUp) {
        this.width = width;
        this.height = height;
        this.wLow = wLow;
        this.wUp = wUp;
        this.hLow = hLow;
        this.hUp = hUp;

        actualColor = color1;
        actualSize = strokeWidth1;
    }
    public void setStroke(int i1 ){
        actualSize = i1;
    }
    public void setColor(String color){
        actualColor = color;
    }
    public String drawBezier2(int i1, int j1, int i2, int j2, int k2, int k3){
        String svgInnhold = "<path d='M " + i1 + " " + j1 + " q  " +(i2-i1) + " " + (j2-j1) + " " + (k2-i1) + " "
                + (k3-j1) + " ' " +" pointer-events ='visiblePainted' stroke='" + actualColor + "' stroke-width='" + actualSize  + "' fill='none' />\n";
        return svgInnhold;
    }
    public String drawEllipse(int  i1, int j1, int i2, int j2 ) {
        String svgInnhold = "<ellipse cx = ' " + i1 + "'  cy= ' " + j1 + "'  rx= ' " + i2+ "'  ry= ' " + j2 + " ' " +"  stroke='" + actualColor + "' stroke-width='" + actualSize + "' fill='none' /> \n";
        return svgInnhold;
    }
    public String initializeSvg(int width, int height) {
        String svgStart = "<svg height='" + height + "'" + " width='" +  width +
                "' viewBox = '" + wLow + " " + hLow + " " + wUp + " " + hUp +
                "' xmlns='http://www.w3.org/2000/svg'  xmlns:xlink = 'http://www.w3.org/1999/xlink' >  \n";
        //    System.out.println(svgStart);
        return  svgStart;
    }
    /*
    public String mouseCoordinats() {
        String  svgInnhold = "<script type = 'text/ecmascript' >"  +
                "<![CDATA[ " +
                "function handleClick(event) { " +
                "var x = event.clientX; " +
                "var y = event.clientY; " +
                "console.log('Museklikk - X: '  + x + ' , Y : ' + y ');' " +
                "} ]]> " +
                "</script>";
        return svgInnhold;
    }
    public String mouseMove() {
        String  svgInnhold = "<script type = 'text/ecmascript' >"  +
                "<![CDATA[ " +
                "function handleMousemove(event) { " +
                "var x = event.clientX; " +
                "var y = event.clientY; " +
                "console.log('Musebevegelse - X: '  + x + ' , Y : ' + y ');' " +
                "} ]]> " +
                "</script>";
        return svgInnhold;
    }
    public String test(){
        String  svgInnhold = "<circle cx='100' cy= '100' r= '50' fill='blue' "  +
                "onclick= 'handleClick(event)' />";
        return svgInnhold;
    }
    public String testMove(){
        String  svgInnhold = "<circle cx='200' cy= '100' r= '50' fill='blue' "  +
                "onclick= 'handleMousemove(event)' />";
        return svgInnhold;
    }

     */
    public String drawText(String testTall, int i1, int j1 ){
        String  svgInnhold = "<text x = '" + i1 + "'  y= '" + j1 + "' fill='" + actualColor + "' >" + testTall + "</text> \n";
        return svgInnhold;
    }
    public String svgEnd(){
        String svgStop = "Sorry, your browser does not support inline SVG. </svg> \n";
        return  svgStop;
    }
    public String drawRect(int i1, int j1, int i2, int j2 ){
        String svgInnhold = "<rect x='" + i1 + "' y=' " + j1 + "' width='" + i2 + "' height='" + j2 + "' stroke='" + color3 + "' stroke-width='" + actualSize + "' fill='none' /> \n";

        return svgInnhold;
    }

    public String drawLine(int i1, int j1, int i2, int j2 ) {
        String svgInnhold = "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + i2 + "' y2='" + j2 + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' fill='none' /> \n";

        return svgInnhold;
    }
    public String drawCircle(int i1, int j1, int r ) {
        String svgInnhold = "<circle cx='" + i1 + "' cy=' " + j1 + "' r='" + r + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' fill='none' />\n";

        return svgInnhold;
    }
    public String drawArrow(int i1, int j1, int i2, int j2 , int k1, int k2) {


        String svgInnhold = "<defs> \n " ;
        svgInnhold += " <marker id = 'circle' markerWidth = '0' markerHeight = '0' refX = '0' refY = '0' >\n " +
                " <circle cx = '0' cy = '0' r= '0' /> \n " +
                "</marker> \n";
        svgInnhold += " <marker id = 'arrow' markerWidth = '4' markerHeight = '4' refX = '2' refY = '2' orient = 'auto' > \n" +
                " <path d = 'M 0 0 L 4 2 L 0 4 z' fill = ' " + actualColor + " ' /> \n" +
                "</marker> \n";
        svgInnhold += "</defs>\n " ;

        //         svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + (i1-2*trin) + "' y2='" + (j1+2*trin) + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' \n" +
        //"marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

        svgInnhold += "<line x1='" + i1 + "' y1=' " + j1 + "' x2='" + i2 + "' y2='" + j2 + "' stroke='" + actualColor + "' stroke-width='" + actualSize + "' \n" +
                "marker-start= 'url(#circle)' marker-end = 'url(#arrow)' /> \n";

        return svgInnhold;
    }


}




