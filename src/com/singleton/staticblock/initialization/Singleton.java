package com.singleton.staticblock.initialization;

public class Singleton {
	private static Singleton INSTANCE;

	private Singleton() {
		System.out.println("constructor");
	}

	static {
		try {
			if (INSTANCE == null) {
				System.out.println("inside static block and before object creation");
				INSTANCE = new Singleton();
				System.out.println("inside static block and after object creation");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getInstance() {
		System.out.println("inside statice method");
		return INSTANCE;
	}

}
