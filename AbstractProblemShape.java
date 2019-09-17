package oop;

public abstract class AbstractProblemShape {
    
    double dim1, dim2;  // variable declare
    
    // constructor declare
    AbstractProblemShape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    // abstract method declare
    abstract void area();  
    
    
    
    public static void main(String[] args) {
        
        AbstractProblemShape shape;
        shape = new AbstractProblemRectangle(10,20);
        shape.area();

        shape = new AbstractProblemTriangle(10,20);
        shape.area();

        shape = new AbstractProblemCircle(7);
        shape.area();
        
    }
}
