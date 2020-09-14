package com.strategy.design.pattern.payment.impl;

import com.strategy.design.pattern.payment.PaymentMethod;

public class UpiPayment implements PaymentMethod {
	private String email;
	private String password;
	

	public UpiPayment(String email, String password) {
		super();
		System.out.println("UpiPayment Constructor");
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	@Override
	public void pay(int amount) {
		System.out.println(amount +"Amout Paid by Paypal");

	}

}
