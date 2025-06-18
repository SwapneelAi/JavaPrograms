package stringshw;

public class ReverseString{
	
	public String makeStringRev(String str, String rev_str){
		for(int i = str.length()-1; i >= 0; i--){
			rev_str = rev_str + str.charAt(i);
		}
		return rev_str;
	}
	
	public static void main(String[] args){
		
		String str = "Java";
		String rev_str = "";
		
		ReverseString rev = new ReverseString();
		String reversed = rev.makeStringRev(str, rev_str);
		
		System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
	}

}