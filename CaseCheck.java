package java1;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch = in.next().trim().charAt(0);

        if (ch>='A' && ch<='Z')     System.out.println("UpperCase"); //if(ch>=65 && cg<=90)
        else                    System.out.println("LowerCase");
    }
}
