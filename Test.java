package oop;

public class Test {

    public static void main(String[] args) {

        Teacher teacher1;  // Object declare / Instantiate
        teacher1 = new Teacher();  // Object created
        teacher1.name = "Shahajahan";
        teacher1.gender = "Male";
        teacher1.phone = 1764433937;

        System.out.println("Name : " + teacher1.name);
        System.out.println("Gender : " + teacher1.gender);
        System.out.println("phone : " + teacher1.phone);

        Teacher teacher2 = new Teacher();    // Object created
        teacher2.name = "Tuhin";
        teacher2.gender = "Male";
        teacher2.phone = 1609897634;

        System.out.println("Name : " + teacher2.name);
        System.out.println("Gender : " + teacher2.gender);
        System.out.println("Phone : " + teacher2.phone);
        
        System.out.println("");
        Teacher teacher3 = new Teacher();
        teacher3.name = "Sumy";
        teacher3.gender = "Female";
        teacher3.phone = 1658897634;
        teacher3.displyInfo();   // call to print
        
        System.out.println("");
        Teacher teacher = new Teacher();
        teacher.name = "Sojib";
        teacher.gender = "Male";
        teacher.phone = 108897634;
        teacher.displyInfo();   // call to print
        
    }

}
