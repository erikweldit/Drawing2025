package com.example.application.zoomdb;


import com.example.application.views.list.MainLayoutDraw;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

//@Route("administrator")
@Route(value = "administrator", layout = MainLayoutDraw.class)
@Service
public class SvgImageAdminService extends HorizontalLayout {

    public static SvgImageRepository repository;

    @Autowired

    public SvgImageAdminService(SvgImageRepository repository) {
        this.repository = repository;
    }

    // Lagrer en ny SVG for angitt bruker
    public  void uploadSvg(String name, String content, String userId) {
        SvgImage svgImage = new SvgImage();
        svgImage.setName(name);
        svgImage.setContent(content);
        svgImage.setUserId(userId);
        svgImage.setCreatedAt(LocalDateTime.now());
        repository.save(svgImage);
    }

    // Sletter alle SVG-filer for en bestemt bruker
    public void deleteAllForUser(String userId) {
        List<SvgImage> userImages = repository.findByUserId(userId);
        repository.deleteAll(userImages);
    }

    public void deleteOlderThanFourWeeks() {
        try {
            LocalDateTime cutoff = LocalDateTime.now().minusWeeks(4);
            List<SvgImage> oldImages = repository.findAll().stream()
                    .filter(img -> {
                        try {
                            return img.getCreatedAt().isBefore(cutoff);
                        } catch (Exception e) {
                            System.err.println("Error retrieving createdAt for image with ID: " + img.getId());
                            return false;
                        }
                    })
                    .toList();

            if (!oldImages.isEmpty()) {
                repository.deleteAll(oldImages);
                System.out.println("Deleted " + oldImages.size() + " SVG images older than 4 weeks.");
            } else {
                System.out.println("No images older than 4 weeks found.");
            }

        } catch (Exception e) {
            System.err.println("Error deleting old images: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public List<String> getAllUserIds() {
        return repository.findAll().stream()
                .map(SvgImage::getUserId)
                .distinct()
                .toList();
    }
    public Optional<SvgImage> getImageById(Long id) {
        return repository.findById(id);
    }

    /*
    // Sletter alle SVG-filer eldre enn 4 uker
    public void deleteOlderThanFourWeeks() {
        LocalDateTime cutoff = LocalDateTime.now().minusWeeks(4);
        List<SvgImage> oldImages = repository.findAll().stream()
                .filter(img -> img.getCreatedAt().isBefore(cutoff))
                .toList();
        repository.deleteAll(oldImages);
    }

     */
}

