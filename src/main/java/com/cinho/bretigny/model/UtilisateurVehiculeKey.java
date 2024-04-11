package com.cinho.bretigny.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class UtilisateurVehiculeKey {

    private Long id_utilisateur;

    private Long id_vehicule;

    public UtilisateurVehiculeKey() {

    }

    public UtilisateurVehiculeKey(Long id_utilisateur, Long id_vehicule) {
        this.id_utilisateur = id_utilisateur;
        this.id_vehicule = id_vehicule;
    }


}
