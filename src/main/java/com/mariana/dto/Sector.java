package com.mariana.dto;
/*
 * 04-23-17
 * 
 * Mariana Ruiz
 * 
 * Model for colum B-C is a catalog than in a relation ship one to many for Product
*/
public class Sector {
	private int IdSector;
	private String Sector;
	
	public int getIdSector() {
		return IdSector;
	}
	public void setIdSector(int idSector) {
		IdSector = idSector;
	}
	public String getSector() {
		return Sector;
	}
	public void setSector(String sector) {
		Sector = sector;
	}

}
