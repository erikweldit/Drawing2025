package com.example.application.tenant;

import com.example.application.config.AppProperties;
import org.springframework.stereotype.Service;

@Service
public class TenantUrlService {

    private final AppProperties appProperties;

    public TenantUrlService(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    /**
     * URL we actually call from inside Docker.
     * Example:
     *   apiPath = "/api/receive-svg"
     * -> "http://host.docker.internal/api/receive-svg"
     */
    public String buildTenantApiUrl(String tenantId) {
        String apiPath = appProperties.getApiPath();
        String externalApiPath = appProperties.getExternalApiPath();
        String environment = appProperties.getEnvironment();
        if (environment.equals("development")) {
           return externalApiPath + apiPath;
        } else {
            return buildTenantApiUrlNew(tenantId);
        }   
    }

    /**
     * Host header we send so Nginx/Laravel knows which tenant.
     * Example:
     *   tenantId = "demo"
     *   baseDomain = "kjwlocal.com"
     * -> "demo.kjwlocal.com"
     */
    public String buildTenantHostHeader(String tenantId) {
        String baseDomain = appProperties.getBaseDomain();
        return tenantId + "." + baseDomain;
    }
    /**
     * Example:
     *  tenantId = "demo"
     *  baseDomain = "kjwlocal.com"
     *  apiPath = "/api/receive-svg"
     *  -> "http://demo.kjwlocal.com/api/receive-svg"
     */
    public String buildTenantApiUrlNew(String tenantId) {
        String baseDomain = appProperties.getBaseDomain(); // kjwlocal.com
        String apiPath    = appProperties.getApiPath();    // /api/receive-svg

        return "https://" + tenantId + "." + baseDomain + apiPath;
    }
     public String getDrawingApiToken(String tenantId) {
        String token = appProperties.getDrawingApiToken(); // token to access the web app

        return token;
    }
}
