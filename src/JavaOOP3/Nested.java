package JavaOOP3;

public class Nested {
    String s;
    public void display(){
        System.out.println("Inside the nested class");
    }
    class inner{
        int i;
        int a;

        int getNum(){
            return 4;
        }
    }

}
