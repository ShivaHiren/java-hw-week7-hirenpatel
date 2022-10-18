package hwweek7;

import java.util.Scanner;

//Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)
public class Program10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Enter the first and the Second number:  ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print(
                "Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
        char op = scanner.next().charAt(0);
        solve(a, b, op);
    }

    public static int solve(int a, int b, char op) {
        int ans = 0;
        if (op == '+') {
            ans = a + b;
        } else if (op == '-') {
            ans = a - b;
        } else if (op == '*') {
            ans = a * b;
        } else if (op == '%') {
            ans = a % b;
        } else if (op == '/') {
            ans = a / b;
        }
        System.out.println("Your answer is: " + ans);
        return ans;
    }
}