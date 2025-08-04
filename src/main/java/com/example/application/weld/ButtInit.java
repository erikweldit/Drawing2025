package com.example.application.weld;





import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.server.auth.AnonymousAllowed;


/**
 * Shows interface for generating actual values for butt weld
 * All values used in calculation fr the forms are given as input from user
 * Values for standard forms are gives as default
 * but a form has to be chosen or a blank page appear
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route(value = "Butt", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS -  Butt weld specifications")
//@Route("Butt")
public class ButtInit extends HorizontalLayout {
    private double[] vec = new double[35];
    String plotType = "butt";
    boolean plotOK = true;
    int antall = 32;
    int selectLeftInt;
    int selectRightInt;

    public ButtInit() {
///
        Image img = new Image("images/fugeprog5.jpg", "Info image");
        img.setWidth("560px");
        Image imgI = new Image("images/i_design.png", "i_design");
        imgI.setWidth("400px");
        Image imgX = new Image("images/X_design.png", "X_design");
        imgX.setWidth("400px");
        Image imgY = new Image("images/Y_design.png", "Y_design");
        imgY.setWidth("400px");
        Image imgU = new Image("images/U_design.png", "U_design");
        imgU.setWidth("400px");
        Image imgDU = new Image("images/DU_design.png", "DU_design");
        imgDU.setWidth("400px");
        Image imgM = new Image("images/Mixed_design.png", "Mixed_design");
        imgM.setWidth("400px");
        Image imgT = new Image("images/tom.png", "Mixed_design");
        imgT.setWidth("300px");
        //   setSizeFull();
        ////////////////////
        Select<String> selectLeft = new Select<>();
        selectLeft.setLabel("Choose left design");
        selectLeft.setItems(" ", "I", "X", "Y", "U", "DU");
        selectLeft.setValue(" ");
        //    ImageToString uu = new ImageToString();
        Select<String> selectRight = new Select<>();
        selectRight.setLabel("Choose right design");
        selectRight.setItems(" ", "I", "X", "Y", "U", "DU");
        selectRight.setValue(" ");

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
        selectPlaceButt.setValue("Zoomable picture ");
        selectPlaceButt.setWidth("400px");


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
        zoomBuildUp.setLabel("zoom Build Up");
        steelL.setValue(" ");
        steelR.setValue(" ");
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



        Button addButton = new Button("Fill in actual design values");
        addButton.setWidth("400px");
        addButton.addThemeVariants(ButtonVariant.LUMO_LARGE);
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        addButton.addClickListener(click -> {
            String typLeft = selectLeft.getValue();
            if (typLeft.equals("I"))   selectLeftInt = 1;
            if (typLeft.equals("X"))   selectLeftInt = 3;
            if (typLeft.equals("Y"))   selectLeftInt = 2;
            if (typLeft.equals("U"))   selectLeftInt = 4;
            if (typLeft.equals("DU"))  selectLeftInt = 5;
            String typRight = selectRight.getValue();
            if (typRight.equals("I"))   selectRightInt = 1;
            if (typRight.equals("X"))   selectRightInt= 3;
            if (typRight.equals("Y"))   selectRightInt = 2;
            if (typRight.equals("U"))   selectRightInt = 4;
            if (typRight.equals("DU"))  selectRightInt= 5;

            CalcValues.selectRightInt = selectRightInt;
            CalcValues.selectLeftInt = selectLeftInt;
            CalcValues.zoomBuildUp = Integer.parseInt(zoomBuildUp.getValue());
            CalcValues.steelL = steelL.getValue();
            CalcValues.steelR = steelR.getValue();
            UI.getCurrent().getPage().setLocation("ButtMain");
        });

        VerticalLayout  v1 = new VerticalLayout(selectLeft, steelL, imgT, imgI, imgX, imgY);
        VerticalLayout  v11 = new VerticalLayout(selectRight, steelR, addButton, imgU, imgDU, imgM);

        HorizontalLayout  v3 = new HorizontalLayout(img);

        add(
                v1,  v11,
                v3
        );


    }
}







