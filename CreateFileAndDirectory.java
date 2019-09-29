package oop;

import java.io.File;

public class CreateFileAndDirectory {
    
    public static void main(String[] args) {
        
        // create directory
        File dir = new File("Person");
        File dirs = new File("C:\\Users\\Shahajahan\\Desktop\\Person");
        dir.mkdir();  // directory will be created
        dirs.mkdir();  // specific location
        
        // check location path
        String location = dirs.getAbsolutePath();
        System.out.println(location);
        String path = dir.getAbsolutePath();
        System.out.println(path);
        System.out.println(dir.getName()); // check name
        
        // dir delete
        if (dirs.delete()) {
            System.out.println(dirs.getName()+" dir has been deleted");
        }
        
        // create file
        File file1 = new File("Student.txt");
        File file2 = new File(path+"/Teacher.txt");
        
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("file created successfully");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        // delete file
        file1.delete();
        
        if (file1.exists()) {
            System.out.println("file exists");
        }
        else
        {
            System.out.println("file not exists");
        }
        
    }
    
}
