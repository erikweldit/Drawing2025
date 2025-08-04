package com.example.application.under;




/**
 * Generate an eclipse object
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class ExtraEllipse {
    private int a1;
    private int a2;
    private int b1;
    private int b2;

    public ExtraEllipse(){
    }

    public ExtraEllipse(int a1, int a2, int b1, int b2){
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
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
}




