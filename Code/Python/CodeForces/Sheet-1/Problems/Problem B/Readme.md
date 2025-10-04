# [B. Basic Data Types](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/B)

The following lines show some C++ data types, their format specifiers and their most common bit widths:

|Data type|Bit widths|
|--|--|
|int| 32 Bit integer.|
|long long| 64 bit integer|
|Char| 8 bit Characters & symbols|
|Float| 32 bit real value|
|Double| 64 bit real value|

**Reading**

To read a data type, use the following syntax:
```cpp
   cin >> VariableName;
```
For example, to read a character followed by a double:
```cpp
  char ch;
  double d;
  cin >> ch >> d;
```
**Printing**

To print a data type, use the following syntax:
```cpp
cout << VariableName;
```

For example, to print a character followed by a double:
```cpp
char ch = 'd';
double d = 234.432;
cout << ch << " "<< d;
```

### Input
Only one line containing the following space-separated values: int, long long, char, float and double respectively.

### Output
Print each element on a new line in the same order it was received as input.

> Don't print any extra spaces.

**Example**
|Input|
|--|
|3 12345678912345 a 334.23 14049.30493|

|Output|
|--|
|3|
|12345678912345|
|a|
|334.23|
|14049.3|

### Solution
```java
import java.util.*;
public class demo {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        char c = sc.next().charAt(0);
        float d = sc.nextFloat();
        double e = sc.nextDouble();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
```