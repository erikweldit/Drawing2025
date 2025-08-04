package com.example.application.h2data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SvgFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String filename;
    private String username;
    @Lob
    @Column(columnDefinition = "CLOB") // SVG er tekstbasert
    private String content;

    private LocalDateTime createdAt = LocalDateTime.now();
    // Gettere og settere

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getUerename() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
