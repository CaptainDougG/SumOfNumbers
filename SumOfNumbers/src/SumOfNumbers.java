
public class SumOfNumbers {

	public static String getSum(int start, int end) {
		String equation = "";
		int sum = 0;
		int i;
		if (start <= end) {
			for (i = start; i <= end; i++) {
				sum = sum + i;
				if (i != start) {
					equation = equation + " + " + i;
				}
				else {
					equation = equation + i;
				}
			}
			return equation + " = " + sum;
		}
		else {
			return "";
		}
	}
}
