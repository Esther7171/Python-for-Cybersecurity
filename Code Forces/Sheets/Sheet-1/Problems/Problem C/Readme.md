# [C. Simple Calculator](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/C)

Given two numbers X and Y. Print the summation and multiplication and subtraction of these 2 numbers.

### Input
Only one line containing two separated numbers X, Y (1  ≤  X, Y  ≤  105).

### Output
Print 3 lines that contain the following in the same order:

* "X + Y = summation result" without quotes.
* "X * Y = multiplication result" without quotes.
* "X - Y = subtraction result" without quotes.

Example:

|InputCopy|
|--|
|5 10|

|OutputCopy|
|--|
|5 + 10 = 15|
|5 * 10 = 50|
|5 - 10 = -5|

> Note
>
>Be careful with spaces.


### Solution
```java
import java.util.*;
public class demo {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " - " + y + " = " + (x - y));
    }
}
```