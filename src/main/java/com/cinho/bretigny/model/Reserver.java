package com.cinho.bretigny.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter

public class Reserver {
    @EmbeddedId
    private UtilisateurVehiculeKey id_reserver;

    private Date date_debut;
    private Date date_fin;


    @MapsId("id_vehicule")
    @ManyToOne
    Vehicule vehicule;

    @MapsId("id_utilisateur")
    @ManyToOne
    Utilisateur utilisateur;




        public Reserver() {

        }

        public Reserver(Date date_debut, Date date_fin, Date date, Double prix_total) {
            this.date_debut = date_debut;
            this.date_fin = date_fin;

    }

    @Override
    public String toString() {
        return "Reserver{" +
                "date_debut=" + date_debut +
                ", date_fin=" + date_fin +
                '}';
    }
}
