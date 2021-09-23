package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void createProduct(Product product) {
		
		
		
		System.out.println("Hello");
		
		this.hibernateTemplate.saveOrUpdate(product);
		
	}

	public List<Product> getProducts() {
		
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		
		return products;
	}

	public void deleteProduct(int pid) {
		
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
		
	}

	public Product getProduct(int pid) {
		
		return this.hibernateTemplate.get(Product.class, pid);
	}

	
	
	
}
