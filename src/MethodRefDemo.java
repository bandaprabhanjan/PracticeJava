import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Prabhanjan", "Ravi", "Rambabu", "Rayudu");

		names.forEach(System.out::println);
	}

}
