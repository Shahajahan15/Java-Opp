package oop;

public class ParameterizedMethod {
    
    public static void main(String[] args) {
        
        Teacher teacher = new Teacher("Sagor","Male",19876553);
        teacher.setInfo("Imo", "Female", 1789987656);  // Parameter calling
        teacher.displyInfo(); 
        
         // Constructor used here
        Teacher teacher1 = new Teacher("Forhad","Male", 178987666);
        teacher1.displyInfo();
        
    }
    
}
