package day27inheritancedt;

public class Rabbit extends Mammal {

	public static void main(String[] args) {
		
		
		Rabbit r = new Rabbit();
		r.eat();
		r.drink();
		r.move();
		r.feed();
		
		System.out.println(r.breathe);


	}

}
