package java1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        float num = input.nextFloat();
//        System.out.println(num);
//        Type casting forced conversion
//        int num =(int)56.798;
//        System.out.println(num);
////        Automatic type promotion in the expression
////        int a =257;
////        byte b = (byte)a;
////        System.out.println(b);
//
//        byte a =40;
//        byte b = 50;
//        byte c = 100;
////        int d = (a*b)/c;
////        System.out.println(d);
//
//        int age = 'A';
//        System.out.println(age);

        byte b = 42;
        char c = 'a';
        short s = 1020;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
//        float+int-double=double
        System.out.println(result);
    }
}
