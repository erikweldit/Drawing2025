package com.example.application.images;



import com.example.application.Mouse.MouseMoved;
import com.example.application.html.ActualString;
import com.example.application.under.ExtraComment;
import com.example.application.under.ExtraTall;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route(value = "movercomment" , layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Drawing welding string")
public class SvgDraggableTextView extends VerticalLayout {
    ExtraComment test;
    ExtraTall testTallNew;
    ExtraTall originalType;
    int enterType;
    int cx4;
    int cy4;
    int ox4;
    int oy4;
    int transX;
    int transY;
    double factor;
    int xP = CalcValues.xP;
    int yP = CalcValues.yP;
    String testTall;
    String movingCurve;
    int foundIndex ;
    public SvgDraggableTextView() {
        ActualString actual = new ActualString();
        String svgCode = actual.getActualString();
        com.vaadin.flow.component.button.Button myButton = new Button("Finish moving");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {  new ElementMove(); } );
        add(myButton);

        this.enterType = MouseMoved.enterTypeNew; // 5 for Comment  6 for extraTallTegn 7 for extraTall
        //      foundIndex = MouseMoved.getFoundIndex();
        //    System.out.println("found enterType  " + enterType);
        transX = ActualString.getTransX();
        transY = ActualString.getTransY();
        factor = ActualString.getFactor();

        if ( this.enterType == 5 ) {
            this.test = MouseMoved.getTest();
            cx4 = test.getFirstX() ;
            cy4 = test.getFirstY() ;
            testTall = test.getLastString();
        }
        if ( this.enterType == 6 ) {
            this.testTallNew = MouseMoved.getFoundType();
            cx4 = testTallNew.getFirstX() ;
            cy4 = testTallNew.getFirstY() ;
            testTall = testTallNew.getLastString();
            //       System.out.println((" enterType  " + enterType + " new "  + cx4 + " " + cy4 + " " + testTall + " original  " + ox4 + "  " + oy4));
        }
        if ( this.enterType == 7 ) {
            this.testTallNew = MouseMoved.getFoundType();
            cx4 = testTallNew.getFirstX() ;
            cy4 = testTallNew.getFirstY() ;
            testTall = testTallNew.getLastString();
            //     System.out.println((" enterType  " + enterType + " new "  + cx4 + " " + cy4 + " " + testTall + " original  " + ox4 + "  " + oy4));
        }
        //      System.out.println(testTall);
        // Lag et Div-element for å holde SVG

        Div svgContainer = new Div();
        svgContainer.setId("svgContainer");
        // svgContainer.setWidth("600px");
        //  svgContainer.setHeight("400px");
        String width = "1200px";
        String height = "900px";
        int r = 5;

        movingCurve = "<svg id='svgCanvas' width='" + width + "' height='" + height + "'>" +
                //     "  <path id='curve' d='M " + cx1 + "  " + cy1 + " Q " + cx2 + "  " + cy2 + ", " + cx3 + "  " + cy3 + "' stroke='black' fill='transparent'/>" +
                //     "  <circle cx='" + cx1 + "' cy='" + cy1 + "' r='" + r + "' fill='red' class='end-point' style='cursor: pointer;'/>" +
                //    "  <circle cx='" + cx2 + "' cy='" + cy2 + "' r='" + r + "' fill='blue' class='control-point' style='cursor: pointer;'/>" +
                //    "  <circle cx='" + cx4 + "' cy='" + cy4 + "' r='" + r + "' fill='red' class='end-point' style='cursor: pointer;'/>" +
                "  <text id='draggableText' x='" + cx4 + "' y='" + cy4 + "' font-family='Arial' font-size='14' cursor= 'pointer' fill='" + "blue" + "'>" + testTall + "</text>";
        // Opprett SVG-elementet


        svgContainer.getElement().setProperty("innerHTML", movingCurve +  CalcValues.outSvg + CalcValues.svgNew + CalcValues.svgBuffer
        );
/*
        // Sett inn SVG-grafikk med en tekstnode
        svgContainer.getElement().setProperty("innerHTML", """
                <svg id="svgCanvas" width="600" height="400" style="border: 1px solid black;">
                    <text id="draggableText" x="100" y="100" fill="black" font-size="16" cursor="pointer">
                        Flytt meg!
                    </text>
                </svg>
                """);


 */
        // Legg til JavaScript for å gjøre teksten flyttbar
        getElement().executeJs(
                """
                const svg = document.getElementById('svgCanvas');
                const text = document.getElementById('draggableText');

                text.addEventListener('mousedown', (e) => {
                    const startX = e.clientX;
                    const startY = e.clientY;
                    const initialX = parseFloat(text.getAttribute('x'));
                    const initialY = parseFloat(text.getAttribute('y'));

                    const onMouseMove = (event) => {
                        const deltaX = event.clientX - startX;
                        const deltaY = event.clientY - startY;
                        text.setAttribute('x', initialX + deltaX);
                        text.setAttribute('y', initialY + deltaY);
                    };

                    const onMouseUp = () => {
                        document.removeEventListener('mousemove', onMouseMove);
                        document.removeEventListener('mouseup', onMouseUp);
                        // Send oppdatert posisjon til serveren
                        $0.$server.updatePosition(text.getAttribute('x'), text.getAttribute('y'));
                    };

                    document.addEventListener('mousemove', onMouseMove);
                    document.addEventListener('mouseup', onMouseUp, { once: true });
                });
                """,
                getElement()
        );

        add(svgContainer);
    }

    // Server-side metode for å oppdatere posisjon
    @ClientCallable
    public void updatePosition(String x, String y) {
        //     System.out.println("Ny posisjon for tekst: x=" + x + ", y=" + y);
        if ( this.enterType == 5 ) {
            int xi = Integer.parseInt(x);
            int yi = Integer.parseInt(y);
            test.setFirstX(xi);
            test.setFirstY(yi);
            CalcValues.extraComment.add(test);
        }
        if ( this.enterType == 6 ) {
            int xi =  Integer.parseInt(x) ;
            int yi =  Integer.parseInt(y) ;
            double xNew =  (xi -xP - transX)/factor;
            double yNew =  (yi -yP - transY)/factor;
            int xii = (int) xNew;
            int yii = (int) yNew;
            CalcValues.extraTallTegn.add( new ExtraTall( testTall, xii, yii));

        }
        if ( this.enterType == 7 ) {
            int xi = Integer.parseInt(x);
            int yi = Integer.parseInt(y);
            double xNew =  (xi -xP - transX)/factor;
            double yNew =  (yi -yP - transY)/factor;
            int xii = (int) xNew;
            int yii = (int) yNew;
            CalcValues.extraTall.add( new ExtraTall( testTall, xii, yii));

        }
        ActualString actual = new ActualString();
        String svgCode = actual.getActualString();

        // Her kan du implementere logikk for å lagre posisjonen i en database
    }
}


