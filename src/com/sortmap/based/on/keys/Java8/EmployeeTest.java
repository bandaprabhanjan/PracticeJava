package com.sortmap.based.on.keys.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

public class EmployeeTest {

	public static void main(String[] args) {
		Map<Integer, Employee> employeeIdAndNameMap = new HashMap<Integer, Employee>();
		employeeIdAndNameMap.put(10001, new Employee(10001, "Kalyan", "ASE", 30000.0));
		employeeIdAndNameMap.put(10002, new Employee(10002, "Naveen", "SE", 40000.0));
		employeeIdAndNameMap.put(10003, new Employee(10003, "Amar", "SSE", 50000.0));
		employeeIdAndNameMap.put(10004, new Employee(10004, "Leela", "SE", 40000.0));
		employeeIdAndNameMap.put(10005, new Employee(10005, "Mahesh", "ASE", 30000.0));
		Set<Entry<Integer, Employee>> entrySet = employeeIdAndNameMap.entrySet();
		List<Entry<Integer, Employee>> empList = new ArrayList<Entry<Integer, Employee>>(entrySet);
		Optional<Entry<Integer, Employee>> findAny = empList.stream().filter(e->e.getValue().getDesignation()=="SE").findAny();
		
		Collections.sort(empList, (o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName()));
		empList.forEach(e -> System.out.println(e.getKey() + "" + e.getValue()));

	}

}
