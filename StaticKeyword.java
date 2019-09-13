package oop;

public class StaticKeyword {
    
    String name;
    int id;
    static String varsity = "BU";
    String div = "Dhaka";
    
    // Empty Constructor  declare
    StaticKeyword(){}
    
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
