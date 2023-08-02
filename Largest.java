package java1;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Find largest of the three numbers
//Appproach 3:          int max = Math.max(a,Math.max(b,c));
//                      System.out.println(max);

        int max =a;
        if (b > max) {
            max=b;
        }if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}
