package com.example.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.model.Produit;
import com.example.model.Role;
import com.example.model.User;
import com.example.repository.ProduitRepository;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;

@Service("produitservice")
public class ProduitServiceImpl implements ProduitService{

	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public List<Produit> SelectAll() {
		return produitRepository.findAll();
	}


	
}
