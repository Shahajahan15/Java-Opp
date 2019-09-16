package oop;

public class PolymorphismS extends PolymorphismP {
    // area
    double length, width;
    
    @Override
    void Person(){
        System.out.println("I am a Student.");
    }
    
    PolymorphismS(){}
    
    PolymorphismS(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area(){
        System.out.print("Area for S : ");  
        return width*length;
    }
    
    public static void main(String[] args) {
        
        PolymorphismP p = new PolymorphismP();
        p.Person();
        
        p = new PolymorphismT();
        p.Person();
        
        p = new PolymorphismS();
        p.Person();
        
        
        
        
        // dynamic Polymorphism
        PolymorphismP[] a = new PolymorphismP[3];   
        
        a[0] = new PolymorphismP();
        a[1] = new PolymorphismT(10, 20);
        a[2] = new PolymorphismS(10, 20);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i].area());
        }
    }
}
