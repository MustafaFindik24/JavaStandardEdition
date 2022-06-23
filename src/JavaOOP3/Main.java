package JavaOOP3;

public class Main {
    public static void main(String[] args) {
        Nested nested = new Nested();
        Nested.inner inn = nested.new inner(); // creating inner object from nested object

        System.out.println("We called inner class method and return value is " + inn.getNum());
        System.out.println("-----------------------------");
        Anony anony = new Anony();
        anony.createClass();



    }
}
