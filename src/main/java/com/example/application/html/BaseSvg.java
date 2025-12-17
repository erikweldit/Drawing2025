package com.example.application.html;

import com.example.application.Mouse.DrawWeldSave;
import com.example.application.diverse.camvas.GreetingComponent;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.apache.batik.transcoder.TranscoderException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.example.application.zoomdb.SvgImageAdminService;
import static com.example.application.zoomdb.SvgImageAdminService.repository;
import com.vaadin.flow.server.VaadinSession;
/**
 * write a svg file in H2 database
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 * */
@AnonymousAllowed
@Route( "base")
@PageTitle("Weld IT AS - Printing welding string")
@JsModule("./svg-zoom.js")
public class BaseSvg  extends  AppLayout {   //  extends AppLayout   HorizontalLayout
 //   private SvgImageRepository repository;
    private final  SvgImageAdminService kli = new  SvgImageAdminService(repository);
    private String outSvg ;
    private String svgNew ;
    private String svgStop ;
    private String svgFile;
    private String fileName;
    private String svgSymbol;
    private String userId = CalcValues.userID;


    public BaseSvg() throws IOException, TranscoderException {
        String username = VaadinSession.getCurrent().getAttribute("tenantUser") != null ?            VaadinSession.getCurrent().getAttribute("tenantUser").toString() :            GreetingComponent.userIdents;

        new CalcValues();
        this.outSvg = CalcValues.outSvg;
        this.svgStop = CalcValues.svgStop;
        this.svgSymbol = CalcValues.svgSymbol;
        this.svgNew = CalcValues.svgNew;
        new DrawWeldSave();
        this.svgNew = CalcValues.svgNew;
        svgFile = outSvg + svgNew + svgSymbol + CalcValues.svgExtra + svgStop;
        
        System.out.println(" Draw type " + CalcValues.drawType + " for user " + CalcValues.userID);

            fileName = CalcValues.pathName  + CalcValues.drawType + '_' + generateFilename();
            String file = fileName + ".svg";
            String svgContent = svgFile;

        kli.uploadSvg(file, svgContent, userId ) ;
        kli.deleteOlderThanFourWeeks();

        UI.getCurrent().getPage().setLocation("lastviewsave");


        }

    private String generateFilename() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

}




