package com.example.application.coonvert;




import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.MultiFileReceiver;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.component.html.Anchor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Route("pdfview")
public class SvgToPdfView extends VerticalLayout {

/*
    private List<File> uploadedFiles = new ArrayList<>();

    public SvgToPdfView() {
        // Opplastingskomponent for flere filer
        Upload upload = new Upload((MultiFileReceiver) (fileName, mimeType) -> {
            try {
                File tempFile = File.createTempFile("upload-", ".svg");
                FileOutputStream fos = new FileOutputStream(tempFile);
                uploadedFiles.add(tempFile);
                return fos;
            } catch (IOException e) {
                Notification.show("Feil ved opplasting: " + e.getMessage());
                return null;
            }
        });

        upload.setMaxFiles(4);
        upload.setAcceptedFileTypes("image/svg+xml");

        // Knapp for å generere PDF
        Button generatePdfButton = new Button("Lag PDF");
        generatePdfButton.addClickListener(e -> {
            if (uploadedFiles.size() != 4) {
                Notification.show("Du må laste opp nøyaktig 4 SVG-filer.");
                return;
            }

            try {
                File pdfFile = SvgToPdfConverter.createPdfWithSvgs(uploadedFiles.toArray(new File[0]));

                // Lag en nedlastingslink
                StreamResource resource = new StreamResource("output.pdf", () -> {
                    try {
                        return new FileInputStream(pdfFile);
                    } catch (FileNotFoundException ex) {
                        return null;
                    }
                });

                Anchor downloadLink = new Anchor(resource, "Last ned PDF");
                downloadLink.getElement().setAttribute("download", true);

                add(downloadLink);
                Notification.show("PDF generert!");

            } catch (Exception ex) {
                Notification.show("Feil under PDF-generering: " + ex.getMessage());
            }
        });

        add(upload, generatePdfButton);
    }


 */

}

