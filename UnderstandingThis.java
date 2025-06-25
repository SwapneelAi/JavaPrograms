
class Student2{
	// instance variables
	String name;
	int age;
	static int studentscount;	// static variable
	
	// parameterized constructor
	Student2(String name, int age){
		System.out.println("parameterized constructor called");
		this.name = name;
		this.age = age;
	}
	
	Student2(){
		this("Ram", 28);		// this(...) is a constructor call to another constructor in the same class — it is part of constructor chaining.
		System.out.println("non-parameterized constructor called");
	}
	
	void printInfo()
	{
		System.out.println(name + " " + age);
	}
	
	void printInfoMethod(){
		printInfoMethod(this);
	}
	
	void printInfoMethod(Student2 obj) {
        System.out.println(obj.name + " " + obj.age);
    }
	
	static void newStaticMethod()
	{
		System.out.println(studentscount);
		System.out.println("Static method called");
	}

}

class UnderstandingThis{
	public static void main(String[] args){
		//Student2 st = new Student2("Swapneel", 29);
		//st.printInfo();
		
		Student2 st2 = new Student2();
		st2.printInfo();
		
		Student2 st3 = new Student2("Ram", 23);
		st3.printInfo();
		
		Student2.studentscount = 4;
		
		System.out.println(Student2.studentscount);
		
		System.out.println("Before calling static method");
		Student2.newStaticMethod();
		System.out.println("After calling static method");
		
		
	}
}