package com.example.application.zoomdb;

// SvgImageRepository.java

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SvgImageRepository extends JpaRepository<SvgImage, Long> {


    SvgImage findTopByOrderByIdDesc();
    List<SvgImage> findByUserIdContainingIgnoreCase(String userId);
    List<SvgImage> findByNameContainingIgnoreCase(String name);
    List<SvgImage> findTop4ByUserIdOrderByCreatedAtDesc(String userId);
    SvgImage findTopByUserIdOrderByIdDesc(String userId);
    List<SvgImage> findByCreatedAtBefore(LocalDateTime cutoffDate);
    List<SvgImage> findByUserIdAndNameContainingIgnoreCase(String userId, String name);

    void deleteAllByUserId(String userId);

    List<SvgImage> findByUserId(String userId);

    @Transactional
    void deleteByUserId(String userId);

    @Transactional
    void deleteById(Long id);

    @Modifying
    @Transactional
    void deleteByCreatedAtBefore(LocalDateTime cutoff);


}




