
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIndexOfLargestElementFunction{

	//ACTIONS
	@Test
	public void testFunctionExistenceTest(){
		int[] numbers = {1, 2, 7, 4, 5, 6};
		IndexOfLargestElement.occurence(numbers);
	}


	@Test
	public void testAccurateResultTest(){

		//CHECKS
		int[] numbers = {1, 2, 7, 4, 5, 6};
		int expected = 2;
		int actual = IndexOfLargestElement.occurence(numbers);
		assertEquals(expected, actual);
	}


	@Test
	public void testEmptyArrayTest(){

		//CHECKS
		int[] numbers = {};
		int expected = 0;
		int actual = IndexOfLargestElement.occurence(numbers);
		assertEquals(expected, actual);
	}


	@Test
	public void testNegativeElementsResultTest(){

		//CHECKS
		int[] numbers = {-1, 2, -7, 4, 5, 6};
		int expected = 5;
		int actual = IndexOfLargestElement.occurence(numbers);
		assertEquals(expected, actual);
	}


	@Test
	public void testSimilarElementsResultTest(){

		//CHECKS
		int[] numbers = {2, 3, 3, 3, 3, 3};
		int expected = 1;
		int actual = IndexOfLargestElement.occurence(numbers);
		assertEquals(expected, actual);
	}





}