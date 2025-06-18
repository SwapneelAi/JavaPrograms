package stringshw;

/// Write a Java Program to Calculate total number of vowels in a String “Hello how are you doing today?”  - post it on your GitHub repo

public class FindVowelsInString{
	
	public void findVowels(String str){
		int vowelCount = 0;

		System.out.print("Vowels are - ");
		// for (int i = 0; i < str.length(); i++) {				prints from start of strings
		for(int i = str.length() - 1; i >= 0; i--){			// prints from end of strings
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				System.out.print(str.charAt(i) + " ");
				vowelCount++;								// calculate the count
			}
		}
		System.out.println("\nTotal vowels: " + vowelCount);
	}
	
	public static void main(String[] args){
		String str = "Hello how are you doing today?";
		
		FindVowelsInString v = new FindVowelsInString();
		v.findVowels(str);
	
	}
}