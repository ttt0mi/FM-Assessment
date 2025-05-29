
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOccurenceOfCharFunction{


	//ACTIONS
	@Test
	public void testFunctionExistenceTest(){
		String word = "Hello, World!";
		char letter = 'o';
		OccurenceOfChar.frequency(word);
	}


	@Test
	public void testAccurateResultTest(){

		//CHECKS
		String word = "Hello, World!";
		char letter = 'o';
		int expected = OccurenceOfChar.frequency(word);
		int actual = 2;
		assertEquals(expected, actual);
	}


	@Test
	public void testEmptyStringTest(){

		//CHECKS
		String word = "";
		char letter = 'o';
		int expected = OccurenceOfChar.frequency(word);
		int actual = 0;
		assertEquals(expected, actual);
	}



}