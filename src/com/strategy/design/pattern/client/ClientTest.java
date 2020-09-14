package com.strategy.design.pattern.client;

import java.util.Iterator;

import com.strategy.design.pattern.payment.impl.CreditCardPaymentMethod;
import com.strategy.design.pattern.payment.impl.UpiPayment;
import com.strategy.design.pattern.product.Product;
import com.strategy.design.pattern.shoppingcart.ShoppingCart;

public class ClientTest {

	public static void main(String[] args) {
		// Creating first Instance of Shoppingcart
		ShoppingCart shoppingcart = new ShoppingCart();

		Product product1 = new Product("Soap", "88889895", 100);
		Product product2 = new Product("Shampoo", "89989895", 120);
		Product product3 = new Product("Cookies", "84449895", 100);

		// adding three product in shopping cart
		shoppingcart.addProduct(product1);
		shoppingcart.addProduct(product2);
		shoppingcart.addProduct(product3);
		System.out.println(shoppingcart);

		// Proceed to payment Strategy as CreditcardPayment
		CreditCardPaymentMethod cardPaymentMethod = new CreditCardPaymentMethod("Prabhanjan", "453123002561", "123",
				"11/23");
//		shoppingcart.payment(new CreditCardPaymentMethod("KK", "987654326372626", "898", "11/23"));
		shoppingcart.payment(cardPaymentMethod);

		System.out.println("--------------------------------------------------------");
		// Creating Second Instance of Shoppingcart
		shoppingcart = new ShoppingCart();

		product1 = new Product("Milk", "888009895", 200);
		product2 = new Product("Beer", "89909995", 320);

		// adding two products in shopping cart
		shoppingcart.addProduct(product1);
		shoppingcart.addProduct(product2);

		// Proceed to payment Strategy as PaypalPayment

		shoppingcart.payment(new UpiPayment("pn@gmail.com", "pass"));
	}

}
