package oop;

public class Teacher {
    
    String name, gender;
    int phone;
    
    // create method
    void displyInfo() {
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("phone : " +phone);
    }
    
    // Parameter Passing by method
    void setInfo(String n, String m, int ph) {
        name = n;
        gender = m;
        phone = ph;
    }
}
