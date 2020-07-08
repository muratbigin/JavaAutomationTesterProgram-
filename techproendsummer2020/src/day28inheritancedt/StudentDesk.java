package day28inheritancedt;

public class StudentDesk extends Classroom{
	
	boolean broken = false;

	public static void main(String[] args) {
		
		
		
		/*
		 If you have variables whose names are same to understand which one 
		 will be used you should look at the data type of the object.
		 In the following example: if data type of "std1" is StudentDesk the output
		 will be "false", if data type of "std1"is Classroom the output will be "true"
		 */
		
		
		
		
		/*
		 If you have variables whose names are same to understand which one 
		 will be used you should look at the data type of the object.
		 In the following example: if data type of "std1" is StudentDesk the output
		 will be "false", if data type of "std1"is Classroom the output will be "true"
		 */
		
		StudentDesk std1 = new StudentDesk();
		System.out.println(std1.broken);//StudentDesk==>false;
		System.out.println(std1.area);//300
		System.out.println(std1.initial);//B
		
		std1.desk();//New desk
		
		Classroom std2 = new StudentDesk();
		 System.out.println(std2.broken); //Classroom==>true;
		 System.out.println(std2.area);//300
		 System.out.println(std2.initial);//B
		 
		 std2.desk();//New desk
		 
		 School std3 = new StudentDesk();
		 System.out.println(std3.area);//400000
		 
		 
		 Classroom std4 =new Classroom();
		 std4.desk();//Classroom desk
		
	}
	
	
	public void desk() {
		System.out.println("New desk");
	}

}
