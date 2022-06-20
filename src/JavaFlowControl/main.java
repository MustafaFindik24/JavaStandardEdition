package JavaFlowControl;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int sayi1, sayi2;
        Scanner scn = new Scanner(System.in);
        label:
        while(true){
            while (true){
                while (true){
                    System.out.print("Enter a number:");
                    sayi1 = scn.nextInt();
                    if (sayi1<0) {
                        System.out.println("Number is lower than zero");
                        break label;
                    }
                }
            }
        }
        System.out.println("---------------------------");
        while (true){
            System.out.print("Enter a number:");
            sayi2 = scn.nextInt();
            if (sayi2<0){
                System.out.println("Number is lower than zero");
                break;
            }
        }
    }
}
