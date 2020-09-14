package com.singleton.lazyinitialization;

public class Singleton {
	private static Singleton INSTANCE = null;

	private Singleton() {
		System.out.println("Inside Controller==>executed when initializing an object");
	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			System.out.println("inside Static Method-First Execution Point");
			INSTANCE = new Singleton();
			System.out.println("Finally Executed==After Object Creation");
		}
		return INSTANCE;
	}
}
