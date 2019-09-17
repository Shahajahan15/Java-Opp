package oop;

public class InheritanceMultipleC implements InheritanceMultipleA,InheritanceMultipleB {
    
    @Override
    public void play(){
        System.out.println("I am from Class");
    }
    
    
    public static void main(String[] args) {
        
        InheritanceMultipleC Class = new InheritanceMultipleC();
        Class.play();
    }
}
