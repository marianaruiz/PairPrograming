package com.mariana.persistence;
/*
 * 04-23-17
 * 
 * Mariana Ruiz
 * 
 * Interface to map all the necessary methods required to get data
*/

import java.util.List;

import com.mariana.dto.Product;

public interface SearchInt {
	public Product searchId(int idProduc);
	public List<Product> search(String word,String codigo);
}
