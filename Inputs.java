import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
//        System.out.println("Please enter your roll number:");
//        System.out.println("Your roll number is "+input.nextInt());
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Hello "+name);

    }
}
