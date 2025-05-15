// Testing Print
// class demo{
//     public static void main(String args []){
//         System.out.print("Hello World");
//         System.out.print("Hello World");
//     }
// }


// Testing Println
// class demo{
//     public static void main(String args []){
//         System.out.println("Hello World");
//         System.out.print("Hello World");
//     }
// }


// Testing \n
// class demo{
//     public static void main(String args []){
//         System.out.print("Hello World\n");
//         System.out.print("Hello World\n");
//         System.out.print("Hello World");
//     }
// }


// Testing \n
// class demo{
//     public static void main(String args []){
//         System.out.print("Hello World\nTesting This");
//     }
// }


// // Question
// class demo{
//     public static void main(String args[]){
//         // with print + println
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//         System.out.println("*****");
//         System.out.println("");
//         // with print + \n
//         System.out.print("*\n**\n***\n****\n*****");
//     }
// }


// // Testing variable
// class demo{
//     public static void main(String args[]){
//        String name = "Death";
//        int a = 2;
//        int b = 4;
//        double price = 25.25;
//        System.out.println(name);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(price);
//     }
// }


// Changing Variable values
// class demo{
//     public static void main(String args[]){
//        String name = "Death";
//        int a = 2;
//        int b = 4;
//        double price = 25.25;  
//        a = 10;
//        name = "Esther";
//        System.out.println(name);
//        System.out.println(a);
//        System.out.println(b);
//     }
// }

// Praticing Variable

// class demo{
//     public static void main(String args[]){
//         // add two number
//         int a = 10;
//         int b = 20;
//         int sum = a + b;
//         System.out.println(sum);
//         // subtract two number
//         int sub = b - a;
//         System.out.println(sub);
//         // Multiply
//         int mul = a * b;
//         System.out.println(mul);
//     }
// }

// Pratice Question

// 1st option
// class demo {
//     public static void main(String args[]){
//         int a = 10;
//         int b = 5;
//         int solve = a * b / a - b;
//         System.out.println(solve);
//     }
// }

// 2nd option
// class demo {
//     public static void main(String args[]){
//         int a = 10;
//         int b = 5;
//         int solve = (a * b) / (a - b);
//         System.out.println(solve);
//     }
// }

// import java.util.*;
// class demo {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("marks baata = ");
//         int test = sc.nextInt();
//         if(test >= 80 && test <= 100){
//             System.out.println("Grade A");
//         }
//         // else if ( ) {
//         //     System.out.println("Pass hai tu bsdk");
//         // }
//         else {
//             System.out.println("ma chuda bsdk");
//         }
//     }
// }

import java.util.*;

public class demo {
    public static void main(String args[]){
        System.out.println("******Menu for week******");
        System.out.print("Enter Weak name = ");
        Scanner sc = new Scanner(System.in);
        String nude = sc.nextLine();
        String khana = nude.toLowerCase();
        if(khana == "monday"){
            System.out.println("Bakra bhat hai..");
        }
        else if(khana.equals("tuesday")){
            System.out.println("Cury bhat hai..");
        }
        else if(khana == "wednesday"){
            System.out.println("Murga bhat hai..");
        }
        else if(khana == "thursday"){
            System.out.println("Machhli bhat hai..");
        }
        else  if(khana == "friday"){
            System.out.println("miya khalifa bhat hai..");
        }
        else if(khana == "saturday"){
            System.out.println("bur bhat hai..");
        }
        else if(khana == "sunday"){
            System.out.println("tu aaj be aagaya bhik magna..");
        }
        else {
            System.out.println("huss");
        }
    }
}
