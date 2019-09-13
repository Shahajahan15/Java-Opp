package oop;

public class StaticKeyword {
    
    String name;
    int id;
    static String varsity = "BU";
    String div = "Dhaka";
    static int count = 0;
    
    // Empty Constructor  declare to count variavle
    StaticKeyword(){
        count++;
    }
    
    // to count 
    void toCount() {
        System.out.println("Total count : "+count);
    }
    
    // Constructor declare
    StaticKeyword(String n, int i) {
        name = n;
        id = i;
    }
    
    // Method declare
    void display() {
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("Varsity Name :"+varsity);
    }
}
