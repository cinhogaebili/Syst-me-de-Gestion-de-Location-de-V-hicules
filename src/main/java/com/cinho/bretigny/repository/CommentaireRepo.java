package com.cinho.bretigny.repository;

import com.cinho.bretigny.model.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepo extends JpaRepository<Commentaire, Long> {
}
