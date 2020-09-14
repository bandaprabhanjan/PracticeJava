package com.strategy.design.pattern.product;

public class Product {
	private String productName;
	private String productId;
	private int price;
	

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", price=" + price + "]";
	}

	public Product(String productName, String productId, int price) {
		super();
		System.out.println("Product Constructor");
		this.productName = productName;
		this.productId = productId;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductId() {
		return productId;
	}

	public int getPrice() {
		return price;
	}

}
