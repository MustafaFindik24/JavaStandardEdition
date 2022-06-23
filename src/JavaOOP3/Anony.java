package JavaOOP3;

public class Anony {
    public void createClass(){
        Nested nested = new Nested(){
            public void display(){
                System.out.println("Inside an anonymous class");            //Anonymous class example
            }
        };
        nested.display();
    }
}
