package com.example.application.diverse;


import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;


@AnonymousAllowed
//@Route(value = "adragg" , layout = MainLayoutDraw.class)
@PageTitle("Weld IT AS - Drawing welding string")
public class DragText extends VerticalLayout {

    public DragText() {
        // Lag et Div-element for å holde SVG
        Div svgContainer = new Div();
        svgContainer.setId("svgContainer");
        svgContainer.setWidth("600px");
        svgContainer.setHeight("400px");

        // Sett inn SVG-grafikk med en tekstnode
        svgContainer.getElement().setProperty("innerHTML", """
                <svg id="svgCanvas" width="1200" height="900" style="border: 1px solid black;">
                    <text id="draggableText" x="100" y="100" fill="black" font-size="16" cursor="pointer">
                        Flytt meg!
                    </text>
                </svg>
                """);

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
        System.out.println("Ny posisjon for tekst: x=" + x + ", y=" + y);
        // Her kan du implementere logikk for å lagre posisjonen i en database
    }
}


