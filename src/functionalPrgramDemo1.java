import java.util.Arrays;
import java.util.List;

public class functionalPrgramDemo1 {

	public static void main(String[] args) {
		List<String> values = Arrays.asList("Apple", "Bat", "Cat", "Dog");
		List<Integer> list = Arrays.asList(1, 2, 5, 8, 3, 2, 5);
		values.stream().filter(s -> s.endsWith("at")).forEach(s -> System.out.println("Element-" + s));

		list.stream().filter(i -> i % 2 != 0).forEach(i -> System.out.println(i));
		int sum = list.stream().filter(i -> i % 2 != 0).reduce(0, (I1, I2) -> I1 + I2);
		System.out.println(sum);
		list.stream().sorted().forEach(i -> System.out.println(i));
		list.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.println(e));
		values.stream().map(s -> s.toLowerCase()).forEach(p -> System.out.println(p));
		values.stream().map(s -> s.length()).forEach(p -> System.out.println(p));
		List<Integer> l = Arrays.asList(1, 2, 3, 4);
		l.stream().max((n1, n2) -> Integer.compare(n1, n2));
		l.stream().map(e -> e * e).forEach(System.out::println);

	}

}
