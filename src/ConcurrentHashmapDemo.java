import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentHashmapDemo {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");	
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
			l.remove("C");
		}

	}

}
