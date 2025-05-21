# [N. Char](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/N)

Given a letter *X*. If the letter is **lowercase** print the letter after converting it from **lowercase letter to uppercase letter**. Otherwise print the letter after converting it from **uppercase letter to lowercase letter**.

> Note : 
>
> difference between *'a'* and *'A'* in **ASCII** is *32* .

### Input

Only one line containing a character X which will be a **capital** or **small** letter.

### Output

Print the answer to this problem.


Examples
|Input|
|--|
|a|

|Output|
|--|
|A|

|Input|
|--|
|A|

|Output|
|--|
|a|

### Soultion
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);  // Read one character

        if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);  // Convert to uppercase
        } else if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);  // Convert to lowercase
        }

        System.out.println(ch);
    }
}

```