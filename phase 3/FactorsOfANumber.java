import java.util.Arrays;

public class FactorsOfANumber{

	public static int[] factors(int number){
	
		int factorCounter = 0;

		for(int counter = 1; counter <= number; counter++){
		
			if(number % counter == 0) factorCounter++;
		}


		int[] factors = new int[factorCounter];
		int counter = 1;

		for(int index = 0; index < factors.length; index++){

			while(counter <= number){

				if(number % counter == 0){
					factors[index] = counter;
					counter++;
					break;
				}
				else counter++;
			}
		}
		
		return factors;

	}
/*

	public static void main(String... args){

		int number = -24;

		String answer = Arrays.toString(factors(number));

		System.out.print(answer);

	}

*/

}