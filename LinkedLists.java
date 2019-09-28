package oop;

import java.util.LinkedList;

public class LinkedLists {
    
    public static void main(String[] args) {
        
        LinkedList<String> countryName = new LinkedList();
        
        countryName.add("Bangladesh");
        countryName.add("Indias");
        countryName.add("India");
        countryName.add("Pakistan");
        countryName.add("Shrilamka");
        countryName.add(4, "China");
        countryName.add(3, "Hongkong");
        countryName.addFirst("Austrollia");
        countryName.addLast("New Zealand");
//        countryName.remove("Indias");
        countryName.remove(8);
        
//        System.out.println(countryName);
        for (String country : countryName) {
            System.out.println(country);
        }
        
        System.out.println("\nSize of LinkedList : "+countryName.size());
    }
}
