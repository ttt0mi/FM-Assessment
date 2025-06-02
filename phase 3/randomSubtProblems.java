import java.util.Scanner;
import java.util.Random;

public class randomSubtProblems{

	public static int subtract(int number1, int number2){
		return number1 - number2;
	}


	public static void main(String... args){

		Scanner input = new Scanner(System.in);
		Random r = new Random();

		int scoreCounter = 0;
		int questionCounter = 0;

		while(questionCounter < 10){

			int numb1 = r.nextInt(1, 101);
			int numb2 = r.nextInt(1, numb1);

			for(int attempt  = 0; attempt < 2; attempt++){
	
				System.out.printf("what is %d minus %d? ", numb1, numb2);
				int answer = input.nextInt();

				if(subtract(numb1, numb2) == answer){
					System.out.println("nice!");
					scoreCounter++;
					break;
				}
				else System.out.println("oops, wrong");
			}

			questionCounter++;
		}

		System.out.printf("Your score is %d", scoreCounter);

}}

