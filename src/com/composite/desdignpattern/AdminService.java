package com.composite.desdignpattern;

public class AdminService implements Service {

	@Override
	public void service(String serviceType) {
	System.out.println(serviceType+ "For Admin Service");

	}

}
