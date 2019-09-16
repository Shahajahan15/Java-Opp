package oop;

public class FinalKeyword {
    
    final String NAME = "BU";
    final int ID;  // Blanck final variable
    static final String DIV;  // Blanck static final variable
    
    FinalKeyword(){   //declare Blanck final variable
        ID = 127;
    }
    
    static{             //declare Blanck static final variable
        DIV = "Dhaka";
    }
    
    void display(){
        System.out.println(NAME);
        System.out.println(ID);
        System.out.println(DIV);
    }
    
    
    
    public static void main(String[] args) {
        
        FinalKeyword fi = new FinalKeyword();
        fi.display();
    }
}
