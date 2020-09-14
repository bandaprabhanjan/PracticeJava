package com.practice.general.singleton;

public class LazySignletonObject {
	private LazySignletonObject() {
	}

	private static LazySignletonObject instance;

	private static LazySignletonObject getInstance() {
		if (instance == null) {
			instance = new LazySignletonObject();
		}
		return instance;
	}

	public static void main(String[] args) {
		LazySignletonObject instance = LazySignletonObject.getInstance();
		System.out.println(instance);
		LazySignletonObject instance1 = LazySignletonObject.getInstance();
		System.out.println(instance1);
	}
}
