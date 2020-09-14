import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferenceStreamDemo {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("abcd","pqrs","wxyz");
		List<String> collect = stream.filter(element->element.contains("pqrs")).collect(Collectors.toList());
		Optional<String> findAny = collect.stream().findAny();
		System.out.println(findAny.get());
		Optional<String> findFirst = collect.stream().findFirst();
		System.out.println(findFirst.get());
	}

}
