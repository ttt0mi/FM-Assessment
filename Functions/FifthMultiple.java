import java.util.Scanner;

public class FifthMultiple{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer to find it's 5th multiple: ");
	int number = input.nextInt();

	System.out.print(Funcs.leapYear(number));


}}