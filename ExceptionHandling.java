package oop;

import java.util.Scanner;

public class ExceptionHandling {
    
    public static void main(String[] args) {
        
       try{
           int a = 10;
           int b = 0;
           int result = a/b;
           System.out.println("Result : "+result); 
       }
       catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception : "+e);
        }
       catch (ArithmeticException e1) {
            System.out.println("Exception : "+e1);
        }
        finally{
        System.out.println("Exception checking");
        }
       
       // execute not stop when found exception 
        int count = 1;
            do {
                try{
                Scanner input = new Scanner(System.in);        
                System.out.print("Enter num1 : ");
                int num1 = input.nextInt();
                System.out.print("Enter num2 : ");
                int num2 = input.nextInt();
                int result = num1/num2;
                System.out.println("Result:"+num1+"/"+num2+" = "+result);
                count = 2;
           }
           catch(Exception e){
               System.out.println("Exception : "+e);
               System.out.println("Enter Integer number, try again");

           }
        } while (count == 1);  
            
    }
}
