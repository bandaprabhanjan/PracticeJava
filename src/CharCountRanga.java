import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharCountRanga {

	public static void main(String[] args) {
		String str = "This is an awesome occasion." + "This has never happened before.";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char key : str.toCharArray()) {
			Integer value = map.get(key);
			if (value == null) {
				map.put(key, 1);
			} else {
				map.put(key, value + 1);
			}

		}
		System.out.println(map);
	}

}
