// Creating a project. A resturant have a menu setup according to weak number

package Code.Java.questions;

import java.util.*;

public class menu_card {

    public static void main(String args[]){
        System.out.println("      ___________");
        System.out.println("     |           |");
        System.out.println("     | Menu card |");
        System.out.println("     |___________|");
        System.out.println();
        System.out.println("1. Monday\n2. Tuesday\n3. Wednesday\n4. Thrusday\5. Friday\n6. Saturday\n7. Sunday");
        System.out.println("");
        System.out.print("Enter a Number between 1-7 to see menu according to day = ");
        Scanner food  = new Scanner(System.in);
        int days = food.nextInt();
        if( days == 1){
            System.out.println("1. The Available iteam for Monday is \"Chicken Soup and Rice\" ");
        }
        else if(days == 2){
            System.out.println("2. The Available iteam for Tuesday is \"Shahi Panner and Roti\"");
        }
        else if(days == 3){
            System.out.println("3. The Available iteam for Wednesday is \"Fried potato and paneer balls\\Malai Kofta and Roti\"");
        }
        else if(days == 4){
            System.out.println("4. The Available iteam for Thursday is \"Mutan Cury and Rice\"");
        }
        else if(days == 5){
            System.out.println("5. The Available iteam for Friday is \"Momos\"");
        }
        else if(days == 6){
            System.out.println("6. The Available iteam for Saturday is \"Dal Makhni and Roti\"");
        }
        else if(days == 7){
            System.out.println("7. The Available iteam for Sunday is \"Burger and Pizza with cook\"");
        }
        else{
            System.out.println("Entered number is  invalid");
        }
    }
}