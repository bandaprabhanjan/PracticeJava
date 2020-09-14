package com.singleton.eagerinitialization;

public class Singleton {
	private static Singleton INSTANCE = new Singleton();

	private Singleton() {
		System.out.println("in constructor");
	}

	public static Singleton getIntance() {
		System.out.println("In method");
		return INSTANCE;
	}
}
