package AdditionalTopics;

public class TypeCasting {
    public static void main(String[] args) {
        int num = 20;
        String st = "Hello world";
        double data = num;                          //widening type casting
        float f = (float)num;                       //narrowing type casting
        String s = String.valueOf(num);             //int to string
        int i = Integer.parseInt(st);               //string to int


    }
}
