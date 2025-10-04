# [O. Calculator](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/O)

Given a mathematical expression. The expression will be one of the following expressions: *A+B, A−B, A∗B and A/B*.

Print the result of the mathematical expression.
### Input

Only one line contains *A,S* and B *(1≤A,B≤104)*, S is either (+,−,∗,/)
.
### Output

Print the result of the mathematical expression.


Examples
|Input|
|--|
|7+54|

|Output|
|--|
|61|

|Input|
|--|
|17*10|

|Output|
|--|
|170|
|

### Soultion
```java
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
```