import java.util.Scanner;

public class HumanToDogYears{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a name: ");
	String dogName = input.next();

	System.out.print("Enter it`s age in human years: ");
	int years = input.nextInt();

	System.out.print(Funcs.yearsForDog(dogName, years));


}}