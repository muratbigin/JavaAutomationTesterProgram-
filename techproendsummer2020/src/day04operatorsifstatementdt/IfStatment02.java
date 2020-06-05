package day04operatorsifstatementdt;

public class IfStatment02 {

	public static void main(String[] args) {
		
   String password = "JavaLearner";
   
   // == is used just for primitive, do not use == for Strings
   // For Strings we use = method
   if(password.equals("JavaLearner")){
	   System.out.println("The password is true");
   }
     
   if(!(password.equals("JavaLearner"))){
	   System.out.println("The password is false");
   }
		

	
	}

}
