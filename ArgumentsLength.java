package oop;

import java.util.Scanner;

public class ArgumentsLength {
    
    // variable length arguments here
    void varargs(int ... num) {
        
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        
        System.out.println("Sum : "+sum);
    }
    
    // factorial recursion function
    int recursion(int n) {
        
        if (n == 1) {
            return 1;
        }
        else
        {
            return n * recursion(n-1);
        }
    }
    
    public static void main(String[] args) {
        
        ArgumentsLength argulen = new ArgumentsLength();
        // variable length arguments here
        argulen.varargs(4,5);
        argulen.varargs(4,5,9);
        argulen.varargs(4,5,18);
        argulen.varargs(4,5,27);
        argulen.varargs(4,5,27, 40);
        
        
        // factorial recursion function initialize here
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter any Integer number : ");
        int n = input.nextInt();
        int result = argulen.recursion(n);
        System.out.println("Recurtion of "+n+" is : "+result);
    }
    
}
