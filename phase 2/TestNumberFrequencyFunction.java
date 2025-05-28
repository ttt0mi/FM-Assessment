import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestNumberFrequencyFunction{

	@Test
	public void testFunctionExistenceTest(){
		String numbers = "1210";
		NumberFrequency.indexFreq(numbers);
	}

	@Test
	public void testAccurateResultTest(){
		String numbers = "1210";
		boolean expected = NumberFrequency.indexFreq(numbers);
		boolean actual = true;
		assertEquals(expected, actual);

	}

	@Test
	public void testInaccurateResultTest(){
		String numbers = "303";
		boolean expected = NumberFrequency.indexFreq(numbers);
		boolean actual = false;
		assertEquals(expected, actual);

	}
}