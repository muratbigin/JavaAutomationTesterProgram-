package day32exceptionsdt;

import java.util.Scanner;

public class TryCatchExamples01 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("What's your favorite number?");
		 
		 /*
		  int n =sc.nextInt();
		  System.out.println(n);  ====>      What's your favorite number?
                                             murat
                                             Exception in thread "main" java.util.InputMismatchException
	                                         at java.util.Scanner.throwFor(Scanner.java:864)
	                                         at java.util.Scanner.next(Scanner.java:1485)
	                                         at java.util.Scanner.nextInt(Scanner.java:2117)
	                                         at java.util.Scanner.nextInt(Scanner.java:2076)
	                                         at day32exceptionsdt.TryCatchExamples01.main(TryCatchExamples01.java:12) 
		                           */  
		 
		 
		 
		 
		 //BUT
		 
		 
		 try {
			 int n =sc.nextInt();
			 System.out.println(n);     // ====>  What's your favorite number?
			                            //        murat
			                            //        Sorry, please enter a number
			                            
			                            
			 
		 }catch(Exception e) {
			 System.out.println("Sorry, please enter a number");
		 }
		 
		
		 
		 
		 
		 
		 
		 

	}

}
