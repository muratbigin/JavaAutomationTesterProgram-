package day28inheritancedt;

public class Mammal extends Animal{
	public Mammal() {
		super("Jhonny"); //	A with P ==> because we called Animal constructor wit super();	
		
		System.out.println("M");
	}
	
	public Mammal(String name) {
		System.out.println("M with P");
	}
	

	public static void main(String[] args) {
		
		Mammal mammal = new Mammal();

	}

}
