package com.cinho.bretigny.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter

public class Commentaire {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )

    private Long id_commentaire;
    private String contenu;
    private Date dateCommentaire;


    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateurs;

    @ManyToOne
    @JoinColumn(name = "id_vehicule")
    private Vehicule vehicules;


    public Commentaire() {

    }

    public Commentaire(String contenu, Date dateCommentaire) {
        this.contenu = contenu;
        this.dateCommentaire = dateCommentaire;
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "id_commentaire=" + id_commentaire +
                ", contenu='" + contenu + '\'' +
                ", dateCommentaire=" + dateCommentaire +
                '}';
    }
}
