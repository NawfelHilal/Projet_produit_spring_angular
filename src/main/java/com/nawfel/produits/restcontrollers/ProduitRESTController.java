package com.nawfel.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nawfel.produits.entities.Produit;
import com.nawfel.produits.service.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {

	@Autowired
	ProduitService produitService;
	
	@GetMapping
	List<Produit> getAllProduits()
	{
		return produitService.getAllProduits();
	}
}
