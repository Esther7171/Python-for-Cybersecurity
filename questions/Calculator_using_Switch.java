import java.util.Scanner;

public class Calculator_using_Switch {
    public static void main(String args[]){
        System.out.println("Calculator");
        System.out.print("Enter your 1st Number => ");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        System.out.print("Enter your 2nd Number => ");
        long b = sc.nextLong();
        System.out.println("1. +\n2. -\n3. X\n4. /\n5. %");
        System.out.print("What => ");

        int c = sc.nextInt();
        switch (c) {
            case 1: System.out.println("Solution => "+(a + b));
            break;

            case 2: System.out.println("Solution => "+(a - b));
            break;

            case 3: System.out.println("Solution => "+(a * b));
            break;

            case 4: System.out.println("Solution => "+(a / b));
            break;

            case 5: System.out.println("Solution => "+(a % b));
            break;
        
            default: System.out.println("Invalid");
                break;
        }
    }    
}
