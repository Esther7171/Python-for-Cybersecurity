# [H. Two numbers](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/H)

Given *2* numbers *A* and *B*. Print **floor**, **ceil** and **round** of ***A/B***.

***Note:***

* Floor: Is a mathematical function that takes a real number X
 and its output is the greatest integer less than or equal to X.

* Ceil: Is a mathematical function that takes a real number X
 and its output is the smallest integer larger than or equal to X.

* Round: Is a mathematical function that takes a real number X
 and its output is the closest integer to that number X.


### Input

Only one line containing two numbers A and B (1≤A,B≤103)

### Output

Print 3 lines that contain the following in the same order:

1. "floor A / B = Floor result" without quotes.

2. "ceil A / B = Ceil result" without quotes.

3. "round A / B = Round result" without quotes.

Examples
|Input|
|--|
|10 3|

|Output|
|--|
|floor 10 / 3 = 3|
|ceil 10 / 3 = 4|
|round 10 / 3 = 3|

***Note***

Links:

* For Rounding method visit: https://www.mathsisfun.com/numbers/rounding-methods.html.
* For Flooring and Ceiling method visit: https://www.mathsisfun.com/sets/function-floor-ceiling.html.



### Hints per Function:
* Floor: Think of Math.floor() in Java — it gives the greatest integer ≤ value.

* Ceil: Use Math.ceil() — it gives the smallest integer ≥ value.

* Round: Use Math.round() — it rounds to the nearest integer.

### Soultion
```java
import java.util.*;
public class demo{
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double result = (double) A / B;

        int floor = (int) Math.floor(result);
        int ceil = (int) Math.ceil(result);
        int round = (int) Math.round(result);

        System.out.println("floor " + A + " / " + B + " = " + floor);
        System.out.println("ceil " + A + " / " + B + " = " + ceil);
        System.out.println("round " + A + " / " + B + " = " + round);
    }
}
```