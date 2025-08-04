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
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Shows interface for generating actual values for butt weld
 * All values used in calculation fr the forms are given as input from user
 * Values for standard forms are gives as default
 * but a form has to be chosen or a blank page appear
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route(value = "ButtMain", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS -  Butt weld specifications")
//@Route("Butt")
public class ButtMain extends HorizontalLayout {
    public boolean[] inBuffer = new boolean[17];
    private double[] vec = new double[35];
    String plotType = "butt";
    boolean plotOK = true;
    int antall = 32;
    int selectLeftInt;
    int selectRightInt;
    String vDesign;
    String hDesign;
    String buff = "";
    double factor;
    public ButtMain() {
        ImageStorage im = new ImageStorage();
        this.selectRightInt = CalcValues.selectRightInt;
        this.selectLeftInt = CalcValues.selectLeftInt;

///
        Image img = new Image("images/fugeprog5.jpg", "Info image");
        img.setWidth("560px");
        //   setSizeFull();
        Image imga = new Image("images/i2.png", "1234");
        imga.setWidth("120px");
        Image imgP12 = new Image("images/P12.png", "1234");
        imgP12.setWidth("120px");

        Image imgT = new Image("images/P12.png", "Mixed_design");
        imgT.setWidth("300px");
        ////////////////////
        Select<String> selectLeft = new Select<>();
        selectLeft.setLabel("Choose left design");
        selectLeft.setItems(" ", "I", "X", "Y", "U", "DU");
        selectLeft.setValue(" ");

        Select<String> selectRight = new Select<>();
        selectRight.setLabel("Choose right design");
        selectRight.setItems(" ", "I", "X", "Y", "U", "DU");
        selectRight.setValue(" ");

        Select<String> selectDraw = new Select<>();
        selectDraw.setLabel("Values on picture");
        selectDraw.setItems("Yes", "No");
        selectDraw.setValue("Yes");

        Select<String> selectEmpty = new Select<>();
        selectEmpty.setLabel("Empty buffer");
        selectEmpty.setItems("Yes", "No");
        selectEmpty.setValue("Yes");

         Button menu = new Button();
         menu.setText("Possible buffers in use (Empties by 4)");

        RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
        radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        radioGroup.setLabel("Choose plot - type");
        radioGroup.setItems("Zoomable picture - placeable in buffers",
                "Singel picture",
             "Picture in buffer#1 + table in buffer#3",
           //     "Big picture in 2 and 4 & buffer",
                "Picture in buffer#1 + table in buffer#2"
            //    "Big picture in 3 and 4 & buffer"
           //     "Picture in 1 - left upper",
           //     "Picture in 2 - right upper",
           //     "Picture in 3 - left lower",
            //    "Picture in 4 - right lower & buffer"
        );
        radioGroup.setValue("Zoomable picture - placeable in buffers");

        Select<String> firstSignE = new Select<>();
        firstSignE.setLabel("Set value for letter code");
        firstSignE.setItems("Actual code values ");
        firstSignE.setValue("Actual code values ");
        TextField firstSignA2 = new TextField();
        firstSignA2.setLabel("Gap ");
        firstSignA2.setValue("I Y X U DU");
        TextField steelL = new TextField();
        TextField steelR = new TextField();
        TextField zoomBuildUp = new TextField();
        steelL.setLabel("Steel type left");
        steelR.setLabel("Steel type right");

        steelL.setValue(" ");
        steelR.setValue(" ");
        zoomBuildUp.setLabel("zoom Build Up");
        zoomBuildUp.setValue("6");


        TextField firstSignA3 = new TextField();
        firstSignA3.setLabel("Dy ");
        firstSignA3.setValue("I Y X U DU");
        TextField firstSignA4 = new TextField();
        firstSignA4.setLabel("Tickness ");
        firstSignA4.setValue("I Y X U DU");
        TextField firstSignF5 = new TextField();
        firstSignF5.setLabel("Top Angle ");
        firstSignF5.setValue("Y X U DU");
        TextField firstSignF9 = new TextField();
        firstSignF9.setLabel("Face      ");
        firstSignF9.setValue("Y X U DU");
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


        NumberField gapLeft = new NumberField();
        gapLeft.setValue(4.0);
        gapLeft.setLabel("Gap left");
        gapLeft.setClearButtonVisible(true);
        NumberField gapRight = new NumberField();
        gapRight.setValue(4.0);
        gapRight.setLabel("Gap right");
        gapRight.setClearButtonVisible(true);

        NumberField dyLeft = new NumberField();
        dyLeft.setValue(0.0);
        dyLeft.setLabel("Dy left");
        dyLeft.setClearButtonVisible(true);
        NumberField dyRight = new NumberField();
        dyRight.setValue(0.0);
        dyRight.setLabel("Dy right");
        dyRight.setClearButtonVisible(true);

        NumberField ticknessLeft = new NumberField();
        ticknessLeft.setValue(40.0);
        ticknessLeft.setLabel("Tickness left");
        ticknessLeft.setClearButtonVisible(true);

        NumberField placing = new NumberField();
        placing.setValue(0.0);
        placing.setLabel("Placing" );
        placing.setClearButtonVisible(true);

        NumberField ticknessRight = new NumberField();
        ticknessRight.setValue(40.0);
        ticknessRight.setLabel("Tickness right");
        ticknessRight.setClearButtonVisible(true);

        NumberField topAngleLeft = new NumberField();
        topAngleLeft.setValue(25.0);
        topAngleLeft.setLabel("Top Angle left");
        topAngleLeft.setClearButtonVisible(true);
        NumberField topAngleRight = new NumberField();
        topAngleRight.setValue(25.0);
        topAngleRight.setLabel("Top Angle right");
        topAngleRight.setClearButtonVisible(true);

        NumberField topRadiusLeft = new NumberField();
        topRadiusLeft.setValue(5.0);
        topRadiusLeft.setLabel("Top Radius left");
        topRadiusLeft.setClearButtonVisible(true);
        NumberField topRadiusRight = new NumberField();
        topRadiusRight.setValue(5.0);
        topRadiusRight.setLabel("Top Radius right");
        topRadiusRight.setClearButtonVisible(true);

        NumberField bottomAngleLeft = new NumberField();
        bottomAngleLeft.setValue(25.0);
        bottomAngleLeft.setLabel("Bottom Angle left");
        bottomAngleLeft.setClearButtonVisible(true);
        NumberField bottomAngleRight = new NumberField();
        bottomAngleRight.setValue(25.0);
        bottomAngleRight.setLabel("Bottom Angle right");
        bottomAngleRight.setClearButtonVisible(true);

        NumberField bottomRadiusLeft = new NumberField();
        bottomRadiusLeft.setValue(5.0);
        bottomRadiusLeft.setLabel("Bottom Radius left");
        bottomRadiusLeft.setClearButtonVisible(true);
        NumberField bottomRadiusRight = new NumberField();
        bottomRadiusRight.setValue(5.0);
        bottomRadiusRight.setLabel("Bottom Radius right");
        bottomRadiusRight.setClearButtonVisible(true);

        NumberField faceLeft = new NumberField();
        faceLeft.setValue(2.0);
        faceLeft.setLabel("Face left");
        faceLeft.setClearButtonVisible(true);
        NumberField faceRight = new NumberField();
        faceRight.setValue(2.0);
        faceRight.setLabel("Face right");
        faceRight.setClearButtonVisible(true);

        NumberField centerLeft = new NumberField();
        centerLeft.setValue(20.0);
        centerLeft.setLabel("Center left");
        centerLeft.setClearButtonVisible(true);
        NumberField centerRight = new NumberField();
        centerRight.setValue(20.0);
        centerRight.setLabel("Center right");
        centerRight.setClearButtonVisible(true);

        TextArea textArea = new TextArea();
        textArea.setWidth("400px");
        textArea.setMinHeight("100px");
        textArea.setMaxHeight("150px");
        textArea.setLabel("Comments");
        //      textArea.setValue(" ");

        Button addButton = new Button("Generate picture");
        addButton.setWidth("400px");
        addButton.addThemeVariants(ButtonVariant.LUMO_LARGE);
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        if (CalcValues.selectLeftInt == 0 ) { vDesign =  " "; }
        if (CalcValues.selectLeftInt == 1 ) { vDesign =  "I"; }
        if (CalcValues.selectLeftInt == 2) { vDesign =  "Y"; }
        if (CalcValues.selectLeftInt == 3 ) { vDesign =  "X"; }
        if (CalcValues.selectLeftInt == 4 ) { vDesign =  "U"; }
        if (CalcValues.selectLeftInt== 5 ) { vDesign =  "DU"; }
        if (CalcValues.selectRightInt == 0 ) { hDesign =  " "; }
        if (CalcValues.selectRightInt == 1 ) { hDesign =  "I"; }
        if (CalcValues.selectRightInt == 2 ) { hDesign =  "Y"; }
        if (CalcValues.selectRightInt == 3 ) { hDesign =  "X"; }
        if (CalcValues.selectRightInt == 4 ) { hDesign =  "U"; }
        if (CalcValues.selectRightInt == 5 ) { hDesign =  "DU"; }
        Select<String> selectLeftInit = new Select<>();
        selectLeftInit.setLabel("Left design choosen");

        selectLeftInit.setItems(vDesign);
        selectLeftInit.setValue(vDesign);

        Select<String> selectRightInit = new Select<>();
        selectRightInit.setLabel("Right design choosen");
        selectRightInit.setItems(hDesign);
        selectRightInit.setValue(hDesign);
        /*
// Fra ditt nåværende view:
        Map<String, List<String>> parameters = new HashMap<>();
        parameters.put("from", Collections.singletonList("ButtMain")); // erstatt med din aktuelle rute
        QueryParameters qp = new QueryParameters(parameters);
        UI.getCurrent().navigate("InfoPicture", qp);



        Image imgb = new Image("images/i2.png", e -> UI.getCurrent().navigate("InfoPicture"));
        imgb.setWidth("120px");
 */

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
            //     nav.addItem(new SideNavItem(" D "));
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
            factor =  1.0;
            String comment = textArea.getValue();
            vec[9] = CalcValues.selectLeftInt;
            vec[21] = CalcValues.selectRightInt;
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



            String typetDraw = selectDraw.getValue();
            if (typetDraw.equals("Yes"))  vec[25] = 1;
            if (typetDraw.equals("No"))  vec[25] = 0;
            String typetEmpty = selectEmpty.getValue();
            if (typetEmpty .equals("Yes")) { im.emptyBuffer() ;}
            if (typetEmpty .equals("No")) { };
            vec[2] = ticknessLeft.getValue();
            vec[14] = ticknessRight.getValue();
            Home.setFactor(1.0);
            CalcValues.minimaliz = false;
            CalcValues.notShowing = true;
            double tickness = (vec[2] + vec[14]) / 2;
            if (tickness <=20 ) {
                CalcValues.minimaliz = true;
            }
            if (vec[26] == 14 ) {
                CalcValues.minimaliz = true;
                CalcValues.notShowing = false;
                if (tickness >= 60) {
                    factor = 0.6;
                }
                if (tickness <= 60) {
                    factor = 0.8;
                }
                if (tickness <= 50) {
                    factor = 1.0;
                }
                if (tickness <= 40) {
                    factor = 1.1;
                }
                if (tickness <= 30) {
                    factor = 1.3;
                }
                if (tickness <= 20) {
                    factor = 1.5;
                }
                if (tickness <= 10) {
                    factor = 2.2;
                }
                if (tickness <= 5) {
                    factor = 3;
                }
                Home.setFactor(factor);
            }

            vec[0] = gapLeft.getValue()*factor;
            vec[1] = dyLeft.getValue()*factor;
            vec[2] = ticknessLeft.getValue()*factor;
            vec[3] = topAngleLeft.getValue();
            vec[4] = topRadiusLeft.getValue()*factor;
            vec[5] = bottomAngleLeft.getValue();
            vec[6] = bottomRadiusLeft.getValue()*factor;
            vec[7] = faceLeft.getValue()*factor;
        //    vec[8] = centerLeft.getValue()*factor;
           vec[8] =  ticknessLeft.getValue()*factor - centerLeft.getValue()*factor;
            vec[10] = 100;  // scaler
            vec[11] = 0;   // rotate
            vec[12] = gapRight.getValue()*factor;
            vec[13] = dyRight.getValue()*factor;
            vec[14] = ticknessRight.getValue()*factor;
            vec[15] = topAngleRight.getValue();
            vec[16] = topRadiusRight.getValue();
            vec[17] = bottomAngleRight.getValue();
            vec[18] = bottomRadiusRight.getValue();
            vec[19] = faceRight.getValue()*factor;
            vec[20] = centerRight.getValue()*factor;
         //   vec[20] = ticknessRight.getValue()*factor - centerRight.getValue()*factor;
            vec[22] = 100;  // scaler
            vec[23] = 0;    // rotate
            vec[24] = 0;  //tabell settes til 0 ?

            vec[27] = 0;
            vec[28] = 1;
            vec[29] = 2;
            vec[30] = 1;
            vec[31] = 0;

            CalcValues.zoomBuildUp = Integer.parseInt(zoomBuildUp.getValue());

            new CalcValues( plotType, antall, vec, comment);

        });

        VerticalLayout v1 = new VerticalLayout(selectLeftInit,  gapLeft, dyLeft, ticknessLeft  );
        if (this.selectLeftInt == 1 ) {  // I
            v1 = new VerticalLayout( selectLeftInit,gapLeft, dyLeft, ticknessLeft  );
        }
        if (this.selectLeftInt == 2 ) {  //Y
            v1 = new VerticalLayout(selectLeftInit, gapLeft, dyLeft, ticknessLeft, topAngleLeft, faceLeft );
        }
        if (this.selectLeftInt == 3 ) {  // X
            v1 = new VerticalLayout(selectLeftInit, gapLeft, dyLeft, ticknessLeft, topAngleLeft, bottomAngleLeft, faceLeft, centerLeft);
        }
        if (this.selectLeftInt == 4 ) {  // U
            v1 = new VerticalLayout(selectLeftInit, gapLeft, dyLeft, ticknessLeft, topAngleLeft, topRadiusLeft,faceLeft  );
        }
        if (this.selectLeftInt == 5 ) {  // DU
            v1 = new VerticalLayout( selectLeftInit, gapLeft, dyLeft, ticknessLeft, topAngleLeft,bottomAngleLeft,  topRadiusLeft, bottomRadiusLeft,faceLeft, centerLeft );
        }
        VerticalLayout  v11 = new VerticalLayout(selectRightInit, gapRight, dyRight, ticknessRight  );
        if (this.selectRightInt == 1 ) {  // I
            v11 = new VerticalLayout( selectRightInit,gapRight, dyRight, ticknessRight  );
        }
        if (this.selectRightInt == 2 ) {  //Y
            v11 = new VerticalLayout(selectRightInit, gapRight, dyRight, ticknessRight, topAngleRight, faceRight );
        }
        if (this.selectRightInt == 3 ) {  // X
            v11 = new VerticalLayout(selectRightInit, gapRight, dyRight, ticknessRight, topAngleRight, bottomAngleRight, faceRight, centerRight);
        }
        if (this.selectRightInt == 4 ) {  // U
            v11 = new VerticalLayout( selectRightInit,gapRight, dyRight, ticknessRight, topAngleRight, topRadiusRight,faceRight  );
        }
        if (this.selectRightInt == 5 ) {  // DU
            v11 = new VerticalLayout( selectRightInit,gapRight, dyRight, ticknessRight, topAngleRight,bottomAngleRight,  topRadiusRight, bottomRadiusRight,faceRight, centerRight );
        }

        VerticalLayout  v2 = new VerticalLayout( textArea, selectDraw, menu, imga,  backButton ,  radioGroup, addButton );  // zoomBuildUp,   backButton
        HorizontalLayout  v3 = new HorizontalLayout(img);

        add(
                v1,  v11,  v2, v3
        );


    }
}






