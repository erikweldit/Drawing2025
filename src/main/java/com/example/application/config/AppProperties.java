package com.example.application.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private String baseDomain; // e.g. weld.local
    private String apiPath; 
    private String externalApiPath;    // e.g. /api/receive-svg
    private String drawingApiToken;
    private String environment;
    public String getBaseDomain() {
        return baseDomain;
    }

    public void setBaseDomain(String baseDomain) {
        this.baseDomain = baseDomain;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }
     public String getExternalApiPath() {
        return externalApiPath;
    }

    public void setExternalApiPath(String externalApiPath) {
        this.externalApiPath = externalApiPath;
    }
   

    public String getDrawingApiToken() {
        return drawingApiToken;
    }

    public void setDrawingApiToken(String drawingApiToken) {
        this.drawingApiToken = drawingApiToken;
    }
    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}   