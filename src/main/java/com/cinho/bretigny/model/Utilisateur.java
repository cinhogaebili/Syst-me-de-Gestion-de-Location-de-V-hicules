package com.cinho.bretigny.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter

public class Utilisateur {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long     id_utilisateur;

    @Column( length = 10 )
    private String      sexe;

    @Column( length = 30 )
    private String       prenom;

    @Column( length = 30 )
    private String       nom;

    @Column( length = 10, unique = true )
    private String       login;

    @Column( length = 8 )
    private String       mdp;

    @Column( length = 30 )
    private String       adresse;

    @Column( length = 5 )
    private int          cp;

    @Column( length = 30 )
    private String       Ville;

    @Column( length = 20 )
    private String       tel;


    @Column( length = 30 )
    private String       email;

    @Column( length = 10 )
    private String       role;

    @OneToMany(mappedBy = "utilisateurs")
    private List<Categorie> categories;

    @OneToMany(mappedBy = "utilisateurs")
    private List<Commentaire> commentaires;


    @OneToMany(mappedBy = "utilisateur")
    private List<Reserver> reserverList;





//    @ManyToMany
//       @JoinTable(
//            name = "reserver",
//            joinColumns = @JoinColumn(name = "id_vehicule"),
//            inverseJoinColumns = @JoinColumn(name = "id_utilisateur")
//
//    )
//    private List<Vehicule> vehiculeList;


//   @ManyToMany(mappedBy = "utilisateur")
//   private List<Vehicule> vehicules;
//
//    @OneToMany(mappedBy = "utilisateur")
//    private List<Commentaire>commentaires;
//
//
//    @ManyToMany(mappedBy = "utilisateur")
//    private List<Reserver>reservers;



    public Utilisateur() {

    }

    public Utilisateur(String sexe, String prenom, String nom, String login, String mdp, String adresse, int cp, String ville, String tel, String email, String role) {
        this.sexe = sexe;
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.mdp = mdp;
        this.adresse = adresse;
        this.cp = cp;
        Ville = ville;
        this.tel = tel;
        this.email = email;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id_utilisateur=" + id_utilisateur +
                ", sexe='" + sexe + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", login='" + login + '\'' +
                ", mdp='" + mdp + '\'' +
                ", adresse='" + adresse + '\'' +
                ", cp=" + cp +
                ", Ville='" + Ville + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
