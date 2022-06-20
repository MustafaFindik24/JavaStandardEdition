package JavaOOP;

class AccessModifiers {
    int var;
    AccessModifiers(int var){
        this.var = var;
        System.out.println(this);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.setName("hello");
        System.out.println(main.getName());
        System.out.println("------------------------------");
        AccessModifiers acm = new AccessModifiers(3);       //this and acm object are same reference
        System.out.println(acm);

    }
}
