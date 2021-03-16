//Revised 2018-10-14
import junit.framework.TestCase;

public class SumOfNumbersTest extends TestCase {

	public void test() {
		
		SumOfNumbers sn = new SumOfNumbers();

		assertEquals("1 + 2 + 3 + 4 + 5 = 15", SumOfNumbers.getSum(1,5));
		assertEquals("10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 = 165", SumOfNumbers.getSum(10,20));
		assertEquals("21 = 21", SumOfNumbers.getSum(21,21));
		assertEquals("", SumOfNumbers.getSum(10,5));

	}
	
}
