package com.example.application.html;





import com.example.application.Mouse.DrawWeldoutString;
import com.example.application.coonvert.SvgToPngConverter;
import com.example.application.under.SendResponse;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.apache.batik.transcoder.TranscoderException;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * write a svg file
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 * */
@AnonymousAllowed
@Route(value = "print", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Printing welding string")
public class PrintSvg extends HorizontalLayout  {
    private String outSvg ;
    private String outHtml ;
    private String stopHtml ;
    private String svgNew ;
    private String svgStop ;
    private String svgFile;
    private String pngFile;
    private String htmlFile;
    private String fileName;
    private String svgSymbol;
    private boolean generated =false;
    private boolean generatedHtml =false;
    private boolean transSvg =false;
    private boolean transHtml =false;


    public PrintSvg() throws IOException, TranscoderException {

        new CalcValues();
        this.outSvg = CalcValues.outSvg;
        this.outHtml = CalcValues.outHtml;
        CalcValues.valgIndeks = 3;
        this.svgStop = CalcValues.svgStop;
        this.stopHtml = CalcValues.stopHtml;
        this.svgSymbol = CalcValues.svgSymbol;
        new DrawWeldoutString();
        this.svgNew = CalcValues.svgNew;
        htmlFile = outHtml + svgNew + svgSymbol + stopHtml;
        svgFile = outSvg + svgNew + svgSymbol + svgStop;
        fileName = CalcValues.pathName + generateFilename();
        String overfortFilSvg = fileName + ".svg";
        String overfortFilHtml = fileName + ".html";
        String overfortFilPng = fileName + ".png";
  //     System.out.println(overfortFilPng);

        TextArea textAreaSvg= new TextArea();
        textAreaSvg.setWidth("320px");
        textAreaSvg.setMinHeight("50px");
        textAreaSvg.setMaxHeight("60px");
        textAreaSvg.setLabel("Filname svg file");
        textAreaSvg.setValue(overfortFilSvg );

        TextArea textAreaHtml= new TextArea();
        textAreaHtml.setWidth("320px");
        textAreaHtml.setMinHeight("50px");
        textAreaHtml.setMaxHeight("60px");
        textAreaHtml.setLabel("Filname html fil");
        textAreaHtml.setValue(overfortFilHtml );

        TextArea textAreaPng = new TextArea();
        textAreaPng.setWidth("320px");
        textAreaPng.setMinHeight("50px");
        textAreaPng.setMaxHeight("60px");
        textAreaPng.setLabel("Filname png fil");
        textAreaPng.setValue(overfortFilPng );

        TextArea textAreaRequest = new TextArea();
        textAreaRequest.setWidth("320px");
        textAreaRequest.setMinHeight("50px");
        textAreaRequest.setMaxHeight("60px");
        textAreaRequest.setLabel("Post request");

        TextArea textAreaParametre = new TextArea();
        textAreaParametre.setWidth("320px");
        textAreaParametre.setMinHeight("50px");
        textAreaParametre.setMaxHeight("60px");
        textAreaParametre.setLabel("Post parametre");

        TextArea textAreaResponsCode = new TextArea();
        textAreaResponsCode.setWidth("320px");
        textAreaResponsCode.setMinHeight("50px");
        textAreaResponsCode.setMaxHeight("60px");
        textAreaResponsCode.setLabel("Post Respons Code");

        Button myButton = new Button("1. Generate svg file");
        myButton.addClassName("my-button");

        myButton.addClickListener((ComponentEventListener<ClickEvent<Button>>) event -> {
            int x = event.getClientX();

            boolean utvid = false;
            try {
                String datafilnavn = fileName  + ".svg";
                PrintWriter tekstSkriver;
                FileWriter tekstFilSkriver = new FileWriter(datafilnavn, utvid) ;
                tekstSkriver = new PrintWriter(tekstFilSkriver);
                tekstSkriver.println(svgFile);
                tekstSkriver.close();
                generated =true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


       String file =  htmlFile + ".html";
        Image img = new Image(file, "22");
  //      Image img = new Image("images/oversikt.png", "22");
        img.setWidth("1000px");
  //      System.out.println(fileName);
        Button myButtonHtml = new Button("1. Generate html file");
        myButtonHtml.addClassName("my-button");

        myButtonHtml.addClickListener((ComponentEventListener<ClickEvent<Button>>) event -> {
            int x = event.getClientX();
            boolean utvid = false;
            try {
                String datafilnavn = fileName + ".html";
                PrintWriter tekstSkriver;
                FileWriter tekstFilSkriver = new FileWriter(datafilnavn, utvid);
                tekstSkriver = new PrintWriter(tekstFilSkriver);
                tekstSkriver.println(htmlFile);
                tekstSkriver.close();
                generatedHtml =true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Button myButtonPng = new Button("1. Generate png file");
        myButtonPng.addClassName("my-button");

        myButtonPng.addClickListener((ComponentEventListener<ClickEvent<Button>>) event -> {
            int x = event.getClientX();

            boolean utvid = false;
            try {
                String datafilnavn = fileName  + ".png";
                PrintWriter tekstSkriver;
                FileWriter tekstFilSkriver = new FileWriter(datafilnavn, utvid) ;
                tekstSkriver = new PrintWriter(tekstFilSkriver);
                tekstSkriver.println(pngFile);
                tekstSkriver.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

if (generated) {
    SvgToPngConverter conv = new SvgToPngConverter();
    conv.convertSvgToPng(overfortFilSvg, pngFile);
}
        Button  transferButtonPng = new Button("2. Transfer png file");
       transferButtonPng.addClickListener((ComponentEventListener<ClickEvent<Button>>) event -> {
            try {
                SendResponse overfoer = new SendResponse(overfortFilSvg );
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        /// //////////////////////////
        Button transferButtonSvg = new Button("2. Transfer svg file");
        transferButtonSvg.addClickListener((ComponentEventListener<ClickEvent<Button>>) event -> {

            try {
                SendResponse overfoer = new SendResponse(overfortFilSvg );
                transSvg = true;
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        Button transferButtonHtml = new Button("2. Transfer html file");
        transferButtonHtml.addClickListener((ComponentEventListener<ClickEvent<Button>>) event -> {

            try {
                SendResponse overfoer = new SendResponse(overfortFilHtml );
                transHtml = true;
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
if (transSvg || transHtml) {
//    System.out.println("copy " + SendResponse.postRequest);
 //   System.out.println("copy " + SendResponse.postParameters);
//    System.out.println("copy " + SendResponse.postResponsCode);

        textAreaRequest.setValue( SendResponse.postRequest );
        textAreaParametre.setValue(SendResponse.postParameters );
        textAreaResponsCode.setValue(SendResponse.postResponsCode );
} else {
    textAreaRequest.setValue( " ");
    textAreaParametre.setValue(" ");
    textAreaResponsCode.setValue(" ");
}
/*
        HorizontalLayout hl = new HorizontalLayout(textAreaSvg, myButton, transferButtonSvg);
        hl.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        add(hl);

        HorizontalLayout hl2 = new HorizontalLayout(textAreaHtml, myButtonHtml, transferButtonHtml);
        hl2.setDefaultVerticalComponentAlignment(Alignment.BASELINE);

        add(hl2);

        HorizontalLayout hl3 = new HorizontalLayout(textAreaPng, myButtonPng, transferButtonPng);
        hl3.setDefaultVerticalComponentAlignment(Alignment.BASELINE);



if (generated) {
    add(hl3);
}
  */
 //   HorizontalLayout hl1 = new HorizontalLayout();
        VerticalLayout vl1 = new VerticalLayout(textAreaSvg, myButton, transferButtonSvg);
vl1.setMaxWidth("340px");
HorizontalLayout hl2 = new HorizontalLayout( img);

        add(vl1 );
    }

    private String generateFilename() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }



}



