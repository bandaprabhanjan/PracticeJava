package com.cloneexample.deep;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private Addrees address;

	public Employee(int id, String name, Addrees address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("Constructor calling...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Addrees getAddress() {
		return address;
	}

	public void setAddress(Addrees address) {
		this.address = address;
	}
//here we are calling the setter() and creating a new object for mutable reference
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		employee.setAddress(new Addrees(getAddress().getId(), getAddress().getAddressLine1(),
				getAddress().getAddressLine2(), getAddress().getCity(), getAddress().getZipcode()));
		return employee;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
