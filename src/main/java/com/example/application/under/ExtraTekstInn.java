package com.example.application.under;





/**
 * Generate a text object
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class ExtraTekstInn {

    private String tekstBeskr;
    private int b1;
    private int b2;

    ExtraTekstInn(){
    }

    ExtraTekstInn(String tekstBeskr, int b1, int b2){
        this.tekstBeskr = tekstBeskr;
        this.b1 = b1;
        this.b2 = b2;
    }

    public String getFirstText() {
        return this.tekstBeskr;
    }

    public int getFirstX() {
        return this.b1;
    }
    public int getLastX() {
        return this.b2;
    }

}



