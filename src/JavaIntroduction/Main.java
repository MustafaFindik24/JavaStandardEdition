package JavaIntroduction;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void positiveNum(){


    }

    public static void main(String[] args) {
        double number;
        int sayi1=13, sayi2=2;
        Scanner scn = new Scanner(System.in);

        int [] dizi = {3,5,4,213,3,21};
        System.out.println(dizi[0]);
        number = ((double)sayi1/(double)sayi2);
        System.out.println(number);
         do {
            System.out.println("Value of the number is " + sayi1);
            sayi1--;
            if (sayi1==5)
                break;
        }while (true);

        while(sayi1<100){
            sayi1++;
            if (sayi1>15){
                continue;
            }
            System.out.println(sayi1);
        }


        System.out.println("Hello world!");
        float a = 32.3F;
        byte b = 127;
        int f = 34;
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ". line");
        }


        if(b>a){
            System.out.println(b + " is greater than " + a);
        }
        else{
            System.out.println(a + " is greater than " + b);
        }
    }
}
