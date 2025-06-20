package stringshw;

// Check if a string is a palindrome Example: Input: "madam" Output: true

import java.util.Scanner;

public class StringPalindrome{
	
	// 1. Reverse a string
	public String reverseString(String str){
		String rev_string = "";
		for (int i = str.length()-1; i >= 0; i--){
			rev_string = rev_string + str.charAt(i);
		}
		return rev_string;
	}
	
	// 2. check using if-else & .equals() 
	public void checkPalindromeOrNot(String str){
		String reversed = reverseString(str);
		if (reversed.equals(str)){
			System.out.print(str + " is palindrome");
		}else{
			System.out.print(str + " is not palindrome");
		}
	}
	
	public static void main(String[] args){
		String str;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string - ");
		str = scanner.nextLine();
		
		StringPalindrome sp = new StringPalindrome();
		sp.checkPalindromeOrNot(str);
	}
}