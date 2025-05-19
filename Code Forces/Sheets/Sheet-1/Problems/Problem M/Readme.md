# [M. Capital or Small or Digit](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/M)

Given a letter X. Determine whether X is Digit or Alphabet and if it is Alphabet determine if it is Capital Case or Small Case.

> Note:
>
> Digits in ASCII '0' = 48,'1' = 49 ....etc
> Capital letters in ASCII 'A' = 65, 'B' = 66 ....etc
> Small letters in ASCII 'a' = 97,'b' = 98 ....etc

### Input

Only one line containing a character X which will be a capital or small letter or digit.

### Output

Print a single line contains **"IS DIGIT"** if X is digit otherwise, print **"ALPHA"** in the first line followed by a new line that contains **"IS CAPITAL"** if *X* is a **capital** letter and **"IS SMALL"** if *X* is a small letter.

Examples
|Input|
|--|
|bassam ramadan|
|ahmed ramadan|

|Output|
|--|
|ARE Brothers|

|Input|
|--|
|ali salah|
|ayman salah|

|Output|
|--|
|ARE Brothers|

|Input|
|--|
|ali kamel|
|ali salah|

|Output|
|--|
|NOT|

### Soultion
```java
import java.util.Scanner;

public class demo {

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        String first_name = sc.nextLine();
        String Second_name = sc.next.Line();

        // Spliting strings
        String surname1 = first_name.split(" ")[1];
        String surname2 = Second_name.split(" ")[2];

        // condition
        if(surname1.equals(surname2)){
            System.out.println("ARE Brothers");
        }else{
            System.out.println("NOT");
        }

    }
}
```