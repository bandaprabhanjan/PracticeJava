import java.util.LinkedHashMap;
import java.util.Map;

public class CountChar {

	public static void main(String[] args) {
		String str = "aabbprabhanjan";
		Map<Character, Integer> freq = new LinkedHashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (Character key : ch) {
			if (freq.containsKey(key)) {
				freq.put(key, freq.get(key) + 1);
			} else {
				freq.put(key, 1);
			}
		}
		System.out.println(freq);

	}

}
