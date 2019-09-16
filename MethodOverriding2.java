package oop;

public class MethodOverriding2 extends MethodOverriding1 {
    
    String Qualification;
    
    @Override
    void displayinfo() {
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Qualification : "+Qualification);
    }
    
    void input(){
        name = "Shahajahan";
        id   = 172;
        Qualification = "Diploma in CSC";
    }
    
    public static void main(String[] args) {
        
        MethodOverriding1 m1 = new MethodOverriding1(); // initiate
        MethodOverriding2 m2 = new MethodOverriding2();
        
        m1.input();
        m1.displayinfo();
        
        System.out.println("");  // MethodOver riding
        m2.input();
        m2.displayinfo();
        
    }
}
