package day35interfacedt;

public class King extends Hotel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void breakfast() {
      System.out.println("Breakfast for kings");		
	}

	@Override
	public void clean() {
		System.out.println("Clean the room for kings");	
	}
	
	public void tea() {
		System.out.println("Tea, twice in a day ");
	}


}
