package com.coforge.pms.controller;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/pms")
public class ProductController {
	
	private ProductService productService;
	private Environment environment;
	
	public ProductController(ProductService productService, Environment environment) {
		super();
		this.productService = productService;
		this.environment = environment;
	}
	

	@PostMapping("/products")
	public ResponseEntity<?> addProduct(@Valid @RequestBody Product product){
		productService.addProduct(product);
		return new ResponseEntity<>(environment.getProperty("pms.product.added"), HttpStatus.CREATED);
	}

	@GetMapping("/products")
	public ResponseEntity<?> viewAllProducts(){
		
		Iterable<Product> products = productService.viewAllProducts();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	

	@GetMapping("/products/{id}")
	public ResponseEntity<?> searchProduct(@PathVariable("id") int id){
		Product product = productService.searchProduct(id);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	

	@PutMapping("/products/{id}")
	public ResponseEntity<?> updateProduct(@PathVariable("id") int id, @Valid @RequestBody Product product){
	
		productService.updateProduct(product);
		
		
		return new ResponseEntity<>(environment.getProperty("pms.product.updated"), HttpStatus.OK);
	}
	

	@DeleteMapping("/products/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable("id") int id){
		productService.deleteProduct(id);
		return new ResponseEntity<>(environment.getProperty("pms.product.deleted"), HttpStatus.OK);
	}
	
	@GetMapping("/products/name/{name}")
	public ResponseEntity<?> searchProductByName(@PathVariable("name") String name) {
		Iterable<Product> products = productService.searchProductByName(name);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@DeleteMapping("/products/name/{name}")
	public ResponseEntity<?> deleteProductByName(@PathVariable("name") String name) {
		productService.deleteProductByName(name);
		return new ResponseEntity<>("Product deleted by name", HttpStatus.OK);
	}
	
	@GetMapping("/products/quantity/{quantity}")
	public ResponseEntity<?> searchProductByQuantity(@PathVariable("quantity") int quantity) {
		Iterable<Product> products = productService.searchProductByQuantity(quantity);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@GetMapping("/products/price/{min}/{max}")
	public ResponseEntity<?> searchProductByPriceRange(@PathVariable("min") Double min, @PathVariable("max") Double max) {
		Iterable<Product> products = productService.searchProductByPriceRange(min, max);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@GetMapping("/products/stats")
	public ResponseEntity<?> getProductStats() {
		long count = productService.countTotalProducts();
		Double sum = productService.sumOfProductsPrice();
		String stats = "Total Products: " + count + ", Sum of Prices: " + sum;
		return new ResponseEntity<>(stats, HttpStatus.OK);
	}
}