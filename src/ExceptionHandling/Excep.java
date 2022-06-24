package ExceptionHandling;

public class Excep {
    public static void main(String[] args) {
        try {
            int equalsZero = 3/0;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception => " + e.getMessage()); //try-catch example
        }
        finally {
            System.out.println("This message is printed no matter what");
        }
    }
}
