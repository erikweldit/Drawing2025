package com.example.application.controller;

import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

@Service
public class SvgService {

    private final SvgStorageProperties storageProperties;

    public SvgService(SvgStorageProperties storageProperties) {
        this.storageProperties = storageProperties;
    }

    public Path generateSvg(String filename, String content) throws IOException {
        Path dirPath = Paths.get(storageProperties.getOutputDirectory());
        if (!Files.exists(dirPath)) {
            Files.createDirectories(dirPath);
        }

        Path filePath = dirPath.resolve(filename);
        Files.writeString(filePath, content, StandardCharsets.UTF_8);

        SvgFileCleaner.scheduleDeletion(filePath.toFile(), 5);
        return filePath;
    }
}

