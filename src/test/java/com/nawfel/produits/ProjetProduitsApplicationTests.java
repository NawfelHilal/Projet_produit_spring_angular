package com.nawfel.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nawfel.produits.entities.Categorie;
import com.nawfel.produits.entities.Produit;
import com.nawfel.produits.repos.ProduitRepository;

@SpringBootTest
class ProjetProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PS4", 1200.0, new Date());
		produitRepository.save(prod);
	}

	@Test
	public void testFindProduit()
	{
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit()
	{
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(2000.0);
		produitRepository.save(p);
		
		System.out.println(p);
	}
	
	@Test
	public void testDeleteProduit()
	{
		produitRepository.deleteById(3L);
	}
	
	@Test
	public void testFindAllProduit()
	{
		List<Produit> prods = produitRepository.findAll();
		
		for (Produit p:prods)
			System.out.println(p);
	}
	
	@Test
	public void testFindProduitByNom()
	{
		List<Produit> prods = produitRepository.findByNomProduit("PC Asus");
		
		for (Produit p:prods)
			System.out.println(p);
	}
	
	@Test
	public void testFindProduitByNomContains()
	{
		List<Produit> prods = produitRepository.findByNomProduitContains("p");
		
		for (Produit p:prods)
			System.out.println(p);
	}
	
	@Test
	public void testfindByNomPrix()
	{
		List<Produit> prods = produitRepository.findByNomPrix("PS4", 1000.0);
		
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testfindByCategorie()
	{
		Categorie cat = new Categorie();
		cat.setIdCat(1L);
		List<Produit> prods = produitRepository.findByCategorie(cat);
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}

	
}
