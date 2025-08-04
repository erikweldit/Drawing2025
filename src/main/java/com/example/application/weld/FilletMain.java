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
 * Shows interface for generating actual values for fillet weld
 * All values used in calculation for the forms are given as input from user
 * Values for standard forms are gives as default
 * but a form has to be chosen or a blank page appear
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.comno
 */
@AnonymousAllowed
@Route(value = "Fillet", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Fillet weld specifications")
//@Route("Fillet")
public class FilletMain extends HorizontalLayout {

    private double[] vec = new double[35];
    String buff = "";
    public boolean[] inBuffer = new boolean[17];
    String plotType = "fillet";
    boolean plotOK = true;
    int selectLeftInt;
    String vDesign;
    int antall = 23;
    public FilletMain() {

        ImageStorage im = new ImageStorage();

        //      System.out.println("left " + CalcValues.selectLeftInt + " right " + CalcValues.selectRightInt );

        this.selectLeftInt = CalcValues.selectLeftInt;
        Image img = new Image("images/fugeprog2.jpg", "Info image");
        img.setWidth("560px");
        //  setSizeFull();
        Image imga = new Image("images/i2.png", "1234");
        imga.setWidth("120px");
        Select<String> selectLeft = new Select<>();
        selectLeft.setLabel("Choose design");
        selectLeft.setItems(" ", "I", "X", "Y", "U", "DU");
        selectLeft.setValue(" ");

        Select<String> selectDraw = new Select<>();
        selectDraw.setLabel("Values on picture");
        selectDraw.setItems("Yes", "No");
        selectDraw.setValue("Yes");

        if (CalcValues.selectLeftInt == 0 ) { vDesign =  " "; }
        if (CalcValues.selectLeftInt == 1 ) { vDesign =  "I"; }
        if (CalcValues.selectLeftInt == 2) { vDesign =  "Y"; }
        if (CalcValues.selectLeftInt == 3 ) { vDesign =  "X"; }
        if (CalcValues.selectLeftInt == 4 ) { vDesign =  "U"; }
        if (CalcValues.selectLeftInt== 5 ) { vDesign =  "DU"; }

        Select<String> selectLeftInit = new Select<>();
        selectLeftInit.setLabel("Left design choosen");

        selectLeftInit.setItems(vDesign);
        selectLeftInit.setValue(vDesign);
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
        Button backButton = new Button("Info about choose plot - type", e -> UI.getCurrent().navigate("InfoPicture"));

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

        addButton.addClickListener(click -> {

            String comment = textArea.getValue();

            //     String typLeft = selectLeft.getValue();
            vec[12] = CalcValues.selectLeftInt;
            vec[1] = 90;

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
            Home.setFactor(40/tickness);
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
            vec[13] = 100;  // scaler
            vec[14] = 0;    // rotate
            vec[15] = 0;   //text

            vec[18] = 0;
            vec[19] = 1;
            vec[20] = 2;
            vec[21] = 1;
            vec[22] = 0;
            CalcValues.minimaliz = false;
            if ( vec[26] == 14 ) {
                CalcValues.notShowing = true;
            } else {
                CalcValues.notShowing = false;
            }
            CalcValues.zoomBuildUp = Integer.parseInt(zoomBuildUp.getValue());
            //      CalcValues.steelL = steelL.getValue();
            //      CalcValues.steelR = steelR.getValue();
            new CalcValues( plotType, antall, vec, comment);

        });



        VerticalLayout v1 = new VerticalLayout(selectLeftInit,  gapFillet, leftASide, rightASide, ticknessBottom, ticknessTop);
        if (this.selectLeftInt == 1 ) {  // I
            v1 = new VerticalLayout( selectLeftInit,  gapFillet, leftASide, rightASide, ticknessBottom, ticknessTop);
        }
        if (this.selectLeftInt == 2 ) {  //Y
            v1 = new VerticalLayout( selectLeftInit,  gapFillet, leftASide, rightASide, ticknessBottom, ticknessTop, topAngle,  faceFillet );
        }
        if (this.selectLeftInt == 3 ) {  // X
            v1 = new VerticalLayout( selectLeftInit,  gapFillet, leftASide, rightASide, ticknessBottom, ticknessTop,topAngle, bottomAngle,  faceFillet, centerFillet  );
        }
        if (this.selectLeftInt == 4 ) {  // U
            v1 = new VerticalLayout( selectLeftInit,  gapFillet, leftASide, rightASide, ticknessBottom, ticknessTop, topAngle, leftRadius, rightRadius,  faceFillet  );
        }
        if (this.selectLeftInt == 5 ) {  // DU
            v1 = new VerticalLayout( selectLeftInit,  gapFillet, leftASide, rightASide, ticknessBottom, ticknessTop, topAngle, bottomAngle, leftRadius, rightRadius,  faceFillet, centerFillet  );
        }


        VerticalLayout  v2 = new VerticalLayout( textArea, selectDraw, menu, imga, backButton, radioGroup, addButton );
        HorizontalLayout  v3 = new HorizontalLayout(img);

        add(
                v1,    v2, v3
        );


    }
}








