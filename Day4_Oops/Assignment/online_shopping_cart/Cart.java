package com.coforge.day4_java.Assignment.online_shopping_cart;
import java.util.*;

public class Cart {
	List<Product> products = new ArrayList<>();
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public void removeProduct(Product p) {
		products.remove(p);
	}
	
	public void calculateTotal() {
		double total = 0;
		
		for(Product product : products) {
			total += product.price;
		}
		
		System.out.println("Total Amount : " + total);
	}
	
	
}
