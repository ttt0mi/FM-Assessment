public class FirstOccurenceOfChar{

	public static String reverseStr(String word, char letter){

		String newWord = " ";

		for(int index = 0; index < word.length(); index++){

			if(word.charAt(index) == letter){

				for(int newIndex = index; newIndex >= 0; newIndex --){
					newWord += word.charAt(newIndex);
				}

				while(index < word.length()){
					newWord += word.charAt(index);
				}
			}
		}
		return newWord;
	}

	public static void main(String[] args){

		String word = "abcdefg";
		char letter = 'd';

		String answer = reverseStr(word, letter);
		System.out.print(answer);
		
	}

}