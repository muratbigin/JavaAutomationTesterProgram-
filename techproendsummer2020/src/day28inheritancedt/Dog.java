package day28inheritancedt;

public class Dog extends Mammal {
	public Dog() {
		super(); //To call parent constructor we use super();
		         // But it is npt mandatory , typing super() or not
		         // typing super() is same .same It is optional.	
		
		System.out.println("D");
		//super();//If we use super() inside a constructor, it must be
		//in the first line otherwise you will get Compile Time Error.
		
	}
	
public static void main(String[] args) {
	
	Dog dog = new Dog();//AMD
	
//	Insect insect = new Insect();//AI
//	
//	Cat cat = new Cat();//AMC
//	
//	Mammal mammal = new Mammal ();//AM
		

	}

}
