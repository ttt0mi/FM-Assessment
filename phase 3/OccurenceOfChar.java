public class OccurenceOfChar{

	public static int frequency(String word, char letter){

		int occurenceCounter = 0;
	
		for(int index = 0; index < word.length(); index++){

			if(word.charAt(index) == letter) occurenceCounter++;

		}		

	return occurenceCounter;

	}

	public static void main(String... args){

		String word = "Hello, World!";
		char letter = 'o';

		System.out.print(frequency(word, letter));

	}

}