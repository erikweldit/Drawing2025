package com.example.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SvgStorageProperties {

    @Value("${svg.output.directory}")
    private String outputDirectory;

    public String getOutputDirectory() {
        return outputDirectory;
    }
}

