package JavaOOP;

public class Java {
    private String s;
    private int i;

    Java(){
        System.out.println("You called a constructor of Java class");
    }
    public Java(String s, int i) {
        this.s = s;
        this.i = i;
    }

    public void hello(){
        System.out.println("heyo");
    }

    public void alright(){
        System.out.println("its fine");
    }
}

