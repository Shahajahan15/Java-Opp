package oop;

public class Inheritance extends InheritanceAs{
    //  Inheritance name, age and display1()
    int role;
    
    void display2() {
        display1();   // Inheritance display1()
        System.out.println("Role : "+role);
        
    }
    
    public static void main(String[] args) {
        
        Inheritance t1 = new Inheritance();
        
        t1.name = "Shahajahan";  // Inheritance name 
        t1.age = 26;             // Inheritance age   
        t1.role = 176;
         
        t1.display2();
    }
}
