package com.example.application.zoomdb;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SvgImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String userId;

    @Lob
    private String content;

    private LocalDateTime createdAt;

    public SvgImage() {
    }

    public SvgImage(String name, String userId, String content, LocalDateTime createdAt) {
        this.name = name;
        this.userId = userId;
        this.content = content;
        this.createdAt = createdAt;
    }
    public SvgImage(String name, String userId, String content) {
        this.name = name;
        this.userId = userId;
        this.content = content;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}