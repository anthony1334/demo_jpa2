package fr.diginamic;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "LIVRE")
public class Livre {
    @Id
    private int id;
    private String titre;
    private String auteur;

    @ManyToMany//jointure sur la table compo entre  l'id livre et l'id_emprunt
    @JoinTable(
            name="COMPO",
            joinColumns = @JoinColumn(name="ID_LIV",referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_EMP",referencedColumnName = "ID")
    )
    private Set<Emprunt> emprunts;



    public Livre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
