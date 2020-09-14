package move.all.negative.numbers.to.last;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> positiveNumbers = new ArrayList<Integer>();
		List<Integer> negativeNumbers = new ArrayList<Integer>();
		int arr[] = { 3, -3, 45, 2, -19, -7, 56, 45 };
		for (Integer data : arr) {
			if (data >= 0) {
				positiveNumbers.add(data);
			} else {
				negativeNumbers.add(data);
			}
		}
		positiveNumbers.addAll(negativeNumbers);
		System.out.println(positiveNumbers);

	}

}
