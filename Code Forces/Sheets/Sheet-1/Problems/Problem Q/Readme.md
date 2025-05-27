# [Q. Coordinates of a Point](https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/Q)

Given two numbers X, Y which donate coordinates of a point in 2D plan. Determine in which quarter does it belong.

> Note:
> 
> Print Q1, Q2, Q3, Q4 according to the quarter in which the point belongs to.
> Print "Origem" If the point is at the ?origin.
> Print "Eixo X" If the point is over X axis.
> Print "Eixo Y" if the point is over Y axis.

### Input
Only one line containing two numbers X, Y ( - 1000 ≤ X, Y ≤ 1000).



### Output

Print the answer to problem above.

Examples
|Input|
|--|
|4.5 -2.2|

|Output|
|--|
|Q4|

|Input|
|--|
|0.1 0.1|

|Output|
|--|
|Q1|

### Soultion
```java
import java.util.*;
public class demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Double x_axis = sc.nextDouble();
        Double y_axis = sc.nextDouble();

        if(x_axis ==0 && y_axis == 0){
            System.out.println("Origem");
        }
        else if(x_axis == 0 && y_axis < 0 && y_axis > 0 ){
            System.out.println("Eixo X");
        }
        else if(y_axis == 0 && x_axis < 0 && x_axis > 0){
            System.out.println("Eixo Y");
        }
        else if(x_axis >= 0 && y_axis >= 0){
            System.out.println("Q1");
        }
        else if(x_axis <= 0 && y_axis >=0 ){
            System.out.println("Q2");
        }
        else if( x_axis <= 0 && y_axis <= 0){
            System.out.println("Q3");
        }
        else if(x_axis >= 0 && y_axis <= 0){
            System.out.println("Q4");
        }
    }
}

```
