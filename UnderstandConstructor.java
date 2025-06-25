
// class -> blueprint which contain properties (Instance variable) & behavior (methods)
class Vehicle{
	//Instance variables -> the variable which declares inside class only
	String model;
	String company_name;
	double price;
	
	/* 
	Types of contructors -> A constructor in Java is a special method that is used to initialize objects of a class
		1. Default contructor
		2. Non-parameterized contructor
		3. Parameterized	contructor
		4. Copy contructor
	*/
	
	// Non-parameterized contructor
	Vehicle(){
		System.out.println("Non-parameterized contructor called");
		model = "Hilux";
		company_name = "Toyota";
		price = 4000000;
	}
	
	// Parameterized contructor
	Vehicle(String model, String company_name, int price){
		System.out.println("Parameterized contructors called");
		this.model = model;
		this.company_name = company_name;
		this.price = price;
	}
	
	// Copy contructor
	Vehicle(Vehicle v){
		System.out.println("Copy contructor called");
		this.model = v.model;
		this.company_name = v.company_name;
		this.price = v.price;
	}
	
	void details(){
		System.out.println("Model: " + model + "\ncompany_name: " + company_name + "\nPrice: " + price);	// null 0 0.0
	}
}

public class UnderstandConstructor{
	public static void main(String[] args){
		Vehicle v = new Vehicle();
		v.details();
		
		Vehicle v1 = new Vehicle("Nexon", "Tata", 1300000);
		v1.details();
		
		Vehicle v2 = new Vehicle(v1);
		v2.details();
	}
	
}