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

        // take inpute as char at index 0
        char inp = sc.next().charAt(0);

        // Convert inpute into ascii

        int ascii = (int)inp;
        // // add conditon

        if (ascii >= 48 && ascii<=57 ){
            System.out.println("IS DIGIT");
        }
        else if (ascii >=97 && ascii<=122){
            System.out.println("ALPHA\nIS SMALL");

        }
        else if(ascii >= 65 && ascii<= 90){
            System.out.println("ALPHA\nIS CAPITAL");
        }
        else{
            System.out.println();
        }

    }    
}
```
