
package oop;

import java.util.LinkedList;

public class CreateStudentList {
    
    String name, className;
    int id;
    
    CreateStudentList(int id, String name, String className){
        
        this.id = id;
        this.name = name;
        this.className = className;
    }
    
    // Student LinkedList
    public static void main(String[] args) {
        LinkedList<CreateStudentList> list = new LinkedList<CreateStudentList>();
        
        // create student
        CreateStudentList s1 = new CreateStudentList(12, "Tuhun", "FCI");
        CreateStudentList s2 = new CreateStudentList(13, "Sumon", "FCI");
        CreateStudentList s3 = new CreateStudentList(14, "Salim", "FCI");
        CreateStudentList s4 = new CreateStudentList(15, "Sagor", "FCI");
        
        // adding to the student list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        System.out.println("Id name  classname");
        for (CreateStudentList s : list) {
            
            System.out.println(s.id +" "+ s.name +" "+ s.className);
        }
    }
    
}
