package com.example.application.weld;

import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
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
@Route(value = "FilletInit", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Fillet weld specifications")
//@Route("Fillet")
public class FilletInit extends HorizontalLayout {
    private double[] vec = new double[35];
    String plotType = "fillet";
    boolean plotOK = true;
    int selectLeftInt;
    String vDesign;
    int antall = 23;
    public FilletInit() {
        Image img = new Image("images/fugeprog2.jpg", "Info image");
        img.setWidth("560px");

        Image imgI = new Image("images/Ifillet.png", "i_design");
        imgI.setWidth("400px");
        Image imgX = new Image("images/Xfillet.png", "X_design");
        imgX.setWidth("400px");
        Image imgY = new Image("images/Yfillet.png", "Y_design");
        imgY.setWidth("400px");
        Image imgU = new Image("images/Ufillet.png", "U_design");
        imgU.setWidth("400px");
        Image imgDU = new Image("images/DUfillet.png", "DU_design");
        imgDU.setWidth("400px");

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
        steelL.setLabel("Steel type top");
        steelR.setLabel("Steel type bottom");
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



        TextArea textArea = new TextArea();
        textArea.setWidth("400px");
        textArea.setMinHeight("100px");
        textArea.setMaxHeight("150px");
        textArea.setLabel("Comments");
        textArea.setValue(" ");

        Button addButton = new Button("Fill in actual design value");
        addButton.setWidth("400px");
        addButton.addThemeVariants(ButtonVariant.LUMO_LARGE);
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        addButton.addClickListener(click -> {

            String comment = textArea.getValue();

            String typLeft = selectLeft.getValue();
            if (typLeft.equals("I"))   selectLeftInt = 1;
            if (typLeft.equals("X"))   selectLeftInt = 3;
            if (typLeft.equals("Y"))   selectLeftInt = 2;
            if (typLeft.equals("U"))   selectLeftInt = 4;
            if (typLeft.equals("DU"))  selectLeftInt = 5;

            CalcValues.selectLeftInt = selectLeftInt;


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



            CalcValues.zoomBuildUp = Integer.parseInt(zoomBuildUp.getValue());
            CalcValues.steelL = steelL.getValue();
            CalcValues.steelR = steelR.getValue();
            UI.getCurrent().getPage().setLocation("Fillet");

        });



        VerticalLayout v1 = new VerticalLayout(selectLeft, steelL, steelR, addButton , imgI, imgX );

        VerticalLayout v2 = new VerticalLayout( imgY, imgU, imgDU );
        //    VerticalLayout  v2 = new VerticalLayout( textArea, selectDraw, zoomBuildUp, selectPlaceButt, addButton );
        HorizontalLayout  v3 = new HorizontalLayout(img);

        add(
                v1,  v2,   v3
        );


    }
}








