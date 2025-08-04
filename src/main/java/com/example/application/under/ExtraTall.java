package com.example.application.under;





/**
 * Generate an extra number object
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class ExtraTall {
    private int a1;
    private int a2;

    private String text;

    public ExtraTall(){
    }

    public ExtraTall(String text, int a1, int a2){
        this.a1 = a1;
        this.a2 = a2;
        this.text = text;
    }

    public int getFirstX() {
        return this.a1;
    }
    public int getFirstY() {
        return this.a2;
    }

    public String getLastString() {
        return this.text;
    }

    public void setLastString(String text) {
        this.text = text;
    }

    public void setFirstX(int a1) {
        this.a1 = a1;
    }

    public void setFirstY(int a2) {
        this.a2 = a2;
    }
}




