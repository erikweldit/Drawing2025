package com.example.application.weld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route("ButtChange")
public class CalcChange extends HorizontalLayout {
    String plotType;
    int antall;
    String vDesign;
    String hDesign;
    double[] vec = new double[35];
    String comment;
    int selectLeftInt;
    int selectRightInt;

    public CalcChange( ) {
        this.plotType = CalcValues.plotType;
        this.antall = CalcValues.antall;
        this.vec = CalcValues.vecDouble;
        this.comment = CalcValues.comment;

//      System.out.println(" tst " + this.plotType + " " + vec[9]);

        String vDesign = " ";
        String hDesign = " ";
        Image img = new Image("images/fugeprog5.jpg", "Info image");
        img.setWidth("560px");
        //   setSizeFull();
        selectRightInt = CalcValues.selectRightInt;
        selectLeftInt = CalcValues.selectLeftInt;

        if (vec[9] == 0.0 ) { vDesign =  " "; }
        if (vec[9] == 1.0 ) { vDesign =  "I"; }
        if (vec[9] == 2.0 ) { vDesign =  "Y"; }
        if (vec[9] == 3.0 ) { vDesign =  "X"; }
        if (vec[9] == 4.0 ) { vDesign =  "U"; }
        if (vec[9] == 5.0 ) { vDesign =  "DU"; }
        if (vec[21] == 0.0 ) { hDesign =  " "; }
        if (vec[21] == 1.0 ) { hDesign =  "I"; }
        if (vec[21] == 2.0 ) { hDesign =  "Y"; }
        if (vec[21] == 3.0 ) { hDesign =  "X"; }
        if (vec[21] == 4.0 ) { hDesign =  "U"; }
        if (vec[21] == 5.0 ) { hDesign =  "DU"; }
        Select<String> selectLeft = new Select<>();
        selectLeft.setLabel("Left design choosen");

        selectLeft.setItems(vDesign);
        selectLeft.setValue(vDesign);

        Select<String> selectRight = new Select<>();
        selectRight.setLabel("Right design choosen");
        selectRight.setItems(hDesign);
        selectRight.setValue(hDesign);



        NumberField gapLeft = new NumberField();
        gapLeft.setValue(vec[0]);
        gapLeft.setLabel("Gap left");
        gapLeft.setClearButtonVisible(true);
        NumberField gapRight = new NumberField();
        gapRight.setValue(vec[12]);
        gapRight.setLabel("Gap right");
        gapRight.setClearButtonVisible(true);

        NumberField dyLeft = new NumberField();
        dyLeft.setValue(vec[1]);
        dyLeft.setLabel("Dy left");
        dyLeft.setClearButtonVisible(true);
        NumberField dyRight = new NumberField();
        dyRight.setValue(vec[13]);
        dyRight.setLabel("Dy right");
        dyRight.setClearButtonVisible(true);

        NumberField ticknessLeft = new NumberField();
        ticknessLeft.setValue(vec[2]);
        ticknessLeft.setLabel("Tickness left");
        ticknessLeft.setClearButtonVisible(true);
        NumberField ticknessRight = new NumberField();
        ticknessRight.setValue(vec[14]);
        ticknessRight.setLabel("Tickness right");
        ticknessRight.setClearButtonVisible(true);

        NumberField topAngleLeft = new NumberField();
        topAngleLeft.setValue(vec[3]);
        topAngleLeft.setLabel("Top Angle left");
        topAngleLeft.setClearButtonVisible(true);
        NumberField topAngleRight = new NumberField();
        topAngleRight.setValue(vec[15]);
        topAngleRight.setLabel("Top Angle right");
        topAngleRight.setClearButtonVisible(true);

        NumberField topRadiusLeft = new NumberField();
        topRadiusLeft.setValue(vec[4]);
        topRadiusLeft.setLabel("Top Radius left");
        topRadiusLeft.setClearButtonVisible(true);
        NumberField topRadiusRight = new NumberField();
        topRadiusRight.setValue(vec[16]);
        topRadiusRight.setLabel("Top Radius right");
        topRadiusRight.setClearButtonVisible(true);

        NumberField bottomAngleLeft = new NumberField();
        bottomAngleLeft.setValue(vec[5]);
        bottomAngleLeft.setLabel("Bottom Angle left");
        bottomAngleLeft.setClearButtonVisible(true);
        NumberField bottomAngleRight = new NumberField();
        bottomAngleRight.setValue(vec[17]);
        bottomAngleRight.setLabel("Bottom Angle right");
        bottomAngleRight.setClearButtonVisible(true);

        NumberField bottomRadiusLeft = new NumberField();
        bottomRadiusLeft.setValue(vec[6]);
        bottomRadiusLeft.setLabel("Bottom Radius left");
        bottomRadiusLeft.setClearButtonVisible(true);
        NumberField bottomRadiusRight = new NumberField();
        bottomRadiusRight.setValue(vec[18]);
        bottomRadiusRight.setLabel("Bottom Radius right");
        bottomRadiusRight.setClearButtonVisible(true);

        NumberField faceLeft = new NumberField();
        faceLeft.setValue(vec[7]);
        faceLeft.setLabel("Face left");
        faceLeft.setClearButtonVisible(true);
        NumberField faceRight = new NumberField();
        faceRight.setValue(vec[19]);
        faceRight.setLabel("Face right");
        faceRight.setClearButtonVisible(true);

        NumberField centerLeft = new NumberField();
        centerLeft.setValue(vec[2] - vec[8]);
        centerLeft.setLabel("Center left");
        centerLeft.setClearButtonVisible(true);
        NumberField centerRight = new NumberField();
        centerRight.setValue(vec[20]);
        centerRight.setLabel("Center right");
        centerRight.setClearButtonVisible(true);


        Select<String> firstSignE = new Select<>();
        firstSignE.setLabel("Set value for letter code");
        firstSignE.setItems("Actual code values ");
        firstSignE.setValue("Actual code values ");
        TextField firstSignA2 = new TextField();
        firstSignA2.setLabel("Gap ");
        firstSignA2.setValue("I Y X U DU");

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
        Select<String> selectLeftInit = new Select<>();
        selectLeftInit.setLabel("Left design choosen");

        selectLeftInit.setItems(vDesign);
        selectLeftInit.setValue(vDesign);

        Select<String> selectRightInit = new Select<>();
        selectRightInit.setLabel("Right design choosen");
        selectRightInit.setItems(hDesign);
        selectRightInit.setValue(hDesign);

        Button addButton = new Button("Generate picture for Butt ");
        addButton.setWidth("400px");
        addButton.addThemeVariants(ButtonVariant.LUMO_LARGE);
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        addButton.addClickListener(click -> {

            //      String comment = textArea.getValue();

            String typLeft = selectLeft.getValue();
            if (typLeft.equals("I"))   vec[9] = 1;
            if (typLeft.equals("X"))   vec[9] = 3;
            if (typLeft.equals("Y"))   vec[9] = 2;
            if (typLeft.equals("U"))   vec[9] = 4;
            if (typLeft.equals("DU"))  vec[9] = 5;
            String typRight = selectRight.getValue();
            if (typRight.equals("I"))   vec[21] = 1;
            if (typRight.equals("X"))   vec[21] = 3;
            if (typRight.equals("Y"))   vec[21] = 2;
            if (typRight.equals("U"))   vec[21] = 4;
            if (typRight.equals("DU"))  vec[21] = 5;

            vec[0] = gapLeft.getValue();
            vec[1] = dyLeft.getValue();
            vec[2] = ticknessLeft.getValue();
            vec[3] = topAngleLeft.getValue();
            vec[4] = topRadiusLeft.getValue();
            vec[5] = bottomAngleLeft.getValue();
            vec[6] = bottomRadiusLeft.getValue();
            vec[7] = faceLeft.getValue();
   //         vec[8] = centerLeft.getValue();
            vec[8] =  ticknessLeft.getValue() - centerLeft.getValue();
            vec[10] = 100;  // scaler
            vec[11] = 0;   // rotate
            vec[12] = gapRight.getValue();
            vec[13] = dyRight.getValue();
            vec[14] = ticknessRight.getValue();
            vec[15] = topAngleRight.getValue();
            vec[16] = topRadiusRight.getValue();
            vec[17] = bottomAngleRight.getValue();
            vec[18] = bottomRadiusRight.getValue();
            vec[19] = faceRight.getValue();
            vec[20] = centerRight.getValue();
            double tickness = (vec[2] + vec[14])/2;
            Home.setFactor(56/56);
            vec[22] = 100;  // scaler
            vec[23] = 0;    // rotate
            vec[24] = 0;  //tabell settes til 0 ?

            vec[27] = 0;
            vec[28] = 1;
            vec[29] = 2;
            vec[30] = 1;
            vec[31] = 0;
            if (vec[26] == 14 && tickness <= 30){
                CalcValues.minimaliz = true;
                //        vec[10] = 400;  // scaler
                //        vec[22] = 400;  // scaler
                vec[25] = 0;
            } else {
                CalcValues.minimaliz = false;
            }

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

        VerticalLayout  v2 = new VerticalLayout(  addButton );
        HorizontalLayout  v3 = new HorizontalLayout(img);

        add(
                v1,  v11  ,  v2,v3
        );


    }
}


