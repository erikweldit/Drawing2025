package com.example.application.controller;


import java.io.File;
import java.util.concurrent.*;

public class SvgFileCleaner {

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void scheduleDeletion(File file, long delayMinutes) {
        scheduler.schedule(() -> {
            if (file.exists()) {
                boolean deleted = file.delete();
                if (!deleted) {
                    System.err.println("Kunne ikke slette fil: " + file.getAbsolutePath());
                }
            }
        }, delayMinutes, TimeUnit.MINUTES);
    }
}

