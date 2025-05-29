
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestFactorsOfANumberFunction{

	//ACTIONS
	@Test
	public void testFunctionExistenceTest(){
		int number = 24;
		FactorsOfANumber.factors(number);
	}


	@Test
	public void testAccurateResultTest(){

		//CHECKS
		int number = 24;
		int expected = {1, 2, 3, 4, 6, 8, 12, 24};
		int actual = FactorsOfANumber.factors(number);
		assertArrayEquals(expected, actual);
	}


	@Test
	public void testAccurateResultTest(){

		//CHECKS
		int number = 7;
		int expected = {1, 7};
		int actual = FactorsOfANumber.factors(number);
		assertArrayEquals(expected, actual);
	}


	@Test
	public void testZeroTest(){

		//CHECKS
		int number = 0;
		int expected = {};
		int actual = TransposedArray.reverse(number);
		assertArrayEquals(expected, actual);
	}


	@Test
	public void testNegativeTest(){

		//CHECKS
		int number = -24;
		int expected = {};
		int actual = FactorsOfANumber.factors(number);
		assertArrayEquals(expected, actual);
	}



}