package com.example.application.under;




import java.awt.*;

/**
 * klassen genererer objekter av typen ExtraSymbol
 *
 * */
public class ExtraSymbol {
    private int a1;
    private int a2;

    private int a3;

    private String text;
    private String atext;
    private Point punkt1 = new Point();


    public ExtraSymbol(){

    }

    public ExtraSymbol(String text, int a1, int a2, int a3, String atext){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.text = text;
        this.atext= atext;
    }

    public int getFirstX() {
        return this.a1;
    }
    public int getFirstY() {
        return this.a2;
    }
    public int getIndex() {
        return this.a3;
    }

    public void setIndex(int a4) {
        this.a3 = a4;
    }

    public String getLastString() {
        return this.text;
    }
    public void setLastString(String inn) {
        this.text = inn;
    }
    public String getAString() {
        return this.atext;
    }
    public void setAString(String aT) {
        this.atext = aT;
    }
}





