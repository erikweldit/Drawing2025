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
@Route(value = "tubechange", layout = MainLayoutDraw.class)
//@Route("Cam")
@PageTitle("Weld IT AS - Bolt weld specifications")
public class TubeChange extends HorizontalLayout {
    private double[] vec = new double[35];
    public boolean[] inBuffer = new boolean[17];
    String plotType = "Bolt joint";
    boolean plotOK = true;
    int antall = 14;
    public TubeChange() {

        Image img = new Image("images/fugeprog1.jpg", "Info image");
        img.setWidth("600px");
        // setSizeFull();

        Select<String> selectType = new Select<>();
        selectType.setLabel("Joint type");
        selectType.setItems(" ", "Bolt joint", "Tube on plate", "Tube on plate 45 degrees");
        selectType.setValue(" ");

        Select<String> selectDimension1 = new Select<>();
        selectDimension1.setLabel("Bolt or tube dimension");
        selectDimension1.setItems("8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm");
        selectDimension1.setValue(" ");
        TextField steelL = new TextField();
        TextField steelR = new TextField();
        TextField zoomBuildUp = new TextField();
        steelL.setLabel("Steel type bolt/tube");
        steelR.setLabel("Steel type plate");
        zoomBuildUp.setLabel("zoom Build Up");
        steelL.setValue(" ");
        steelR.setValue(" ");
        zoomBuildUp.setValue("4");
        Select<String> selectDimension2 = new Select<>();
        selectDimension2.setLabel("Plate dimension");
        selectDimension2.setItems("8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm");
        selectDimension2.setValue(" ");

        Select<String> selectDimension3 = new Select<>();
        selectDimension3.setLabel("Tube thickness");
        selectDimension3.setItems("8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm");
        selectDimension3.setValue(" ");

        Select<String> selectDraw = new Select<>();
        selectDraw.setLabel("Values on picture");
        selectDraw.setItems("Yes", "No");
        selectDraw.setValue("Yes");

        Button addButton = new Button("Generate picture for stub joint");
        addButton.setWidth("400px");
        addButton.addThemeVariants(ButtonVariant.LUMO_LARGE);
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        addButton.addClickListener(click -> {

            String camType = selectType.getValue();
            vec[1] = 0;
            if (camType.equals("Bolt joint"))   vec[1] = 5;



            String typetDraw = selectDraw.getValue();
            if (typetDraw.equals("Yes")) {
                vec[7] = 1;
                vec[6] = 1;
            }
            if (typetDraw.equals("No"))  {
                vec[7] = 0;
                vec[6] = 0;
            }

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

            if (selectedType.equals("Bolt")) {
                plotType = "Bolt joint";
            }
            if (selectedType.equals("Tube on plate")) {
                plotType = "Tube on plate";
            }
            if (selectedType.equals("Tube on plate 45 degrees")) {
                plotType = "Tube on plate 45 degrees";
            }
            antall = 14;
            double tickness = 10*(vec[0] + vec[2] + vec[5]/3);
            tickness = 100.0;
            if ((vec[0] + vec[0]  +vec[0] )>= 15) tickness = 125.0;
            Home.setFactor(100/tickness);

            vec[3] = 0;  // rotate
            vec[4] = 100;  // scaler


            vec[9] = 0;
            vec[10] = 1;
            vec[11] = 2;
            vec[12] = 1;
            vec[13] = 0;
            CalcValues.minimaliz = false;

            String comment = "";
            CalcValues.zoomBuildUp = Integer.parseInt(zoomBuildUp.getValue());
            //     CalcValues.steelL = steelL.getValue();
            //     CalcValues.steelR = steelR.getValue();
            //    CalcValues.minimaliz= true;
            new CalcValues( plotType, antall, vec, comment);


            //             addButton.addClickShortcut(Key.ENTER);

        });

        VerticalLayout  v1 = new VerticalLayout( selectType,  selectDraw,
                selectDimension1, selectDimension2, selectDimension3);

        VerticalLayout  v2 = new VerticalLayout(
                //    zoomBuildUp,

                addButton );

        HorizontalLayout  v3 = new HorizontalLayout(img);

        add(
                v1, v2, v3
        );
    }
}

