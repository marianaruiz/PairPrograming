package com.mariana.persistence;
/*
 * 04-23-17
 * 
 * Mariana Ruiz
 * 
 * Data Access Object to implements the methods to get data 
*/

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mariana.dto.Product;

public class SearchDAO extends HibernateDaoSupport implements SearchInt{

	public Product searchId(int idProduc) {
		// TODO Auto-generated method stub
		Session session = getSessionFactory().openSession();
		return null;
	}

	public List<Product> search(String word, String codigo) {
		// TODO Auto-generated method stub
		Session session = getSessionFactory().openSession();
		return null;
	}

}
