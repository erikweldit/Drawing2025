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
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
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
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.component.UI;
import java.util.ArrayList;

//import static org.vaadin.example.weld.ImageStorage.inBuffer;

//@CssImport("./styles/shared-styles.css")
/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayoutDraw extends AppLayout {
    public static boolean imageGenerated = false;
    public boolean[] inBuffer = new boolean[17];
    private ArrayList<ExtraImage> imageList = new ArrayList<>();
    private H2 viewTitle;
    private String userID = CalcValues.userID;
    Image imga;
    int index = 9;
    private final Span apiResponse = new Span();
    public MainLayoutDraw() {

        UI ui = UI.getCurrent();
        VaadinSession session = VaadinSession.getCurrent();
        String tenantId = (String) session.getAttribute("tenantId");
        String userId   = (String) session.getAttribute("userId");
        if (tenantId == null || tenantId.isBlank() || userId == null || userId.isBlank()) {
            if (ui != null) {
                ui.access(() -> apiResponse.setText(
                        "⚠️ Tenant ID or User ID missing! Please reload with ?tenant=xxx&user_id=yyy"
                ));
            }
            UI.getCurrent().getPage().setLocation("accessdenied");
            return;  // ❗ STOP: don't continue to send to API
        }


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
    /*
        private void addDrawerContent() {
            H1 appName = new H1("Weldit AS");
            appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
            Header header = new Header(appName);

            Scroller scroller = new Scroller(createNavigation());

            addToDrawer(header, scroller, createFooter());
        }

     */
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

        nav.addClassName(LumoUtility.Background.CONTRAST_50);
        nav.addItem(new SideNavItem("Home / empty buffer", Home.class, VaadinIcon.HOME.create()));
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
        //    System.out.println("tttDraw " + CalcValues.plotType);;
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
        if (generateImage && (CalcValues.plotType.equals("Bolt joint"))) {
            nav.addItem(new SideNavItem("New values ", BoltChange.class, VaadinIcon.PENCIL.create()));
        }
        if (generateImage && (CalcValues.plotType.equals("Tube on plate")  || CalcValues.plotType.equals("Tube on plate 45 degrees") )) {
            nav.addItem(new SideNavItem("New values ", TubeChange.class, VaadinIcon.PENCIL.create()));
        }
    //    nav.addItem(new SideNavItem("Draw string & symbol", BaseMouse.class, VaadinIcon.PENCIL.create()));
   //    nav.addItem(new SideNavItem("Draw string & symbol", ZoomImage.class, VaadinIcon.PENCIL.create()));
        //     nav.addItem(new SideNavItem("Generate files ", PrintSvg.class, VaadinIcon.TASKS.create()));
    //    nav.addItem(new SideNavItem("New string names", NewIdent.class, VaadinIcon.TEXT_LABEL.create()));
        nav.addItem(new SideNavItem("New string symbol", NewSymbol.class, VaadinIcon.TAG.create()));
        nav.addItem( new SideNavItem("Symbol Table", SymbolTable.class, VaadinIcon.TABLE.create()));
        nav.addItem(new SideNavItem("Save file ", BaseSvg.class, VaadinIcon.PRINT.create()));
        nav.addItem(new SideNavItem("Print/ transfer", PrintSvg.class, VaadinIcon.PRINT.create()));
        nav.addItem( new SideNavItem(" "));
        //    nav.addItem(new SideNavItem("Weld IT main website", "https://weldit.weldit.no", VaadinIcon.WORKPLACE.create()));
        //    nav.addItem(new SideNavItem("Weld IT drawing website", LoginView.class, VaadinIcon.AT.create()));
        nav.addItem(new SideNavItem("Use info ", Info.class, VaadinIcon.BOOK.create()));
        //   nav.addItem(new SideNavItem("Empty buffer", Home.class, VaadinIcon.HOME.create()));

        String buff = "";
        inBuffer = ImageStorage.inBuffer;
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
        if (viewTitle != null) {
            viewTitle.setText(getCurrentPageTitle());
        }
    }

    private String getCurrentPageTitle() {
        PageTitle title = getContent().getClass().getAnnotation(PageTitle.class);
        return title == null ? "" : title.value();
    }
}




