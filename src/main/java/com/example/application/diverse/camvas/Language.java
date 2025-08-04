package com.example.application.diverse.camvas;



import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import java.util.ArrayList;
import java.util.List;

@AnonymousAllowed
@Route("language")
public class Language {
    public List<String> languageA = new ArrayList<String>();
    public static List<String> actual = new ArrayList<String>();
    public Language()  {

        languageA.add( 0, "Home " );
        languageA.add( 1, "Butt weld " );
        languageA.add( 2, "Cam weld " );
        languageA.add( 3, "Corner weld " );
        languageA.add( 4, "Fillet weld " );
        languageA.add( 5, "Flanged weld " );

        languageA.add( 6, "Draw string & symbol " );
        languageA.add( 7, "New String names " );
        languageA.add( 8, "New string symbol " );
        languageA.add( 9, "Symbol table " );
        languageA.add( 10, "Print / transfer file " );
        languageA.add( 11, "Butt weld specifications " );
        languageA.add( 12, "Choose left design " );
        languageA.add( 13, "Choose right design " );
        languageA.add( 14, "Comments " );
        languageA.add( 15, "Gap left " );
        languageA.add( 16, "Gap right " );
        languageA.add( 17, "Dy left " );
        languageA.add( 18, "Dy right " );
        languageA.add( 19, "Tickness left " );
        languageA.add( 20, "Tickness right " );
        languageA.add( 21, "Top Angle left " );
        languageA.add( 22, "Top Angle right " );
        languageA.add( 23, "Top Radius left " );
        languageA.add( 24, "Top Radius right " );
        languageA.add( 25, "Bottom Angle left " );
        languageA.add( 26, "Botton Angle right " );
        languageA.add( 27, "Bottom Radius left " );
        languageA.add( 28, "Bottom Radius right " );
        languageA.add( 29, "Face left " );
        languageA.add( 30, "Face right " );
        languageA.add( 31, "Center left " );
        languageA.add( 32, "Center right " );
        languageA.add( 33, "Values on picture " );
        languageA.add( 34, "Yes " );
        languageA.add( 35, "No " );
        languageA.add( 36, "Choose plot-type " );
        languageA.add( 37, "Generate picture " );
        languageA.add( 38, "Single picture - small " );
        languageA.add( 39, "Single picture - big " );
        languageA.add( 40, "2 picture vertical left " );
        languageA.add( 41, "2 picture vertical right & finishing " );
        languageA.add( 42, "2 picture horizontal upper " );
        languageA.add( 43, "2 picture horizontal lower & finishing " );
        languageA.add( 44, "4 picture left upper " );
        languageA.add( 45, "4 picture right upper " );
        languageA.add( 46, "4 picture left lower " );
        languageA.add( 47, "4 picture right lower & finishng " );
        languageA.add( 48, "Show picture " );
        languageA.add( 49, "Cam weld specifications " );
        languageA.add( 50, "Joint type " );
        languageA.add( 51, "Dimension 1 " );
        languageA.add( 52, "Dimension 2 / plate " );
        languageA.add( 53, "Dimension 3 " );

        languageA.add( 54, "Corner wed specifications " );
        languageA.add( 55, "Angle " );
        languageA.add( 56, "Thickness plate 1 " );
        languageA.add( 57, "Thickness plate 2 " );
        languageA.add( 58, "Left angle " );
        languageA.add( 59, "Rigt angle " );
        languageA.add( 60, "Plate 1 Dx " );
        languageA.add( 61, "Plate 2 Dx " );
        languageA.add( 62, " " );
        languageA.add( 63, "Fillet weld specifications " );
        languageA.add( 64, "Choose design " );
        languageA.add( 65, "Gap " );
        languageA.add( 66, "Left-a-side " );
        languageA.add( 67, "Right-a-side " );
        languageA.add( 68, "Thickness bottom " );
        languageA.add( 69, "Thickness top " );
        languageA.add( 70, "Face " );
        languageA.add( 71, "Center left " );

        languageA.add( 72, "Flanged weld secifications " );
        languageA.add( 73, "Thickness " );
        languageA.add( 74, "Top radius " );

        languageA.add( 75, "Overlap weld specifications " );
        languageA.add( 76, "Thickness plate 1 " );
        languageA.add( 77, "Tickness plate 2 " );

        languageA.add( 78, "Actual weld drawing " );

        languageA.add( 79, "Drawing welding string " );

        languageA.add( 80, "Draw string " );
        languageA.add( 81, "Move string " );
        languageA.add( 82, "Delete string " );
        languageA.add( 83, "Welding symbol " );
        languageA.add( 84, "Zoom ");

        languageA.add( 85, "Change welding identificators " );

        languageA.add( 86, "No weld string is generated " );

        languageA.add( 87, "Drawing welding string " );

        languageA.add( 88, "Index " );

        languageA.add( 89, "Symbol " );
        languageA.add( 90, "Type " );
        languageA.add( 91, "I-fuge  " );
        languageA.add( 92, "V-fuge " );
        languageA.add( 93, "Halv V-fuge " );
        languageA.add( 94, "Y-fuge " );
        languageA.add( 95, "Halv Y-fuge " );
        languageA.add( 96, "Symmetisk X-fuge " );
        languageA.add( 97, "Usymmetrisk X-fuge " );
        languageA.add( 98, "Symmetrisk K-fuge " );
        languageA.add( 99, "Usymmetrisk K-fuge " );
        languageA.add( 100, "Enkel kilsveis " );
        languageA.add( 101, "Dobbel kilsveis " );

        languageA.add( 102, "Printing welding string " );

        languageA.add( 103, "Filname svg file " );
        languageA.add( 104, "Filname html file " );
        languageA.add( 105, "Generate svg file " );
        languageA.add( 106, "Generate html file " );
        languageA.add( 107, "Transfer svg file " );
        languageA.add( 108, "Transfer html file " );

        languageA.add( 109, "How to use the system " );


        languageA.add( 110, "I menyens øverste del vises 6 ulike typer sveis: Butt, Cam, Corner, Fillet, Flanged og Overlap. " +
                " Ved å velge den aktuelle typen kommer en side opp hvor ulike verdier må velges. " +
                " Verdiene vil variere avhengig av hvilken type som er valgt. " +
                "For Butt og Fillet må en først velge hvilket design en skal ha indikert ved en av I, X, Y, U eller DU " +
                "Verdien av Gap angir avstanden mellom de to delene som skal sveises sammen mens Dy angir vertikal forskyvning." +
                "De øvrige numeriske verdier bestemmer formen til de to elementene som skal sveises sammen. " +
                "Det er også mulig å legge korte kommentarer inn på dokumentasjonen ved bruk av feltet 'Comments'. " );

        languageA.add( 111, "I feltet 'Values on picture' kan det velges om plottet skal inneholde informasjon som vinkler og radius inntegnet eller ikke. " +

                "I feltet 'Choose plot -type' kan utformingen av plottet velges. Mulighetene er: " +

                "-Enkelt bilde enten stort eller lite. " +
                "-Sammensatt bilde hvor tegnearket er delt i 4 deler (øvre, nedre, venstre og høyre) " +
                "Når en trykker på 'Generate picture' vil et bilde den valgte strukturen genereres. " );

        languageA.add( 112, "Ved valgmulighetene i den midterste delen av menyen kan en tegne inn sveisestrenger og sveisesymboler på dette plottet. " +
                "NB! Når en tegner med musen kan en ikke flytte skjermbildet i browseren for da blir koordinatene til musen også endret. NB! " +

                "Ved å aktivisere 'Draw string & symbol' blir et tegneområde generert. For å kunne tegne på dette må en bruke en av de 4 valgmulighetene. " +

                "Etter at 'Draw string' er aktivisert må  en klikke 3 ganger for å indikere de tre punktene som genererer en Bezier-kurve. " +

                "Etter at 'Move string' er aktivisert må en først klikke innenfor det punktet en ønsker å flytte og deretter hvor det skal plasseres.  " +
                "(Husk at Bezier-punktet ikke ligger på  selve kurven, men enten over eller under). " +

                "Etter at 'Delete string' er aktivisert må en klikke innenfor det punktet som skal slettes. Hele Bezier-kurven blir da slettet. " );

        languageA.add( 113, "Etter at 'Welding symbol' er aktivisert må en klikke på den plassen hvor det ønskes plassert. Det vil da komme frem som '.a' til '.Z'  " +
                "Symbolet kan slettes eller flyttes ved å identifisere plasseringen ved '.' " +
                "(Kan ikke flyttes etter at selve symbolet er generert)  "+

                "Ved å aktivisere 'New string names' kommer det opp en liste over hvilke sveisestrenger som er generert. Her kan navnet på dem endres og  " +"genereres på nytt. " +

                "Ved å aktivisere 'New string symbol' kommer det opp en liste over først det symbolet som står på plottet allerede, deretter det symbolet  " +
                "som står på plottet etter ny generering. Dette vil typisk være a-målet til sveisen. Og i den tredje kolonnen står verdien 0.  " +
                "Dersom et sveisesymbol ønskes på plottet, må en velge en indeks mellom 1 og 11. " );

        languageA.add( 104, "For mulige valg se 'Symbol Table'. " +

                "Det ferdige plottet kan genereres til en svg-fil eller en html fil ved menyvalget 'Print/transfer files'. " +
                "Her kan også adressen resultatfilen sendes til en API for å bli integrert i sveise dokumentasjonen. " );
        for ( int i = actual.size();  i >= 0; i--){
            //  actual.remove(i);
        }

        for ( int i =0 ; i < languageA.size();  i++){
            actual.add(i, languageA.get(i));
            //      System.out.println(actual.get(i));
        }

    }
}


