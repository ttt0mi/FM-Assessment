import java.util.Scanner;

public class SumOfDigitsInANumber{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int number = input.nextInt();

	System.out.print(Funcs.computeSumOfNumbers(number));


}}