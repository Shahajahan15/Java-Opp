package oop;

public class AbstractProblemTriangle extends AbstractProblemShape{
    
    // dim1, dim2
    // constructor declare
    AbstractProblemTriangle(double dim1, double dim2){
        super(dim1,dim2);  // constructor calling of super class 
    }
    
    @Override   // abstract method of super class
    void area(){
        double results = 0.5 * dim1 * dim2;
        System.out.println("Triangle area : "+results);
    }
    
    
    public static void main(String[] args) {
        
        AbstractProblemShape shape;
        
        
    }
}
