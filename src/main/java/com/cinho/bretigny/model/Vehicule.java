package com.cinho.bretigny.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Vehicule {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id_vehicule;
    private String couleur;
    private String poids;
    private String longueur;
    private int nbreportes;
    private Double prixjournalier;

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private Categorie categorie;

    @OneToMany(mappedBy = "vehicules")
    private List<Commentaire> commentaires;

    @OneToMany(mappedBy = "vehicule")
    private List<Reserver>reserverList;




    public Vehicule() {

    }

    public Vehicule(String couleur, String poids, String longueur, int nbreportes, Double prixjournalier) {
        this.couleur = couleur;
        this.poids = poids;
        this.longueur = longueur;
        this.nbreportes = nbreportes;
        this.prixjournalier = prixjournalier;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "id_vehicule=" + id_vehicule +
                ", couleur='" + couleur + '\'' +
                ", poids=" + poids +
                ", longueur='" + longueur + '\'' +
                ", nbreportes=" + nbreportes +
                ", prixjournalier=" + prixjournalier +
                '}';
    }
}
