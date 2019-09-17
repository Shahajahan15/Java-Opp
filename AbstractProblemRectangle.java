package oop;

public class AbstractProblemRectangle extends AbstractProblemShape {
    
    // dim1, dim2
    // constructor declare
    AbstractProblemRectangle(double dim1, double dim2){
        super(dim1,dim2);  // constructor calling of super class 
    }
    
    @Override   // abstract method of super class
    void area(){
        double result = dim1 * dim2;
        System.out.println("Rectangle area : "+result);
    }
    
    
}
