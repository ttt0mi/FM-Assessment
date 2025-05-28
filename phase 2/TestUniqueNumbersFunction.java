import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestUniqueNumbersFunction{

	@Test
	public void testFunctionExistenceTest(){
		int[] numbers = {1, 2, 3, 2};
		UniqueNumbersFunction.uniqueNumbers(numbers);
	}

	@Test
	public void testAccurateResultTest(){
		int[] numbers = {1, 2, 3, 2};
		int expected = UniqueNumbersFunction.uniqueNumbers(numbers);
		int actual = 4;
		assertEquals(expected, actual);

	}

	@Test
	public void testNegativeResultTest(){
		int [] numbers = {1,-1, 2, 3, 2};
		int expected = UniqueNumbersFunction.uniqueNumbers(numbers);
		int actual = 3;
		assertEquals(expected, actual);

	}

	@Test
	public void testNoUniqueNumberstTest(){
		int [] numbers = {1, 1, 1, 1, 1};
		int expected = UniqueNumbersFunction.uniqueNumbers(numbers);
		int actual = 0;
		assertEquals(expected, actual);

	}

	@Test
	public void testEmptyArraytTest(){
		int [] numbers = {};
		int expected = UniqueNumbersFunction.uniqueNumbers(numbers);
		int actual = 0;
		assertEquals(expected, actual);

	}
}