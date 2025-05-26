import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedSquaredArrayTest{

	@BeforeEach
	public void setUp(){
		int[] numbers = {9, 2, 7, 0, 5};
	}


	//ACTIONS
	@Test
	public void testFunctionExistenceTest(){
		SortedSquaredArray.squaresort(numbers);
	}

	@Test
	public void testAccurateResultTest(){

		//CHECKS
		assertEquals([0, 4, 25, 49, 81], SortedSquaredArray.squaresort(numbers));

	}
}