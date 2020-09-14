package com.composite.desdignpattern;

public class EmployeeService implements Service {

	@Override
	public void service(String serviceType) {
		System.out.println(serviceType + "for Employee Service");

	}

}
