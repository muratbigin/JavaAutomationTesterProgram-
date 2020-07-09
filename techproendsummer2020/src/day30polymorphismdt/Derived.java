package day30polymorphismdt;

public class Derived {

	public void getDetails(String temp) {
		System.out.println("Deruved class " + temp);
	}

}


class Test extends Derived{
	
	
//	public int getDetails(String temp) {
//		System.out.println("Test class "+ temp);
//		return 0;
//	}
//}

public int getDetails(int temp) {
	System.out.println("Test class "+ temp);
	return 0;
}
}
