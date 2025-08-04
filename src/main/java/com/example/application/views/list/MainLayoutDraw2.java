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
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.lumo.LumoUtility;



/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayoutDraw2 extends AppLayout {

    private H2 viewTitle;

    public MainLayoutDraw2() {
        FlexLayout filters = new FlexLayout();
        filters.addClassName(LumoUtility.Background.CONTRAST_5);
        setPrimarySection(Section.DRAWER);
        addDrawerContent();
        addHeaderContent();
        Tabs tabs = new Tabs();

        tabs.setWidth("100%");
        setTabsSampleData(tabs);
        MenuBar menuBar = new MenuBar();
        Text selected = new Text("");
        ComponentEventListener<ClickEvent<MenuItem>> listener = e -> selected
                .setText(e.getSource().getText());
        Div message = new Div(new Text("Clicked item: "), selected);

        menuBar.addItem("View", listener);
        menuBar.addItem("Edit", listener);

        MenuItem share = menuBar.addItem("Share");
        SubMenu shareSubMenu = share.getSubMenu();
        MenuItem onSocialMedia = shareSubMenu.addItem("On social media");
        SubMenu socialMediaSubMenu = onSocialMedia.getSubMenu();
        socialMediaSubMenu.addItem("Facebook", listener);
        socialMediaSubMenu.addItem("Twitter", listener);
        socialMediaSubMenu.addItem("Instagram", listener);
        shareSubMenu.addItem("By email", listener);
        shareSubMenu.addItem("Get Link", listener);

        MenuItem move = menuBar.addItem("Move");
        SubMenu moveSubMenu = move.getSubMenu();
        moveSubMenu.addItem("To folder", listener);
        moveSubMenu.addItem("To trash", listener);

        menuBar.addItem("Duplicate", listener);
        // end::snippet[]

        //   add(menuBar, message);


    }

    private void setTabsSampleData(Tabs tabs) {
    }
    /*
        private void addDrawerContent() {


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
    private void addHeaderContent() {
        NumberField zoom = new NumberField();
        zoom.setValue(0.0);
        zoom.setLabel("zoom");
        zoom.setClearButtonVisible(true);

    }


    private SideNav createNavigation() {
        SideNav nav = new SideNav();
        nav.addClassName(LumoUtility.Background.CONTRAST_5);
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
        nav.addItem( new SideNavItem(" "));
        if (generateImage) {
            nav.addItem(new SideNavItem("Show picture", ThymeleafExampleView.class, VaadinIcon.ENVELOPE.create()));
        }
   //     nav.addItem(new SideNavItem("Draw string & symbol", BaseMouse.class, VaadinIcon.PENCIL.create()));
    //    nav.addItem(new SideNavItem("Draw string & symbol", ZoomImage.class, VaadinIcon.PENCIL.create()));
        //     nav.addItem(new SideNavItem("Generate files ", PrintSvg.class, VaadinIcon.TASKS.create()));
    //    nav.addItem(new SideNavItem("New string names", NewIdent.class, VaadinIcon.TEXT_LABEL.create()));
        nav.addItem(new SideNavItem("New string symbol", NewSymbol.class, VaadinIcon.TAG.create()));
        nav.addItem( new SideNavItem("Symbol Table", SymbolTable.class, VaadinIcon.TABLE.create()));
        nav.addItem(new SideNavItem("Save file ", BaseSvg.class, VaadinIcon.PRINT.create()));
        nav.addItem(new SideNavItem("Print/ transfer", PrintSvg.class, VaadinIcon.PRINT.create()));
        nav.addItem( new SideNavItem(" "));
        //     nav.addItem(new SideNavItem("Weld IT main website", "https://weldit.weldit.no", VaadinIcon.WORKPLACE.create()));
        //      nav.addItem(new SideNavItem("Weld IT drawing website", LoginView.class, VaadinIcon.AT.create()));
        nav.addItem(new SideNavItem("Use info ", Info.class, VaadinIcon.BOOK.create()));

        return nav;
    }

    private Footer createFooter() {
        Footer layout = new Footer();

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





