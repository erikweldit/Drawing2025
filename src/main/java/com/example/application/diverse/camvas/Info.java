package com.example.application.diverse.camvas;



import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;



import java.util.ArrayList;
import java.util.List;

@AnonymousAllowed
@Route(value = "info", layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - How to  use the system")
public class Info extends VerticalLayout {
    public List<String> out = new ArrayList<>();
    public boolean[] inBuffer = new boolean[17];

    public Info() {

        String text0 = "I menyens øverste del vises 6 ulike typer sveis: Butt, Cam, Corner, Fillet, Flanged og Overlap. " +
                " Ved å velge den aktuelle typen kommer en side opp hvor ulike verdier må velges. " +
                " Verdiene vil variere avhengig av hvilken type som er valgt. " +
                "For Butt og Fillet må en først velge hvilket design en skal ha indikert ved en av I, X, Y, U eller DU " +
                "Verdien av Gap angir avstanden mellom de to delene som skal sveises sammen mens Dy angir vertikal forskyvning. " +
                "De øvrige numeriske verdier bestemmer formen til de to elementene som skal sveises sammen. " +
                "Det er også mulig å legge korte kommentarer inn på dokumentasjonen ved bruk av feltet 'Comments'. " ;

        String text5 =  "I feltet 'Values on picture' kan det velges om plottet skal inneholde informasjon som vinkler og radius inntegnet eller ikke. " +


                " 1. zoombart bilde " +
                "2. Enkelt stort bilde eller " +
                "3.Sammensatt bilde hvor tegnearket er delt i 4 deler (øvre, nedre, venstre og høyre) " +
                "Når en trykker på 'Generate picture' vil et bilde av den valgte strukturen genereres. " ;

        String text10 =          "Ved valgmulighetene i den midterste delen av menyen kan en tegne inn sveisestrenger og sveisesymboler på dette plottet. " +

                "Ved å aktivisere 'Draw string & symbol' blir et tegneområde generert. For å kunne tegne på dette må en bruke en av de 4 valgmulighetene. " +

                "Etter at 'Draw string' er aktivisert må  en klikke 3 ganger for å indikere de tre punktene som genererer en Bezier-kurve. " +

                "Etter at 'Move string' er aktivisert må en først klikke innenfor det punktet en ønsker å flytte og deretter hvor det skal plasseres.  " +
                "(Husk at Bezier-punktet ikke ligger på  selve kurven, men enten over eller under). " +

                "Etter at 'Delete string' er aktivisert må en klikke innenfor det punktet som skal slettes. Hele Bezier-kurven blir da slettet. " +
                " Ved å aktivisere Draw line kan en tegne flere rette linjer som blir konventert til Bezier kurver. Disse kurvene er uten nummer.";

        String text16 =      "Etter at 'Welding symbol' er aktivisert må en klikke på den plassen hvor det ønskes plassert. Det vil da komme frem som '.a' til '.Z'  " +
                "Symbolet kan slettes eller flyttes ved å identifisere plasseringen ved '.' " +

                "Ved å aktivisere 'New string names' kommer det opp en liste over hvilke sveisestrenger som er generert. Her kan navnet på dem endres og  " +"genereres på nytt. " +

                "Ved å aktivisere 'New string symbol' kommer det opp en liste over først det symbolet som står på plottet allerede, deretter det symbolet  " +
                "som står på plottet etter ny generering. Dette vil typisk være a-målet til sveisen. Og i den tredje kolonnen står verdien 0.  " +
                "Dersom et sveisesymbol ønskes på plottet, må en velge en indeks mellom 1 og 22. " ;

        String text22=        "For mulige valg se 'Symbol Table'. " +

                "Det ferdige plottet kan genereres til en svg-fil eller en html fil ved menyvalget 'Print/transfer files'. " +
                "Her kan også adressen resultatfilen sendes til en API for å bli integrert i sveise dokumentasjonen. " ;

        String text12 = "For zoombare bilder er det egne menyer for å kunne velge ulike størrelser om en kan tegne i.  " +
                " Denne størrelsen kan beholdes eller minimeres ned til standard størrelse. " +
                " Det er også mulig å velge endelig plassering i en av sidekvadrantene 1, 2, 3 eller 4. " +
                " En slik plassering er markert nederst i menyen til venstre ved et tall." +
                " Denne bufferen tømmes ved valg av posisjon 4. "  ;

        String text30 = "Etter at tegningen er passert på arket kan en også flytte tekstelementer i tegningen. ";
        out.add(0,text0 ) ;
        out.add(1,text5 ) ;
        out.add(2,text10 ) ;
        out.add(3,text12 ) ;
        out.add(4,text16 ) ;
        out.add(5,text22) ;
        out.add(6,text30) ;

        Button backButton = new Button("Info about cChoose plot - type", e -> UI.getCurrent().navigate("InfoPicture"));
        Image img = new Image("images/info.jpg", "Info image");
        img.setWidth("360px");
        //   setSizeFull();

        H2 header = new H2("WPS drawing program for joint configuration and string buildup");
        header.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM);
        //     add(header);
        add(
                new HorizontalLayout(

                        new VerticalLayout(
                                new Paragraph(out.get(0)),
                                new Paragraph(out.get(1)),
                                new Paragraph(out.get(2)),
                                new Paragraph(out.get(3)),
                                new Paragraph(out.get(4)),
                                new Paragraph(out.get(5)),
                                new Paragraph(out.get(6)),
                                backButton
                        ),
                        new HorizontalLayout(
                                img

                        )));
    }

}



