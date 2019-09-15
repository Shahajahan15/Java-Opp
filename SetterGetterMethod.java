package oop;

public class SetterGetterMethod {
            
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }    
    
    public void setAge(int age) {
    this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    
    public static void main(String[] args) {

    SetterGetterMethod set = new SetterGetterMethod();
    set.setName("Shahajahan");
    set.setAge(25);
    System.out.println("Name : "+set.getName());
    System.out.println("Age : "+set.getAge());
        
    }
    
}
