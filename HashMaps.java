package oop;

import java.util.HashMap;

public class HashMaps {
    
    public static void main(String[] args) {
        
        // put, get
        HashMap<Integer, String> customer = new HashMap<Integer,String>();
        
        customer.put(101, "tuhin");
        customer.put(102, "Sagor");
        customer.put(103, "Salim");
        
        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
    }
    
}
