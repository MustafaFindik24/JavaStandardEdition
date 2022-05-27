package JavaIntroduction;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void positiveNum(){


    }

    public static void main(String[] args) {
        int []a1={3,6,8,4,2,3,6,8,99};
        int []a2=new int[9];
        int []a3=new int[a1.length];

        System.arraycopy(a1,0,a2,0,a1.length);
        System.out.println("a2 : " + Arrays.toString(a2));
        System.arraycopy(a1,3,a3,6,3);
        System.out.println("a3 : " + Arrays.toString(a3));
        System.out.println("---------------------------");

        int []a4 = Arrays.copyOfRange(a1,3,6);
        System.out.println("a4 : " + Arrays.toString(a4));


        /*Scanner scn = new Scanner(System.in);
        int [][] array = {
                {3,4,2,5,78,21,234},
                {3,9,43,845,23,6,123},
                {3,5,6},
                {3,8,88}
        };          //new int[10][3];
        int [][][] dizi = {
                {
                        {3, 4, 2, 5, 78, 21, 234},
                        {3, 9, 43, 845, 23, 6, 123}
                },
                {
                        {3, 5, 6},
                        {3, 8, 88},
                }

        };

        Double number;
        int sayı1= 10;
        int sayı2= 34;
        for (int []innerArray:array) {
            for (int data:innerArray) {
                System.out.println(data);
            }
        }
        System.out.println("-------------------------------------");
        for (int[][] array2D:dizi) {
            for (int[] array1D:array2D) {
                for (int a:array1D){
                    System.out.println(a);
                }
            }
        }
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(i + ". satırın " + j + ". sütunundaki değer : " + array[i][j]);
            }
        }


        /*int [] dizi = {3,5,4,213,3,21};
        System.out.println(dizi[0]);
        number = ((double)sayı1/(double)sayı2);
        System.out.println(number);
        /* do {
            System.out.println("Value of the number is " + sayı);
            sayı--;
            if (sayı==5)
                break;
        }while (true);
        */
        /*
        while(sayı<100){
            sayı++;
            if (sayı>15){
                continue;
            }
            System.out.println(sayı);
        }

        /*label:
        while(true){
            while (true){
                while (true){
                    System.out.print("Enter a number:");
                    sayı = scn.nextInt();
                    if (sayı<0) {
                        System.out.println("Number is lower than zero");
                        break label;
                    }
                }
            }
        }
         /* while (true){
            System.out.print("Enter a number:");
            sayı = scn.nextInt();
            if (sayı<0){
                System.out.println("Number is lower than zero");
                break;
            }
        }


        /*System.out.println("Hello world!");
        float a = 32.3F;
        byte b = 127;
        int f = 34;
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ". line");
        }

        /*for (int sayı:array){
            System.out.println(sayı);
        }*/
        /*for (int sayı :
                array) {
            array[sayı]=b;
            System.out.println(sayı);
        }
        /*if(b>a){
            System.out.println(b + " is greater than " + a);
        }
        else{
            System.out.println(a + " is greater than " + b);
        }*/
    }
}
