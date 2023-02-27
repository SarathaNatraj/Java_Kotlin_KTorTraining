package day6.collections;

//Java program to demonstrate the
//working of ArrayList
import java.io.*;
import java.util.*;

class ArrayListDemo {

	// Main Method
	public static void main(String[] args) {

		// Declaring the ArrayList with
		// initial size n
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList arr = new ArrayList<String>();
		
		//ArrayList<E>
		//HashMap<K, V>
		
		ArrayList<Student> stuArrayList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter n ");
		int n = sc.nextInt();
		System.out.println(" enter the student details ::: ");
		for (int i = 0; i < n; i++) {

			int id = sc.nextInt();
			String name = sc.next();

			Student stuObj = new Student(id, name);
			stuArrayList.add(stuObj);
		}

		// ArrayList al = new ArrayList();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			al.add(i);

		// Printing elements
		System.out.println(al);
		
		System.out.println(stuArrayList);

		// Remove element at index 3
		al.remove(3);

		// Displaying the ArrayList
		// after deletion
		System.out.println(al);

		// Printing elements one by one
		for (int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + " " );
		
		
			System.out.println(" METHOD 1 ********** START");
		// Printing elements one by one - method 1
				for (int i = 0; i < stuArrayList.size(); i++) {
					System.out.println(stuArrayList.get(i) + " " );
					Student stu = stuArrayList.get(i); 
					System.out.println("id  : "+stu.getId() + " name : "+stu.getName());
				}
				
				System.out.println(" METHOD 1 ********** END");
				
				System.out.println(" METHOD 2 ********** START");
				//enhanced for loop - method 2, jdk 1.5
				for(Student stu22: stuArrayList) {
				//	System.out.println(stu);
					System.out.println("id  : "+stu22.getId() + " name : "+stu22.getName());
				}
				System.out.println(" METHOD 2 ********** END");
				
				System.out.println(" METHOD 3 ********** START");
				// using listiterator - method 3
				ListIterator<Student> listIterator = stuArrayList.listIterator();
				while(listIterator.hasNext()) {
					Student s = listIterator.next();
					System.out.println(" id ::"
							+ "id : "+s.getId() + " name : "+s.getName());
				}
				System.out.println(" METHOD 4 ********** END");
				
				//using while - method 4
				int index = 0;
				while (stuArrayList.size() > index)
				{
				   System.out.println(stuArrayList.get(index++).getName() );
				}

				
				// lambda expression  - method 5 - java 8 new features
				System.out.println(" METHOD 5 ********** START");
				stuArrayList.forEach(stu1 -> System.out.println(stu1.getName()+"  "+stu1.getId()));
				System.out.println(" METHOD 5 ********** END");

				
				
	}
	
}
