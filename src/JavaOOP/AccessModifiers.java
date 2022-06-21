package JavaOOP;

class AccessModifiers {
    int var;
    AccessModifiers(int var){
        this.var = var;
        System.out.println(this);
    }
    public static void main(String[] args) {
        String hello = "hi";
        int world = 2;
        Main main = new Main();
        boolean result1 = main instanceof Main;          //instanceof using
        boolean result2 = hello instanceof String;
        System.out.println(result1 + " "+ result2);
        main.setName("hello");
        System.out.println(main.getName());
        System.out.println("------------------------------");
        AccessModifiers acm = new AccessModifiers(3);       //this and acm object are same reference
        System.out.println(acm);
        System.out.println("------------------------------");
        int result = factorial(4);
        System.out.println(result);
    }
    static int factorial(int n){
        if(n==0)
             return 1;
        else
             return  n * factorial(n - 1);
    }
}
