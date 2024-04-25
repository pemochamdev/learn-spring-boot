package com.example.demo.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduct;
	private String nameProduct;
	private double prixProduct;
	private  Date dateCreation;
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String nameProduct, double prixProduct, Date dateCreation) {
		super();
		this.nameProduct = nameProduct;
		this.prixProduct = prixProduct;
		this.dateCreation = dateCreation;
	}


	public long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public double getPrixProduct() {
		return prixProduct;
	}
	public void setPrixProduct(double prixProduct) {
		this.prixProduct = prixProduct;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", prixProduct=" + prixProduct
				+ ", dateCreation=" + dateCreation + "]";
	}
	
	

}
