package fr.diginamic;

import javax.persistence.*;

public class ConnexionJpa {
    public static void main(String[] args) {
      /*  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();


        Region region = em.find(Region.class,11);
     *//*   Region region1 = new Region();
        region1.setCode_region(72);
        region1.setNom_region("Andorus");
        em.persist(region1);*//*
        Region region2 = new Region(130,"joland");
        em.persist(region2);

        System.out.println(region.getNom_region());
    *//*    System.out.println(region1.getNom_region());*//*

        et.commit();
        em.close();*/

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("compta2");
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        Livre livre = em.find(Livre.class,5);
        System.out.println(livre.getTitre());


        Emprunt emprunt = em.find(Emprunt.class,4
        );

        for (Livre empruntLivre : emprunt.getLivres()) {
            System.out.println(empruntLivre.getTitre());
        }

    }
}
