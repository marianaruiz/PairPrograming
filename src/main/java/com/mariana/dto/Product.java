package com.mariana.dto;
/*
 * 04-23-17
 * 
 * Mariana Ruiz
 * 
 * Model for one row is teh main model to which all these related
*/
import java.sql.Date;

public class Product {
	private int idProduct;
	private Date year;
	private Sector sector;
	private String name;
	private Double inicalAproved;
	private Double finalAproved;
	private Double Commitments;
	private Double Obligations;
	private Double Playments;
	private Reference Reference;
	private Detail detail;
	
	public Product() {
		super();
	}
	public int getIdCongres() {
		return idProduct;
	}
	public void setIdCongres(int idCongres) {
		this.idProduct = idCongres;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getInicalAproved() {
		return inicalAproved;
	}
	public void setInicalAproved(Double inicalAproved) {
		this.inicalAproved = inicalAproved;
	}
	public Double getFinalAproved() {
		return finalAproved;
	}
	public void setFinalAproved(Double finalAproved) {
		this.finalAproved = finalAproved;
	}
	public Double getCommitments() {
		return Commitments;
	}
	public void setCommitments(Double commitments) {
		Commitments = commitments;
	}
	public Double getObligations() {
		return Obligations;
	}
	public void setObligations(Double obligations) {
		Obligations = obligations;
	}
	public Double getPlayments() {
		return Playments;
	}
	public void setPlayments(Double playments) {
		Playments = playments;
	}
	public Reference getReference() {
		return Reference;
	}
	public void setReference(Reference reference) {
		Reference = reference;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	

}
