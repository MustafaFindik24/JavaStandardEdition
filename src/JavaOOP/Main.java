package JavaOOP;

public class Main {
    private String name;
    private String language;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    Main(){
        System.out.println("Constructor created and called");
        name = "hello world";
    }
    Main(String language){
        this.language = language;
    }
    int gear = 5;
    public void braking(){
        System.out.println("Bicycle is stop.");
    }
    public void goOn(){
        System.out.println("Bicycle is continues.");
    }

    public int sumNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }
    public int sumNumbers(int a, int b, int c){//method overloading
        int sum = a + b + c;
        return sum;
    }
    public int squareNum(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Main main = new Main(); // creating the object
        Main main1 = new Main("Java"); // Constructor overloading
        if (main.gear == 6) {
            main.braking();// calling the method
        }
        else{
            main.goOn();
        }
        System.out.println("---------------------------");
        System.out.println(main.squareNum(3,5));        //calling the method with parameters
        System.out.println(main.sumNumbers(3,5));       //return operations
        System.out.println(main.sumNumbers(3,5,7));  //method overloading examples
        System.out.println(Math.abs(-5));                     //Java standard library methods
        System.out.println("---------------------------");
        System.out.println("Message is  : " + main.name);
        System.out.println("Language is : " + main1.language); //Constructor overloading example
        System.out.println("---------------------------");
        String word = "Hello world!";
        int wordLen = word.length();
        System.out.println("Length: " + wordLen);              //String length method
        System.out.println("---------------------------");
        String first = "hello";
        String second = "world";
        String third = "!!";

        String united = first.concat(second).concat(third);    // combine these String words
        System.out.println(united);
        String s = "This is \"my\" code";
        System.out.println(s);
        String name = new String("hi guys");
        System.out.println(name);
        System.out.println("-----------------------------");
        Inheritance in = new Inheritance("heyo", 3, "ok", 5);                    //Inheritance example
        Java java = new Java();                                                     //calling constructor of java class with no parameters
        in.alright();
        java.hello();
        in.hello();
        System.out.println("-----------------------------");
        Sınıf sınıf = new Sınıf();                                                  // abstract example
        sınıf.helloAbs();
        sınıf.worldAbs();
        System.out.println("------------------------------");
        in.helloWorld();                                                            // usage of interface
        in.startingInterface("hello world");
        in.interfaceWithBody();
    }
}
