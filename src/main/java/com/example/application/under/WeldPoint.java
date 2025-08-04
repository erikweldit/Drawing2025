package com.example.application.under;


import java.awt.Point;

/**
 *
 * Generate a weldpoint object
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
public class WeldPoint {
    Point firstPoint = new Point();
    Point lastPoint = new Point();
    Point middelPoint = new Point();
    Point textPoint = new Point();
    String text = "";
    String atext;
    String user;
    int index;
    int code;
    Boolean punktPlottes = false;
    Boolean textPlottes = false;
    int type;
    int indicator;
    String plotType;
    String svgTab =  " ";

    public WeldPoint(){

    }
    /*
        public WeldPoint(Point firstPoint, Point middelPoint, Point lastPoint, Point textPoint, String text, boolean punktPlottes, boolean textPlottes){
            this.firstPoint = firstPoint;
            this.middelPoint = middelPoint;
            this.lastPoint = lastPoint;
            this.textPoint = textPoint;
            this.text = text;
            this.punktPlottes = punktPlottes;
            this.textPlottes = textPlottes;
        }
        public WeldPoint(Point firstPoint, Point middelPoint, Point lastPoint, Point textPoint, String text, boolean punktPlottes, boolean textPlottes, int type, String plotType){
            this.firstPoint = firstPoint;
            this.middelPoint = middelPoint;
            this.lastPoint = lastPoint;
            this.textPoint = textPoint;
            this.text = text;
            this.punktPlottes = punktPlottes;
            this.textPlottes = textPlottes;
            this.type = type;
            this.plotType = plotType;
        }

     */
    public WeldPoint(Point firstPoint, Point middelPoint, Point lastPoint, Point textPoint, String text, boolean punktPlottes, boolean textPlottes, int type, String plotType, int index, String atext, int code, int indicator, String user, String SvgTab){
        this.firstPoint = firstPoint;
        this.middelPoint = middelPoint;
        this.lastPoint = lastPoint;
        this.textPoint = textPoint;
        this.text = text;
        this.punktPlottes = punktPlottes;
        this.textPlottes = textPlottes;
        this.type = type;
        this.plotType = plotType;
        this.index = index;
        this.atext = atext;
        this.code = code;
        this.indicator = indicator;
        this.user = user;
        this.svgTab = svgTab;
    }
    public Point getWeldPointFirst() {
        return this.firstPoint;
    }
    public Point getWeldPointLast() {
        return this.lastPoint;
    }
    public Point getWeldPointMiddel() {
        return this.middelPoint;
    }

    public Point getWeldPointTextPoint() {
        return this.textPoint;
    }
    public String getWeldPointText() {
        return this.text;
    }
    public boolean getWeldPointPlottes() {
        return this.punktPlottes;
    }
    public boolean getWeldTextPlottes() {
        return this.textPlottes;
    }
    public int getType() { return this.type; }
    public String getPlotType() { return this.plotType; }
    public void setWeldPointFirst( Point actualPoint) {
        this.firstPoint= actualPoint;
    }
    public void setWeldPointLast( Point actualPoint) {
        this.lastPoint= actualPoint;
    }
    public void setWeldPointMiddel( Point actualPoint) {
        this.middelPoint= actualPoint;
    }
    public void setWeldPointTextPoint( Point actualPoint) {
        this.textPoint = actualPoint;
    }
    public void setWeldText( String actualText) {
        this.text= actualText;
    }
    public void setWeldPointPlottes( boolean actualPlott) {
        this.punktPlottes= actualPlott;
    }
    public void setWeldTextPlottes(boolean actualPlott) {
        this.textPlottes = actualPlott;
    }
    public void setType(int type) { this.type = type; }
    public void setPlotType(String plotType) { this.plotType = plotType; }
    public void setIndex(int indeks) { this.index = indeks;}
    public int getIndex() { return this.index ;}
    public void setAString(String aT) { this.atext = aT; }
    public String getAString() {return this.atext;}
    public void setCode(int kode) { this.code = kode; }
    public int getCode() { return this.code;}
    public int getIndicator() { return this.indicator;}
    public void setIndicator(int kode) { this.indicator = kode; }

    public String getUser() {  return this.user;}
    public void setUser(String us) {this.user = us;}

    public String getSymbol() { return svgTab ;}
    public void setSymbol(String svgTab) { this.svgTab = svgTab;}
}









