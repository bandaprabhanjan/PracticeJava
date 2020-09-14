import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipelineDemo {

	public static void main(String[] args) {
		Stream<String> onceModifiedStream = Stream.of("abcd","pqrs","wxyz").skip(1);
		onceModifiedStream.forEach(System.out::println);
		
		List<String> list = Arrays.asList("abc1", "pqr2", "xyz3");
		List<String> twiceModifiedList = list.stream().skip(1).map(element -> element.substring(0, 3)).sorted()
				.collect(Collectors.toList());
		twiceModifiedList.forEach(System.out::println);
		
		Stream<String> twoMOdifiedStream = Stream.of("first","second","third","fourth");
		long size = twoMOdifiedStream.skip(1).map(elements->elements.substring(0, 3)).sorted().count();
		System.out.println(size);
	}

}

/*
 * comments: to perform sequence of operation over the elements of the
 * datasource and aggregate their results 3 parts needed. 1)Source 2)
 * Intermedicate operations 3) Terminal operation
 */