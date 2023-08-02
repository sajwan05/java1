package java1;
import java.util.Scanner;
public class MultiIfElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your base salary:");
        int salary = input.nextInt();
        System.out.println("Your base salary is : "+salary);

        if(salary>=10000 && salary <20000){
            salary+= 2000;
        } else if (salary>=20000 && salary<30000) {
            salary+=3000;
        }else if(salary>=30000 && salary <100000){
            salary+=4000;
        }else if (salary>=100000){
            salary+=10000;
        }else{
            salary+=1000;
        }
        System.out.println("Your gross salary is : "+salary);
    }
}
