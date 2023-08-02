package java1;

import java.util.Scanner;

public class SwitchCa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the name of the fruit: ");
//        String fruit = in.nextLine();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "orange" -> System.out.println("A round fruit");
//            case "apple" -> System.out.println("A red fruit");
//            case "grapes" -> System.out.println("A small fruit");
//            default -> System.out.println("Please,Enter the valid fruit name!!");
//        }
        System.out.println("Enter the day");
        int day = in.nextInt();
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend!");
        }
    }
}
