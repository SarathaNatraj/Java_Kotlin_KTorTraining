package day7;

import java.util.Scanner;

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber = 10, secondNumber=0;
		try {
			
		Scanner sc = new Scanner(System.in);
		
		Car c = new Car();
		c.move();
		c.displayVehicleInfo("Swift", "Prakash", "32872372387");
		
		Boat b = new Boat();
		b.move();
		b.displayVehicleInfo("Audi", "Ajay", "45454885555");
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}

