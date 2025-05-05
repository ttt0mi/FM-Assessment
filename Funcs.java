public class Funcs{

//1
	public int findMultiple(int number){

		return number * 5;
	}


//2
/*	public void int displayPrimeNumbers(){

			

	}
*/

//3
	public String displayAge(int ageYears){

		long ageMonths = ageYears * 12;
		long ageDays = ageYears * 365;
		long ageMinutes = ageYears * 525600;
		long ageSeconds = ageYears * 31536000;

		String age = "Age: " + ageYears + " year(s), " + ageMonths + " months, " + ageDays + " days, " + ageMinutes + " minutes, " + ageSeconds + " seconds.";

		return age;
	}


//4	??


//5	??





//6
	public int computeSumOfNumbers(int number){

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
	public boolean leapYear(int year){

		return year % 4 == 0;
	}

	
}