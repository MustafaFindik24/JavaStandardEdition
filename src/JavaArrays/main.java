package JavaArrays;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int b=2;

        int []a1={3,6,8,4,2,3,6,8,99};
        int []a2=new int[10];
        int []a3=new int[20];
        int []a5=new int[8];


        System.arraycopy(a1,0,a2,0,a1.length);
        System.out.println("a2 : " + Arrays.toString(a2));
        System.arraycopy(a1,2,a3,6,5);
        System.out.println("a3 : " + Arrays.toString(a3));
        System.out.println("---------------------------");

        int []a4 = Arrays.copyOfRange(a1,3,6);
        System.out.println("a4 : " + Arrays.toString(a4));



         for (int i = 0; i < a1.length; i++) {
            boolean case1 = a1[i]%b==0;
            System.out.print(case1+  " ");
        }
        System.out.println("-----------------------------");

        Scanner scn = new Scanner(System.in);
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
                System.out.print(data+ " ");
            }
        }
        System.out.println("-------------------------------------");
        for (int[][] array2D:dizi) {
            for (int[] array1D:array2D) {
                for (int a:array1D){
                    System.out.print(a + " ");//three dimension foreach example
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(i + ". satırın " + j + ". sütunundaki değer : " + array[i][j]);// Two dimension array example
            }
        }
        System.out.println("---------------------------------");
        for (int sayı:a5){
            System.out.print(sayı + " ");
        }
        for (int sayı : a5) {
            a5[sayı]=b;
            System.out.print(a5[sayı]+ " ");//foreach examples
        }
    }
}