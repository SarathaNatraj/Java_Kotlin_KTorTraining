package day7;

public abstract  class Vehicle {
	
	//method declaration 
	//abstract method - not implemented method
	public abstract void move();
	
	//method definition
	//concrete method - fully implemented method
	public void displayVehicleInfo(String name,String owner, String phoneNo) {
		System.out.println(" Vehicle name : "+name);
		System.out.println(" Vehicle owner : "+owner);
		System.out.println(" Vehicle owner phoneNo :"+phoneNo);
	}

}
