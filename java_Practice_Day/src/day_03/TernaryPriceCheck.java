package day_03;

public class TernaryPriceCheck {

	public static void main(String[] args) {
		
		
		/*
		 * Write a code using ternary: Create int variable : price Create string
		 * variable : decision If the price <= $10 
		 * Print “cheap” 
		 * If price is 10-$20 print“ok” 
		 * Otherwise “expensive”.
		 */
		
		int price = 100;
		String decision;
		
		if(price>=1&&price<=10) {
			decision="cheap";
			//System.out.println("cheap");
		}else {
			if(price>=11 && price <=20) {
				decision="ok";
			}else {//price will be more than 20
				decision="expensive";
			}
		}
		
		System.out.println(decision);
		
		
		
		///////////////////
		
		
		/*
		 * Write a code using ternary: Create int variable : price Create string
		 * variable : decision If the price <= $10 
		 * Print “cheap” 
		 * If price is 10-$20 print“ok” 
		 * Otherwise “expensive”.
		 */
		
		int price1 = 5;
		String decision1;
		
		if(price1>=1&&price1<=10) {
			decision1="cheap";
			//System.out.println("cheap");
		}else {
			if(price1>=11 && price1 <=20) {
				decision1="ok";
			}else {//price will be more than 20
				decision1="expensive";
			}
		}
		
		System.out.println("Decission with if "+decision1);
		
		//SOLVING WITH TERNARY
		decision1=(price1>=1&&price1<=10)?"cheap" 
				:(price1>=11 && price1 <=20)?"ok"
						:"expensive";
		System.out.println("Decision with ? "+decision1);


	}

}
