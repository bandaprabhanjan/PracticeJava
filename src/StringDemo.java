
public class StringDemo {

	public static void main(String[] args) {
		String[] words = { "apple", "Prabhanjan","123", "@12ndn" };
		String date1 = "26/06/2020";
		String[] split2 = date1.split("/");
		System.out.println(split2.length);
		System.out.println(split2[1]);
		String word = "Prabhanjan Banda";
		String str2 ="Split This    String";
		String[] split = str2.split("\\s+");
		System.out.println(split.length);
		for(String word1: split)
		{
			System.out.println(word1);
		}
		System.out.println(word.substring(11));
		for (String str : words) {
			if (str.matches("[a-zA-Z]+")) {
				System.out.println(str);
			}
		}

	}

}
