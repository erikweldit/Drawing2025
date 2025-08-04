package com.example.application.zoomnew;

import jakarta.persistence.*;

import java.util.List;

public class SvgServiceNew {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("svg-pu");

    public void saveSvg(String filename, String svgContent) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        SvgFileNew file = new SvgFileNew();
        file.setFilename(filename);
        file.setContent(svgContent);

        em.persist(file);
        em.getTransaction().commit();
        em.close();
    }

    public List<SvgFileNew> getAllSvgFiles() {
        EntityManager em = emf.createEntityManager();
        List<SvgFileNew> files = em.createQuery("SELECT s FROM SvgFile s", SvgFileNew.class).getResultList();
        em.close();
        return files;
    }

    public SvgFileNew getById(Long id) {
        EntityManager em = emf.createEntityManager();
        SvgFileNew file = em.find(SvgFileNew.class, id);
        em.close();
        return file;
    }
}

