package hwweek7;

import javax.jws.soap.SOAPMessageHandlers;
import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even
public class Program6 {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
