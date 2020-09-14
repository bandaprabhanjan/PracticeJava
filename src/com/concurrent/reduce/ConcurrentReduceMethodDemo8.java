package com.concurrent.reduce;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentReduceMethodDemo8 {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
		chm.put("Rajesh", "India");
		chm.put("Ram", "Pak");
		chm.put("Raj", "China");
		chm.put("Ravi", "USA");
		String reduce = chm.reduce(2, (k, v) -> k + "-" + v, (r1, r2) -> r1 + "," + r2);
		System.out.println(reduce);
		String reduceKeys = chm.reduceKeys(2, (k1, k2) -> k1 + "--" + k2);
		System.out.println(reduceKeys);
		String reduceValues = chm.reduceValues(2, (v1, v2) -> v1 + "-" + v2);
		System.out.println(reduceValues);
	}

}
