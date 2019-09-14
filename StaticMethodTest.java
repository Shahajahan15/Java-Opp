package oop;

public class StaticMethodTest {
    
    public static void main(String[] args) {
        
        // initialize StaticMethod class
        StaticMethod ob = new StaticMethod();
        ob.nonStatic(); // calling nonStatic
        
        // initialize StaticMethod method here
        StaticMethod.staticMethod();
        
        // Initialize Static method
        StaticMethod.display();
        
    }
    
}
