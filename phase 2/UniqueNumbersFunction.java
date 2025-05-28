public class UniqueNumbersFunction{

	public static int uniqueNumbers(int[] array){

		int sum = 0;
		int noOfUniqueCount = 0;

		for(int index = 0; index < array.length; index++){

			int count = 0;

			for(int innerIndex = 0; innerIndex < array.length; innerIndex++){	
				if(array[index] == array[innerIndex]) count++;
			}
			if(count == 1) ++noOfUniqueCount;
		}

		int[] newArray = new int[noOfUniqueCount];
		int uniqueCount = 0;

		for(int index = 0; index < array.length; index++){

			int count = 0;

			for(int innerIndex = 0; innerIndex < array.length; innerIndex++){		
				if(array[index] == array[innerIndex]) ++count;	
			}
			if(count == 1){ 
				newArray[uniqueCount] = array[index];
				++uniqueCount;
			}
		}

		for(int index = 0; index < newArray.length; index++){
			sum += newArray[index];
		}

		return sum;
	}
}