package com.example.application.zoomdb;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.application.weld.CalcValues;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;

@Route("admin")
@PermitAll
public class AdminView extends VerticalLayout {

    private final AdminService adminService;
    private final TextField userIdField = new TextField("Bruker-ID");
    private final VerticalLayout galleryLayout = new VerticalLayout();
    String user = CalcValues.userID;

    public AdminView(@Autowired AdminService adminService) {
        this.adminService = adminService;

        setSizeFull();
        setSpacing(true);
        setPadding(true);

        if (user.equals("admin")) {
            userIdField.setPlaceholder("Write in user-ID");
            Button refreshButton = new Button("Upload gallery", e ->
                    refreshGallery());
            Button deleteOldButton = new Button("Delete files older than 4 weeks", e -> {
                adminService.deleteOlderThanFourWeeks();
                refreshGallery();
            });

            HorizontalLayout controls = new HorizontalLayout(userIdField, refreshButton, deleteOldButton);
            add(controls, new Span("Gallery for user:"), galleryLayout);
        }  else {

            userIdField.setValue(user);
            HorizontalLayout controls = new HorizontalLayout(userIdField);
            add(controls, new Span("Gallery for user:"), galleryLayout);
            refreshGallery();
        }


    }

    private void refreshGallery() {
        galleryLayout.removeAll();
        String userId = userIdField.getValue();
        if (userId == null || userId.isEmpty()) return;

        List<SvgImage> images = adminService.getSvgByUserId(userId);
        images.stream()
                .sorted(Comparator.comparing(SvgImage::getCreatedAt).reversed())
                .forEach(svg -> {
                    Div svgDiv = new Div();
                    svgDiv.getElement().setProperty("innerHTML", svg.getContent());
                    svgDiv.getStyle().set("border", "1px solid #ccc");
                    svgDiv.getStyle().set("margin", "10px");
                    svgDiv.setWidth("150px");
                    svgDiv.setHeight("150px");
                    galleryLayout.add(svgDiv);
                });
    }
}
