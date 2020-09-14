
public class DebugDemo {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
		int sum = calculateSum(numbers);

		System.out.println(sum);
	}

	private static int calculateSum(int[] numbers) {
		int result = 0;
		for (int number : numbers) {
			result += number;
		}
		return result;
	}

}
