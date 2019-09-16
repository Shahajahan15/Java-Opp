package oop;

public class SuperB extends SuperA{
    
    // int a = 10;
    int a = 5;
    int height;
    
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
    
    SuperB(String c, int w, int h){
        super(c,w);  // calling the constructor SuperA
        height = h;
    }
    
    @Override       // displayS  Overriding
    void displayS() {   
        super.displayS();  // calling the displayS method
        System.out.println("Height : "+height);
    }
    
    
    public static void main(String[] args) {
        
        SuperB sb = new SuperB();
        sb.displayinfo();
        
        // Override Method calling here
        sb.displayM();
        
        // create Override method constructor and calling
        System.out.println("");
        SuperB finals = new SuperB("Green",25,26);
        finals.displayS();
    }
}
