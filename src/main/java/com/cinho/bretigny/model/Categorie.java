package com.cinho.bretigny.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import java.util.List;

@Entity
@Getter
@Setter
public class Categorie {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id_categorie;

    @Column( length = 30 )
    private String nomCat;

    private String description;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateurs;

    @OneToMany(mappedBy = "categorie")
    private List<Vehicule> vehicules;

    public Categorie() {

    }

    public Categorie(String nomCat, String description) {
        this.nomCat = nomCat;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id_categorie=" + id_categorie +
                ", nomCat='" + nomCat + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
