package com.mariana.dto;
/*
 * 04-23-17
 * 
 * Mariana Ruiz
 * 
 * Model for colum D is a catalog than in a relation ship one to many for Product
*/
public class ExecutingUnit {
	private int IdEsecutingUnit;
	private String name;
	public int getIdEsecutingUnit() {
		return IdEsecutingUnit;
	}
	public void setIdEsecutingUnit(int idEsecutingUnit) {
		IdEsecutingUnit = idEsecutingUnit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
