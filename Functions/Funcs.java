public class Funcs{

//1
	public static int findMultiple(int number){

		return number * 5;
	}


//2
	public static void displayPrimeNumbers(){

		int primeNumberCounter = 0;

		for(int number = 2; number < Integer.MAX_VALUE ; number++){

			int primeCounter = 0;

			for(int counter = 1; counter <= number; counter++){
				
				if(number % counter == 0) primeCounter++;
			}

			if(primeCounter == 2){
				System.out.println(number);
				primeNumberCounter++;
			}

			if(primeNumberCounter == 50) break;
		
		}

	}


//3
	public static String displayAge(int ageYears){

		long ageMonths = ageYears * 12;
		long ageDays = ageYears * 365;
		long ageMinutes = ageYears * 525600;
		long ageSeconds = ageYears * 31536000;

		String age = "Age: " + ageYears + " year(s), " + ageMonths + " months, " + ageDays + " days, " + ageMinutes + " minutes, " + ageSeconds + " seconds.";

		return age;
	}


//4	
	public static String yearsForDog(String name, int humanYears){

		String dogName = name;

		int dogYears = humanYears * 7;

		String result = dogName + " is " + dogYears + " years old in dog years";

	return result;

	}


//5
	public static void multiplesOf7Not5(){

		String result = "2002";

		for(int number = 2003; number <= 3200; number++){

			if(number % 7 == 0 && number % 5 != 0) result = result + " ," + number;

		}

		System.out.print(result);

	}


//6
	public static int computeSumOfNumbers(int number){

		int eachDigit = 0;
		int sum = 0;

		while(number != 0){

			eachDigit = number % 10;
			number 	/= 10;

			sum += eachDigit;
		}
		return sum;
	}


//7
	public static boolean leapYear(int year){

		return year % 4 == 0;
	}

	
}