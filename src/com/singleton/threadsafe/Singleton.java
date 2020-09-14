package com.singleton.threadsafe;

public class Singleton {
	private static Singleton INSTANCE = null;

	private Singleton() {
		System.out.println("Constructor");
	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					System.out.println("with in synchronized block");
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					INSTANCE = new Singleton();
					System.out.println("Object is created");
				}
			}
		}
		return INSTANCE;
	}
}
//Double check locking mechanism
