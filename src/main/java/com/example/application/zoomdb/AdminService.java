package com.example.application.zoomdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    private SvgImageRepository repository;

    public void saveSvgFile(String userId, String name, String content) {
        SvgImage image = new SvgImage();
        image.setUserId(userId);
        image.setName(name);
        image.setContent(content);
        image.setCreatedAt(LocalDateTime.now());
        repository.save(image);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<SvgImage> getAllImages() {
        return repository.findAll();
    }

    public List<SvgImage> getSvgByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    public void deleteAllByUserId(String userId) {
        repository.deleteByUserId(userId);
    }

    public void deleteOlderThanFourWeeks() {
        int weeks = 4;
        LocalDateTime cutoff = LocalDateTime.now().minusWeeks(weeks);
        repository.deleteByCreatedAtBefore(cutoff);
    }
}

