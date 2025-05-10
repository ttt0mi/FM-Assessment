import java.util.Scanner;

public class DisplayAge{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.print("How old are you mate? ");
	int age = input.nextInt();

	System.out.print(Funcs.displayAge(age));


}}