package oop;

public class PolymorphismT extends PolymorphismP {
    //  area
    double height, base;
    
    @Override
    void Person(){
        System.out.println("I am a Teacher");
    }
    
    PolymorphismT(){}
    
    // dynamic Polymorphism
    PolymorphismT(double height, double base){  // create constructor
        this.base = base;
        this.height = height;
    }
    
    @Override
    double area(){
        System.out.print("Area for T : ");
        return 0.5*base*height;
    }
    
}
