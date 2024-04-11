package com.cinho.bretigny.repository;

import com.cinho.bretigny.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepo extends JpaRepository<Categorie, Long> {
}
