# [D. Difference](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/D)

Given four numbers A, B, C and D. Print the result of the following equation :

`X = (A * B) - (C * D)`.

### Input

Only one line containing 4 separated numbers A, B, C and D ( - 105  ≤  A, B, C, D  ≤  105).


### Output

Print "Difference  =  " without quotes followed by the equation result.


Examples
|Input|
|--|
|1 2 3 4|

|Output|
|--|
|Difference = -10|

|Input|
|--|
|2 3 4 5|

|Output|
|--|
|Difference = -14|

|Input|
|--|
|4 5 2 3|

|Output|
|--|
|Difference = 14|


### Soultion

```java
import java.util.*;
public class demo {

    public static void main(String args[]){
        Scanner test = new Scanner(System.in);
        Long a = test.nextLong();
        Long b = test.nextLong();
        Long c = test.nextLong();
        Long d = test.nextLong();
        Long x = ((a * b) - (c * d));
        System.out.println("Difference = "+ x);
    }
}
```