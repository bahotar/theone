package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Produit;
import com.example.model.User;
import com.example.service.ProduitService;
import com.example.service.UserService;

@Controller
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	private List<Produit> produits;

	
	

	
	@RequestMapping(value="/products",method = RequestMethod.GET)
	public ModelAndView products() {
		ModelAndView modelAndView=new ModelAndView();
		produits = produitService.SelectAll();
		modelAndView.addObject("produits", produits);
		modelAndView.setViewName("admin/index");
		return modelAndView;
	}
	
	
	

}
