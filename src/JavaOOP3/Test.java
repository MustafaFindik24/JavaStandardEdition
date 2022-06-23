package JavaOOP3;

public class Test {
    Size pizzaSize;
    public Test(Size pizzaSize){
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza(){
        switch (pizzaSize){
            case MEDIUM:
                System.out.println("Ordered medium pizza.");
                break;
            case SMALL:
                System.out.println("Ordered small pizza.");
                break;
            case LARGE:
                System.out.println("Ordered large pizza.");
                break;
            case EXTRALARGE:
                System.out.println("Ordered extralarge pizza.");
                break;
            default:
                System.out.println("Choose again please.");
                break;
        }
    }
}
