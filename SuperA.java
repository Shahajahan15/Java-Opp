package oop;

public class SuperA {
    
    int a = 10;
   String color;
   int width;
    
    void displayM(){
        System.out.println("Inside SuperA class.");
    }
    
    // create constructor
    SuperA(){
        System.out.println("A constructor");
    }
    
    SuperA(String c, int w){  // Overload constructor to parameter passing
        color = c;
        width = w;
    }
    
    void displayS(){ 
        System.out.println("Color : "+color);
        System.out.println("Width : "+width);
    }
}
