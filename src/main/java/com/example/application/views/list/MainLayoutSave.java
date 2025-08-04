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
import com.example.application.under.ExtraImage;
import com.example.application.weld.*;
import com.example.application.zoomdb.LastView;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.lumo.LumoUtility;


import java.util.ArrayList;

//import static org.vaadin.example.weld.ImageStorage.inBuffer;

//@CssImport("./styles/shared-styles.css")
/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayoutSave extends AppLayout {
    public static boolean imageGenerated = false;
    public boolean[] inBuffer = new boolean[17];
    private ArrayList<ExtraImage> imageList = new ArrayList<>();
    private H2 viewTitle;
    private String userID = CalcValues.userID;
    Image imga;
    int index = 9;
    public MainLayoutSave() {
        imageList = ImageStorage.imageList;
        imga = new Image("images/Snag_dd734eff", "Weldit AS");
        imga.setWidth("40px");



        FlexLayout filters = new FlexLayout();
        filters.addClassName(LumoUtility.Background.CONTRAST_5);
        setPrimarySection(Section.DRAWER);
        addClassName(LumoUtility.Background.CONTRAST_5);
        addClassName("menu-color");
        addDrawerContent();
        addHeaderContent();
        Tabs tabs = new Tabs();

        tabs.setWidth("100%");
        setTabsSampleData(tabs);


    }




    private void setTabsSampleData(Tabs tabs) {
        tabs.add(new Tab("Dashboard"));
        tabs.add(new Tab("Cam"));
        tabs.add(new Tab("Shipping"));
    }

    private void addHeaderContent() {

        DrawerToggle toggle = new DrawerToggle();
        toggle.setAriaLabel("Menu toggle");

        viewTitle = new H2();
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
        // toggle.setIcon();
        addToNavbar(true, toggle, viewTitle);
    }

    private void addDrawerContent() {
        H1 appName = new H1("     Weldit AS");
        appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

        // Sett bakgrunnen for headeren mørk
        Header header = new Header(appName);
        header.addClassNames(LumoUtility.Background.CONTRAST_50, LumoUtility.TextColor.PRIMARY_CONTRAST);
        //header.addClassName("text-white");
        header.getStyle().set("color", "white");
        // Sett bakgrunnen for SideNav
        Scroller scroller = new Scroller(createNavigation());
        scroller.addClassNames(LumoUtility.Background.CONTRAST_50, LumoUtility.TextColor.PRIMARY_CONTRAST);
        scroller.addClassName("text-white");
        header.getStyle().set("color", "white");
        scroller.getStyle().set("color", "white");

        addToDrawer(header, scroller, createFooter());
    }
    private SideNav createNavigation() {
        boolean generateImage = false;
        generateImage = CalcValues.generateImage;
        SideNav nav = new SideNav();
        nav.addClassName("text-white");
        nav.getStyle().set("color", "white");
        //    nav.getStyle().setBackground("black");
        //    nav.getStyle().setBackgroundColor("black");
        Button printButton = new Button("Skriv ut");
 //       LastView lab = new LastView();
        nav.addClassName(LumoUtility.Background.CONTRAST_50);
    //    nav.addItem(new SideNavItem("Home / empty buffer", Home.class, VaadinIcon.HOME.create()));
     //   nav.addItem(new SideNavItem("Butt weld", ButtInit.class, VaadinIcon.COMPILE.create()));
     //   nav.addItem(new SideNavItem("Cam weld", CamMain.class, VaadinIcon.COMPILE.create()));
    //    nav.addItem(new SideNavItem("Corner weld", CornerMain.class, VaadinIcon.COMPILE.create()));
     //   nav.addItem(new SideNavItem("Fillet weld", FilletInit.class, VaadinIcon.COMPILE.create()));
     //   nav.addItem(new SideNavItem("Flanged weld", FlangedMain.class, VaadinIcon.COMPILE.create()));
       // nav.addItem(new SideNavItem("Overlap weld", OverlapMain.class, VaadinIcon.COMPILE.create()));
      //  nav.addItem(new SideNavItem("Stud on plate", BoltMain.class, VaadinIcon.COMPILE.create()));
    //    nav.addItem( printButton.addClickListener(e -> lab.printCanvas()));
        nav.addItem( new SideNavItem(" "));

        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));
        nav.addItem( new SideNavItem(" "));


        nav.isCollapsible();

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



