import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList6Ways {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Prabhanjan", "Mahender", "Srilatha");
		System.out.println("----1->Iterate through Java8 forEach loop and Lambda Expression-------");
		nameList.forEach(name -> System.out.println(name));

		System.out.println("----2->Iterate through itreator-------");
		Iterator<String> itr = nameList.iterator();
		while (itr.hasNext()) {
			String name = (String) itr.next();
			System.out.println(name);

		}
		System.out.println("----3->Iterate through iterator Java8 forEachRemaining loop and Lambda Expression-------");
		Iterator<String> itr1 = nameList.iterator();
		itr1.forEachRemaining(name -> System.out.println(name));
		System.out.println("----4->Iterate through normal forEach loop -------");
		for (String name : nameList) {
			System.out.println(name);
		}
		System.out.println("----5->Iterate through for loop with order/index-------");
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		System.out.println("----6->Iterate through ListIterator traverse through forward direction-------");
		ListIterator<String> listitr = nameList.listIterator();
		while (listitr.hasNext()) {
			String name = listitr.next();
			System.out.println(name);
		}
		System.out.println("----7->Iterate through ListIterator traverse through Backward direction-------");
		ListIterator<String> listIterator = nameList.listIterator(nameList.size());
		while (listIterator.hasPrevious()) {
			String nameReverse = listIterator.previous();
			System.out.println(nameReverse);
		}

	}

}
