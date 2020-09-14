package com.cloneexample.deep;

public class DeepCloningTest {

	public static void main(String[] args) {
		System.out.println("Original Object details Befr:");
		Addrees address1 = new Addrees(1111, "H.no 2-94", "Koppula", "Warangal", "506164");
		Employee employee1 = new Employee(1001, "user1", address1);
		System.out.println("Original Object Details:" + employee1);
		employee1.setName("user-1-mod" +employee1);
		try {
			Object cloneObject = employee1.clone();
			Employee employee2 = (Employee) cloneObject;
			employee2.setName("user1-mofified");
			employee2.getAddress().setCity("Hyderabad");
			employee2.getAddress().setZipcode("500072");
			System.out.println("Cloned Object Details" + employee2);

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
	}

}
