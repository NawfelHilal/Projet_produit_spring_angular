package com.nawfel.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
	
	@GetMapping("/{id}")
	public Produit getProduitById(@PathVariable("id") Long id) 
	{
		return produitService.getProduit(id);
	}
	
	@PostMapping
	public Produit createProduit(@RequestBody Produit produit) 
	{
		return produitService.saveProduit(produit);
	}

	@PutMapping
	public Produit updateProduit(@RequestBody Produit produit) 
	{
		return produitService.updateProduit(produit);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable("id") Long id)
	{
		produitService.deleteProduitById(id);
	}

	@GetMapping("/prodscat/{idCat}")
	public List<Produit> getProduitsByCatId(@PathVariable("idCat") Long idCat) 
	{
		return produitService.findByCategorieIdCat(idCat);
	}

}
