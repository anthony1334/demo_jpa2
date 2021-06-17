package fr.diginamic;

import javax.persistence.*;

@Entity
@Table(name="regions")
public class Region {
    @Id

    private int code_region;
    private String nom_region;

    public Region() {
    }

    public Region(int code_region, String nom_region) {
        this.code_region = code_region;
        this.nom_region = nom_region;
    }

    public int getCode_region() {
        return code_region;
    }

    public void setCode_region(int code_region) {
        this.code_region = code_region;
    }

    public String getNom_region() {
        return nom_region;
    }

    public void setNom_region(String nom_region) {
        this.nom_region = nom_region;
    }
}