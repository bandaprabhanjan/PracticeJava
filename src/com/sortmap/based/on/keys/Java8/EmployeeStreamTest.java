package com.sortmap.based.on.keys.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//Sort Map based on Values (custom object) in Java 8
public class EmployeeStreamTest {

	public static void main(String[] args) {
		Map<Integer, Employee> employeeIdAndNameMap = new HashMap<Integer, Employee>();
		employeeIdAndNameMap.put(10001, new Employee(10001, "Kalyan", "ASE", 30000.0));
		employeeIdAndNameMap.put(10002, new Employee(10002, "Naveen", "SE", 40000.0));
		employeeIdAndNameMap.put(10002, new Employee(10002, "Naveen", "SE", 40000.0));
		employeeIdAndNameMap.put(10003, new Employee(10003, "Amar", "SSE", 50000.0));
		employeeIdAndNameMap.put(10004, new Employee(10004, "Leela", "SE", 40000.0));
		employeeIdAndNameMap.put(10005, new Employee(10005, "Mahesh", "ASE", 30000.0));
		LinkedHashMap<Integer, Employee> mapSortedBasedOnKeys = employeeIdAndNameMap.entrySet().stream()
				.sorted((o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		mapSortedBasedOnKeys.forEach((k, v) -> System.out.println(k + "\t" + v));
		/*
		 * Set<Entry<Integer, Employee>> entrySet = employeeIdAndNameMap.entrySet();
		 * List<Entry<Integer, Employee>> empList = new ArrayList<Entry<Integer,
		 * Employee>>(entrySet); Collections.sort(empList, (o1, o2) ->
		 * o1.getValue().getName().compareTo(o2.getValue().getName()));
		 * empList.forEach(e -> System.out.println(e.getKey() + "\t" + e.getValue()));
		 */

	}

}
