package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Produit;
import com.example.model.Role;

@Repository("ProduitRepository")
public interface ProduitRepository extends JpaRepository<Produit, Integer>{

}
