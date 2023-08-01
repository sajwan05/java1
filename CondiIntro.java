package java1;
import java.util.Scanner;
public class CondiIntro {
    public static void main(String[] args){
        /*

       Syntax of if statement :
       if(boolean expression){
               body
               }
         */
//        if salary is more than 10k add 2k otherwise add 1k

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary to get Bonus:");
        int salary = input.nextInt();

        if (salary>=10000){
            salary+= 2000;
        }else {
            salary+=1000;
        }


        System.out.println("Your gross salary is "+salary);

    }
}
