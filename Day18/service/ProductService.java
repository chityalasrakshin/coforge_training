package com.coforge.pms.service;

import com.coforge.pms.model.Product;

public interface ProductService {
	Product addProduct(Product product);
	Iterable<Product> viewAllProducts();
    Product searchProduct(int productId);
    Product updateProduct(Product product);
    void deleteProduct(int productId);

    Iterable<Product> searchProductByName(String productName);
    void deleteProductByName(String productName);
    Iterable<Product> searchProductByQuantity(int quantity);
    Iterable<Product> searchProductByPriceRange(Double minPrice, Double maxPrice);
    long countTotalProducts();
    Double sumOfProductsPrice();
}
