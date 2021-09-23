package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {

	void createProduct(Product product);
	
	List<Product> getProducts();
	
	void deleteProduct(int pid);
	
	Product getProduct(int pid);
}
