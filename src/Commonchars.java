import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Commonchars {
	public static void main(String[] args) {
		String s1 = "abcxxx";
		String s2 = "defxxx";
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();

		for (char c1 : s1.toCharArray()) {
			list1.add(c1);
		}
		for (char c2 : s2.toCharArray()) {
			list2.add(c2);
		}
		list1.retainAll(list2);

	}
}
