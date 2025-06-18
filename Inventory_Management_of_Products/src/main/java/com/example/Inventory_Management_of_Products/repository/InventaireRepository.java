package com.example.Inventory_Management_of_Products.repository;

import com.example.Inventory_Management_of_Products.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventaireRepository extends JpaRepository<Produit, Long> {
    Optional<Produit> findByNom(String nom);

    void deleteByNom(String nom);

    List<Produit> findByQuantiteLessThan(int seuil);
}
