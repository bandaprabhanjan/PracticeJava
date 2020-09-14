import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class Cowset {
	public static void main(String[] args) {
		CopyOnWriteArraySet s = new CopyOnWriteArraySet();
		s.add("A");
		s.add("1");
		s.add('A');
		s.add(true);
		s.add(null);
		s.add("A");
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			if (s1.equals("A"))
				itr.remove();
			System.out.println(s1);
		}
	}

}
