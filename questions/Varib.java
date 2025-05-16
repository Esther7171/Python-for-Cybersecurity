package questions;

// Question take Two Vaiable A,B and print there sum.

import java.util.*;

public class Varib {
    public static void main(String args[]){
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = marks.nextInt();
        System.out.print("Enter the value of b = ");

        int b = marks.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+sum);
    }
}
