package com.example.application.coonvert;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.MultiFileReceiver;
import com.vaadin.flow.component.upload.Receiver;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Anchor;

import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;

import java.io.*;

@Route("pngview")
public class SvgToPngView extends VerticalLayout {

    public SvgToPngView() throws FileNotFoundException, TranscoderException {
    //    new File("uploads").mkdirs();

        ///    /////////
        // Opplastingskomponent
        Upload upload = new Upload((Receiver) (fileName, mimeType) -> {
            try {
                File tempFile = File.createTempFile("upload-", ".svg");
                return new FileOutputStream(tempFile);
            } catch (IOException e) {
                Notification.show("Feil ved opplasting: " + e.getMessage());
                return null;
            }
        });

        // Knapp for å konvertere filen
        Button convertButton = new Button("Konverter til PNG");
        convertButton.addClickListener(e -> {
            try {
                File svgFile = new File("upload.svg");
                File pngFile = new File("output.png");

                // Konverter SVG til PNG
                SvgToPngConverter.convertSvgToPng(svgFile.getAbsolutePath(), pngFile.getAbsolutePath());

                // Vis bildet i UI
                StreamResource resource = new StreamResource("output.png", () -> {
                    try {
                        return new FileInputStream(pngFile);
                    } catch (FileNotFoundException ex) {
                        return null;
                    }
                });

                Image image = new Image(resource, "Konvertert PNG");
                image.setWidth("300px");

                // Last ned-knapp
                Anchor downloadLink = new Anchor(resource, "Last ned PNG");
                downloadLink.getElement().setAttribute("download", true);

                add(image, downloadLink);

            } catch (Exception ex) {
                Notification.show("Konverteringsfeil: " + ex.getMessage());
            }
        });

        add(upload, convertButton);
    }
}

