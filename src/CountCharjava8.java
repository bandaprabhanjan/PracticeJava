import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharjava8 {
	public static void main(String[] args) {
		String s = "Prabhanjan";
		Map<Character, Integer> freq= new LinkedHashMap<Character, Integer>();
		for(char c : s.toCharArray())
		{
			freq.merge(c, 1, Integer::sum);
			System.out.println(freq);
		}
		System.out.println(freq);
	}

}
