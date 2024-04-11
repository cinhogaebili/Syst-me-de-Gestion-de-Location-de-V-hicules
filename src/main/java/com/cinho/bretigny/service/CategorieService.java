package com.cinho.bretigny.service;

import com.cinho.bretigny.model.Categorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategorieService {
    Categorie saveCategorie(Categorie cat);
    Categorie updateCategorie(Categorie cat);
    void deleteCategorie(Categorie cat);
    void deleteCategorieById(Long id);
    Categorie getCategorie(Long id);
    List<Categorie> getAllCategorie();


}
