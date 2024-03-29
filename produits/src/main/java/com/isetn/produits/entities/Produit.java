package com.isetn.produits.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity  
public class Produit implements Serializable{
	
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private Long idProduit;
	private String nomProduit;
	private Double prixProduit;
	
	
	public Produit() {
		super();
	}
	public Produit(String nomProduit, Double prix) {
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prix;
	}
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public Double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(Double prix) {
		this.prixProduit = prix;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prix=" + prixProduit + "]";
	}
	
}
