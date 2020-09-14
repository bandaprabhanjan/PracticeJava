package com.markerinterface.create;

public class CustomMarkerInterfaceTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		try {
			new MarkerEntityService().save(employee);
		} catch (InvalidEntityFoundException e) {
			e.printStackTrace();
		}

	}

}
