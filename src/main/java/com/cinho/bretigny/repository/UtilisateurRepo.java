package com.cinho.bretigny.repository;

import com.cinho.bretigny.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {
}
