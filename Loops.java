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

        /*
        Syntax of while loop:
        while(boolean/conditional){
             //body
             //Increment/decrement
        }

         */
        while (count<=N) {
            System.out.println("Hello, World!");
            count += 1;
        }
    }
}

