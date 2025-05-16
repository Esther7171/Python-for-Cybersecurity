package questions;

import java.util.Scanner;

public class age_checker_for_driving {
    public static void main(String args[]){
        Scanner test = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = test.nextInt();

        if(age >= 18){
            System.out.println("U can drive");
        }
        else{
            System.out.println("U cant drive");
        }
    }
}
