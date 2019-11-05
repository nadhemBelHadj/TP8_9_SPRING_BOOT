package com.isetn.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isetn.produits.entities.Produit;
import com.isetn.produits.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	ProduitRepository produitRepository;
	
	@Override
	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
		
	}

	@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
		
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);

	}

	@Override
	public Produit getProduit(Long id) {
		return  produitRepository.findById(id).orElse(null);
	
	}

	@Override
	public List<Produit> getAllProduits() {
		List<Produit> prods = produitRepository.findAll();
		return prods;
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);	
	}

}
