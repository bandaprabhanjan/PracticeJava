package com.exception.handling;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExceptionTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 0, 30, 40, 50);
		int b = 0;
		for (Integer i : list) {
			try {
				System.out.println("dividing by" + i);
				b = 100 / i;
			} catch (Exception e) {
			System.out.println("Division by zero");
			b = 0;
				e.printStackTrace();
			}
			System.out.println("value of b" +b);
		}
		System.out.println("after for loop");

	}

}
