package com.singleton.clone;

public class Singleton implements Cloneable{
	private static Singleton INSTANCE = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("You cannot create clone for singleton");
		//return super.clone();
	}
	
}
