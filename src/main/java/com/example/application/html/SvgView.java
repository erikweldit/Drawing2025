package com.example.application.html;

import com.example.application.weld.CalcValues;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import static com.example.application.weld.CalcValues.*;

@Route("svgzoom")
@JsModule("./svg-zoom.js")
public class SvgView extends VerticalLayout {

    public SvgView() {
        // Bygg SVG som en Html-komponent
        String svgMarkup = outSvg;
   //     String svgfile = outSvg + svgNew + svgSymbol + svgStop;
        String svgfile =  CalcValues.startSvg + CalcValues.svgNew + CalcValues.svgBuffer;
        Html svg = new Html(svgfile);
        add(svg);

        // Kjør JS-funksjonen etter at DOM er klar
        getElement().executeJs("import('./svg-zoom.js').then(m => m.enableZoomAndPan('mySvg'))");
    }


}

