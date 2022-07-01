package AdditionalTopics;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean value = file.createNewFile();
            if (value){
                System.out.println("File created.");
            }
            else{
                System.out.println("File is already exists.");
            }
        }
        catch (Exception e){
            e.getStackTrace();
        }
        System.out.println("-----------------------------------");
        boolean deger = file.delete();
        if (deger){
            System.out.println("file deleted.");
        }
        else{
            System.out.println("file is not deleted.");
        }
    }
}
