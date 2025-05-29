import java.util.Arrays;

public class TransposedArray{

	public static int[][] reverse(int[][] numbers){

		int[][] newNumbers =new int[numbers.length][numbers[0].length];


		for(int index = 1; index < numbers.length; index++){

			for(int innerIndex = 0; innerIndex < numbers.length; innerIndex++){
			
				newNumbers[index][innerIndex] = numbers[index][innerIndex];

			}
		}


		for(int index = 0; index < numbers.length - 1; index++){

			for(int innerIndex = 0; innerIndex < numbers.length; innerIndex++){
			
				newNumbers[index][innerIndex] = numbers[index][innerIndex];

			}
		}


		int[][] tNumbers = new int [newNumbers[0].length][newNumbers.length];


		for(int index = 0; index < newNumbers.length; index++){

			for(int innerIndex = 0; innerIndex < newNumbers[0].length; innerIndex++){
			
				tNumbers[innerIndex][index] = newNumbers[index][innerIndex];

			}
		}
		return tNumbers;

	}
/*

	public static void main(String... args){

		int[][] numbers = {{1, 2, 3}, {4, 5, 6}};

		String answer = Arrays.toString(reverse(numbers));

		System.out.print(answer);

	}
*/
}