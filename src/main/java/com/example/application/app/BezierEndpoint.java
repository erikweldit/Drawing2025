package com.example.application.app;


//import com.vaadin.hilla.Endpoint;
//import com.vaadin.hilla.Nonnull;

//@Endpoint
public class BezierEndpoint {

    public Point updatePoint( Point point) {   // @Nonnull
        // Håndter oppdateringen her. F.eks. lagre i en database eller logge
        //    System.out.println("Oppdatert punkt: " + point);
        return point;
    }

    public static class Point {
        public double x;
        public double y;

        public Point() {}

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}


