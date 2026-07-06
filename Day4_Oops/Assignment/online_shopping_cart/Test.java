package com.coforge.day4_java.Assignment.online_shopping_cart;

public class Test {
	public static void main(String[] args) {
		Customer neeraj = new Customer("Neeraj");
		neeraj.cart.addProduct(new Product(1, "Perfume", 1000));
		neeraj.cart.addProduct(new Product(2, "Apple", 100));
		
		Customer kumar = new Customer("Kumar");
		kumar.cart.addProduct(new Product(1, "Perfume", 3000));
		
		neeraj.cart.calculateTotal();
		kumar.cart.calculateTotal();
		
	}

}
