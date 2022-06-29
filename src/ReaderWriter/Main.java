package ReaderWriter;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        char[]array = new char[100];
        String s = "This sentence was written from within the code.";
        try {
            Reader input = new FileReader("C:\\Users\\Mustafa\\Desktop\\file.txt");
            System.out.println("Is any data in this file? Answer is " + input.ready());
            input.read(array);
            System.out.println(array);
            input.close();
       }
       catch(Exception e) {
           e.getStackTrace();
        }

        try {
            Writer output = new FileWriter("C:\\Users\\Mustafa\\Desktop\\file.txt");
            output.write(s);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
