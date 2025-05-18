import java.util.*;

public class menu_card_by_switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("      ___________");
        System.out.println("     |           |");
        System.out.println("     | Menu card |");
        System.out.println("     |___________|");
        System.out.println();
        System.out.print("Enter a Number between 1-7 to see menu according to day = ");


        int a = sc.nextInt();
        switch (a) {
            case 1: System.out.println("1. The Available iteam for Monday is \"Chicken Soup and Rice\" ");
            break;

            case 2: System.out.println("2. The Available iteam for Tuesday is \"Shahi Panner and Roti\"");
            break;

            case 3: System.out.println("3. The Available iteam for Wednesday is \"Fried potato and paneer balls\\Malai Kofta and Roti\"");
            break;

            case 4: System.out.println("4. The Available iteam for Thursday is \"Mutan Cury and Rice\"");
            break;

            case 5: System.out.println("5. The Available iteam for Friday is \"Momos\"");
            break;

            case 6: System.out.println("6. The Available iteam for Saturday is \"Dal Makhni and Roti\"");
            break;

            case 7: System.out.println("7. The Available iteam for Sunday is \"Burger and Pizza with cook\"");
            break;

            default: System.out.println("Entered number is  invalid");
            break;
        }
    }
}
