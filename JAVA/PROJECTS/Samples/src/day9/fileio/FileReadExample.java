package day9.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileReadExample {
	public static void main(String[] args) {
		String fileName = null; // outside try block, can be used in catch
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter file name:");
			fileName = keyboard.next();
			System.out.println(" Reading from the file");
			BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
			int count = 0;
			String line = inputStream.readLine();
			while (line != null) {
				count++;
			//	System.out.println(line);
				// outputStream.println(count + " " + line);
				System.out.println(" ************************ ");
				StringTokenizer wordFinder = new StringTokenizer(line);// the second argument is a string of the 4
																		// delimiters
				while (wordFinder.hasMoreTokens()) {
					System.out.println(wordFinder.nextToken());
				}
				System.out.println(" ************************ ");
				line = inputStream.readLine();
			}

			System.out.println(" no of lines :" + count);
			// . . . code for reading second line not shown here . . .
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("File " + fileName + " not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error reading from file " + fileName);
		}
	}

}
