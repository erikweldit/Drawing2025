package com.example.application.weld;

import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

/**
 * Shows interface for generating actual values for flanged weld
 * All values used in calculation fr the forms are given as input from user
 * Values for standard forms are gives as default
 * but a form has to be chosen or a blank page appear
 *
 *@author Erik Andreas Vold -  erikvold84@gmail.com @author Erik Andreas Vold -  erik.vold@weldit.no
 */
@AnonymousAllowed
@Route(value = "Flanged", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Flanged weld specifications")
//@Route("Flanged")
public class FlangedMain extends HorizontalLayout {
    private double[] vec = new double[35];
    public boolean[] inBuffer = new boolean[17];
    String plotType = "flanged";
    String buff = "";

    boolean plotOK = true;
    int antall = 13;
    public FlangedMain() {
        Image img = new Image("images/fugeprog4.jpg", "Info image");
        img.setWidth("560px");
        //    setSizeFull();
        Image imga = new Image("images/i2.png", "1234");
        imga.setWidth("120px");

        Image imgI = new Image("images/Flanged.png", "i_design");
        imgI.setWidth("400px");
        Select<String> selectDraw = new Select<>();
        selectDraw.setLabel("Values on picture");
        selectDraw.setItems("Yes", "No");
        selectDraw.setValue("Yes");
/*
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


 */
        RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
        radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        radioGroup.setLabel("Choose plot - type");
        radioGroup.setItems("Zoomable picture - placeable in buffers",
                "Singel picture",
                "Picture in buffer#1 + table in buffer#3",
                //     "Big picture in 2 and 4 & buffer",
                "Picture in buffer#1 + table in buffer#2"
                //     "Big picture in 3 and 4 & buffer"
                //     "Picture in 1 - left upper",
                //     "Picture in 2 - right upper",
                //     "Picture in 3 - left lower",
                //    "Picture in 4 - right lower & buffer"
        );
        radioGroup.setValue("Zoomable picture - placeable in buffers");
        NumberField gapFlanged = new NumberField();
        gapFlanged.setValue(0.0);
        gapFlanged.setLabel("Gap ");
        gapFlanged.setClearButtonVisible(true);

        NumberField ticknessFlanged = new NumberField();
        ticknessFlanged.setValue(10.0);
        ticknessFlanged.setLabel("Thickness ");
        ticknessFlanged.setClearButtonVisible(true);

        NumberField topRadiusFlanged = new NumberField();
        topRadiusFlanged.setValue(10.0);
        topRadiusFlanged.setLabel("Top radius");
        topRadiusFlanged.setClearButtonVisible(true);


        TextField steelL = new TextField();
        TextField steelR = new TextField();
        TextField zoomBuildUp = new TextField();
        steelL.setLabel("Steel type left");
        steelR.setLabel("Steel type right");
        zoomBuildUp.setLabel("zoom Build Up");
        steelL.setValue(" ");
        steelR.setValue(" ");
        zoomBuildUp.setValue("4");

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
        Button menu = new Button();
        menu.setText("Possible buffers in use (Empties by 4)");
        inBuffer = ImageStorage.inBuffer;
        if (inBuffer[7] || inBuffer[11] || inBuffer[15] ) {
            buff += "1";
        }
        if (inBuffer[8] || inBuffer[11] || inBuffer[16] ) {
            buff += "2";
        }
        if (inBuffer[9] || inBuffer[12] || inBuffer[15]) {
            buff += "3" ;
        }
        if (inBuffer[10] || inBuffer[12] || inBuffer[16]) {
            buff += "4";
            buff = "";
        }

        String buffName = "images/r" + buff + ".png";
        imga = new Image(buffName, "1234");

        if(buff.indexOf("4") <= 0) {
            buff = "";
            for (int i = 0; i < 5; i++) {
                //     CalcValues.bufferId[i] = 0;
            }
        }

        Button backButton = new Button("Info about choose plot - type", e -> UI.getCurrent().navigate("InfoPicture"));
        addButton.addClickListener(click -> {

            String comment = textArea.getValue();

            String typetPlace = radioGroup.getValue();
            if (typetPlace.equals("Zoomable picture - placeable in buffers"))   vec[26] = 0;
            if (typetPlace.equals("Singel picture"))   vec[26] = 14;
            if (typetPlace.equals("Picture in buffer#1 + table in buffer#3"))   vec[26] = 15;
            if (typetPlace.equals("Big picture in 2 and 4 & buffer"))   vec[26] = 16;
            if (typetPlace.equals("Picture in buffer#1 + table in buffer#2"))   vec[26] = 11;
            if (typetPlace.equals("Big picture in 3 and 4 & buffer"))   vec[26] = 12;
            if (typetPlace.equals("Picture in 1 - left upper"))   vec[26] = 7;
            if (typetPlace.equals("Picture in 2 - right upper"))   vec[26] = 8;
            if (typetPlace.equals("Picture in 3 - left lower"))   vec[26] = 9;
            if (typetPlace.equals("Picture in 4 - right lower & buffer")) vec[26] = 10;

            String typetDraw = selectDraw.getValue();
            if (typetDraw.equals("Yes"))  vec[6] = 1;
            if (typetDraw.equals("No"))  vec[6] = 0;

            vec[0] = gapFlanged.getValue();
            vec[1] = ticknessFlanged.getValue();
            vec[2] = topRadiusFlanged.getValue();
            vec[3] = 100;  // scaler
            vec[4] = 0;    // rotate
            vec[5] = 0;
            double tickness = (vec[1] + vec[1])/2;
            Home.setFactor(15/tickness);
            vec[8] = 0;
            vec[9] = 1;
            vec[10] = 2;
            vec[11] = 1;
            vec[12] = 0;

            if ( vec[26]== 15) {
                CalcValues.bufferId[1] = 0;
                CalcValues.bufferId[3] = 0;
                ImageStorage.inBuffer[7] = true;
                ImageStorage.inBuffer[9] = true;
                buff += "1";
                buff += "3";
            }
            if ( vec[26]== 11) {
                CalcValues.bufferId[1] = 0;
                CalcValues.bufferId[2] = 0;
                ImageStorage.inBuffer[7] = true;
                ImageStorage.inBuffer[8] = true;
                buff += "1";
                buff += "2";
            }
            CalcValues.minimaliz = false;
            CalcValues.zoomBuildUp = Integer.parseInt(zoomBuildUp.getValue());
            //      CalcValues.steelL = steelL.getValue();
            //     CalcValues.steelR = steelR.getValue();
            if ( vec[26] == 14 ) {
                CalcValues.notShowing = true;
            } else {
                CalcValues.notShowing = false;
            }
            new CalcValues( plotType, antall, vec, comment);



            //             addButton.addClickShortcut(Key.ENTER);
        });




        VerticalLayout  v1 = new VerticalLayout(                        gapFlanged,
                selectDraw,                        ticknessFlanged,
                topRadiusFlanged , imgI );

        VerticalLayout  v2 = new VerticalLayout( textArea,menu, imga, backButton, radioGroup, addButton  );

        HorizontalLayout  v3 = new HorizontalLayout(img);

        add(
                v1, v2, v3
        );

    }
}







