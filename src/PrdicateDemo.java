import java.util.ArrayList;
import java.util.function.Predicate;

public class PrdicateDemo {
	public static void main(String[] args) {
		String[] names = { "Ravi", "Ranjith", "Prabhanjan", "Mahendar", "Naveen", "Kiran", null, "" };
		Predicate<String> avoidnull = n -> n != null && n.length() != 0;
		Predicate<String> startswithR = s -> s.startsWith("R");
		ArrayList<String> l = new ArrayList<String>();
		for (String v : names) {
			if (avoidnull.test(v)) {
				l.add(v);
			}
		}

		System.out.println(l);
		for (String s : names) {
			if (startswithR.test(s)) {
				System.out.println(s);
			}
		}

	}
}
