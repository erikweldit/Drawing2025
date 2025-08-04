package com.example.application.diverse;



import com.example.application.html.WeldSymbol;
import com.example.application.html.svg;
import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.Svg;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;


/**
 * Class draw table of actual welding symbol
 *
 *
 *
 *  @author Erik Andreas Vold -  erikvold84@gmail.com
 *
 */
@AnonymousAllowed
@Route(value = "SymbolTable"  , layout = MainLayoutDraw.class)
@RouteAlias("interntabell")
@PageTitle("Weld IT AS - Drawing welding string")
@CssImport("./../frontend/themes/my-theme/styles.css")
public class SymbolTable extends Div {
    public int xCoord;
    public int yCoord;

    public int xStep;
    public int yStep;
    public String svgTableString;


    public SymbolTable() {
        xCoord = 200;
        yCoord = 200;
        int height = 860;

        int width  = 1200;
        int wLow = 0;
        int wUp = 1200;
        int hLow = 0;
        int hUp = 860;
        yStep = 50;
        svgTableString = "";
        svgTableString = "<svg height='" + height + "'" + " width='" +  width + "' viewBox = '" + wLow + " " + hLow + " " + wUp + " " + hUp +
                "' xmlns='http://www.w3.org/2000/svg'  xmlns:xlink = 'http://www.w3.org/1999/xlink' >  \n";
        String svgStop = "Sorry, your browser does not support inline SVG. </svg> \n";
        svgTable();
        // Opprett et Div-element for å vise Thymeleaf-innhold
        Div thymeleafContent = new Div();

        // Hent Thymeleaf-templaten og legg til i Div-elementet
        thymeleafContent.getElement().setProperty("innerHTML", getThymeleafTemplate());

        // Legg til Div-elementet i layouten
        add(thymeleafContent);

    }
    /**
     * Generate the whole symbol table on actual page
     * @return svgTable();
     */
    private String getThymeleafTemplate() {
        return svgTable();


    }
    /**
     * Gives the hole symbol table as a String
     * @return String svgTableString
     */
    public String svgTable(){
        int width = 50;
        int height = 70;
        int wLow = 10;
        int hLow = 50;
        int wUp = 40;
        int hUp = 70;
        svg svgElement = new svg(width, height,wLow, hLow, wUp, hUp);
        int xCoord = 100;
        int yCoord = 100;
        int xStep = 10;
        int yStep = 30;

        svgElement.setColor("black");
        svgTableString +=  svgElement.drawLine(xCoord-6*xStep,yCoord- 2*yStep,xCoord+ 30*xStep,yCoord -2*yStep);
        svgTableString +=  svgElement.drawLine(xCoord-6*xStep,yCoord- 1*yStep,xCoord+ 30*xStep,yCoord -1*yStep);
        svgTableString +=  svgElement.drawLine(xCoord-6*xStep,yCoord- 2*yStep,xCoord - 6*xStep,yCoord + 22*yStep);
        svgTableString +=  svgElement.drawLine(xCoord-0*xStep,yCoord- 2*yStep,xCoord - 0*xStep,yCoord + 22*yStep);
        svgTableString +=  svgElement.drawLine(xCoord+ 15*xStep,yCoord- 2*yStep,xCoord + 15*xStep,yCoord + 22*yStep);
        svgTableString +=  svgElement.drawLine(xCoord+ 30*xStep,yCoord- 2*yStep,xCoord + 30*xStep,yCoord + 22*yStep);
        svgTableString +=  svgElement.drawLine(xCoord-6*xStep,yCoord+ 22*yStep,xCoord+ 30*xStep,yCoord +22*yStep);

        svgTableString +=  svgElement.drawText("Index", xCoord-5*xStep,yCoord-1*yStep-5);
        svgTableString +=  svgElement.drawText("Symbol", xCoord+ 1*xStep,yCoord-1*yStep-5);
        svgTableString +=  svgElement.drawText("Type", xCoord+20*xStep,yCoord-1*yStep-5);

        svgTableString +=  svgElement.drawText("1", xCoord - 5*xStep,yCoord+ 0*yStep);
        svgTableString +=  svgElement.drawText("2", xCoord - 5*xStep,yCoord+ 1*yStep);
        svgTableString +=  svgElement.drawText("3", xCoord - 5*xStep,yCoord+ 2*yStep);
        svgTableString +=  svgElement.drawText("4", xCoord - 5*xStep,yCoord+ 3*yStep);
        svgTableString +=  svgElement.drawText("5", xCoord - 5*xStep,yCoord+ 4*yStep);
        svgTableString +=  svgElement.drawText("6", xCoord - 5*xStep,yCoord+ 5*yStep);
        svgTableString +=  svgElement.drawText("7", xCoord - 5*xStep,yCoord+ 6*yStep);
        svgTableString +=  svgElement.drawText("8", xCoord - 5*xStep,yCoord+ 7*yStep);
        svgTableString +=  svgElement.drawText("9", xCoord - 5*xStep,yCoord+ 8*yStep);
        svgTableString +=  svgElement.drawText("10", xCoord - 5*xStep,yCoord+ 9*yStep);
        svgTableString +=  svgElement.drawText("11", xCoord - 5*xStep,yCoord+ 10*yStep);
        svgTableString +=  svgElement.drawText("12", xCoord - 5*xStep,yCoord+ 11*yStep);
        svgTableString +=  svgElement.drawText("13", xCoord - 5*xStep,yCoord+ 12*yStep);
        svgTableString +=  svgElement.drawText("14", xCoord - 5*xStep,yCoord+ 13*yStep);
        svgTableString +=  svgElement.drawText("15", xCoord - 5*xStep,yCoord+ 14*yStep);
        svgTableString +=  svgElement.drawText("16", xCoord - 5*xStep,yCoord+ 15*yStep);
        svgTableString +=  svgElement.drawText("17", xCoord - 5*xStep,yCoord+ 16*yStep);
        svgTableString +=  svgElement.drawText("18", xCoord - 5*xStep,yCoord+ 17*yStep);
        svgTableString +=  svgElement.drawText("19", xCoord - 5*xStep,yCoord+ 18*yStep);
        svgTableString +=  svgElement.drawText("20", xCoord - 5*xStep,yCoord+ 19*yStep);
        svgTableString +=  svgElement.drawText("21", xCoord - 5*xStep,yCoord+ 20*yStep);
        svgTableString +=  svgElement.drawText("22", xCoord - 5*xStep,yCoord+ 21*yStep);


        svgTableString +=  svgElement.drawText("I-fuge", xCoord+ 16*xStep,yCoord+ 0*yStep);
        svgTableString +=  svgElement.drawText("V-fuge", xCoord+ 16*xStep,yCoord+ 1*yStep);
        svgTableString +=  svgElement.drawText("Halv V-fuge", xCoord+ 16*xStep,yCoord+ 2*yStep);
        svgTableString +=  svgElement.drawText("Y-fuge", xCoord+ 16*xStep,yCoord+ 3*yStep);
        svgTableString +=  svgElement.drawText("Halv Y-fuge", xCoord+ 16*xStep,yCoord+ 4*yStep);
        svgTableString +=  svgElement.drawText("Symmetrisk X-fuge", xCoord+ 16*xStep,yCoord+ 5*yStep);
        svgTableString +=  svgElement.drawText("Usymmetrisk X-fuge", xCoord+ 16*xStep,yCoord+ 6*yStep);
        svgTableString +=  svgElement.drawText("Symmetrisk K-fuge", xCoord+ 16*xStep,yCoord+ 7*yStep);
        svgTableString +=  svgElement.drawText("Usymmetrisk K-fuge", xCoord+ 16*xStep,yCoord+ 8*yStep);
        svgTableString +=  svgElement.drawText("Enkel kilsveis", xCoord+ 16*xStep,yCoord+ 9*yStep);
        svgTableString +=  svgElement.drawText("Dobbel kilsveis", xCoord+ 16*xStep,yCoord+ 10*yStep);

        svgTableString +=  svgElement.drawText("I-fuge", xCoord+ 16*xStep,yCoord+ 11*yStep);
        svgTableString +=  svgElement.drawText("V-fuge", xCoord+ 16*xStep,yCoord+ 12*yStep);
        svgTableString +=  svgElement.drawText("Halv V-fuge", xCoord+ 16*xStep,yCoord+ 13*yStep);
        svgTableString +=  svgElement.drawText("Y-fuge", xCoord+ 16*xStep,yCoord+ 14*yStep);
        svgTableString +=  svgElement.drawText("Halv Y-fuge", xCoord+ 16*xStep,yCoord+ 15*yStep);
        svgTableString +=  svgElement.drawText("Symmetrisk X-fuge", xCoord+ 16*xStep,yCoord+ 16*yStep);
        svgTableString +=  svgElement.drawText("Usymmetrisk X-fuge", xCoord+ 16*xStep,yCoord+ 17*yStep);
        svgTableString +=  svgElement.drawText("Symmetrisk K-fuge", xCoord+ 16*xStep,yCoord+ 18*yStep);
        svgTableString +=  svgElement.drawText("Usymmetrisk K-fuge", xCoord+ 16*xStep,yCoord+ 19*yStep);
        svgTableString +=  svgElement.drawText("Enkel kilsveis", xCoord+ 16*xStep,yCoord+ 20*yStep);
        svgTableString +=  svgElement.drawText("Dobbel kilsveis", xCoord+ 16*xStep,yCoord+ 21*yStep);

        xCoord = xCoord + 2*xStep;
        WeldSymbol sym1 = new WeldSymbol( 1, xCoord,yCoord+ 0*yStep);
        svgTableString += sym1.choseSymbol(1, xCoord,yCoord+ 0*yStep);

        WeldSymbol sym2 = new WeldSymbol( 2, xCoord,yCoord+ 1*yStep);
        svgTableString += sym1.choseSymbol(2, xCoord,yCoord+ 1*yStep);

        WeldSymbol sym3 = new WeldSymbol( 3, xCoord,yCoord+ 2*yStep);
        svgTableString += sym1.choseSymbol(3, xCoord,yCoord+ 2*yStep);

        WeldSymbol sym4 = new WeldSymbol( 4, xCoord,yCoord+ 3*yStep);
        svgTableString += sym1.choseSymbol(4, xCoord,yCoord+ 3*yStep);

        WeldSymbol sym5 = new WeldSymbol( 5, xCoord,yCoord+ 4*yStep);
        svgTableString += sym1.choseSymbol(5, xCoord,yCoord+ 4*yStep);

        WeldSymbol sym6 = new WeldSymbol( 6, xCoord,yCoord+ 5*yStep);
        svgTableString += sym1.choseSymbol(6, xCoord,yCoord+ 5*yStep);

        WeldSymbol sym7 = new WeldSymbol( 7, xCoord,yCoord+ 6*yStep);
        svgTableString += sym1.choseSymbol(7, xCoord,yCoord+ 6*yStep);

        WeldSymbol sym8 = new WeldSymbol( 8, xCoord,yCoord+ 7*yStep);
        svgTableString += sym1.choseSymbol(8, xCoord,yCoord+ 7*yStep);

        WeldSymbol sym9 = new WeldSymbol( 9, xCoord,yCoord+ 8*yStep);
        svgTableString += sym1.choseSymbol(9, xCoord,yCoord+ 8*yStep);

        WeldSymbol sym10 = new WeldSymbol( 10, xCoord,yCoord+ 9*yStep);
        svgTableString += sym1.choseSymbol(10, xCoord,yCoord+ 9*yStep);

        WeldSymbol sym11 = new WeldSymbol( 11, xCoord,yCoord+ 10*yStep);
        svgTableString += sym1.choseSymbol(11, xCoord,yCoord+ 10*yStep);
        xCoord = xCoord + 9*xStep;
        WeldSymbol sym12 = new WeldSymbol( 12, xCoord,yCoord+ 11*yStep);
        svgTableString += sym1.choseSymbol(12, xCoord,yCoord+ 11*yStep);

        WeldSymbol sym13 = new WeldSymbol( 13, xCoord,yCoord+ 12*yStep);
        svgTableString += sym1.choseSymbol(13, xCoord,yCoord+ 12*yStep);

        WeldSymbol sym14 = new WeldSymbol( 14, xCoord,yCoord+ 13*yStep);
        svgTableString += sym1.choseSymbol(14, xCoord,yCoord+ 13*yStep);

        WeldSymbol sym15 = new WeldSymbol( 15, xCoord,yCoord+ 14*yStep);
        svgTableString += sym1.choseSymbol(15, xCoord,yCoord+ 14*yStep);

        WeldSymbol sym16 = new WeldSymbol( 16, xCoord,yCoord+ 15*yStep);
        svgTableString += sym1.choseSymbol(16, xCoord,yCoord+ 15*yStep);

        WeldSymbol sym17 = new WeldSymbol( 17, xCoord,yCoord+ 16*yStep);
        svgTableString += sym1.choseSymbol(17, xCoord,yCoord+ 16*yStep);

        WeldSymbol sym18 = new WeldSymbol( 18, xCoord,yCoord+ 17*yStep);
        svgTableString += sym1.choseSymbol(18, xCoord,yCoord+ 17*yStep);

        WeldSymbol sym19 = new WeldSymbol( 19, xCoord,yCoord+ 18*yStep);
        svgTableString += sym1.choseSymbol(19, xCoord,yCoord+ 18*yStep);

        WeldSymbol sym20 = new WeldSymbol( 20, xCoord,yCoord+ 19*yStep);
        svgTableString += sym1.choseSymbol(20, xCoord,yCoord+ 19*yStep);

        WeldSymbol sym21 = new WeldSymbol( 21, xCoord,yCoord+ 20*yStep);
        svgTableString += sym1.choseSymbol(21, xCoord,yCoord+ 20*yStep);

        WeldSymbol sym22 = new WeldSymbol( 22, xCoord,yCoord+ 21*yStep);
        svgTableString += sym1.choseSymbol(22, xCoord,yCoord+ 21*yStep);

        return svgTableString;
    }
}



