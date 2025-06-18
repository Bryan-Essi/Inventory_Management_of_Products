package com.example.Inventory_Management_of_Products.service;

import com.example.Inventory_Management_of_Products.model.Produit;

import java.util.List;
import java.util.Optional;

public interface InventaireService {
    Produit addProduit(Produit produit);

    List<Produit> getAllProduit();

    Optional<Produit> getOneProduit(String nom);

    Produit deleteOneProduit(String nom);

    Produit updateOneProduit(String nom, Produit produit);

    List<Produit> verifierStocksBas();

}
