import java.util.HashMap;
import java.util.Map;

public class wordcount {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. " + "This has never happened before.";
		Map<String, Integer> freq = new HashMap<>();
		String[] word = str.split(" ");
		for (String key : word) {
			if (freq.containsKey(key)) {
				freq.put(key, freq.get(key) + 1);
			} else {
				freq.put(key, 1);
			}
		}
		System.out.println(freq);
	}

}
