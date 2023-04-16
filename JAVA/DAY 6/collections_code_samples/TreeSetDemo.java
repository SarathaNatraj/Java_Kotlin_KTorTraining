package day6.collections;

//Java program to demonstrate the
//working of a TreeSet
import java.util.*;

public class TreeSetDemo {
 
   // Main Method
 public static void main(String args[])
 {
     // Creating TreeSet and
     // adding elements
     TreeSet<String> ts = new TreeSet<String>();

     ts.add("Geeks");
     ts.add("For");
     ts.add("Geeks");
     ts.add("Is");
     ts.add("Very helpful");

     ts.size();

     // Traversing elements
     Iterator<String> itr = ts.iterator();
     while (itr.hasNext()) {
         System.out.println(itr.next());
     }
 }
}