import java.util.Scanner;

public class demo {

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        String first_name = sc.nextLine();
        String Second_name = sc.next.Line();

        // Spliting strings
        String surname1 = first_name.split(" ")[1];
        String surname2 = Second_name.split(" ")[2];

        // condition
        if(surname1.equals(surname2)){
            System.out.println("ARE Brothers");
        }else{
            System.out.println("NOT");
        }

    }
}