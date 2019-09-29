package oop;

import java.util.Formatter;
import java.util.Scanner;

public class WriteFile {
    
    public static void main(String[] args) {
        
        try{
            Formatter formatter = new Formatter("F:/BasicJava/OOP/Person/Student.txt");
//            formatter.format("%d %s\r\n",101,"Shahajahan");
//            formatter.format("%d %s\r\n",102,"Tuhin");
//            formatter.format("%d %s\r\n",103,"Hira");
//            formatter.format("%d %s\r\n",104,"Jahid");
            int id; String name;
            Scanner input = new Scanner(System.in); 
            System.out.print("how many students : ");
            int num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.println("Enter student id and name : ");
                id = input.nextInt();
                name = input.next();
                formatter.format("%d %s\r\n",id,name);
            }
            formatter.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
