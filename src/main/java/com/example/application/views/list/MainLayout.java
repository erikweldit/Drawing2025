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
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.lumo.LumoUtility;

/**
 * The main view is a top-level placeholder for other views.
 */
//@JsModule("@vaadin/vaadin-lumo-styles/presets/compact.js")
public class MainLayout extends AppLayout {
    public static boolean imageGenerated = false;
    private H2 viewTitle;
    public MainLayout() {


        Div div = new Div();
        setPrimarySection(Section.DRAWER);
        addDrawerContent();
        addHeaderContent();
    }
    private void addHeaderContent() {
        viewTitle = new H2();
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
        addToNavbar(true,  viewTitle);   //  toggle,
    }
    /*
    private void addDrawerContent() {
        H1 appName = new H1("Weldit AS");
        appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE, LumoUtility.Background.CONTRAST_5);
        Header header = new Header(appName);
        Scroller scroller = new Scroller(createNavigation());
        addToDrawer(header, scroller, createFooter());
    }

     */
    private void addDrawerContent() {
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
    private SideNav createNavigation() {
        boolean[] inBuffer = new boolean[17];
        boolean generateImage = false;
        SideNav nav = new SideNav();
        nav.addClassName(LumoUtility.Background.CONTRAST_5);
        inBuffer = ImageStorage.inBuffer;
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
        nav.addItem( new SideNavItem(" "));
        if (generateImage) {
            nav.addItem(new SideNavItem("Show picture", ThymeleafExampleView.class, VaadinIcon.ENVELOPE.create()));
        }
        if (generateImage && (CalcValues.plotType.equals("butt") || CalcValues.plotType.equals("Butt") )) {
            nav.addItem(new SideNavItem("New values ", CalcChange.class, VaadinIcon.PENCIL.create()));
        }
        if (generateImage && CalcValues.plotType.equals("flanged")) {
            nav.addItem(new SideNavItem("New values ", FlangedChange.class, VaadinIcon.PENCIL.create()));
        }
        if (generateImage && CalcValues.plotType.equals("overlap")) {
            nav.addItem(new SideNavItem("New values ", OverlapChange.class, VaadinIcon.PENCIL.create()));
        }
        if (generateImage && CalcValues.plotType.equals("fillet")) {
            nav.addItem(new SideNavItem("New values ", FilletChange.class, VaadinIcon.PENCIL.create()));
        }
        if (generateImage && CalcValues.plotType.equals("corner")) {
            nav.addItem(new SideNavItem("New values ", CornerChange.class, VaadinIcon.PENCIL.create()));
        }
        if (generateImage && (CalcValues.plotType.equals("Cam")  || CalcValues.plotType.equals("Cross joint") || CalcValues.plotType.equals("Lap joint")
                || CalcValues.plotType.equals("On plate") || CalcValues.plotType.equals("Strap joint") )) {
            nav.addItem(new SideNavItem("New values ", CamChange.class, VaadinIcon.PENCIL.create()));
        }

  //      nav.addItem(new SideNavItem("Draw string & symbol", BaseMouse.class, VaadinIcon.PENCIL.create()));
   //     nav.addItem(new SideNavItem("Draw string & symbol", ZoomImage.class, VaadinIcon.PENCIL.create()));
   //     nav.addItem(new SideNavItem("New string names", NewIdent.class, VaadinIcon.TEXT_LABEL.create()));
        nav.addItem(new SideNavItem("New string symbol", NewSymbol.class, VaadinIcon.TAG.create()));
        nav.addItem( new SideNavItem("Symbol Table", SymbolTable.class, VaadinIcon.TABLE.create()));
        nav.addItem(new SideNavItem("Save file ", BaseSvg.class, VaadinIcon.PRINT.create()));
        nav.addItem(new SideNavItem("Print/ transfer", PrintSvg.class, VaadinIcon.PRINT.create()));
        nav.addItem( new SideNavItem(" "));
        nav.addItem(new SideNavItem("Use info ", Info.class, VaadinIcon.BOOK.create()));
        nav.addItem( new SideNavItem(" "));
        String buff = "";
        if (inBuffer[7] || inBuffer[11] || inBuffer[15] ) {
            buff += "1";
        }
        if (inBuffer[8] || inBuffer[11] || inBuffer[16] ) {
            buff += "2";
        }
        if (inBuffer[9] || inBuffer[12] || inBuffer[15]) {
            buff += "3" ;
        }
        if (inBuffer[10] || inBuffer[12] || inBuffer[16]) {
            //     nav.addItem(new SideNavItem(" D "));
            buff += "4";
            buff = "";
        }
        nav.addItem(new SideNavItem("Buffer = " + buff));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        return nav;
    }
    private Footer createFooter() {
        Footer layout = new Footer();
        layout.addClassNames(LumoUtility.Background.CONTRAST_50, LumoUtility.TextColor.PRIMARY_CONTRAST);
        return layout;
    }
    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
    }
    private String getCurrentPageTitle() {
        PageTitle title = getContent().getClass().getAnnotation(PageTitle.class);
        return title == null ? "" : title.value();
    }
}




