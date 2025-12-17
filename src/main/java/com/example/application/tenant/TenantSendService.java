package com.example.application.tenant;

import com.example.application.zoomdb.SvgImage;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TenantSendService {

    private final TenantUrlService tenantUrlService;
    private final RestTemplate restTemplate = new RestTemplate();

    public TenantSendService(TenantUrlService tenantUrlService) {
        this.tenantUrlService = tenantUrlService;
    }

    /**
     * Sends the SVG to the tenant's API.
     *
     * @param tenantId e.g. "demo"
     * @param svg      SVG image to send
     */
    public void sendSvgToTenant(String tenantId, SvgImage svg) {
        String url = tenantUrlService.buildTenantApiUrl(tenantId);
        System.out.println("Sending SVG to: " + url);

        try {
            // You might want to send a DTO instead of SvgImage directly,
            // but this shows the basic idea.
            restTemplate.postForEntity(url, svg, Void.class);
        } catch (Exception e) {
            System.err.println("Failed to send SVG to tenant API: " + e.getMessage());
        }
    }
}
