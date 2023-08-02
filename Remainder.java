package java1;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args){
        //Print reverse of a given number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number you want to reverse:");
        int n = in.nextInt();

        while(n > 0){
            int rem = n % 10;
            System.out.print(rem);
            n=n/10;
        }
        System.out.println(" ");
    }
}
