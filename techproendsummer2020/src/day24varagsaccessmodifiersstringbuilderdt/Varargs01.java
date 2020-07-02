package day24varagsaccessmodifiersstringbuilderdt;

public class Varargs01 {

	public static void main(String[] args) {
		
		/*
		 sometimes we need flexible number of parameters
		 if you use varargs as a parameter in a method, you method runs for 
		 every number of arguments
		 To create a varargs use "..."after the data type. The syntax is like "int... x"
		 Varargs is actually an array because of that in varargs we use Array methods
		 Varargs is like a bottomless pit, you can put infinitely many number of elements
		 into it, there is no any limit. 
		 If you want do not put any element into a varargs, it is fine because empty
		 array is fine
		 
		 
		 
		 Rule 1: if you use varargs in a method it must be the last parameter.
		         if you use varargs at the beginning or 

		 */
		
		add();//0
		add(2);//2
		add(2,3);//5
		add(2,3,4);//9
		add(2,3,4,5,6,7,8,9);//44
		
		
		mrt('a','b','d'); //d because into the for last words is gonna be d 
		mrt('2');
		
		num("A",'a','b'); //2 because c.length for char
		
		num1(3,4,5.6);// didnt work 
		
		str("A",'b');
		
		
		
		

	}
	
	public static void add(int... x) { // if don't put in (...) java is not going to accept this method
		int sum =0;
		for(int w: x) {
			sum=sum+w;
		}
		System.out.println(sum);
		
	}
	
	
	/*
	 Create a method 
	 The method will accept the characters and return the characters after joining
	 The method should run for every number of characters
	 For example; a, l, i ==> ali 
	 */

	
	
	public static void mrt(char... k) {
		
		 char mrt1 =0;
		 
		 for(char w : k) {
			 mrt1=w;
		 }
		
		System.out.println(mrt1);
	}
	
	
//	public static void test(int i, short j, double... k) {
//		
//	}
	
	
	public static int num(String s, char... c) {
		return c.length;
		
	}
	
	
	public static int num1(int s, double... b) {
		return b.length;		
	}
	
	
	public static void str(String s, char... c) {
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
