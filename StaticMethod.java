package oop;

public class StaticMethod {
    
    // non static method declare
    void nonStatic() {
        System.out.println("I am not Static method");
    }
    
    // Static method declare
    static void staticMethod() {
        System.out.println("I am static Method");
    }  
    
    //  Static block start here
    static int id;
    static String name;
    
    static{  // create static block
        id = 132;
        name = "shahajahan";
    }
    
    static void display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }
}
