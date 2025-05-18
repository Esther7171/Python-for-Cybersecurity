# [F. Digits Summation](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/F)

Given two numbers N and M. Print the summation of their last digits.

### Input

Only one line containing two numbers N, M (0 ≤ N, M ≤ 1018).

### Output

Print the answer of the problem.


Examples
|Input|
|--|
|13 12|

|Output|
|--|
|5|

***Note***
First Example :

**last digit** in the first number is **3** and **last digit** in the second number is **2**.

So the answer is: **(3 + 2 = 5)**.


### Solution

<img width="362" alt="1111" src="https://github.com/user-attachments/assets/b016416d-3d19-49b4-a443-8104d67f0d54" />

```java
import java.util.*;

public class demo {

    public static void main(String args[]){
        Scanner test = new Scanner(System.in);

        // taking 1st long and storing reminder in another vairiable
        Long a = test.nextLong();
        Long last_digit_of_first_number = a % 10;

        Long b = test.nextLong();
        Long last_digit_of_second_number = b % 10;

        // Sum
        Long sum = last_digit_of_first_number + last_digit_of_second_number;
        System.out.println(sum);
    }
}
```