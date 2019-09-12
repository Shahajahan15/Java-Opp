package oop;

public class Teacher {
    
    String name, gender;
    int phone;
    
    // Constructor Declare
    Teacher(String n, String g, int ph) {
        name = n;
        gender = g;
        phone = ph;
    }
    
    // create method
    void displyInfo() {
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("phone : " +phone);
        System.out.println("");
    }
    
    // Parameter Passing by method
    void setInfo(String n, String m, int ph) {
        name = n;
        gender = m;
        phone = ph;
    }
}
