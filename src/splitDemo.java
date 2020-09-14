
public class splitDemo {
	public static void main(String[] args) {
		String s = "Prabhanjan working on IBM";
		String[] s1 = s.split(" .");
		System.out.println(s.substring(11, 19));
		String s5 = "Java India";
		String[] s6 = s5.split(" ");
		for (String s7 : s6) {
			System.out.println(s7);
		}

		for (String s2 : s1) {
			System.out.println(s2);
		}
	}

}
