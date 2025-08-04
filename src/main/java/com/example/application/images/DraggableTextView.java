package com.example.application.images;



import com.example.application.Mouse.MouseMoved;
import com.example.application.under.ExtraComment;
import com.example.application.views.list.MainLayoutDraw;
import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route(value = "movertext" , layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Drawing welding string")
public class DraggableTextView extends VerticalLayout {

    private Div draggableText;

    ExtraComment test;
    int enterType;
    int cx4;
    int cy4;
    String testTall;
    public DraggableTextView() {
        this.test = CalcValues.extraComment.get(0);
        this.enterType = MouseMoved.enterTypeNew; // 5 for Comment
        //     this.weldList = CalcValues.weldList;

        cx4 = test.getFirstX();
        cy4 = test.getFirstY();
        testTall = test.getLastString();
        System.out.println("vi er her move   " + cx4 + "  " + cy4  + " " + testTall);




        // Lag en Div-komponent med tekst
        Div draggable = new Div();


        draggable.getElement().setProperty("innerHTML", CalcValues.outSvg + CalcValues.svgNew + CalcValues.svgBuffer
        );

        // Legg til SVG-elementet i UI
        add(draggable);

        draggableText = new Div();
        draggableText.setText( "moving");
        draggableText.setId("draggableText");
        draggableText.getStyle().set("position", "absolute");
        draggableText.getStyle().set("left", "100px");
        draggableText.getStyle().set("top", "100px");
        draggableText.getStyle().set("cursor", "grab");
        draggableText.setWidth("150px");

        // Legg til JavaScript for å gjøre den flyttbar
        getElement().executeJs(
                """
                const text = document.getElementById('draggableText');
                text.addEventListener('mousedown', (e) => {
                    const onMouseMove = (event) => {
                        text.style.left = event.pageX + 'px';
                        text.style.top = event.pageY + 'px';
                    };
                    document.addEventListener('mousemove', onMouseMove);
                    document.addEventListener('mouseup', () => {
                        document.removeEventListener('mousemove', onMouseMove);
                        // Kall Java-metoden for å sende ny posisjon til serveren
                        $0.$server.updatePosition(text.style.left, text.style.top);
                    }, { once: true });
                });
                """,
                getElement()
        );

        // Legg til komponenten i layoutet
        add(draggableText);
    }

    // Server-side metode for å oppdatere posisjon
    @ClientCallable
    public void updatePosition(String left, String top) {
    //    System.out.println("Ny posisjon: left=" + left + ", top=" + top);
        int x = Integer.parseInt(left);
        int y = Integer.parseInt(top);

        test.setFirstX(x);
        test.setFirstY(y);
        CalcValues.extraComment.set(0,test);
        // Her kan du lagre den nye posisjonen i en database eller annen logikk
    }
}


