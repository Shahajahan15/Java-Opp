package oop;

public class InheritingPrivateMember extends InheritingPrivateM {
    
    private int role;

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    void input () {
        this.setName("Shahajahan");
        this.setAge(23);
        this.setRole(128);
    }
    
    void output() {
        System.out.println("Name : "+this.getName());
        System.out.println("Name : "+this.getAge());
        System.out.println("Role : "+this.getRole());
    }
    
    public static void main(String[] args) {
        
        InheritingPrivateMember t1 = new InheritingPrivateMember();
        t1.input();
        t1.output();
    }
}
