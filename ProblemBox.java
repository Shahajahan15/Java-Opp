package oop;

public class ProblemBox {
    
    double height, width, depth; // variable declare
    
    ProblemBox(double h, double w, double d) { // costructor declare
        height = h;
        width = w;
        depth = d;
    }
    
    void displayVol(){      // create method to out put display
        double vol = height * width * depth;
        System.out.println("Volume : "+vol);
    }
    
}
