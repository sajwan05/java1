package java1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch(empId){
            case 1 :
                System.out.println("Sooraj Sajwan");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "man":
                        System.out.println("Manager");
                        break;
                    default:
                        System.out.println("Please enter correct department");
                        break;
                }
                break;
            case 2 :
                System.out.println("Divyanshu Tiwari");
                break;
            case 3 :
                System.out.println("Aayush Khanduri");
                break;
            default :
                System.out.println("Enter correct employee ID");
        }
    }
}
