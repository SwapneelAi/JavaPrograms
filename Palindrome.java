package stringshw;
import java.util.Scanner;

public class Palindrome{
	
	public void checkPalindrome(String str){
		int i = 0; int j = str.length() - 1;
		while (i < j){
			if (str.charAt(i) != str.charAt(j)){
				System.out.print(str + " is not Palindrome");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.print(str + " is Palindrome");
	}
	
	public static void main(String[] args){
		String str;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String - ");
		str = scanner.nextLine();
		
		Palindrome p = new Palindrome();
		p.checkPalindrome(str);
	}
}