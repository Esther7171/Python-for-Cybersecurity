# [G. Summation from 1 to N](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/G)

Given a number N. Print the **summation** of the numbers that is between **1** and **N** **(inclusive)**.

.∑i=1Ni


### Input

Only one line containing a number N(1≤N≤109)

### Output

Print the **summation** of the numbers that is between **1** and **N** **(inclusive)**.

Examples
|Input|
|--|
|3|

|Output|
|--|
|6|

|Input|
|--|
|10|

|Output|
|--|
|55|

***Note***

First Example :

the numbers between 1 and 3 are **1,2,3** .

So the answer is: **(1 + 2 + 3 = 6)**

Second Example :

the numbers between 1 and 10 are **1,2,3,4,5,6,7,8,9,10**.

So the answer is: **(1 + 2 + 3 + 4 + 5 + 6 +7 +8 + 9 + 10 = 55)**


### 📐 Hint

To find the sum of all numbers from 1 to N, use this simple mathematical formula:
```
Sum = N * (N + 1) / 2
```

### Solution
```java
import java.util.*;

public class demo {

    public static void main(String args[]){
        Scanner test = new Scanner(System.in);

        // Sum = N * (N + 1) / 2
        long a = test.nextLong();
        long sum = a * (a + 1)/2;
        System.out.println(sum);

    }
}
```