package com.example.application.zoomdb;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.component.UI;
import java.util.List;
import java.util.Map;

@Route("landing")
public class LandingView extends HorizontalLayout implements BeforeEnterObserver {


    private String tenantId;
    private String userId;

    // Some simple UI components for demo purposes
    private final Span infoSpan = new Span();
    private final TextArea svgArea = new TextArea("SVG content");

    @Autowired
    public LandingView() {

        add(infoSpan);
    }

    /**
     * This is called before the view is shown.
     * We use it to read the query parameters:
     *   /home?tenant=demo&user_id=1&wpqr_id=123
     */
    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        QueryParameters queryParameters = event.getLocation().getQueryParameters();
        Map<String, List<String>> params = queryParameters.getParameters();

        String tenantId = getFirstParam(params, "tenant");
        String userId   = getFirstParam(params, "user_id");
        String wpqrId   = getFirstParam(params, "wpqr_id");

        // ✅ Store in Vaadin session
        VaadinSession session = VaadinSession.getCurrent();
        session.setAttribute("tenantId", tenantId);
        session.setAttribute("userId", userId);
        session.setAttribute("wpqrId", wpqrId);
        session.setAttribute("tenantUser", tenantId + '_' + userId);

        infoSpan.setText("Session set: tenant = " + tenantId + ", user_id = " + userId + ", wpqr_id = " + wpqrId);

        // Use forwardTo instead of rerouteTo for internal navigation
       // event.forwardTo("home");
        UI.getCurrent().getPage().setLocation("home");
    }

    private String getFirstParam(Map<String, List<String>> params, String key) {
        return params.getOrDefault(key, List.of("")).stream().findFirst().orElse("");
    }    
}
