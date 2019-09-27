package oop;

public class AnonymousClass extends InheritanceAs {
    
    public static void main(String[] args) {
        
        InheritanceMultipleC any = new InheritanceMultipleC(){
             @Override
             public void play(){
                System.out.println("I Override InheritanceMultipleC");
            }
        };
        any.play();
    }
}
