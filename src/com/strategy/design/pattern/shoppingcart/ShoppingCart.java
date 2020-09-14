package com.strategy.design.pattern.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import com.strategy.design.pattern.payment.PaymentMethod;
import com.strategy.design.pattern.product.Product;

public class ShoppingCart {
	

	@Override
	public String toString() {
		return "ShoppingCart [productList=" + productList + "]";
	}

	private List<Product> productList = new ArrayList<Product>();

	/*
	 * public ShoppingCart() { productList = new ArrayList<Product>(); }
	 */

	public void addProduct(Product product) {
		productList.add(product);
	}

	public int calculateTotalPrice() {
		return productList.stream().map(p -> p.getPrice()).reduce(0, Integer::sum);
	}

	public void payment(PaymentMethod paymentMethod) {
		paymentMethod.pay(calculateTotalPrice());
	}
}
