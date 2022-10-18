package hwweek7;

import java.util.Scanner;

//3. Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
//_______________________________
//| |
//| Mark Sheet |
//|_______________________________|
//| Name : Jay |
//| Roll No: 08 |
//|_______________________________|
//| Subjects : Marks |
//|_______________________________|
//| Math : 98 |
//| Science : 90 |
//| English : 85 |
//|_______________________________|
//| Total : 273 |
//|_______________________________|
//| Percentage : 91.0 |
//| Result : Pass |
//| Grade : A+ |
//|_______________________________|
public class Program3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student  Name");
        String studentname = scanner.nextLine();
        System.out.println("Roll number ");
        int rollNumber = scanner.nextInt();
        System.out.println("Enter marks between 0 - 100");
        System.out.println("Maths marks");
        int mathsmarks = scanner.nextInt();
        System.out.println("science marks");
        int sciencemarks = scanner.nextInt();
        System.out.println("English marks");
        int englishmarks = scanner.nextInt();
        float totalMarks = mathsmarks + englishmarks + sciencemarks;
        float percentage = totalMarks / 300 * 100;


        String result;
        String grade;

        if (percentage >= 80) {
            result = "Pass";
            grade = "A+";
        } else if (percentage >= 60) {
            result="Pass";
            grade = "A";
        } else if (percentage >= 50) {
            result="Pass";
            grade = "B";
        } else if (percentage >= 35) {
            result = "Pass";
            grade = "C";
        }else {
            result = "Fail";
            grade = "N/A";
        }
            System.out.println("  ___________________________________");
            System.out.println(" |           Mark Sheet              |");
            System.out.println(" |___________________________________|");
            System.out.println(" | Name        :" + studentname +              "|");
            System.out.println(" | Roll Number :" + rollNumber +                   "|");
            System.out.println(" |___________________________________|");
            System.out.println(" | Subjects    :     Marks           |");
            System.out.println(" |___________________________________|");
            System.out.println(" | Maths       :" + mathsmarks + "   |");
            System.out.println(" | Science     :" + sciencemarks + " |");
            System.out.println(" | English     :" + englishmarks + " |");
            System.out.println(" |___________________________________|");
            System.out.println(" | Total       :" + totalMarks + "             |");
            System.out.println(" |___________________________________|");
            System.out.println(" |Percentage   :" + percentage + "             |");
            System.out.println(" |Results      :" + result + "                 |");
            System.out.println(" | Grade       :" + grade + "                   |");
            System.out.println(" |___________________________________|");


        }
    }
