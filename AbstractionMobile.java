package oop;

public abstract class AbstractionMobile {
    
    abstract void sendMessage();
    
    
    
    public static void main(String[] args) {
        
        AbstractionMobile am;   // refernece variable
        
        am = new AbstractionSendR();
        am.sendMessage();
        am = new AbstractionSendK();
        am.sendMessage();

    }   
}
