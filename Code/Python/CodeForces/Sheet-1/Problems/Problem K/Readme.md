# [K. Max and Min](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/K)

Given 3 numbers *A*, *B* and *C*, Print the **minimum** and the **maximum** numbers.
### Input

Only one line containing two numbers A, B (1  ≤  A, B  ≤  106)

### Output

Print the minimum number followed by a single space then print the maximum number.


Examples
|Input|
|--|
|1 2 3|

|Output|
|--|
|1 2 3|

|Input|
|--|
|1 2 3|

|Output|
|--|
|1 2 3|

|Input|
|--|
|10 20 -5|

|Output|
|--|
|10 20 -5|

### Soultion
```java
import java.util.*;

public class demo {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        System.out.println(min +" " + max);
    }
}
```