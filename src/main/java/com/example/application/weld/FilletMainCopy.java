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
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;



/**
 * Shows interface for generating actual values for fillet weld
 * All values used in calculation for the forms are given as input from user
 * Values for standard forms are gives as default
 * but a form has to be chosen or a blank page appear
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.comno
 */
@AnonymousAllowed
@Route(value = "FilletCopy", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Fillet weld specifications")
//@Route("Fillet")
public class FilletMainCopy extends HorizontalLayout {
    private double[] vec = new double[35];
    String plotType = "fillet";
    boolean plotOK = true;
    int antall = 23;
    public FilletMainCopy() {
        Image img = new Image("images/fugeprog2.jpg", "Info image");
        img.setWidth("560px");
        //  setSizeFull();
        Select<String> selectLeft = new Select<>();
        selectLeft.setLabel("Choose design");
        selectLeft.setItems(" ", "I", "X", "Y", "U", "DU");
        selectLeft.setValue(" ");

        Select<String> selectDraw = new Select<>();
        selectDraw.setLabel("Values on picture");
        selectDraw.setItems("Yes", "No");
        selectDraw.setValue("Yes");

        Select<String> selectPlaceButt = new Select<>();
        selectPlaceButt.setLabel("Choose plot-type");
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
        selectPlaceButt.setValue("Zoomable picture ");
        selectPlaceButt.setWidth("400px");

        TextField steelL = new TextField();
        TextField steelR = new TextField();
        TextField zoomBuildUp = new TextField();
        steelL.setLabel("Steel type left");
        steelR.setLabel("Steel type right");
        zoomBuildUp.setLabel("zoom Build Up");
        steelL.setValue(" ");
        steelR.setValue(" ");
        zoomBuildUp.setValue("6");


        TextField firstSignE = new TextField();
        firstSignE.setLabel("Gap Actual code values");
        firstSignE.setValue("I Y X U DU");
        TextField firstSignA2 = new TextField();
        firstSignA2.setLabel("a-side ");
        firstSignA2.setValue("I Y X U DU");

        TextField firstSignA3 = new TextField();
        firstSignA3.setLabel("Tickness ");
        firstSignA3.setValue("I Y X U DU");
        TextField firstSignA4 = new TextField();
        firstSignA4.setLabel("Top Angle/Bottom angle");
        firstSignA4.setValue("Y X U DU / X DU");
        TextField firstSignF5 = new TextField();
        firstSignF5.setLabel("Radius ");
        firstSignF5.setValue("U DU");
        TextField firstSignF9 = new TextField();
        firstSignF9.setLabel("Face / Center     ");
        firstSignF9.setValue("Y X U DU / X DU");
        TextField firstSignB6 = new TextField();
        firstSignB6.setLabel("Bottom Angle ");
        firstSignB6.setValue("X  DU");
        TextField firstSignB10 = new TextField();
        firstSignB10.setLabel("Center ");
        firstSignB10.setValue("X DU");
        TextField firstSignC7 = new TextField();
        firstSignC7.setLabel("Top Radius ");
        firstSignC7.setValue("U DU");
        TextField firstSignD8 = new TextField();
        firstSignD8.setLabel("Bottom radius ");
        firstSignD8.setValue("DU");

        NumberField gapFillet = new NumberField();
        gapFillet.setValue(0.0);
        gapFillet.setLabel("Gap ");
        gapFillet.setClearButtonVisible(true);

        Select<String> selectAngle = new Select<>();
        selectAngle.setLabel("Choose intern angle");
        selectAngle.setItems("90 ", "80", "70", "60", "50");
        selectAngle.setValue(" ");

        NumberField leftASide = new NumberField();
        leftASide.setValue(0.0);
        leftASide.setLabel("Left-a-side");
        leftASide.setClearButtonVisible(true);

        NumberField rightASide = new NumberField();
        rightASide.setValue(0.0);
        rightASide.setLabel("Right-a-side");
        rightASide.setClearButtonVisible(true);

        NumberField ticknessBottom = new NumberField();
        ticknessBottom.setValue(10.0);
        ticknessBottom.setLabel("Thickness bottom");
        ticknessBottom.setClearButtonVisible(true);

        NumberField ticknessTop = new NumberField();
        ticknessTop.setValue(40.0);
        ticknessTop.setLabel("Thickness top");
        ticknessTop.setClearButtonVisible(true);

        NumberField topAngle = new NumberField();
        topAngle.setValue(30.0);
        topAngle.setLabel("Top angle");
        topAngle.setClearButtonVisible(true);

        NumberField rightRadius = new NumberField();
        rightRadius.setValue(5.0);
        rightRadius.setLabel("Right radius");
        rightRadius.setClearButtonVisible(true);

        NumberField bottomAngle = new NumberField();
        bottomAngle.setValue(25.0);
        bottomAngle.setLabel("Bottom angle");
        bottomAngle.setClearButtonVisible(true);

        NumberField leftRadius = new NumberField();
        leftRadius .setValue(5.0);
        leftRadius .setLabel("Left radius");
        leftRadius .setClearButtonVisible(true);


        NumberField faceFillet = new NumberField();
        faceFillet.setValue(2.0);
        faceFillet.setLabel("Face");
        faceFillet.setClearButtonVisible(true);


        NumberField centerFillet = new NumberField();
        centerFillet.setValue(20.0);
        centerFillet.setLabel("Center left");
        centerFillet.setClearButtonVisible(true);

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

            String typLeft = selectLeft.getValue();
            if (typLeft.equals("I"))   vec[12] = 1;
            if (typLeft.equals("X"))   vec[12] = 3;
            if (typLeft.equals("Y"))   vec[12] = 2;
            if (typLeft.equals("U"))   vec[12] = 4;
            if (typLeft.equals("DU"))  vec[12] = 5;
            String typRight = selectAngle.getValue();
            if (typRight.equals("90"))   vec[1] = 90;
            if (typRight.equals("80"))   vec[1] = 80;
            if (typRight.equals("70"))   vec[1] = 70;
            if (typRight.equals("60"))   vec[1] = 60;
            if (typRight.equals("50"))   vec[1] = 50;

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
            if (typetDraw.equals("Yes"))  vec[16] = 1;
            if (typetDraw.equals("No"))  vec[16] = 0;

            vec[0] = gapFillet.getValue();

            vec[2] = leftASide.getValue();
            vec[3] = rightASide.getValue();
            vec[4] = ticknessBottom.getValue();
            vec[5] = ticknessTop.getValue();
            vec[6] = topAngle.getValue();
            vec[7] = rightRadius.getValue();
            vec[8] = bottomAngle.getValue();
            vec[9] = leftRadius.getValue();
            vec[10] = faceFillet.getValue();
            vec[11] = centerFillet.getValue();
            double tickness = (vec[4] + vec[5])/2;
            Home.setFactor(56/tickness);

            vec[13] = 100;  // scaler
            vec[14] = 0;    // rotate
            vec[15] = 0;   //text

            vec[18] = 0;
            vec[19] = 1;
            vec[20] = 2;
            vec[21] = 1;
            vec[22] = 0;

            CalcValues.zoomBuildUp = Integer.parseInt(zoomBuildUp.getValue());
            //      CalcValues.steelL = steelL.getValue();
            //      CalcValues.steelR = steelR.getValue();
            new CalcValues( plotType, antall, vec, comment);

        });


        VerticalLayout  v1 = new VerticalLayout( selectLeft,  leftASide, ticknessBottom, topAngle, leftRadius, faceFillet );
        VerticalLayout  v11 = new VerticalLayout(gapFillet, rightASide, ticknessTop, bottomAngle, rightRadius, centerFillet  );
        VerticalLayout v33 = new VerticalLayout(firstSignE,firstSignA2,firstSignA3,firstSignA4, firstSignF5,firstSignF9 );
        VerticalLayout  v2 = new VerticalLayout( textArea, selectDraw,   zoomBuildUp, selectPlaceButt, addButton ) ;
        HorizontalLayout  v3 = new HorizontalLayout(img);
        add(
                v1, v11, v33, v2, v3
        );
    }
}








