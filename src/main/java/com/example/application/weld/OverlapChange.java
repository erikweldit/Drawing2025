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
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;



/**
 * Shows interface for generating actual values for overlap weld
 * All values used in calculation fr the forms are given as input from user
 * Values for standard forms are gives as default
 * but a form has to be chosen or a blank page appear
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed

@Route(value = "OverlapChange", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Overlap weld specifications")
//@Route("Overlap")
public class OverlapChange extends HorizontalLayout {
    private double[] vec = new double[35];

    boolean plotOK = true;

    String plotType;
    int antall;
    String vDesign;
    String hDesign;

    String comment;
    public OverlapChange() {

        this.plotType = CalcValues.plotType;
        this.antall = CalcValues.antall;
        this.vec = CalcValues.vecDouble;
        this.comment = CalcValues.comment;

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
        selectPlaceButt.setValue("Single picture - big");
        selectPlaceButt.setWidth("400px");

        NumberField gapOverlap = new NumberField();
        gapOverlap.setValue(0.0);
        gapOverlap.setLabel("Gap ");
        gapOverlap.setClearButtonVisible(true);


        NumberField tickness1Overlap = new NumberField();
        tickness1Overlap.setValue(10.0);
        tickness1Overlap.setLabel("Thickness plate 1");
        tickness1Overlap.setClearButtonVisible(true);

        NumberField tickness2Overlap = new NumberField();
        tickness2Overlap.setValue(10.0);
        tickness2Overlap.setLabel("Thickness plate 2");
        tickness2Overlap.setClearButtonVisible(true);

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
            if (typetDraw.equals("Yes"))  vec[6] = 1;
            if (typetDraw.equals("No"))  vec[7] = 0;
            vec[0] = gapOverlap.getValue();
            vec[1] = tickness1Overlap.getValue();
            vec[2] = tickness2Overlap.getValue();
            vec[3] = 100;  // scaler
            vec[4] = 0;    // rotate
            vec[5] = 0;
            double tickness = (vec[1] + vec[2])/2;
            Home.setFactor(15/tickness);
            vec[8] = 0;
            vec[9] = 1;
            vec[10] = 2;
            vec[11] = 1;
            vec[12] = 0;

            new CalcValues( plotType, antall, vec, comment);



            //             addButton.addClickShortcut(Key.ENTER);
        });



        VerticalLayout  v1 = new VerticalLayout( gapOverlap,
                selectDraw,                         tickness1Overlap,
                tickness2Overlap );

        VerticalLayout  v2 = new VerticalLayout( addButton );


        VerticalLayout  v22 = new VerticalLayout(   );
        VerticalLayout  v23 = new VerticalLayout(   );
        VerticalLayout  v24 = new VerticalLayout(   );

        add(
                v1, v2, v22, v23, v24
        );
    }
}







