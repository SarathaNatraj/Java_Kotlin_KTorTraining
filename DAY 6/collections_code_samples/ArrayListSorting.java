package day6.collections;

import java.util.*;

public class ArrayListSorting  {

	public static void main(String args[]){

		//Declaring an arrayList with Employee reference type
	   ArrayList<Employee> arraylist = new ArrayList<Employee>();
	   arraylist.add(new Employee(223, "Chaitanya", 26,10000));
	   arraylist.add(new Employee(245, "Rahul", 24, 20000));
	   arraylist.add(new Employee(209, "Ajeet", 32, 5000));
	   arraylist.add(new Employee(210, "AjeetR", 20, 50000));
	   arraylist.add(new Employee(211, "AjeetB", 17,3000));

	  Collections.sort(arraylist);

	   for(Employee emp: arraylist){
			System.out.println(emp);
	   }

	//sort employees array using Comparator by Salary
		Collections.sort(arraylist, Employee.SalaryComparator);
		System.out.println("Employees list sorted by Salary:\n"+arraylist);

//sort employees array using Comparator by Age
		Collections.sort(arraylist, Employee.AgeComparator);
		System.out.println("Employees list sorted by Age:\n"+arraylist);

//sort employees array using Comparator by Name
		Collections.sort(arraylist, Employee.NameComparator);
		System.out.println("Employees list sorted by Name:\n"+arraylist);


	}
}

