package com.example.application.weld;

import com.example.application.Mouse.DrawWeldinnString;
import com.example.application.Mouse.MakeMovePossible;
import com.example.application.diverse.camvas.GreetingComponent;
import com.example.application.html.ActualString;
import com.example.application.under.*;
import com.vaadin.flow.component.UI;
import java.util.ArrayList;
import java.util.List;

/**
 * class collecting the object used i drawing
 * Give information of the different object and are used for testing
 * Klass generate the actual plot
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
public class CreateAndShowGUI {
    String plotType;
    int antall;
    int xP;

    int yP;
    List<ExtraLine> extraLine = new ArrayList<>();
    List<ExtraBase> extraBase = new ArrayList<>();

    List<ExtraBue> extraBue = new ArrayList<>();

    List<ExtraTall> extraTall = new ArrayList<>();

    List<ExtraEllipse> extraEllipse = new ArrayList<>();

    List<ExtraLine> extraLineTegn = new ArrayList<>();
    List<ExtraLine> extraLineTabell = new ArrayList<>();
    List<ExtraBue> extraBueTegn = new ArrayList<>();

    List<ExtraTall> extraTallTegn = new ArrayList<>();

    List<ExtraTall> extraTallBase = new ArrayList<>();

    List<ExtraEllipse> extraEllipseTegn = new ArrayList<>();

    List<ExtraArray> extraArrayTegn = new ArrayList<>();

    List<ExtraOval> extraOval = new ArrayList<>();
    List<ExtraText> extraText = new ArrayList<>();
    List<ExtraComment> extraComment = new ArrayList<>();

    int[] vec = new int[35];

    public CreateAndShowGUI(String plotType, int antall, int[] vec) {
        this.plotType = plotType;
        this.antall = antall;
        this.extraOval = CalcValues.extraOval;
        this.extraText = CalcValues.extraText;
        this.extraBase = CalcValues.extraBase;
        this.extraLine = CalcValues.extraLine;
        this.extraBue = CalcValues.extraBue;
        this.extraTall = CalcValues.extraTall;
        this.extraEllipse = CalcValues.extraEllipse;
        this.extraLineTegn = CalcValues.extraLineTegn;
        this.extraLineTabell = CalcValues.extraLineTabell;
        this.extraBueTegn = CalcValues.extraBueTegn;
        this.extraTallTegn = CalcValues.extraTallTegn;
        this.extraArrayTegn = CalcValues.extraArrayTegn;
        this.extraTallBase = CalcValues.extraTallBase;
        this.extraEllipseTegn = CalcValues.extraEllipseTegn;
        this.extraComment = CalcValues.extraComment;
        this.xP = CalcValues.xP;
        this.yP = CalcValues.yP;
        CalcValues.generateImage = true;
        CalcValues.zoomIndex = CalcValues.zoomC[CalcValues.gang[2]];
        if (vec[26] == 15 || vec[26] == 11 ) {
            CalcValues.valgIndeks = 1;  // 1
        } else {
            CalcValues.valgIndeks = 4;
        }
        new CalcChange();
        //   System.out.println(" zoomIndex " + CalcValues.zoomIndex);
        //   System.out.println("test create " + CalcValues.gang[2]);
        //     for (int i = 0; i < 35 ; i++) {
        //        System.out.println("vec " +  " 26  " + vec[26]);
        //     }
        CalcValues.gang[2] = vec[26];
    //   if (CalcValues.gang[2] == 14 ) CalcValues.zoomIndex = 1.4;
        //  System.out.println("gang[2] =  " + CalcValues.gang[2]);
if (CalcValues.bufferId[4] > 0 || CalcValues.bufferId[7] > 0){
    CalcValues.svgExtra = "";
    CalcValues.bufferId[0] = 0;
    CalcValues.bufferId[1] = 0;
    CalcValues.bufferId[2] = 0;
    CalcValues.bufferId[3] = 0;
    CalcValues.bufferId[4] = 0;
    CalcValues.bufferId[5] = 0;
    CalcValues.bufferId[6] = 0;
    CalcValues.bufferId[7] = 0;
}
        if ( (CalcValues.userID.equals(GreetingComponent.userIdents))) {
            new MakeMovePossible();
       //     new ActualString();
        //   new DrawWeldinnString();
            UI.getCurrent().getPage().setLocation("/thymeleaf-example");


        }

    }
}




