package oop;

public class ProblemBox {
    
    // Instance Variable Hiding
    double height, width, depth; // variable declare
    
    ProblemBox(double height, double width, double depth) { // costructor declare
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    void displayVol(){      // create method to out put display
        double vol = height * width * depth;
        System.out.println("Volume : "+vol);
    }
    
}
