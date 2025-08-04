package com.example.application.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
@RequestMapping("/generated/svg")
public class SvgExportController {

    private static final String SVG_FOLDER = "generated_svgs"; // mappe der du genererer SVG-filer

    @GetMapping("/{filename}")
    public ResponseEntity<Resource> getGeneratedSvg(@PathVariable String filename) {
        // Enkelt sikkerhetstiltak for å hindre ".." path traversal
        if (filename.contains("..") || !filename.endsWith(".svg")) {
            return ResponseEntity.badRequest().build();
        }

        File file = new File(SVG_FOLDER, filename);
        if (!file.exists()) {
            return ResponseEntity.notFound().build();
        }

        Resource resource = new FileSystemResource(file);
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf("image/svg+xml"))
                .body(resource);
    }
}


