package oop;

import java.util.Scanner;

public class Teacher {
    
    String name, gender;
    int phone;
    String year;
    
    // Constructor Declare
    Teacher () {  }
    
    //  Overloading Constructor Declare
    Teacher(String n, String g, int ph) {
        name = n;
        gender = g;
        phone = ph;
    }
    
    //  Overloading Constructor Declare
    Teacher(String n, String g, String a) {
        name = n;
        gender = g;
        year = a;
    }
    
    // create method
    void displyInfo() {
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("phone : " +phone);
        System.out.println("Age : " +year);
        System.out.println("");
    }
    
    // Parameter Passing by method
    void setInfo(String n, String m, int ph) {
        name = n;
        gender = m;
        phone = ph;
    }
    
    //  Returning a value from method
    int returningValueMethod(int value) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Integer number : ");
        value = input.nextInt();
        return value*value;
        
    }
}
