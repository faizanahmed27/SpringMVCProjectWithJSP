package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDao {

	void createProduct(Product product);
	
	List<Product> getProducts();
	
	void deleteProduct(int pid);
	
	Product getProduct(int pid);
}

