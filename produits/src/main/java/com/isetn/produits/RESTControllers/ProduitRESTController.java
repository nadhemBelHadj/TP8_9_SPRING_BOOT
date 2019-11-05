package com.isetn.produits.RESTControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.isetn.produits.entities.Produit;
import com.isetn.produits.service.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {
	@Autowired
	ProduitService produitService;
	
	@GetMapping
	public List<Produit> getAllProduits() {
		return produitService.getAllProduits();
		
	}
	
	@GetMapping("/{id}")
	public Produit getProduitById(@PathVariable("id") Long id) {	
		return produitService.getProduit(id);
    }
	
	@PostMapping
	public Produit createProduit(@RequestBody Produit produit) {
		return produitService.updateProduit(produit);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable("id") Long id)
	{
		produitService.deleteProduitById(id);
	}
	
}