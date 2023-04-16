package day9.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		//	int count = 5;
			//String line =" This is a sample text";
			PrintWriter outputStream  = new PrintWriter(new FileOutputStream("smiley.txt", true));
			System.out.println("Enter three lines of text:");
			Scanner keyboard = new Scanner(System.in);
			String line = null;
			int count;
			   for (count = 1; count <= 3; count++)
			   {
			       line = keyboard.nextLine();
			       outputStream.println(count + " " + line);
			   }
			   outputStream.close();
			   System.out.println("... written to out.txt.");
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
