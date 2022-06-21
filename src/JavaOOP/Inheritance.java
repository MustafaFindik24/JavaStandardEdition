package JavaOOP;

public class Inheritance extends Java implements example{
    private String a;
    private long b;

    public Inheritance(String s, int i, String a, long b) {
        super(s, i);
        this.a = a;
        this.b = b;
    }

    @Override
    public void hello() {
        System.out.println("------------------------------------");
        super.hello();
        System.out.println("we overriding the method of Java Class");
    }

    @Override
    public void helloWorld() {
        System.out.println("we overriding from the example interface");
    }

    @Override
    public void startingInterface(String s) {
        System.out.println("Our word is : " + s);
    }
}
