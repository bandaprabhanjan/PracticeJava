package com.practice.general.singleton;

public class EarlyInitialization {
	private EarlyInitialization() {
	}

	public static EarlyInitialization instance = new EarlyInitialization();

	public static EarlyInitialization getinstance() {
		return instance;
	}

	public static void main(String[] args) {
		EarlyInitialization instance = EarlyInitialization.getinstance();
		System.out.println("Hashcode" + instance.hashCode());
		EarlyInitialization instance1 = EarlyInitialization.getinstance();
		System.out.println("Hashcode" + instance1.hashCode());
	}
}
