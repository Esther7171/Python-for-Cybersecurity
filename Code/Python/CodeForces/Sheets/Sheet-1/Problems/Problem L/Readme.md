# [L. The Brothers](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/L)

Given two person names.

Each person has {"the first name" + "the second name"}

Determine whether they are brothers or not.

> Note:
>
> The two persons are brothers if they share the same second name.


### Input

First line will contain two Strings *F1*, *S1* which donates the first and second name of the 1st person.

Second line will contain two Strings *F2*, *S2* which donates the first and second name of the 2nd person.

### Output

Print ***"ARE Brothers"*** if they are brothers otherwise print **"NOT"**.


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
        String Second_name = sc.nextLine();

        // Spliting strings
        String surname1 = first_name.split(" ")[1];
        String surname2 = Second_name.split(" ")[1];

        // condition
        if(surname1.equals(surname2)){
            System.out.println("ARE Brothers");
        }else{
            System.out.println("NOT");
        }

    }
}
```