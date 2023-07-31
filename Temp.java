package java1;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in celcius:");
        double cel = input.nextDouble();

        double fahr = (cel *9/5) +32;

        System.out.println("Temperature in fahrenheit = "+fahr);
    }
}
