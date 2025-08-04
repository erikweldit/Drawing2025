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
import com.vaadin.flow.router.*;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import java.util.*;

/**
 * Shows interface for generating actual values for butt weld
 * All values used in calculation fr the forms are given as input from user
 * Values for standard forms are gives as default
 * but a form has to be chosen or a blank page appear
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route(value = "InfoPicture", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS -  Explanation of chooses")
//@Route("Butt")
public class InfoPicture extends HorizontalLayout  implements HasUrlParameter<String> {
int type = 0;
    String image = CalcValues.image;
    private String fromRoute;

    @Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
        // Hent "from" parameteren fra query parameter
        fromRoute = event.getLocation()
                .getQueryParameters()
                .getParameters()
                .getOrDefault("from", Arrays.asList("defaultView"))
                .get(0);
    }
    public InfoPicture() {
        if ( CalcValues.image.equals("")){
            CalcValues.image = "images/P0.png";
        }
        String adr = "images/P";
        String adr2 = ".png";
        /*
// Fra ditt nåværende view:
        Map<String, List<String>> parameters = new HashMap<>();
        parameters.put("from", Collections.singletonList("ButtMain")); // erstatt med din aktuelle rute
        QueryParameters qp = new QueryParameters(parameters);
        UI.getCurrent().navigate("InfoPicture", qp);
      Button backButton = new Button("Tilbake", e -> UI.getCurrent().navigate(fromRoute));

         */
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
  //     radioGroup.setValue("Zoomable picture - normal size");
 //       radioGroup.setValue(CalcValues.image);
        Button backButton = new Button("Tilbake", e -> UI.getCurrent().navigate(fromRoute));


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


     //       System.out.println(" " + "  " + CalcValues.image);
            CalcValues.image = adr + type + adr2;
       //     System.out.println(" " + "  " + CalcValues.image);
            new InfoPictureC( );
            UI.getCurrent().getPage().setLocation("InfoPictureC");
        });

   //     System.out.println("ff   " + type + "  " + image);
        VerticalLayout v1 = new VerticalLayout( radioGroup, addButton  );  // , backButton

        HorizontalLayout  v3 = new HorizontalLayout(v1, img);

        add(
           v1,     v3
        );


    }







}







