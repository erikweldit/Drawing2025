package com.example.application.controller;
//  Alternativ: Automatisk sletting i bulk (cron-jobb)
//Hvis du vil slette alle gamle filer en gang i timen:
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class SvgFileSweeper {

    private static final String SVG_FOLDER = "generated_svgs";

    @Scheduled(fixedRate = 60 * 60 * 1000) // hver time
    public void cleanOldFiles() {
        File folder = new File(SVG_FOLDER);
        if (!folder.exists()) return;

        long cutoff = System.currentTimeMillis() - (10 * 60 * 1000); // 10 minutter
        for (File file : folder.listFiles((dir, name) -> name.endsWith(".svg"))) {
            if (file.lastModified() < cutoff) {
                file.delete();
            }
        }
    }

    /*

    Husk å aktivere @EnableScheduling i en konfigurasjonsklasse:

java
Kopier
Rediger
@SpringBootApplication
@EnableScheduling
public class YourApp {
    public static void main(String[] args) {
        SpringApplication.run(YourApp.class, args);
    }
}
     */
}

