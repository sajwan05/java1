package java1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ans = 0;
        while (true) {
            System.out.println("Enter Operation: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter the two numbers:");
                double num1 = in.nextDouble();
                double num2 = in.nextDouble();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operator!!");
            }
            System.out.println(ans);
        }
    }
}
