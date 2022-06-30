package AdditionalTopics;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("What is your name?");
        String s = scn.next();
        System.out.println("Your name is " + s);

    }
}
