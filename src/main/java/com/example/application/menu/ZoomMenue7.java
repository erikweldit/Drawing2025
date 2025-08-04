package com.example.application.menu;

import com.example.application.Mouse.MouseMoved;
import com.example.application.html.ActualString;
import com.example.application.images.BezierPlacing;
import com.example.application.under.ExtraComment;
import com.example.application.under.ExtraTall;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import java.awt.*;

@AnonymousAllowed
@Route("zoommenue7")
public class ZoomMenue7 extends AppLayout {   //  extends AppLayout
    ExtraComment test;
    ExtraTall testTallNew;
    ExtraTall originalType;
    int enterType;
    int cx4;
    int cy4;
    int transX;
    int transY;
    double factor;
    int xP = CalcValues.xP;
    int yP = CalcValues.yP;
    String testTall;
    String movingCurve;
    int foundIndex ;
    double zoom;
    int x;
    int y;
    Point relPoint = new Point(0,0);

    public ZoomMenue7() {

        ActualString actual = new ActualString();
        String svgCode = actual.getActualString();
        CalcValues.valgIndeks = 3;
        this.zoom = 2.0;
        createHeader();
        this.enterType = MouseMoved.enterTypeNew; // 5 for Comment  6 for extraTallTegn 7 for extraTall
        //      foundIndex = MouseMoved.getFoundIndex();
        //    System.out.println("found enterType  " + enterType);
    //    transX = ActualString.getTransX();
    //    transY = ActualString.getTransY();
    //    factor = ActualString.getFactor();

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
        // Lag et Div-element for å holde  svg

        Div svgContainer = new Div();
        String movingCurve = "<svg id='svgCanvas' width='1800' height='1290' viewBox = '0 0 1200 860' style='border:1px solid black;'>"
                + "<g id='zoomGroup'>"; // Legg til en gruppe for zooming

        String movingCurve2 =   "  <text id='draggableText' x='" + cx4 + "' y='" + cy4 + "' font-family='Arial' font-size='14' cursor= 'pointer' fill='" + "blue" + "'>" + testTall + "</text>";


        svgContainer.getElement().setProperty("innerHTML", movingCurve + movingCurve2 + CalcValues.startSvg + CalcValues.svgNew + CalcValues.svgBuffer
                + "</g></svg>");
        HorizontalLayout content = new HorizontalLayout();
        UI.getCurrent().getPage().executeJs(
                "let zoomGroup = document.getElementById('svgCanvas');" +
                        "if (zoomGroup) {" +
                        "    zoomGroup.setAttribute('transform', 'scale(' + $0 + ')');" +
                        "} else {" +
                        "    console.error('Element med ID zoomGroup ikke funnet!');" +
                        "}", zoom);

        content.add(svgContainer);
        setContent(content);

        // Legg til JavaScript for å gjøre teksten flyttbar
        getElement().executeJs(
                """
                const svg = document.getElementById('svgCanvas');
                const text = document.getElementById('draggableText');
                let zoomGroup = document.getElementById('zoomGroup');

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


    }

    // Server-side metode for å oppdatere posisjon
    @ClientCallable
    public void updatePosition(String x, String y) {
        System.out.println("Ny posisjon for tekst: x=" + x + ", y=" + y);
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
    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");
        // Menyvalgene
        // RouterLink home = new RouterLink("Hjem", Home.class);

        Button myButton = new Button("Finished move");
        myButton.addClassName("my-button");
        myButton.addClickListener(click -> {   new BezierPlacing();} );

        com.vaadin.flow.component.html.Image imga = new Image("icons/logo.png", "logo");
        imga.setWidth("40px");
        imga.addClickListener(click -> { UI.getCurrent().getPage().setLocation("home");} );

        // Legg menyvalgene i en horisontal layout
        HorizontalLayout menuBar = new HorizontalLayout(myButton);
        menuBar.setSpacing(true);
        //   menuBar.getStyle().set("margin-left", "auto"); // Skyver menyen til høyre

        // Topplinje med tittel og meny
        HorizontalLayout header = new HorizontalLayout(title, imga, menuBar);
        header.setWidthFull();
        header.setAlignItems(FlexComponent.Alignment.CENTER);
        header.setPadding(true);
        //      header.getStyle().set("background", "#333").set("color", "white");
        addToNavbar(header); // Legger det til i toppen
    }
}

