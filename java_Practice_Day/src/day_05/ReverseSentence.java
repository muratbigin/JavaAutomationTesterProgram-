package day_05;

public class ReverseSentence {
	
	
//	!Create a method: reverseString
//	!It should accept a string sentences
//	! And return the reverse of that string sentences.
//	! E.g:
//	!String str ="I love Java";
//    !Output:"Java love I”

	public static void main(String[] args) {
		
		

		
			String input ="I love Java";
			System.out.println(reverseString(input));
		}
		
		static String reverseString(String input) {
			String output ="";
			String[] arr = input.split(" ");
			for(int w=arr.length-1;w>=0;w--) {
				output+=arr[w]+" ";
			}
			return output;
		}

}
