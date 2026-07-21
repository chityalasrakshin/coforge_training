package com.coforge.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;
import com.coforge.pms.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepo productRepo;
	private Environment environment;

	@Autowired
	public ProductServiceImpl(ProductRepo productRepo, Environment environment) {
		super();
		this.productRepo = productRepo;
		this.environment = environment;
	}

	@Override
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Iterable<Product> viewAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product searchProduct(int productId) {
		return productRepo.findById(productId).orElseThrow(
				() -> new ProductNotFoundException("Product with ID " + productId + " does not exist.")
		);
	}

	@Override
	public Product updateProduct(Product product) {
	    if (!productRepo.existsById(product.getProductId())) {
	        throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
	    }
	    // Save it and return the newly updated object immediately!
	    return productRepo.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		if (!productRepo.existsById(productId)) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		productRepo.deleteById(productId);
	}

	@Override
	public Iterable<Product> searchProductByName(String productName) {
		return productRepo.findByProductName(productName);
	}

	@Override
	public void deleteProductByName(String productName) {
		productRepo.deleteByProductName(productName);
	}

	@Override
	public Iterable<Product> searchProductByQuantity(int quantity) {
		return productRepo.findByProductQuantity(quantity);
	}

	@Override
	public Iterable<Product> searchProductByPriceRange(Double minPrice, Double maxPrice) {
		return productRepo.findByProductPriceBetween(minPrice, maxPrice);
	}

	@Override
	public long countTotalProducts() {
		return productRepo.count();
	}

	@Override
	public Double sumOfProductsPrice() {
		Double sum = productRepo.sumOfProductsPrice();
		return sum != null ? sum : 0.0;
	}
}
