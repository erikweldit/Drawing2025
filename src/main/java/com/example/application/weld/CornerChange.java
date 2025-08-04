package com.example.application.weld;

import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;



/**
 * Shows interface for generating actual values for corner weld
 * All values used in calculation fr the forms are given as input from user
 * Values for standard forms are gives as default
 * but a form has to be chosen or a blank page appear
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route(value = "CornerChange", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Corner weld specifications")
//@Route("Corner")
public class CornerChange extends HorizontalLayout {
    private double[] vec = new double[35];
    boolean plotOK = true;
    String plotType;
    int antall;
    String vDesign;
    String hDesign;

    String comment;
    public CornerChange() {

        this.plotType = CalcValues.plotType;
        this.antall = CalcValues.antall;
        this.vec = CalcValues.vecDouble;
        this.comment = CalcValues.comment;

        Select<String> selectDraw = new Select<>();
        selectDraw.setLabel("Values on picture");
        selectDraw.setItems("Yes", "No");
        selectDraw.setValue("Yes");

        Select<String> selectPlaceButt = new Select<>();
        selectPlaceButt.setLabel("Choose plot - type");
        selectPlaceButt.setItems("Zoomable picture ",
                "Single picture - big",
                "13 - 2 picture vertical left",
                "24 - 2 picture vertical right&finishing",
                "12 - 2 picture horizontal upper",
                "34 - 2 picture horizontal lower&finishing",
                "1 - 4 picture left upper",
                "2 - 4 picture right upper",
                "3 - 4 picture left lower",
                "4 - 4 picture right lower&finishing");
        selectPlaceButt.setValue("Single picture - big");
        selectPlaceButt.setWidth("400px");


        NumberField angleCorner = new NumberField();
        angleCorner.setValue(90.0);
        angleCorner.setLabel("Angle ");
        angleCorner.setClearButtonVisible(true);

        NumberField tickness1Corner = new NumberField();
        tickness1Corner.setValue(10.0);
        tickness1Corner.setLabel("Thickness plate 1");
        tickness1Corner.setClearButtonVisible(true);

        NumberField tickness2Corner = new NumberField();
        tickness2Corner.setValue(10.0);
        tickness2Corner.setLabel("Thickness plate 2");
        tickness2Corner.setClearButtonVisible(true);

        NumberField leftAngleCorner = new NumberField();
        leftAngleCorner .setValue(0.0);
        leftAngleCorner .setLabel("Left angle");
        leftAngleCorner .setClearButtonVisible(true);

        NumberField rightAngleCorner  = new NumberField();
        rightAngleCorner.setValue(0.0);
        rightAngleCorner.setLabel("Right angle");
        rightAngleCorner.setClearButtonVisible(true);

        NumberField leftDxCorner = new NumberField();
        leftDxCorner.setValue(0.0);
        leftDxCorner.setLabel("Plate 1 Dx");
        leftDxCorner.setClearButtonVisible(true);

        NumberField rightDxCorner = new NumberField();
        rightDxCorner.setValue(0.0);
        rightDxCorner.setLabel("Plate 2 Dx");
        rightDxCorner.setClearButtonVisible(true);

        TextArea textArea = new TextArea();
        textArea.setWidth("400px");
        textArea.setMinHeight("100px");
        textArea.setMaxHeight("150px");
        textArea.setLabel("Comments");
        textArea.setValue(" ");

        Button addButton = new Button("Generate picture");
        addButton.setWidth("400px");
        addButton.addThemeVariants(ButtonVariant.LUMO_LARGE);
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        addButton.addClickListener(click -> {

            String comment = textArea.getValue();

            String typetPlace = selectPlaceButt.getValue();
            if (typetPlace.equals("Zoomable picture "))   vec[26] = 0;
            if (typetPlace.equals("Single picture - big"))   vec[26] = 14;
            if (typetPlace.equals( "13 - 2 picture vertical left"))   vec[26] = 15;
            if (typetPlace.equals("24 - 2 picture vertical right&finishing"))   vec[26] = 16;
            if (typetPlace.equals("12 - 2 picture horizontal upper"))   vec[26] = 11;
            if (typetPlace.equals("34 - 2 picture horizontal lower&finishing"))   vec[26] = 12;
            if (typetPlace.equals ("1 - 4 picture left upper"))   vec[26] = 7;
            if (typetPlace.equals("2 - 4 picture right upper"))   vec[26] = 8;
            if (typetPlace.equals("3 - 4 picture left lower"))   vec[26] = 9;
            if (typetPlace.equals("4 - 4 picture right lower&finishing"))   vec[26] = 10;

            String typetDraw = selectDraw.getValue();
            if (typetDraw.equals("Yes"))  vec[10] = 1;
            if (typetDraw.equals("No"))  vec[10] = 0;
            vec[0] = angleCorner.getValue();
            vec[1] = tickness1Corner.getValue();
            vec[2] = tickness2Corner.getValue();
            vec[3] = leftAngleCorner.getValue();
            vec[4] = rightAngleCorner.getValue();
            vec[5] = leftDxCorner.getValue();
            vec[6] = rightDxCorner.getValue();
            vec[7] = 100;  // scaler
            vec[8] = 0;    // rotate
            vec[9] = 0;
            double tickness = (vec[2] + vec[1])/2;
            Home.setFactor(11/tickness);
            vec[12] = 0;
            vec[13] = 1;
            vec[14] = 2;
            vec[15] = 1;
            vec[16] = 0;

            new CalcValues( plotType, antall, vec, comment);


            //             addButton.addClickShortcut(Key.ENTER);
        });

        VerticalLayout  v1 = new VerticalLayout( angleCorner, tickness1Corner, leftAngleCorner, leftDxCorner  );
        VerticalLayout  v11 = new VerticalLayout( selectDraw, tickness2Corner, rightAngleCorner, rightDxCorner  );
        VerticalLayout  v2 = new VerticalLayout(  addButton );

        VerticalLayout  v22 = new VerticalLayout(   );
        VerticalLayout  v23 = new VerticalLayout(   );
        VerticalLayout  v24 = new VerticalLayout(   );

        add(
                v1, v11, v2, v22, v23, v24
        );

    }
}








