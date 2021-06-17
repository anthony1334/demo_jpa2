package fr.diginamic;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Emprunt")
public class Emprunt {
    @Id
    private int id;
    private LocalDateTime date_debut;
    private LocalDateTime date_fin;
    private int delai;
    @ManyToOne// jointure plusieurs emprunt peuvent avoir 1 client
    @JoinColumn(name = "id_client")
    private Client client;


    @ManyToMany//jointure sur la table compo entre id_emprunt et l'id livre
    @JoinTable(
            name="COMPO",
        joinColumns = @JoinColumn(name="ID_EMP",referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name = "ID_LIV",referencedColumnName = "ID")
    )
    private Set<Livre> livres;
    public Emprunt() {
    }
public Set<Livre> getLivres(){
        return this.livres;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(LocalDateTime date_debut) {
        this.date_debut = date_debut;
    }

    public LocalDateTime getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LocalDateTime date_fin) {
        this.date_fin = date_fin;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }
}
