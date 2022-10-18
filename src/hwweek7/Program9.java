package hwweek7;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
import java.util.Scanner;
//9. Same as above program-8 using switch statement.
public class Program9 {
    public static void main(String[] args) {


            Scanner obj = new Scanner(System.in);
            System.out.println("Enter Capital letter from A to F");
            char city = obj.next().charAt(0);
            switch (city) {
                case 'A':
                    System.out.println("City is Amritsir");
                    break;
                case 'B':
                    System.out.println("City is Banglore");
                    break;
                case 'C':
                    System.out.println("City is Chennai");
                    break;
                case 'D':
                    System.out.println("City is Darjiling");
                    break;
                case 'E':
                    System.out.println("City is Edinbrough");
                    break;
                case 'F':
                    System.out.println("City is Faridabad");
                default:
                    System.out.println("Invalid Entry");
            }
        }
    }
