public class NumberFrequency{

	public static boolean indexFreq(String digits){

		int confirm = 0;	

		for(int index = 0; index < digits.length(); index++){

			int freqCounter = 0;

			for(int check = 0; check < digits.length(); check++){
				
				if(index == Character.getNumericValue(digits.charAt(check))){
					freqCounter++;
				}
			}
			
			if(freqCounter == Character.getNumericValue(digits.charAt(index))){
				confirm++;
			}
		}

		if(confirm == digits.length()) return true;
		else return false;

	}
/*
	public static void main(String... args){

		String numbers = "1210";

		System.out.print(indexFreq(numbers));
		
	}
*/
}