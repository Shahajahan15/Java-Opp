package oop;

public class SuperB extends SuperA{
    
    // int a = 10;
    int a = 5;
    
    void displayinfo(){
        System.out.println("A : "+a);   // calling to Instance class
        System.out.println("A : "+super.a);  // calling to super class
    }
    
    
    public static void main(String[] args) {
        
        SuperB sb = new SuperB();
        sb.displayinfo();
    }
}
