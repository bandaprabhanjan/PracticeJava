package com.composite.desdignpattern;

public class CompositeTest {

	public static void main(String[] args) {
		EmployeeService employeeService1 = new EmployeeService();
		EmployeeService employeeService2 = new EmployeeService();
		AdminService adminService1 = new AdminService();

		ServiceProvider serviceProvider = new ServiceProvider();
		serviceProvider.addService(employeeService1);
		serviceProvider.addService(employeeService2);
		serviceProvider.addService(adminService1);
		serviceProvider.service("Registration");
		
		serviceProvider.removeService(employeeService2);
		serviceProvider.removeService(employeeService1);
		serviceProvider.service("Admin");
		serviceProvider.clearService(employeeService1);
		serviceProvider.service("update");
	}

}
