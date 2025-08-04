package com.example.application.zoomsvg;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SvgController {

    @GetMapping(value = "/svg-view", produces = MediaType.TEXT_HTML_VALUE)
    public String getSvgView() {
        // Dette kan også leses fra database eller filsystem
        return """
            <!DOCTYPE html>
            <html>
            <body style="margin:0; overflow: auto;">
                <div style="width:100%; height:100%; overflow:scroll;">
                    <svg width="2000" height="2000" viewBox="0 0 1000 1000">
                        <circle cx="500" cy="500" r="400" stroke="black" stroke-width="5" fill="red" />
                    </svg>
                </div>
            </body>
            </html>
            """;
    }
}

