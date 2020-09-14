package com.sortmapbasedon.values.with.customobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class SortMapBasedOnCustomObject {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1001, "Rakesh", 20000, "ASE");
		Employee employee2 = new Employee(1002, "Kiran", 30000, "SE");
		Employee employee3 = new Employee(1003, "Navin", 40000, "SSE");
		Employee employee4 = new Employee(1001, "Praveen", 20000, "ASE");
		Employee employee5 = new Employee(1002, "Dp", 30000, "SE");
		Map<Integer, Employee> hashMap = new HashMap<Integer, Employee>();
		hashMap.put(1001, employee1);
		hashMap.put(1002, employee2);
		hashMap.put(1003, employee3);
		hashMap.put(1004, employee4);
		hashMap.put(1005, employee5);
		Set<Entry<Integer, Employee>> entrySet = hashMap.entrySet();
		ArrayList<Entry<Integer, Employee>> list = new ArrayList<Entry<Integer, Employee>>(entrySet);
		Stream<Entry<Integer, Employee>> filter = list.stream().filter(s->s.getValue().getSalary()>20000);
		filter.forEach(e->System.out.println(e.getKey()+"\t"+e.getValue()));
		Collections.sort(list, new Comparator<Entry<Integer, Employee>>() {

			@Override
			public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
				return o1.getValue().getName().compareTo(o2.getValue().getName());
			}
		});
	//	list.forEach(s -> System.out.println(s.getKey() + "\t" + s.getValue()));
	}

}
