package com.example.application.images;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("viewF")
public class BezierViewD extends VerticalLayout {

    public BezierViewD() {
        /*
        getElement().executeJs("vaadinBridge = { returnPoints: function(points) { $0.$server.receivePoints(points); } };", getElement());
    }

    @ClientCallable
    public void receivePoints(JsonArray points) {
        points.forEach(point -> {
            JsonObject obj = point.asJsonObject();
            double x = obj.getNumber("x");
            double y = obj.getNumber("y");
            System.out.println("Point: (" + x + ", " + y + ")");
        });

         */
    }
}

