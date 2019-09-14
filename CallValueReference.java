package oop;

public class CallValueReference {
    
    // call by value
    void callvalue(int i) {
        i = 20;
    }
    
    
    //call by reference here
    String name;
    void change(CallValueReference r2) {
        
        r2.name = "Shahajahan";
        
    }
    
    public static void main(String[] args) {
        
        // // call by value here 
        CallValueReference val = new CallValueReference();
        int x = 10;  // primitive data
        System.out.println("x before call : "+x);
        
        val.callvalue(x);
        System.out.println("x after call : "+x);
        
        //call by reference here
        CallValueReference r1 = new CallValueReference();
        r1.name = "Tuhin";

        System.out.println("Before calling : "+r1.name);
        
        r1.change(r1);
        System.out.println("After calling : "+r1.name);
    }
    
}
