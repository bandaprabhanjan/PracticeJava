package com.distributed.singleton.serialization;

import java.io.Serializable;

public class Singleton implements Serializable {
	private static final long serialVersionUID = 3169173136126517351L;
	private static Singleton INSTANCE = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

	private Object readResolve() {
		return getInstance();
	}
}
