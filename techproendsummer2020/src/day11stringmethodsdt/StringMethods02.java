package day11stringmethodsdt;

public class StringMethods02 {

	public static void main(String[] args) {
		// 13) trim() method will delete the space characters from the 
		//        beginning and ending of the String
		
		String str = " Java  ";
		//Before trim()
		System.out.println(str);
		System.out.println(str.length());//7
		// After trim()
		System.out.println(str.trim());
		System.out.println(str.trim().length());// 4
		
		
		// 14)indexOf() method returns the index of 1st occurrence of the character
		String s = "Java is easy";
		
		s.indexOf('a'); //1
		System.out.println(s.indexOf('a'));//1
		System.out.println(s.indexOf("s"));//6
 		// in indexOf method you can use String and Chars as parameters
		
		System.out.println(s.indexOf("is")); //5 
		//  if you look for index of multiple characters you will 
		//get the index of first chapters
		
		System.out.println(s.indexOf("x")); //-1
		// -1 because x is not exist in the string 
		
		System.out.println(s.indexOf('a', 4)); //9 
		// After the 4th index(inclusive) what is the index of "a" ==> 9 
		
		System.out.println(s.indexOf(" "));  // 4
		
		System.out.println(s.indexOf('a', 3)); 
		// After the 3th index(inclusive) what is the index of "a" ==> 3 
		// first occurrence 'a' ==> 3
		
		
		// 15) lastIndexOf() Method will return the index of last occurrence 
	    //                  of a characters
		
		
		String t = "Learn java learn";
		t.lastIndexOf('a');
		System.out.println(t.lastIndexOf('a')); // 13
		
		System.out.println(t.lastIndexOf("ar")); //13, it returned the first index
		
		System.out.println(t.lastIndexOf('e', 5)); // 1
		// 
		
		
		

	}

}
