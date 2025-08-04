package com.example.application.under;




/**
 * Generate a comment object
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class ExtraComment {
    private int a1;
    private int a2;

    private String text;

    private String plotType;
    private int type;
    private int plotIndicator;

    public ExtraComment(){
    }
    public ExtraComment(String text, int a1, int a2, int plotIndicator){
        this.a1 = a1;
        this.a2 = a2;
        this.text = text;
        this.plotIndicator = plotIndicator;

    }
    public ExtraComment(String plotType, int type, String text, int a1, int a2, int plotIndicator){
        this.a1 = a1;
        this.a2 = a2;
        this.text = text;
        this.plotType = plotType;
        this.type = type;
        this.plotIndicator = plotIndicator;

    }

    public int getFirstX() {
        return this.a1;
    }
    public int getFirstY() {
        return this.a2;
    }
    public void  setFirstX(int a1) {
        this.a1= a1;
    }
    public void  setFirstY(int a2) {
        this.a2= a2;
    }
    public int getType() {
        return this.type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getFirstString() {
        return this.plotType;
    }
    public String getLastString() {
        return this.text;
    }
    public void setFirstString(String text) {
        this.plotType = text;
    }
    public void setLastString(String text) {
        this.text = text;
    }
    public int getPlotIndicator() {return this.plotIndicator;}
    public void setPlotIndicator(int plotInd) { this.plotIndicator = plotInd ;}

}




