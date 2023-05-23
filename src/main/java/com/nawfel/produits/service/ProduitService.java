package com.nawfel.produits.service;

import java.util.List;

import com.nawfel.produits.dto.ProduitDTO;
import com.nawfel.produits.entities.Categorie;
import com.nawfel.produits.entities.Produit;

public interface ProduitService {
	ProduitDTO saveProduit(ProduitDTO p);
	ProduitDTO getProduit(Long id);
	List<ProduitDTO> getAllProduits();
	
	ProduitDTO updateProduit(ProduitDTO p);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	
	
	List<Produit> findByNomProduit(String nom);
	List<Produit> findByNomProduitContains(String nom);
	List<Produit> findByNomPrix (String nom, Double prix);
	List<Produit> findByCategorie (Categorie categorie);
	List<Produit> findByCategorieIdCat(Long id);
	List<Produit> findByOrderByNomProduitAsc();
	List<Produit> trierProduitsNomsPrix();
	
	ProduitDTO convertEntityToDto(Produit p);
	Produit convertDtoToEntity(ProduitDTO produitDto);

}
