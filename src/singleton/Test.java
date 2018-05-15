package singleton;

public class Test {

	public static void main(String[] args){
		
		SingletonCar theCar = SingletonCar.getInstance();
		theCar.setDescription("New ferrari amazing vehicle");
		
		System.out.println("Car = " + theCar.getDescription());
	
		SingletonCar otherCar = SingletonCar.getInstance();
		//SAME VEHICLE FOR THIS ONE!
		System.out.println("Car = " + otherCar.getDescription());
	
	}
}
