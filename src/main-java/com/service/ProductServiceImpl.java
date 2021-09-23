package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDao productDao;

	public void createProduct(Product product) {
		
		productDao.createProduct(product);
		
		
	}

	public List<Product> getProducts() {
		
		
		return productDao.getProducts();
	}

	public void deleteProduct(int pid) {
		
		productDao.deleteProduct(pid);
		
	}

	public Product getProduct(int pid) {
		
		return productDao.getProduct(pid);
	}
	
	

}
