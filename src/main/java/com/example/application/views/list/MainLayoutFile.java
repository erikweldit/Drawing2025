package com.example.application.views.list;

import com.example.application.diverse.NewIdent;
import com.example.application.diverse.SymbolTable;
import com.example.application.diverse.camvas.Info;
import com.example.application.diverse.camvas.NewSymbol;
import com.example.application.html.BaseMouse;
import com.example.application.html.BaseSvg;
import com.example.application.html.PrintSvg;
import com.example.application.html.ThymeleafExampleView;
import com.example.application.menu.ZoomImage;
import com.example.application.weld.*;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.lumo.LumoUtility;

/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayoutFile extends AppLayout {

        private H2 viewTitle;

    public MainLayoutFile() {

            FlexLayout filters = new FlexLayout();
            filters.addClassName(LumoUtility.Background.CONTRAST_5);
            setPrimarySection(Section.DRAWER);
            addDrawerContent();
            addHeaderContent();

        }

        private void addHeaderContent () {

            DrawerToggle toggle = new DrawerToggle();
            toggle.setAriaLabel("Menu toggle");

            viewTitle = new H2();
            viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

            addToNavbar(true, toggle, viewTitle);
        }
    /*
        private void addDrawerContent() {
            H1 appName = new H1("Weldit AS");
            appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
            Header header = new Header(appName);

            Scroller scroller = new Scroller(createNavigation());

            addToDrawer(header, scroller, createFooter());
        }

     */
        private void addDrawerContent () {
            H1 appName = new H1("Weldit AS");
            appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

            // Sett bakgrunnen for headeren mørk
            Header header = new Header(appName);
            header.addClassNames(LumoUtility.Background.CONTRAST_50, LumoUtility.TextColor.PRIMARY_CONTRAST);
            header.addClassName("text-white");
            // Sett bakgrunnen for SideNav
            Scroller scroller = new Scroller(createNavigation());
            scroller.addClassNames(LumoUtility.Background.CONTRAST_50, LumoUtility.TextColor.PRIMARY_CONTRAST);
            scroller.addClassName("text-white");

            addToDrawer(header, scroller, createFooter());
        }
        private SideNav createNavigation () {
            SideNav nav = new SideNav();
            boolean generateImage = false;
            generateImage = CalcValues.generateImage;
            nav.addItem(new SideNavItem("Home", Home.class, VaadinIcon.HOME.create()));
            nav.addItem(new SideNavItem("Butt weld", ButtInit.class, VaadinIcon.COMPILE.create()));
            nav.addItem(new SideNavItem("Cam weld", CamMain.class, VaadinIcon.COMPILE.create()));
            nav.addItem(new SideNavItem("Corner weld", CornerMain.class, VaadinIcon.COMPILE.create()));
            nav.addItem(new SideNavItem("Fillet weld", FilletInit.class, VaadinIcon.COMPILE.create()));
            nav.addItem(new SideNavItem("Flanged weld", FlangedMain.class, VaadinIcon.COMPILE.create()));
            nav.addItem(new SideNavItem("Overlap weld", OverlapMain.class, VaadinIcon.COMPILE.create()));
            nav.addItem(new SideNavItem("Stud on plate", BoltMain.class, VaadinIcon.COMPILE.create()));
            nav.addItem(new SideNavItem("Tube on plate", TubeMain.class, VaadinIcon.COMPILE.create()));
            nav.addItem(new SideNavItem(" "));
            if (generateImage) {
                nav.addItem(new SideNavItem("Show picture", ThymeleafExampleView.class, VaadinIcon.ENVELOPE.create()));
            }
     //       nav.addItem(new SideNavItem("Draw string & symbol", BaseMouse.class, VaadinIcon.PENCIL.create()));
     //       nav.addItem(new SideNavItem("Draw string & symbol", ZoomImage.class, VaadinIcon.PENCIL.create()));
            //    nav.addItem(new SideNavItem("Generate files ", PrintSvg.class, VaadinIcon.TASKS.create()));
        //    nav.addItem(new SideNavItem("New string names", NewIdent.class, VaadinIcon.TEXT_LABEL.create()));
            nav.addItem(new SideNavItem("New string symbol", NewSymbol.class, VaadinIcon.TAG.create()));
            nav.addItem(new SideNavItem("Symbol Table", SymbolTable.class, VaadinIcon.TABLE.create()));
            nav.addItem(new SideNavItem("Save file ", BaseSvg.class, VaadinIcon.PRINT.create()));
            nav.addItem(new SideNavItem("Print/ transfer", PrintSvg.class, VaadinIcon.PRINT.create()));
            nav.addItem(new SideNavItem(" "));
            //    nav.addItem(new SideNavItem("Weld IT main website", "https://weldit.weldit.no", VaadinIcon.WORKPLACE.create()));
            //    nav.addItem(new SideNavItem("Weld IT drawing website", LoginView.class, VaadinIcon.AT.create()));
            nav.addItem(new SideNavItem("Use info ", Info.class, VaadinIcon.BOOK.create()));
            //    LumoUtility.Background.CONTRAST_60;
            return nav;
        }

        private Footer createFooter () {
            Footer layout = new Footer();

            return layout;
        }

        @Override
        protected void afterNavigation () {
            super.afterNavigation();
            viewTitle.setText(getCurrentPageTitle());
        }

        private String getCurrentPageTitle () {
            PageTitle title = getContent().getClass().getAnnotation(PageTitle.class);
            return title == null ? "" : title.value();
        }
    }





