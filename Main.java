import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    How to take input in java
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello "+name);

    }
}