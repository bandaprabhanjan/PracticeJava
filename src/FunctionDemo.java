import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("PRABHANJAN"));
		Function<Integer, Integer> f1 = i -> i * i;
		System.out.println("Square:" + f1.apply(5));
		Function<String, String> f2 = s -> s.replaceAll(" ", "");
		System.out.println(f2.apply("Prabhanjan Banda IBM"));
		String s = "IBM Software Solutions";
		Function<String, String> f3 = m -> m.replaceAll(" ", "");
		System.out.println("spaces replaced:" + f3.apply(s));
		Function<String, Integer> f4 = n -> n.length() - n.replaceAll(" ", "").length();
		System.out.println("number of spaces present in String:" + f4.apply(s));

	}

}
//here,we are passing the function as an argument
