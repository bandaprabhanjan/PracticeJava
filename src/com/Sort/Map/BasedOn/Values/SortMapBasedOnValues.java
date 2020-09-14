package com.Sort.Map.BasedOn.Values;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortMapBasedOnValues {

	public static void main(String[] args) {
		Map<Integer, String> employeeIdAndMap = new HashMap<Integer, String>();
		employeeIdAndMap.put(1001, "Rakesh");
		employeeIdAndMap.put(1002, "Karthik");
		employeeIdAndMap.put(1003, "Naveen");
		employeeIdAndMap.put(1004, "Karthik");
		System.out.println("Original Values");
		employeeIdAndMap.forEach((k, v) -> System.out.println(k + " \t" + v));
		Set<Entry<Integer, String>> entrySet = employeeIdAndMap.entrySet();
		List<Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(entrySet);
		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		System.out.println("Map sorted based on Keys");
		list.forEach(s -> System.out.println(s.getValue() + "\t" + s.getKey()));

		/*
		 * List<String> collect =
		 * entrySet.stream().map(v->v.getValue()).sorted().collect(Collectors.toList());
		 * for (String printValue : collect) { System.out.println(printValue); }
		 */

	}

}
