package oop;

import java.text.DecimalFormat;

public class DecimalNumberFormatting {
    
    public static void main(String[] args) {
        
        double a = 4.40422356;
        System.out.printf("a : %.2f\n",a); // like c programming
        // java programming 
        DecimalFormat ob = new DecimalFormat("0.00"); 
        String x = ob.format(a);
        System.out.println("double : "+x);
        
    }
    
}
