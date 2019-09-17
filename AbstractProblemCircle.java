package oop;

public class AbstractProblemCircle extends AbstractProblemShape{
    
    // dim1, dim2
    double r;
    
    // constructor declare
    AbstractProblemCircle(double r){
        super(r,r);  // constructor calling of super class 
    }
    
    @Override    // abstract method of super class
    void area(){
        double result = 3.1416 * dim1 * dim2;
        System.out.println("Circle area : "+result);
    }
}
