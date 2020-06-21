package day16constructorsdt;

public class Constructors01 {
	
	
	
	// When you create a constructors Java deletes the default one 
	
	Constructors01(){
		
	}
	
	// Create a constructors which has 1 parameter
	Constructors01(int price){
		
	}
	
	// Create a constructors which has 2 parameters
	Constructors01(boolean b, char ch){
		
	}
	
	// Create a constructors which has 2 parameters
	
	Constructors01(char ch, boolean b){
		
	}
	

	public static void main(String[] args) {
		
		//1) Constructors are used to create objects from Classes
		//2) Constructor is not method because : a) Constructors do not have return type
	    //                                     b) Constructors name's starts with upper case
		//3) Constructor's name must be same with the class name but methods'name may be same 
		   //or different with the class name
		//4) Constructors should be inside the class body
		//5) When you create a class, Java creates a constructors for the class. The constructor 
		   // is behind the class, it is invisible inside the class.
		   // The constructor which java created is called "default" constructor"
		   // The variables inside the method/constructor parentheses are called "parameters"
		   // Default constructors do not have any "parameter"s. I mean inside the default constructor 
		       // Parentheses there is no any parameters
		//6) When you create any constructor Java deletes the default one
		
		//                                      TO CREATE AN OBJECT
		
		//  Class name                 Object Name            new keyword             Class Name with parentheses
		
		    Constructors01                obj1        =            new                      Constructors01();

	}
	
	
	              public void add (int num1, String str, boolean bool)  {
	            	  
	              }

}