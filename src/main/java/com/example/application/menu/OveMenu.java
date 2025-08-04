package com.example.application.menu;

import com.example.application.images.DrawLineView;
import com.example.application.weld.Home;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

//@PageTitle("Hovedside")
@Route("hoved")
//@Theme( Lumo.class) // Bruker mørkt tema, valgfrittHoepublclass OverMenu extends AppLayout {
public class OveMenu extends AppLayout {

    public OveMenu() {
  //      UI.getCurrent().getElement().setAttribute("theme", Lumo.LIGHT); // Sett mørkt tema manuelt
        createHeader();
    }
    private void createHeader() {
        H1 title = new H1("Weld IT");
        title.getStyle().set("margin", "0").set("font-size", "var(--lumo-font-size-l)");

        // Menyvalgene
        RouterLink home = new RouterLink("Hjem", Home.class);
        RouterLink about = new RouterLink("Om oss", Home.class);
        RouterLink services = new RouterLink("Tjenester", DrawLineView.class);
        RouterLink contact = new RouterLink("Kontakt", Home.class);

        // Legg menyvalgene i en horisontal layout
        HorizontalLayout menuBar = new HorizontalLayout(home, about, services, contact);
        menuBar.setSpacing(true);
     //   menuBar.getStyle().set("margin-left", "auto"); // Skyver menyen til høyre

        // Topplinje med tittel og meny
        HorizontalLayout header = new HorizontalLayout(title, menuBar);
        header.setWidthFull();
        header.setAlignItems(FlexComponent.Alignment.CENTER);
        header.setPadding(true);
  //      header.getStyle().set("background", "#333").set("color", "white");

        addToNavbar(header); // Legger det til i toppen
    }
}

