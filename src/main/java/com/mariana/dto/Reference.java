package com.mariana.dto;
/*
 * 04-23-17
 * 
 * Mariana Ruiz
 * 
 * Model for colum Q is a catalog than in a relation ship one to many for Product
*/
public class Reference {
	private int IdReference;
	private String name;
	public int getIdReference() {
		return IdReference;
	}
	public void setIdReference(int idReference) {
		IdReference = idReference;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
