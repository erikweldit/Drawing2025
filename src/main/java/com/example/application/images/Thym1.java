package com.example.application.images;





import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
/**
 * Test for Thymeleaf function
 * Not in use
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route("thym1")
public class Thym1 extends VerticalLayout {

    public String svg ;
    public Thym1() {

        // Opprett et Div-element for å vise Thymeleaf-innhold
        Div thymeleafContent = new Div();

        // Hent Thymeleaf-templaten og legg til i Div-elementet
        thymeleafContent.getElement().setProperty("innerHTML", getThymeleafTemplate());

        // Legg til Div-elementet i layouten
        add(thymeleafContent);
    }

    public String getThymeleafTemplate() {
        int x = 1600;
        int y = 800;

        String svg = "<svg width='200' height='200' xmlns='http://www.w3.org/2000/svg'> " +
                "<rect width='200' height='200' fill='lightgray' /> " +

                "<circle cx='100' cy='100' r='50' fill='blue' " +
                " onclick='handleClick()' />" +
                "<script type='text/ecmascript'>" +
                "  <![CDATA[" +
                "    function handleClick() {" +
                "      alert('Sirkel ble klikket!');" +
                "    }" +
                "  ]]>" +
                " </script>" +
                "</svg>" ;

/*
        String svg = "<!DOCTYPE html>\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\"\n" +
                "      xmlns:th=\"http://www.thymeleaf.org\"\n" +
                "      lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv = \"refresh\" content = \"1;url= /Image\" />\n" +
                "    <title>Taming Thymeleaf</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";
        */
        return svg ;


    }
}





