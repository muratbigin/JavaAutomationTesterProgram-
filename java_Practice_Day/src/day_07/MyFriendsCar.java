package day_07;

public class MyFriendsCar extends Vehicle {
//  Now complete the task:
//  Create a class MyFriendsCar and extend Vehicle
//  create 1 int variable :price and assign a value
//  Then create a method :selling() and print This car is for sale and price is price
//  and print assign and print all of the information of the car
	
	int price=50000;
	public void selling() {
		System.out.println("This car is for sale and price is : "+  price);
	}
	
	public static void main(String[] args) {
		
		MyFriendsCar myFriendsCar = new MyFriendsCar();
		myFriendsCar.model="BMW";
		myFriendsCar.year=2007;
		myFriendsCar.mileage=120000;
		
		System.out.println(myFriendsCar.price
				+"\n"+myFriendsCar.model
				+"\n"+myFriendsCar.year
				+"\n"+myFriendsCar.mileage);
		
		myFriendsCar.selling();
		myFriendsCar.drive();
		myFriendsCar.oilChange();
		
		//How can i print doUber inside MyCar class
		// By extending MyCar or By creating MyCar object
		//
		
		MyCar mycar = new MyCar();
		mycar.doUber();
		
		
		
	}

}
