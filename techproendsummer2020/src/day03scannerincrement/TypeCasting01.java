package day03scannerincrement;

public class TypeCasting01 {

	public static void main(String[] args) {
		
//		byte < short < int < long < float < double
		
//		Auto Widening : To convert small data type to lage data type 
//		Converting small to large is easy/ because of that java can do it automatically
//		you have to type the name of the small daat type before the variable name.
		
		byte num1= 123;
		short num2 = num1;
		
		int num3 = 2345;
		double num4 =num3;

//		Explicit Narrowing;If you convert large data type to small 
		
		long num5 = 657;
		short num6 =(short)num5;
		
		double num7 = 12.56;
		float num8 = (float) num7;
		
		
//		Example
		short num9 = 255;
		byte num10 = (byte) num9; 
		System.out.println(num10); //-1 
		
		
		
	}

}
