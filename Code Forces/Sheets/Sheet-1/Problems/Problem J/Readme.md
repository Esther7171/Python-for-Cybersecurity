# [J. Multiples](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/J)

Given two numbers *A* and *B*. Print **"Yes"** if A is **greater than or equal** to *B*. Otherwise print **"No"**.

### Input

Only one line containing two numbers A, B (1  ≤  A, B  ≤  106)

### Output

Print the "Multiples" or "No Multiples" corresponding to the read numbers.



Examples
|Input|
|--|
|9 3|

|Output|
|--|
|Multiples|

|Input|
|--|
|6 24|

|Output|
|--|
|Multiples|

|Input|
|--|
|12 5|

|Output|
|--|
|No Multiples|

***Note***
* A is said to be Multiple of *B* if **B** is **divisible by** ***A***.

***First Example :***

* **9** is divisible by **3** , So the answer is: Multiples.

***Second Example :***

* **6** is **not divisible** by **24** but

* **24** is divisible by *6* , So the answer is: Multiples.

***Third Example :***

* **12** is **not divisible** by *5* and *5* is not divisible by **12**.

So the answer is: No Multiples.


### Soultion
```java
import java.util.*;

public class demo {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a%b == 0 | b%a == 0){
            System.out.println("Multiples");   
        }else{
            System.out.println("No Multiples");
        }
    }
}
```