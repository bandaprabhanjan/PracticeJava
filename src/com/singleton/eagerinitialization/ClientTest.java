package com.singleton.eagerinitialization;

public class ClientTest {

	public static void main(String[] args) {
		
		Singleton intance1 = Singleton.getIntance();
		Singleton intance2 = Singleton.getIntance();
		System.out.println(intance1.hashCode());
		System.out.println(intance2.hashCode());
	}

}
