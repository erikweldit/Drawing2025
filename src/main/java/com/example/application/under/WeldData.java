package com.example.application.under;





import java.util.ArrayList;
//import weld.WeldPoint;

/**
 *
 * Used for testing only
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
public class WeldData {
    private ArrayList<WeldPoint> weldListing = new ArrayList<>();

    WeldData() {
    }



    public WeldData(ArrayList<WeldPoint> weldListing){
        this.weldListing = weldListing;

    }


    //@SuppressWarnings("unused")
    public int newsize() {
//		System.out.println("indre test 23  " + this.weldListing.size());
        return this.weldListing.size();
    }

}








