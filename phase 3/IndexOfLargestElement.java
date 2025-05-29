public class IndexOfLargestElement{

	public static int occurence(int[] numbers){

		int maximum = Integer.MIN_VALUE;
		int answer = 0;

		for(int index = 0; index < numbers.length; index++){
			if (numbers[index] > maximum){
				maximum = numbers[index];
				answer = index;
			}
		}
		return answer ;
	}
/*
	public static void main(String... args){

		int[] numbers = {1, 2, 7, 4, 5, 6};

		System.out.print(occurence(numbers));

	}
*/
}