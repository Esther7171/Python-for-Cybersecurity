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
//         //     System.out.println("Pass hai tu");
//         // }
//         else {
//             System.out.println("fail");
//         }
//     }
// }

// Creating a project. A resturant have a menu setup according to weak number

// import java.util.*;

// public class demo {

//     public static void main(String args[]){
//         System.out.println("     ***********");
//         System.out.println("      Menu card ");
//         System.out.println("     ***********");
//         System.out.println("1. Monday\n2. Tuesday\n3. Wednesday\n4. Thrusday\5. Friday\n6. Saturday\n7. Sunday");
//         System.out.println("");
//         System.out.print("Enter a Number between 1-7 to see menu according to day = ");
//         Scanner food  = new Scanner(System.in);
//         int days = food.nextInt();
//         if( days == 1){
//             System.out.println("1. The Available iteam for Monday is \"Chicken Soup and Rice\" ");
//         }
//         else if(days == 2){
//             System.out.println("2. The Available iteam for Tuesday is \"Shahi Panner and Roti\"");
//         }
//         else if(days == 3){
//             System.out.println("3. The Available iteam for Wednesday is \"Fried potato and paneer balls\\Malai Kofta and Roti\"");
//         }
//         else if(days == 4){
//             System.out.println("4. The Available iteam for Thursday is \"Mutan Cury and Rice\"");
//         }
//         else if(days == 5){
//             System.out.println("5. The Available iteam for Friday is \"Momos\"");
//         }
//         else if(days == 6){
//             System.out.println("6. The Available iteam for Saturday is \"Dal Makhni and Roti\"");
//         }
//         else if(days == 7){
//             System.out.println("7. The Available iteam for Sunday is \"Burger and Pizza with cook\"");
//         }
//         else{
//             System.out.println("Entered number is  invalid");
//         }
//     }
// }

// import java.util.*;

// public class demo {
//     public static void main(String args[]){
//         Scanner marks = new Scanner(System.in);
//         System.out.println("Enter the value of a = ");
//         int a = marks.nextInt();
//         System.out.println("Enter the value of b = ");

//         int b = marks.nextInt();
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }