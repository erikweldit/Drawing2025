package com.example.application.zoomnew;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("viewnew")
public class SvgViewNew extends VerticalLayout {

    private final SvgServiceNew svgService = new SvgServiceNew();
    private final TextArea svgEditor = new TextArea("SVG Editor");
    private final Div svgPreview = new Div();

    public SvgViewNew() {
        TextField filenameField = new TextField("Filnavn");

        svgEditor.setWidthFull();
        svgEditor.setHeight("200px");

        svgPreview.setWidth("100%");
        svgPreview.getStyle().set("border", "1px solid #ccc");
        svgPreview.getElement().setProperty("innerHTML", "");

        Button saveButton = new Button("Lagre SVG", e -> {
            svgService.saveSvg(filenameField.getValue(), svgEditor.getValue());
            updatePreview(svgEditor.getValue());
        });

        Button loadButton = new Button("Hent første lagrede", e -> {
            var list = svgService.getAllSvgFiles();
            if (!list.isEmpty()) {
                SvgFileNew file = list.get(0);
                filenameField.setValue(file.getFilename());
                svgEditor.setValue(file.getContent());
                updatePreview(file.getContent());
            }
        });

        add(filenameField, svgEditor, saveButton, loadButton, svgPreview);
    }

    private void updatePreview(String svgContent) {
        svgPreview.getElement().setProperty("innerHTML", svgContent);
    }
}
