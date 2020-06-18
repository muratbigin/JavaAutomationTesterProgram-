package day13wrapperscopewhiledt;

public class WrapperClass01 {

	public static void main(String[] args) {
		
		int i = Integer.MAX_VALUE;
	    System.out.println(i);// 2147483647
	    
	    int j = Integer.compare(12, 12);
	    System.out.println(j); //0 ==> if the numbers are equal you will get 0 from compare
	    
	    int k = Integer.compare(12, 15);
	    System.out.println(k); //-1 ==> if the first number is less than second 
	                            // it returns -1
	    
	    int l = Integer.compare(21, 12);
		System.out.println(l);//If the first number is greater than the second
                              //it returns 1
		
		boolean bl = Boolean.valueOf(2<1);
		System.out.println(bl);//false
		
		char ch = Character.toLowerCase('A');
		System.out.println(ch);

	    
	    
	}

}
