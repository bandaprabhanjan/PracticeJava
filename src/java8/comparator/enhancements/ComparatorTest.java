package java8.comparator.enhancements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1001, "emp1"), new Employee(1002, "user1"),
				new Employee(1003, "customer1"), new Employee(1004, "testuser"));
		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println("After Sort");
		empList.forEach(System.out::println);
		

	}

}
