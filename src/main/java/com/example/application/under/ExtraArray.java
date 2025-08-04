package com.example.application.under;




/**
 * Generate an arrayobject
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class ExtraArray {
    private int a1;
    private int a2;
    private int b1;
    private int b2;
    private int c1;
    private int c2;

    public ExtraArray(){
    }

    public ExtraArray(int a1, int a2, int b1, int b2, int c1, int c2){
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
        this.c1 = c1;
        this.c2 = c2;
    }

    public int getFirstX() {
        return this.a1;
    }
    public int getLastX() {
        return this.b1;
    }
    public int getFirstY() {
        return this.a2;
    }
    public int getLastY() {
        return this.b2;
    }
    public int getFirstZ() {
        return this.c1;
    }
    public int getLastZ() {
        return this.c2;
    }
}







