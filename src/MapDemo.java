import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 3);
		map.put("C", 10);
		map.put("R", 1);
		System.out.println(map.get("C"));
		System.out.println(map.get("N"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsValue(2));
		System.out.println(map.remove("D", 4));
		System.out.println(map.replace("A", 3, 6));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
	}

}
