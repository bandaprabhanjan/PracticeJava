
public class ReverseStringDemo {
	public static void main(String[] args) {
		String s = "Hi P rabh anjan";
		char [] c = s.toCharArray();
		s.replaceAll("\\s+", "");
		for(int i =s.length()-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
		StringBuffer sb = new StringBuffer("This is Java class");
		sb.reverse();
		System.out.println(sb);
				
	}

}
