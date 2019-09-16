package oop;

public class SuperB extends SuperA{
    
    // int a = 10;
    int a = 5;
    
    @Override   // displayM()
    void displayM(){  
        super.displayM();  // super method calling
        System.out.println("Inside SuperB class.");
    }
    
    void displayinfo(){
        System.out.println("A : "+a);   // calling to Instance class
        System.out.println("A : "+super.a);  // calling to super class
    }
    
    // create constructor
    SuperB(){
        super();  // super constructor calling
        System.out.println("B constructor");
        
    }
    
    
    public static void main(String[] args) {
        
        SuperB sb = new SuperB();
        sb.displayinfo();
        
        // Override Method calling here
        sb.displayM();
        
    }
}
