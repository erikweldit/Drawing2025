package com.example.application.views.list;




import com.example.application.diverse.SymbolTable;
import com.example.application.diverse.camvas.Info;
import com.example.application.menu.ZoomImage0C;
import com.example.application.weld.*;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;


/**
 * MainView defines the main left side menu for navigation
 */
@AnonymousAllowed
@Route(value = "Main", layout = MainLayout.class)
@PageTitle("Weld IT AS - Menu for weld drawing")
//@Uses(ZoomImage0C.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class MainView extends Div {
    public MainView() {
        // tag::snippet[]
        FlexLayout filters = new FlexLayout();
        filters.addClassName(LumoUtility.Background.CONTRAST_5);
        SideNav nav = new SideNav();
        nav.addClassName(LumoUtility.Background.CONTRAST_5);
        ImageStorage imageOut = new ImageStorage();
        //      SideNavItem dashboardLink = new SideNavItem("Dashboard", ButtMain.class, VaadinIcon.DASHBOARD.create());
        SideNavItem buttLink = new SideNavItem("Butt weld", ButtInit.class, VaadinIcon.DASHBOARD.create());
        SideNavItem camLink = new SideNavItem("Cam weld", CamMain.class, VaadinIcon.DASHBOARD.create());
        SideNavItem cornerLink = new SideNavItem("Corner weld", CornerMain.class, VaadinIcon.DASHBOARD.create());
        SideNavItem filletLink = new SideNavItem("Fillet weld", FilletInit.class, VaadinIcon.DASHBOARD.create());
        SideNavItem flangedLink = new SideNavItem("Flanged weld", FlangedMain.class, VaadinIcon.DASHBOARD.create());
        SideNavItem overlapLink = new SideNavItem("Overlap weld", OverlapMain.class, VaadinIcon.DASHBOARD.create());
        nav.addItem(new SideNavItem("Stud on plate", BoltMain.class, VaadinIcon.COMPILE.create()));
        nav.addItem(new SideNavItem("Tube on plate", TubeMain.class, VaadinIcon.COMPILE.create()));

        SideNavItem inboxLink = new SideNavItem("Symbol Table", SymbolTable.class, VaadinIcon.ENVELOPE.create());
        SideNavItem inboxLinkB = new SideNavItem("Values", CalcChange.class, VaadinIcon.ENVELOPE.create());

        //       SideNavItem erase = new SideNavItem("New values " , CalcChange.class, VaadinIcon.ENVELOPE.create());

        nav.addItem(new SideNavItem("Use info ", Info.class, VaadinIcon.DIPLOMA.create()));
        SideNavItem weldLink = new SideNavItem("Weld IT website", "https://weldit.weldit.no", VaadinIcon.AT.create());
        weldLink.addClassName("external");

        //   nav.addItem(buttLink, camLink,cornerLink,filletLink,flangedLink,overlapLink, weldLink);
        // end::snippet[]

        Div navWrapper = new Div(nav);
        nav.setWidthFull();
        //    add(navWrapper);

        UI.getCurrent().getPage().setLocation("home");
        this.addClassName("side-nav-sample");
    }

}





