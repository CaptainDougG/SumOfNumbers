
public class SumOfNumbers {

	public static String getSum(int start, int end) {
		String equation = "";
		int sum = 0;
		int numberOfLoops;
		if (start <= end) {
			for (numberOfLoops = start; numberOfLoops <= end; numberOfLoops++) {
				sum = sum + numberOfLoops;
				if (numberOfLoops != start) {
				equation = equation + " + " + numberOfLoops;
				}
				else {
					equation = equation + numberOfLoops;
				}
			}
			return equation + " = " + sum;
		}
		else {
			return "";
		}
	}
}
