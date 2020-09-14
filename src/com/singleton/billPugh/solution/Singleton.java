package com.singleton.billPugh.solution;

public class Singleton {
	private Singleton() {
		System.out.println("Inside constructor");

	}

	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		System.out.println("Inside method");
		return SingletonHolder.INSTANCE;
	}
}
