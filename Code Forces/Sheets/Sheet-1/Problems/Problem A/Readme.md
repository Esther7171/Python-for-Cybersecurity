# [A. Say Hello With C++](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/A)

Given a name *`S`*. Print `"Hello, (name)"` without parentheses.

### Input
Only one line containing a string *S*.

### Output
Print "Hello, " without quotes, then print name.

Example
|Input|Output
|--|--|
|programmer|Hello, programmer


### Solution
```java
import java.util.*;

public class demo {
    public static void main(String args[]){
        Scanner test = new Scanner(System.in);
        String a = test.nextLine();
        System.out.print("Hello, "+a);
    }
    
}
```