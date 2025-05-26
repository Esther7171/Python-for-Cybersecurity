    import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // e.g., 7+54
 
        int a = 0, b = 0;
        char op = ' ';
        
        // Find the operator position and split
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                op = ch;
                a = Integer.parseInt(input.substring(0, i));
                b = Integer.parseInt(input.substring(i + 1));
                break;
            }
        }
 
        // Perform the operation
        if (op == '+') {
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a - b);
        } else if (op == '*') {
            System.out.println(a * b);
        } else if (op == '/') {
            System.out.println(a / b); // Integer division
        }
    }
}