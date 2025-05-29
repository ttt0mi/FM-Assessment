
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTransposedArrayFunction{

	//ACTIONS
	@Test
	public void testFunctionExistenceTest(){
		int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
		TransposedArray.reverse(numbers);
	}


	@Test
	public void testAccurateResultTest(){

		//CHECKS
		int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
		int[][] expected = {{4, 1}, {5, 2}, {6, 3}};
		int[][] actual = TransposedArray.reverse(numbers);
		assertArrayEquals(expected, actual);
	}


	@Test
	public void testEmptyArrayTest(){

		//CHECKS
		int[][] numbers = {{}, {}};
		int[][] expected = {{}, {}, {}};
		int[][] actual = TransposedArray.reverse(numbers);
		assertArrayEquals(expected, actual);
	}





}