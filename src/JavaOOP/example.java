package JavaOOP;

public interface example {
    public void helloWorld();
    public void startingInterface(String s);
    default void interfaceWithBody(){
        System.out.println("I'm created in interface and i have a body"); // interface method examples with body
    }
}
