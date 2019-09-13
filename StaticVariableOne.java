package oop;

public class StaticVariableOne {
    
    public static void main(String[] args) {
        
        // Constructor Initialize
        StaticKeyword statickeyword = new StaticKeyword("Sagor", 12);
        statickeyword.display(); // method calling
        
        // Non static variable calling
        StaticKeyword nonvariable = new StaticKeyword();
        System.out.println("Division naame : "+nonvariable.div);       
        
        // static variable calling
        System.out.println("Varsity name : "+StaticKeyword.varsity);
        
        // count to static variable
        StaticKeyword count = new StaticKeyword();
        count.toCount();
        
        StaticKeyword count1 = new StaticKeyword();
        count1.toCount();
        
    }
    
}
