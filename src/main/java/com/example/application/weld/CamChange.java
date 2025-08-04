package com.example.application.weld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
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
//@Route(value = "Cam", layout = MainLayout.class)
@AnonymousAllowed
@Route("CamChange")
@PageTitle("Weld IT AS - Cam weld specifications")
public class CamChange extends HorizontalLayout {
    private double[] vec = new double[35];

    boolean plotOK = true;

    String plotType;
    int antall;
    String vDesign;
    String hDesign;
    String mDesign;
    String tDesign;

    String comment;
    public CamChange() {
        this.plotType = CalcValues.plotType;
        this.antall = CalcValues.antall;
        this.vec = CalcValues.vecDouble;
        this.comment = CalcValues.comment;
        vDesign = " ";
        hDesign = " ";
        mDesign = " ";
        tDesign = " ";
        if ( vec[0] == 1.0 ) { vDesign = "8 mm" ; }
        if ( vec[0] == 2.0 ) { vDesign = "10 mm" ; }
        if ( vec[0] == 3.0 ) { vDesign = "12 mm" ; }
        if ( vec[0] == 4.0 ) { vDesign = "16 mm" ; }
        if ( vec[0] == 5.0 ) { vDesign = "20 mm" ; }
        if ( vec[0] == 6.0 ) { vDesign = "25 mm" ; }
        if ( vec[0] == 7.0 ) { vDesign = "32 mm" ; }
        if ( vec[2] == 1.0 ) { hDesign = "8 mm" ; }
        if ( vec[2] == 2.0 ) { hDesign = "10 mm" ; }
        if ( vec[2] == 3.0 ) { hDesign = "12 mm" ; }
        if ( vec[2] == 4.0 ) { hDesign = "16 mm" ; }
        if ( vec[2] == 5.0 ) { hDesign = "20 mm" ; }
        if ( vec[2] == 6.0 ) { hDesign = "25 mm" ; }
        if ( vec[2] == 7.0 ) { hDesign = "32 mm" ; }
        if ( vec[5] == 1.0 ) { mDesign = "8 mm" ; }
        if ( vec[5] == 2.0 ) { mDesign = "10 mm" ; }
        if ( vec[5] == 3.0 ) { mDesign = "12 mm" ; }
        if ( vec[5] == 4.0 ) { mDesign = "16 mm" ; }
        if ( vec[5] == 5.0 ) { mDesign = "20 mm" ; }
        if ( vec[5] == 6.0 ) { mDesign = "25 mm" ; }
        if ( vec[5] == 7.0 ) { mDesign = "32 mm" ; }
        if ( vec[1] == 1.0 ) { tDesign = "Cross joint" ; }
        if ( vec[1] == 2.0 ) { tDesign = "Lap joint" ; }
        if ( vec[1] == 3.0 ) { tDesign = "On plate" ; }
        if ( vec[1] == 4.0 ) { tDesign = "Strap joint" ; }

        System.out.println("cam " + "  "  + vec[1] + "  "  +vec[0] + " "   + vec[2] + "  "  + vec[5]);
        Select<String> selectType = new Select<>();
        selectType.setLabel("Joint type");
        selectType.setItems(" ", "Cross joint", "Lap joint",
                "On plate", "Strap joint");
        selectType.setValue(tDesign);

        Select<String> selectDimension1 = new Select<>();
        selectDimension1.setLabel("Dimension 1");
        selectDimension1.setItems("8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm");
        selectDimension1.setValue(vDesign);

        Select<String> selectDimension2 = new Select<>();
        selectDimension2.setLabel("Dimension 2 / plate");
        selectDimension2.setItems("8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm");
        selectDimension2.setValue(hDesign);
        Select<String> selectDimension3 = new Select<>();
        selectDimension3.setLabel("Dimension 3");
        selectDimension3.setItems("8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm");
        selectDimension3.setValue(mDesign);

        Select<String> selectDraw = new Select<>();
        selectDraw.setLabel("Values on picture");
        selectDraw.setItems("Yes", "No");
        selectDraw.setValue("Yes");



        Button addButton = new Button("Generate picture");
        addButton.setWidth("400px");
        addButton.addThemeVariants(ButtonVariant.LUMO_LARGE);
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);


        addButton.addClickListener(click -> {

            String camType = selectType.getValue();
            vec[1] = 0;
            if (camType.equals("Cross joint"))   vec[1] = 1;
            if (camType.equals("Lap joint"))   vec[1] = 2;
            if (camType.equals("On plate"))   vec[1] = 3;
            if (camType.equals("Strap joint"))   vec[1] = 4;



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

            if (selectedType.equals("Lap joint"))  {
                plotType = "Lap joint";
            }
            if (selectedType.equals("On plate")) {
                plotType = "On plate";
            }
            if (selectedType.equals("Strap joint")) {
                plotType = "Strap joint";
            }


            new CalcValues( plotType, antall, vec, comment);


            //             addButton.addClickShortcut(Key.ENTER);

        });

        VerticalLayout  v1 = new VerticalLayout( selectType,  selectDraw,
                selectDimension1,  selectDimension3, selectDimension2  );

        VerticalLayout  v2 = new VerticalLayout(  addButton );

        VerticalLayout  v22 = new VerticalLayout(   );
        VerticalLayout  v23 = new VerticalLayout(   );
        VerticalLayout  v24 = new VerticalLayout(   );

        add(
                v1, v2, v22, v23, v24
        );
    }
}







