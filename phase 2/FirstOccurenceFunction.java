public class FirstOccurenceFunction{

	public static int[] occurence(int[] array){

		int noOfUniqueCount = 0;

		for(int index = 0; index < array.length; index++){

			int count = 0;

			for(int innerIndex = 0; innerIndex < array.length; innerIndex++){	
				if(array[index] == array[innerIndex]) count++;
			}
			if(count <= 2) ++noOfUniqueCount;
		}

		int[] newArray = new int[noOfUniqueCount];
		int uniqueCount = 0;

		for(int index = 0; index < array.length; index++){

			int count = 0;

			for(int innerIndex = 0; innerIndex < array.length; innerIndex++){		
				if(array[index] == array[innerIndex]) ++count;	
			}
			if(count <= 2){ 
				newArray[uniqueCount] = array[index];
				++uniqueCount;
			}
		}
	
		return newArray;
	}
}