package day26encapsulationdt;

public class E02 {

	public static void main(String[] args) {
	 
		
		E03 objm = new E03();
		E01 obj1 = new E01();
		System.out.println(obj1.retired);//false
		
		System.out.println(obj1.getName());//Murat Bigin
		
		//Before updating salary
		System.out.println(obj1.getSalary());//80000
		
		//Updating salary
		obj1.setSalary(90000);
		
		//After updating salary
		System.out.println(obj1.getSalary());//90000
		
		System.out.println(objm.getDisease());
	


	}

}