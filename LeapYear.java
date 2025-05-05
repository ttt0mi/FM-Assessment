import java.util.Scanner;

public class LeapYear{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	Funcs funcs = new Funcs();

	System.out.print("Enter a year: ");
	int numb1 = input.nextInt();

	System.out.print(funcs.leapYear(numb1));


}}