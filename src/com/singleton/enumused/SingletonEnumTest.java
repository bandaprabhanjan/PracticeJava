package com.singleton.enumused;

public class SingletonEnumTest {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.GETINSTANCE;
		Singleton instance2 = Singleton.GETINSTANCE;
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance1.welcome());

	}

}
