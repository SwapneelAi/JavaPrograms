package stringshw;


public class LearnStrings{
	public static void main(String[] args){
		String name1 = "Swapneel";			// Declaration of Strings
		String name2 = new String("Swapneel");		
		String name3 = "Swapneel";
		String str = "Hello java world";
		
		
		System.out.println("Name1 - " + name1);
		System.out.println("Name2 - " + name2);
		System.out.println("Name3 - " + name3);
		
		// == operator: points to the reference of obbject i.e. memory address
		System.out.println("name1 == name2 -> " + (name1 == name2));		// false: name2 is a new object
		System.out.println("name1 == name3 -> " + (name1 == name3));		// true: both refer to same object in string pool
		System.out.println("name1 == name3 -> " + (name2 == name3));		// false: name2 is a new object
		
		
		if (name1 == name2){
			System.out.println("true: name1 & name2 are same objects");
		}else {
			System.out.println("false: name1 & name2 are diffrent objects");
		}
		
		if(name1 == name3){
			System.out.println("true: name1 & name3 are same objects");
		}else {
			System.out.println("false: name1 & name3 are diffrent objects");
		}
	
		
		// equals(): compairs the values stores in a string variable
		System.out.println("name1.equals(name3): " + name1.equals(name3));
		System.out.println("name1.equals(name2): " + name1.equals(name2));
		
		
		// function -> length()
		System.out.println("length of string - " + name1.length());
		
		// function -> charAt
		System.out.println("charAt - " + name1.charAt(4));	// character at perticular index.
		
		// function -> toUpperCase() and toLowerCase()
		System.out.println("UpperCase - " + name1.toUpperCase());
		System.out.println("UpperCase - " + name1.toLowerCase());
		
		// function -> trim()
		System.out.println("Trimmed: '" + name1.trim() + "'");
		
		// function -> indexOf()
		System.out.println("Index of str - " + str.indexOf("java"));		// it will calculate spaces also
		

		
		
		
		
		
		
		
	
		


		
		
	}


}