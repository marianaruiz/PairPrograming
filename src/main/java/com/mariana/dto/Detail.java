package com.mariana.dto;
/*
 * 04-23-17
 * 
 * Mariana Ruiz
 * 
 * Model for colums F-J is a dtatail from Product
*/
public class Detail {
	private int idDetail;
	private int prog;
	private int subp;
	private int proy;
	private int subp2;
	private int rec;
	private int sit;
	
	public Detail() {
		super();
	}
	public Detail(int idDetail, int prog, int subp, int proy, int subp2, int rec, int sit) {
		super();
		this.idDetail = idDetail;
		this.prog = prog;
		this.subp = subp;
		this.proy = proy;
		this.subp2 = subp2;
		this.rec = rec;
		this.sit = sit;
	}
	public int getIdDetail() {
		return idDetail;
	}
	public void setIdDetail(int idDetail) {
		this.idDetail = idDetail;
	}
	public int getProg() {
		return prog;
	}
	public void setProg(int prog) {
		this.prog = prog;
	}
	public int getSubp() {
		return subp;
	}
	public void setSubp(int subp) {
		this.subp = subp;
	}
	public int getProy() {
		return proy;
	}
	public void setProy(int proy) {
		this.proy = proy;
	}
	public int getSubp2() {
		return subp2;
	}
	public void setSubp2(int subp2) {
		this.subp2 = subp2;
	}
	public int getRec() {
		return rec;
	}
	public void setRec(int rec) {
		this.rec = rec;
	}
	public int getSit() {
		return sit;
	}
	public void setSit(int sit) {
		this.sit = sit;
	}

}
