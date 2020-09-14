package com.strategy.design.pattern.payment.impl;

import com.strategy.design.pattern.payment.PaymentMethod;

public class CreditCardPaymentMethod implements PaymentMethod {
	private String cardHolderName;
	private String card;
	private String cvv;
	private String expiryDate;

	public CreditCardPaymentMethod(String cardHolderName, String card, String cvv, String expiryDate) {
		super();
		System.out.println("CreditCardPaymentMethod Constructor");
		this.cardHolderName = cardHolderName;
		this.card = card;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public String getCard() {
		return card;
	}

	public String getCvv() {
		return cvv;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Credit Card Payment Method" + card);

	}

}
