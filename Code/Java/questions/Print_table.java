package Code.Java.questions;
// import java.util.Scanner;

// public class Print_table {
//     public static void main(String[] args) {
//         System.out.print("Inpute the number = ");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         for(int i = 1; i<=10;i++){
//             int sum = number * i;
//             System.out.println(number + " x " + i +" = " + sum );
//         } 
//     }
// }

// sudo code 
// inpute = 2
// i++ ... n 
// i * input

import java.util.Scanner;

public class Print_table {
    public static void main(String[] args) {
        System.out.print("Inpute the number = ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(number + " x " + i +" = " + (i* number) );
        } 
    }
}
