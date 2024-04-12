package com.cinho.bretigny.impl;

import com.cinho.bretigny.model.Categorie;
import com.cinho.bretigny.repository.CategorieRepo;
import com.cinho.bretigny.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorieImpl implements CategorieService {

    @Autowired
    CategorieRepo categorieRepo;


    @Override
    public Categorie saveCategorie(Categorie cat) {
        return null;
    }

    @Override
    public Categorie updateCategorie(Categorie cat) {
        return null;
    }

    @Override
    public void deleteCategorie(Categorie cat) {

    }

    @Override
    public void deleteCategorieById(Long id) {

    }

    @Override
    public Categorie getCategorie(Long id) {
        return null;
    }

    @Override
    public List<Categorie> getAllCategorie() {
        return null;
    }
}
