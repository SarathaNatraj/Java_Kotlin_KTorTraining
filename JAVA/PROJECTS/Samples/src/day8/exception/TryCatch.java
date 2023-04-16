package day8.exception;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import day7.Boat;
import day7.Car;

public class TryCatch {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		int firstNumber = 10, secondNumber=0;
		String name="Reema";
		int numArray[] = new int[5];
		try {
			System.out.println(" Going to perform division operation");
			System.out.println("name Length "+name.hashCode());
			int result = firstNumber/secondNumber;
			System.out.println(" After performing division operation "+result);
			numArray[2]=6;
			System.out.println(" Accessing 6th element int array "+numArray[6]);
		}catch (NullPointerException ne) {
			// TODO: handle exception
			System.out.println(" name cannot be null");
			ne.printStackTrace();
			
			
			
			
		//	throw e;
		}catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println(" SecondNumber cannot be zero"+ae.hashCode());
			ae.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				finally {
			//Clean up code , closing database connection, file objects
			System.out.println(" Inside finally ");
		}

	}

}
