package com.isetn.produits;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.isetn.produits.entities.Produit;
import com.isetn.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
/*	
	@Test
	 public void testCreateProduit() {
		Produit prod = new Produit();
		prod.setNomProduit("PC Asus");
		prod.setPrixProduit(100.0);
	}
	
	@Test
	public void testFindProduit()
	 {
		 Produit p = produitRepository.findById(1L).orElse(null);
		 System.out.println(p);
	 }

	@Test
	public void testUpdateProduit()
	 {
		 Produit p = produitRepository.findById(1L).orElse(null);
		p.setPrixProduit(1000.0);
		 produitRepository.save(p);
	 }
	
	@Test
	public void testDeleteProduit()
	 {
		 produitRepository.deleteById(1L);;
		 
	 }

	*/
	
}
