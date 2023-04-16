package day9.functionalinterface;

import java.util.*;
@FunctionalInterface
interface PersonalGreet{
    String greeting(String name);
}
public class MyClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("May I please know your Name?");
        String name = sc.next();
        
        //
        PersonalGreet hello = (String temp) -> "Hello! "+temp;
        System.out.println(hello.greeting(name));
    }
}

