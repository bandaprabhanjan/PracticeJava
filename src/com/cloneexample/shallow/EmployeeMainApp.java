package com.cloneexample.shallow;

public class EmployeeMainApp {

	public static void main(String[] args) {
		System.out.println("Employee original object...");
		Employee employee1 = new Employee(1001, "user1");
		System.out.println("Employee Details" + employee1);
		try {
			Object cloneOject = employee1.clone();
			Employee employee2 = (Employee) cloneOject;
			System.out.println("Employee Details After Cloning" + employee2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
