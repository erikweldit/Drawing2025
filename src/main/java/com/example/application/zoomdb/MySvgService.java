package com.example.application.zoomdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

@Service
public class MySvgService {
    @Autowired
    private JdbcTemplate jdbc;

    public InputStream getSvgAsStream(String name) {
        byte[] bytes = jdbc.queryForObject(
                "SELECT data FROM svg_table WHERE name = ?",
                byte[].class, name);
        return new ByteArrayInputStream(bytes);
    }
}

