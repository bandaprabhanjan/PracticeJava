package com.singleton.lazyinitialization;

public class ClientTest {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();		
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1.equals(instance2));
	}

}
