package com.example.application.weld;



import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
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
@Route(value = "InfoPictureC", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS -  Explanation of chooses")
//@Route("Butt")
public class InfoPictureC extends HorizontalLayout {
    int type = 0;
    String image = CalcValues.image;
    public InfoPictureC() {
        String adr = "images/P";
        String adr2 = ".png";
        if ( CalcValues.image.equals("")){
            CalcValues.image = "images/P0.png";
        }
        Button addButton = new Button("Show generate picture");
        addButton.setWidth("400px");
        addButton.addThemeVariants(ButtonVariant.LUMO_LARGE);
        addButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Image img = new Image(CalcValues.image, "Mixed_design");
        img.setWidth("1000px");

        ////////////////////

        RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
        radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        radioGroup.setLabel("Choose plot - type");
        radioGroup.setItems("Zoomable picture - normal size",
                "Zoomable picture - very thin",
                "Picture in 1 + table in 3",
                "Big picture in 2 and 4 & buffer",
                "Picture in 1 + table in 2",
                "Big picture in 3 and 4 & buffer",
                "Picture in 1 - left upper",
                "Picture in 2 - right upper",
                "Picture in 3 - left lower",
                "Picture in 4 - right lower & buffer");
     //   radioGroup.setValue("Zoomable picture - normal size");
    //    radioGroup.setValue(CalcValues.image);



        addButton.addClickListener(click -> {

            String typetPlace = radioGroup.getValue();
            if (typetPlace.equals("Zoomable picture - normal size")) {
                type = 0;
            };
            if (typetPlace.equals("Zoomable picture - very thin")) {
                type = 14;
            };

            if (typetPlace.equals("Picture in 1 + table in 3"))  {
                type = 13;
            };
            if (typetPlace.equals("Big picture in 2 and 4 & buffer"))   {
                type = 24;
            };
            if (typetPlace.equals("Picture in 1 + table in 2"))    {
                type = 12;
            };
            if (typetPlace.equals("Big picture in 3 and 4 & buffer"))  {
                type = 34;
            };
            if (typetPlace.equals("Picture in 1 - left upper"))   {
                type = 1;
            };
            if (typetPlace.equals("Picture in 2 - right upper"))  {
                type = 2;
            };
            if (typetPlace.equals("Picture in 3 - left lower"))   {
                type = 3;
            };
            if (typetPlace.equals("Picture in 4 - right lower & buffer")) {
                type = 1234;
            };


     //               System.out.println("C " + "  " + CalcValues.image);
            CalcValues.image = adr + type + adr2;
   //         System.out.println("C " + "  " + CalcValues.image);
            new InfoPicture( );
            UI.getCurrent().getPage().setLocation("InfoPicture");
        });

        //     System.out.println("ff   " + type + "  " + image);
        VerticalLayout v1 = new VerticalLayout( radioGroup, addButton  );

        HorizontalLayout  v3 = new HorizontalLayout(v1, img);

        add(
                v1,     v3
        );


    }
}








