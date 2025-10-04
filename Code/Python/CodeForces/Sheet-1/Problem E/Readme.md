# [E. Area of a Circle](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/E)

Given a number R calculate the area of a circle using the following formula:

**Area = π * R2.**

> Note:
>
> consider **π** = **3.141592653**.

### Input

Only one line containing the number R (1  ≤  R  ≤  100).

### Output

Print the calculated **area**, with **9** digits after the decimal point.

Examples
|Input|
|--|
|2.00|

|Output|
|--|
|12.566370612|

***Note***

* Use the data type double for this problem.

* Use setprecision(9) to print 9 digits after decimal point.

* you can use function **setprecision** that are in `#include<iomanip>` library for Example :

```cpp
#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
     cout << fixed << setprecision(9);
     // your code.
}
```
### Soultion

```java
import java.util.*;
public class demo {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        double pie =  3.141592653d;
        double r = sc.nextDouble();
        double area = (pie * (r * r));
        System.out.println(area);
    
    }
}
```