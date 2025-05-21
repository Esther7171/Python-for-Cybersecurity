import java.util.Scanner;

public class demo {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        // take inpute as char at index 0
        char inp = sc.next().charAt(0);

        // Convert inpute into ascii

        int ascii = (int)inp;
        // // add conditon

        if (ascii >= 48 && ascii<=57 ){
            System.out.println("IS DIGIT");
        }
        else if (ascii >=97 && ascii<=122){
            System.out.println("ALPHA\nIS SMALL");

        }
        else if(ascii >= 65 && ascii<= 90){
            System.out.println("ALPHA\nIS CAPITAL");
        }
        else{
            System.out.println();
        }

    }    
}