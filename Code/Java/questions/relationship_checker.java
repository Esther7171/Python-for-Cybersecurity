package Code.Java.questions;
//  Write a program that checks the relationship between two variables a and b. If a == b, print 'equal'; if a > b, print 'a is greater'; and if a < b, print 'a is lesser'

import java.util.*;

public class relationship_checker {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // for a 
        System.out.print("Enter the 1st number = ");
        int a = sc.nextInt();
        // for b
        System.out.print("Enter the 2nd number = ");
        int b = sc.nextInt();

        // condition start here:

        if(a == b){
            System.out.println("Equal");
        }
        else if (a > b){
                System.out.println("a is greater");
            }
        else{
                System.out.println("a is lesser");
            }
        
        }

                
}

 
