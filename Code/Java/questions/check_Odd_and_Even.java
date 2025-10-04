package Code.Java.questions;
import java.util.Scanner;
// Check Input is odd number or Even
public class check_Odd_and_Even {
    public static void main(String agrs[]){
        Scanner check = new Scanner(System.in);
        int number = check.nextInt();
        System.out.println("Enter the Number = ");
        
        if(number % 2 == 0 ){
            System.out.println("Even Number hai..");
        }
        else{
            System.out.println("Even Number hai..");
        }
    }
}
