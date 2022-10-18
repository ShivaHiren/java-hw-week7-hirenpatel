package hwweek7;

import java.util.Scanner;

/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/
public class Program8 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any Capital Alphabet letter from A to F");
            char city = scanner.next().charAt(0);

            if (city == 'A' || city == 'a') {
                System.out.println("City is Anand");
            } else if (city == 'b' || city == 'B') {
                System.out.println("City is Bombay");
            } else if (city == 'C' || city == 'c') {
                System.out.println("City is Calcuta");
            } else if (city == 'D' || city == 'd') {
                System.out.println("City is Delhi");
            } else if (city == 'E' || city == 'e') {
                System.out.println("City is Enfield");
            } else if (city == 'F' || city == 'f') {
                System.out.println("City is France");
            } else {
                System.out.println("Invalid Entry");
            }
        }
    }
