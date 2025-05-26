import java.util.Arrays;

public class SortedSquaredArray{

	public static String squaresort(int [] numbers){

		int holder = 0;	
		for(int index1 = 0; index1 < numbers.length; index1++){
			for(int index2 = 0; index2 < numbers.length; index2++){
				if(numbers[index1] < numbers[index2]){
					holder = numbers[index2];
					numbers[index2] = numbers[index1];
					numbers[index1] = holder;
				}
			}	
		}
		for(int index = 0; index < numbers.length; index++){
			numbers[index] *= numbers[index];
		}
		return Arrays.toString(numbers);
	}
/*
	public static void main(String... args){

		int[] numbers = {9, -2, -7, 0, 5};

		String answer = Arrays.toString(squaresort(numbers));
		System.out.print(answer);
	}
*/
}