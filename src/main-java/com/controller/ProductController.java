package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.model.Product;
import com.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	
	
	
	/*
	 * @RequestMapping("/") public String home(Model m) {
	 * 
	 * m.addAttribute("title", "Home Page");
	 * 
	 * 
	 * return "index"; }
	 */
	
	
	 
	
	@RequestMapping("/product-form")
	public String addProduct() {
		
		return "add-product-form";
	}
	
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		
		System.out.println(product);
		
		productService.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/list");
		return redirectView;
	}
	
	@RequestMapping("/list")
	public String ListProduct(Model model) {
		
		List<Product> products = productService.getProducts();
		model.addAttribute("products", products);
		
		return "listproducts";
		
		}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		
		this.productService.deleteProduct(productId);
		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath() + "/list");
		return view;
		
	}
	
	@RequestMapping("/update/{productId}")
	public String updateform(@PathVariable("productId") int pid, Model model ) {
		
		Product product = this.productService.getProduct(pid);
		model.addAttribute("product", product);
		return "update_page";
		
		
	}
}
