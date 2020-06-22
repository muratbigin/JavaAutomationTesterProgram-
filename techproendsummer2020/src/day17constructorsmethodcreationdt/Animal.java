package day17constructorsmethodcreationdt;

public class Animal {
	
	
	int age=7;
	String name = "Dog";// Default value for String is "" or null
	boolean mammal; //Default value for booleans is false

	Animal(){
		this(true);// Constructor call must be in the first line every time
		           // Don't use more than 1 constructor inside a constructor
		           // because when you use a second constructor call it can not be 
		           // in the first line.If you do it you will get Compile Time Error
		System.out.println("No parameter");
		
	}
	Animal(boolean mammal){
		
		System.out.println("boolean");
		
	}
	
	Animal(int age, String namel){
		
		System.out.println("int and String");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		

	}

}
