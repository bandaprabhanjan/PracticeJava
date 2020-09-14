import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("K","Z","B");
	    Collections.sort(l,(i1,i2)->i2.compareTo(i1));
	    System.out.println(l);
	    TreeSet<String>t = new TreeSet<String>((i1,i2)->i2.compareTo(i1));
	    t.add("A");
	    t.add("K");
	    t.add("B");
	    System.out.println("Treeset-result"+t);
	}

}
