package day7;

public class Car extends Vehicle {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(" Car is moving on the road");
	}
	
	//Method Overriding
	public void displayVehicleInfo(String name,String owner, String phoneNo) {
		//System.out.println(" Vehicle name : "+name);
		//System.out.println(" Vehicle owner : "+owner);
		super.displayVehicleInfo(name, owner, phoneNo);
		System.out.println("Inside Sub class - Car ");
	}


}
