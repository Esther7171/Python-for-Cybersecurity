# [I. Welcome for you with Conditions](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/I)

Given two numbers *A* and *B*. Print **"Yes"** if A is **greater than or equal** to *B*. Otherwise print **"No"**.

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

Print **"Yes"** or **"No"** according to the statement.


Examples
|Input|
|--|
|10 9|

|Output|
|--|
|Yes|

|Input|
|--|
|5 5|

|Output|
|--|
|Yes|

|Input|
|--|
|5 7|

|Output|
|--|
|no|



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