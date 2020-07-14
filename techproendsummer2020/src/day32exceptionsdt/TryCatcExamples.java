package day32exceptionsdt;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatcExamples {

	public static void main(String[] args) {
		
		
//		int a[]= {3,4,7};
//		System.out.println(a[3]); ===> //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
//                                ===> //at day32exceptionsdt.TryCatcExamples.main(TryCatcExamples.java:9)
		
		
		try {
			int a[]= {3,4,7};
			System.out.println(a[3]);
		}catch(Exception e) {
			System.out.println("An exception happened!");
		}
		
		
		//But 
		
	
		
		try {
			int a1[]= {3,4,7};
			System.out.println(a1[3]);
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
		// when we use TryCatch blocks Java Program will not stop
		
		System.out.println("MAhmut abe");
		
		
		int a3[]= {3,4,7};
		System.out.println(a3[0]);
		
		
		
	}

}
