
class LearnVariables{
	String name = "Swapneel";
	static int rollNo = 100;	
	// 1. static keyword is a modifier used for creating class-level members.
	// 2. When a member (variable, method, block, or nested class) is declared static, it belongs to the class itself rather than to any specific instance (object) of that class
	// 3. As a result, it can be accessed directly using the class name, without instantiating the class.
}

class UnderstandingStaticVariables{
	public static void main(String[] args){
		LearnVariables lv = new LearnVariables();
		System.out.println(lv.name);
		System.out.println(lv.rollNo);
		
		
		LearnVariables lv1 = new LearnVariables();
		System.out.println(lv1.name);
		System.out.println(lv1.rollNo);
		
		lv1.rollNo = 200;
		System.out.println(lv.name);
		System.out.println(lv.rollNo);
		System.out.println(lv1.name);
		System.out.println(lv1.rollNo);
		
		System.out.println(LearnVariables.rollNo);	// by directly using class name
	}
}