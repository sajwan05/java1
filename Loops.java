package java1;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of count:");
        int count = input.nextInt();
        input.nextLine();
        System.out.println("Enter the value of N");
        int N= input.nextInt();
        input.nextLine();
//        Print number from 1 to 5
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
        while (count<=N) {
            System.out.println(count);
            count += 1;
        }
    }
}

