package com.example.application.coonvert;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
//import org.apache.batik.transcoder.pdf.PDFTranscoder;

import java.io.*;

@Route("svg-to-pdf-memory")
public class SvgToPdfMemoryView extends VerticalLayout {
/*
    public SvgToPdfMemoryView() {
        setPadding(true);
        setSpacing(true);

        Button generatePdfButton = new Button("Generer PDF fra SVG (i minnet)");

        Div downloadContainer = new Div();

        generatePdfButton.addClickListener(event -> {
            try {
                // 1. Lag SVG som tekst
                String svgContent = generateSvgAsString();

                // 2. Konverter SVG til PDF (i minnet)
                ByteArrayOutputStream pdfOutput = convertSvgStringToPdf(svgContent);

                // 3. Lag nedlastbar resource
                StreamResource pdfResource = new StreamResource("tegning.pdf", () ->
                        new ByteArrayInputStream(pdfOutput.toByteArray()));
                pdfResource.setContentType("application/pdf");

                Anchor downloadLink = new Anchor(pdfResource, "Last ned PDF");
                downloadLink.getElement().setAttribute("download", true);

                downloadContainer.removeAll();
                downloadContainer.add(downloadLink);

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        add(generatePdfButton, downloadContainer);
    }

    private String generateSvgAsString() {
        // Du kan generere SVG dynamisk her – eksempel med enkel tegning
        return """
            <svg xmlns="http://www.w3.org/2000/svg" width="300" height="200">
              <rect x="10" y="10" width="280" height="180" fill="lightblue" stroke="black"/>
              <text x="150" y="100" font-size="20" text-anchor="middle" alignment-baseline="middle" fill="black">Hei SVG</text>
            </svg>
            """;
    }

    private ByteArrayOutputStream convertSvgStringToPdf(String svgContent) throws Exception {
        ByteArrayInputStream svgInputStream = new ByteArrayInputStream(svgContent.getBytes("UTF-8"));
        ByteArrayOutputStream pdfOutputStream = new ByteArrayOutputStream();

        TranscoderInput input = new TranscoderInput(svgInputStream);
        TranscoderOutput output = new TranscoderOutput(pdfOutputStream);

    //    PDFTranscoder transcoder = new PDFTranscoder();
     //   transcoder.transcode(input, output);

        pdfOutputStream.flush();
        return pdfOutputStream;
    }

 */
}

