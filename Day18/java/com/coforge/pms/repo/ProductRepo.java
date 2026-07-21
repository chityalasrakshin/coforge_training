package com.coforge.pms.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import jakarta.transaction.Transactional;

import com.coforge.pms.model.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {
	
	Iterable<Product> findByProductName(String productName);
	
	@Transactional
	void deleteByProductName(String productName);
	
	Iterable<Product> findByProductQuantity(int productQuantity);
	
	Iterable<Product> findByProductPriceBetween(Double minPrice, Double maxPrice);
	
	@Query("SELECT SUM(p.productPrice) FROM Product p")
	Double sumOfProductsPrice();
}
