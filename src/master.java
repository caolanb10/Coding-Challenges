import java.util.*;

public class master {

	public static void main(String[] args) {
		Sorter s = new Sorter();
		int testArray[] = { 1, 3, 6, 4, 3, 1, 6, 9, 0, 2, 1, 65, 3, 1, 1, 6, 8, 6 };
		s.sort(testArray, 0, testArray.length - 1);

		// Values for current count of integers and largest count of integers
		int currentCount = 1;
		int maxCount = 1;

		// Placeholder for element in the array and current element we are
		// counting
		int el;
		int current;

		// Placeholder for the most common integer
		int mostCommon = 0;

		// Init current to first element
		current = testArray[0];

		for (int a = 1; a < testArray.length - 1; a++) {
			el = testArray[a];
			if (el == current)
				currentCount++;

			else {
				if (currentCount > maxCount) {
					maxCount = currentCount;
					mostCommon = testArray[a - 1];
				}
				currentCount = 1;
				current = el;
			}
		}
		System.out.println(Integer.toString(mostCommon));
	}
}