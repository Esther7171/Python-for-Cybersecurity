import java.util.*;

public class demo {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        switch (b) {
            case '+':
            System.out.println(a+c);
            break;
            case '-':
            System.out.println(a-c);
            break;
            case '*':
            System.out.println(a*c);
            break;
            case '/':
            System.out.println(a/c);
            break;
        }
        
    }
}