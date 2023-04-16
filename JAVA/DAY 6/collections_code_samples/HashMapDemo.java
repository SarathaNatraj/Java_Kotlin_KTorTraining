package day6.collections;

//Java program to demonstrate the
//working of a HashMap
import java.util.*;

public class HashMapDemo {
 
   // Main Method
 public static void main(String args[])
 {
     // Creating HashMap and
     // adding elements
     HashMap<Integer, String> hm = new HashMap<Integer, String>();

     hm.put(1, "Geeks");
     hm.put(2, "For");
     hm.put(3, "Geeks");

     // Finding the value for a key
     System.out.println("Value for 1 is " + hm.get(1));

     // Traversing through the HashMap - METHOD - 1
     for (Map.Entry<Integer, String> e : hm.entrySet())
         System.out.println(e.getKey() + " " + e.getValue());
     
     
     //METHOD - 2 lambda expression
    hm.forEach((k,v)->System.out.println("key: " + k + ", value: " + v));

 }
}
