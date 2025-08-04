package com.example.application.weld;

import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;


/**
 * Shows interface for generating actual values for cam weld
 * All values used in calculation fr the forms are given as input from user
 * Values for standard forms are gives as default
 * but a form has to be chosen or a blank page appear
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route(value = "Cam", layout = MainLayoutDraw.class)
//@Route("Cam")
@PageTitle("Weld IT AS - Cam weld specifications")
public class CamMain extends HorizontalLayout {
    private double[] vec = new double[35];
    public boolean[] inBuffer = new boolean[17];
    String plotType = "Cam";
    boolean plotOK = true;
    int antall = 14;
    public CamMain() {

        Image img = new Image("images/fugeprog1.jpg", "Info image");
        img.setWidth("660px");
        // setSizeFull();
        Image imga = new Image("images/i2.png", "1234");
        imga.setWidth("120px");
        Image imgC = new Image("images/Crossjoint.png", "i_design");
        imgC.setWidth("200px");
        Image imgL = new Image("images/Lapjoint.png", "X_design");
        imgL.setWidth("200px");
        Image imgO = new Image("images/Onplate.png", "Y_design");
        imgO.setWidth("200px");
        Image imgS = new Image("images/Strapjoint.png", "U_design");
        imgS.setWidth("200px");

        Select<String> selectType = new Select<>();
        selectType.setLabel("Joint type");
        selectType.setItems(" ", "Cross joint", "Lap joint",
                "On plate", "Strap joint");
        selectType.setValue(" ");

        Select<String> selectDimension1 = new Select<>();
        selectDimension1.setLabel("Dimension 1");
        selectDimension1.setItems("8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm");
        selectDimension1.setValue(" ");
        TextField steelL = new TextField();
        TextField steelR = new TextField();
        TextField zoomBuildUp = new TextField();
        steelL.setLabel("Steel type left");
        steelR.setLabel("Steel type right");
        zoomBuildUp.setLabel("zoom Build Up");
        steelL.setValue(" ");
        steelR.setValue(" ");
        zoomBuildUp.setValue("4");
        Select<String> selectDimension2 = new Select<>();
        selectDimension2.setLabel("Dimension 2 / plate");
        selectDimension2.setItems("8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm");
        selectDimension2.setValue(" ");
        Select<String> selectDimension3 = new Select<>();
        selectDimension3.setLabel("Dimension 3");
        selectDimension3.setItems("8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm");
        selectDimension3.setValue(" ");

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
                "Singel picture"
          //      "Picture in buffer#1 + table in buffer#3",
                //     "Big picture in 2 and 4 & buffer",
           //     "Picture in buffer#1 + table in buffer#2"
                //     "Big picture in 3 and 4 & buffer",
                //     "Picture in 1 - left upper",
                //     "Picture in 2 - right upper",
                //     "Picture in 3 - left lower",
                //    "Picture in 4 - right lower & buffer"
        );
        radioGroup.setValue("Zoomable picture - placeable in buffers");
/*
        radioGroup.setItems("Zoomable picture",
                "Singel picture",
                "Picture in 1 + table in 3",
                "Big picture in 2 and 4 & buffer",
                "Picture in 1 + table in 2",
                "Big picture in 3 and 4 & buffer",
                "Picture in 1 - left upper",
                "Picture in 2 - right upper",
                "Picture in 3 - left lower",
                "Picture in 4 - right lower & buffer");
        radioGroup.setValue("Zoomable picture");



 */
  //     radioGroup.setItems("Singel picture");
   //     radioGroup.setValue("Singel picture");

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







        String buff = "";
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
            String camType = selectType.getValue();
            vec[1] = 0;
            if (camType.equals("Cross joint"))   vec[1] = 1;
            if (camType.equals("Lap joint"))   vec[1] = 2;
            if (camType.equals("On plate"))   vec[1] = 3;
            if (camType.equals("Strap joint"))   vec[1] = 4;


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
            if (typetDraw.equals("Yes"))  vec[7] = 1;
            if (typetDraw.equals("No"))  vec[7] = 0;

            String selectedType = selectType.getValue();
            String dimention1 = selectDimension1.getValue();
            String dimention2 = selectDimension2.getValue();
            String dimention3 = selectDimension3.getValue();

            if (dimention1.equals("8 mm"))   vec[0] = 1;
            if (dimention1.equals("10 mm"))   vec[0] = 2;
            if (dimention1.equals("12 mm"))   vec[0] = 3;
            if (dimention1.equals("16 mm"))   vec[0] = 4;
            if (dimention1.equals("20 mm"))  vec[0] = 5;
            if (dimention1.equals("25 mm"))   vec[0] = 6;
            if (dimention1.equals("32 mm"))  vec[0] = 7;

            if (dimention2.equals("8 mm"))   vec[2] = 1;
            if (dimention2.equals("10 mm"))   vec[2] = 2;
            if (dimention2.equals("12 mm"))   vec[2] = 3;
            if (dimention2.equals("16 mm"))   vec[2] = 4;
            if (dimention2.equals("20 mm"))  vec[2] = 5;
            if (dimention2.equals("25 mm"))   vec[2] = 6;
            if (dimention2.equals("32 mm"))  vec[2] = 7;

            if (dimention3.equals("8 mm"))   vec[5] = 1;
            if (dimention3.equals("10 mm"))   vec[5] = 2;
            if (dimention3.equals("12 mm"))   vec[5] = 3;
            if (dimention3.equals("16 mm"))   vec[5] = 4;
            if (dimention3.equals("20 mm"))  vec[5] = 5;
            if (dimention3.equals("25 mm"))   vec[5] = 6;
            if (dimention3.equals("32 mm"))  vec[5] = 7;

            if (selectedType.equals("Cross joint")) {
                plotType = "Cross joint";
            }
            antall = 14;
            double tickness = 10*(vec[0] + vec[2] + vec[5]/3);
            tickness = 100.0;
            if ((vec[0] + vec[0]  +vec[0] )>= 15) tickness = 125.0;
            Home.setFactor(100/tickness);

            vec[3] = 0;  // rotate
            vec[4] = 100;  // scaler

            vec[6] = 0;

            vec[9] = 0;
            vec[10] = 1;
            vec[11] = 2;
            vec[12] = 1;
            vec[13] = 0;
            CalcValues.minimaliz = false;
            if (selectedType.equals("Lap joint"))  {
                plotType = "Lap joint";
            }
            if (selectedType.equals("On plate")) {
                plotType = "On plate";
            }
            if (selectedType.equals("Strap joint")) {
                plotType = "Strap joint";
            }
            CalcValues.zoomBuildUp = Integer.parseInt(zoomBuildUp.getValue());
            //     CalcValues.steelL = steelL.getValue();
            //     CalcValues.steelR = steelR.getValue();
        //    CalcValues.minimaliz= true;
            new CalcValues( plotType, antall, vec, comment);


            //             addButton.addClickShortcut(Key.ENTER);

        });

        VerticalLayout  v1 = new VerticalLayout( selectType,  selectDraw,
                selectDimension1,  selectDimension3, selectDimension2 , imgC, imgL );

        VerticalLayout  v2 = new VerticalLayout( textArea, menu, imga,
                //    zoomBuildUp,
                radioGroup, addButton , imgO, imgS);

        HorizontalLayout  v3 = new HorizontalLayout(img);

        add(
                v1, v2, v3
        );
    }
}







