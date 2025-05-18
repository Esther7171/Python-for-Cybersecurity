# Introduction to Java Programming

1. What is Code ?
2. Input-Output, Variables, Data Types
3. Conditional statmemts
4. Loops
5. All about Patterns
6. Methods / Functions
7. Space & Time complexity
8. Arrays
9. 2D Arrays
10. Strings
11. StringBuilder
12. Bit Manipulation


#### 1. What is Code ?
Code is a set of instructions that a computer can understand.

#### 2. What is programming language
A programming language is a set of rules that define how to write code.

#### 3. Binarry 
* A computer understands only 0 & 1 binnary 
* When current come in Circuit, it is 1.
* When current does not come in Circuit, it is 0.
            Or
* When devices go high voltage it is 1
* When devices go low voltage it is 0.


Java is a high level programming language.

So we write a code in java and there is compiler which converts the code into machine language or binary.



To run java code our code pass two steps 

1. step is compilation
2. execution 


In jdk kit there is Jre component (Java runtime enviornment) 
In Jre there is another component JVM(Java Virutal Machine)

JDK --> JRE --> JVM
they stored level wise with help of this our java code runs


In stage of complie , any code we write we called it as `source code` we save this code with help of extention `.java`

And all this code send to compiler that reside inside `JDK`. Compiler take all code and it convert the **source code** in `Byte code` and save as `.class` and the byte code run at any os and machine with help of JRE.

In the stage of execution the JVM take **byte code** and convert it to `Native code` like machine code and computer understand it.

Here, we have a class named CodeChef
Inside the class, we have a main method: public static void main (String[] args)

This line is special because it is where the program starts running. Let’s break it down:

`public` – This means the method can be accessed by Java to start execution.
`static` – This allows the method to run without creating an object of the class.
`void` – This means the method does not return any value.
`main` – The name of the method (always written as main).
`String[] args` – This is used to pass arguments from the command line (not needed for now).
`System.out.println("hii")`

This is what we use to output/print anything to the screen. Note that this line contains a (;) semicolon at the end. Semicolon is mandatory at the end of statements in Java.

#### Component of Code

1. **Functions** or **Method** are the part of code who preform the work 

like if i have to add 2 number we write all the code in a function  

and the function in this code is 
```java
class demo {
    public static void main(String args []){
        System.out.println("Hello World");
    }
}
```

The `void main` the function name is `main` and the function return type is `void`. void mean empty. it didnt retun aything

2. class 

```java
class main{
    void main(){

    }
}
```
ALL the code are writen in function, And all the function are stored in `Class`.

The class is big entity that can contain many function

class is like a kitchen and jar and box that contain somethingh are function.



#### Output

how to take output in java
```java
System.out.print("hii");
``` 
For output we use `System.out.print` class.

print is a function to print

to terminate line of code we need to use `;` to defin the code is end like `.` full stop.



So if i run this code 

1. print
```java
class demo{
    public static void main(String args []){
        System.out.print("Hello World");
        System.out.print("Hello World");
    }
}
```

> **Output**
>   
> Hello WorldHello World

2. Println

TO print in Next line in java we can take in use of this function `println`

```java
class demo{
    public static void main(String args []){
        System.out.println("Hello World");
        System.out.print("Hello World");
    }
}
```

> **Output**
>
> Hello World
> Hello World


print dont give new line
println give new line 

3 "\n"
to continua in next line we can also use an escape sequence in java like `\n`

```java
class demo{
    public static void main(String args []){
        System.out.print("Hello World\n");
        System.out.print("Hello World\n");
        System.out.print("Hello World");
    }
}
```

> **Output**
> 
> Hello World
> Hello World
> Hello World


Or we can use it like this to print single out in two line with single pirnt 
```java
class demo{
    public static void main(String args []){
        System.out.print("Hello World\nTesting This\nJava is cool");
    }
}
```

> **Output**
>
> Hello World
> Testing This 
> Java is cool



#### Question: print this patter
```
*
**
***
****
*****
```
```java
class demo{
    public static void main(String args[]){
        // with print + println
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("");
        // with print + \n
        System.out.print("*\n**\n***\n****\n*****");
    }
}
```


#### Variables

Declaring a variable
When we declare a variable, we should also specify what type of variable it is. This is known as data type, basically meaning what type of data we are going to store in a variable. Each data type has a specific size in memory and a range of values that it can represent.

Here are all the major data types and what they store in Java:

| Data Type | Description | Example Declaration |
|--|--|--|
| int |	Stores integers | `int c = 100000;` |
| long | Stores larger/smaller integers | `long d = 100000L;` |
| float | Stores small decimal numbers | `float e = 10.5;` | 
| double | Stores large decimal numbers | `double f = 10.5;` |
| char | Stores single characters | `char g = 'A';` |
| boolean | true or false value	boolean | `h = true;` |
| String | Stores text (a sequence of characters) | `String i = "Hello";` |

Variables are the container that store values

Define variable in Java

```java
class demo{
    public static void main(String args[]){
       String name = "Death";
       int a = 2;
       int b = 4;
       double price = 25.25;
       System.out.println(name);
       System.out.println(a);
       System.out.println(b);
    }
}
```
> **Output**
>
> Death
> 2
> 4
> 25.25

We can even modify the value of variable values


```java
class demo{
    public static void main(String args[]){
       String name = "Death";
       int a = 2;
       int b = 4;
       double price = 25.25;
       a = 10;
       name = "Esther";
       System.out.println(name);
       System.out.println(a);
       System.out.println(b);
    }
}
```
> **Output**
>
> Esther
> 10
> 4

#### Data types

Java is a typed language

DATA Type are two types:

1. Primitive
2. Non-Primitive


#### 1. Primitive data type

we need to remember than, These are permanent in java and java have 8 primitive data type.

Ever data type have differnt work purpose and different size of memory

* byte
  * byte have 1 byte memory size = 8 bits.(01 is 1 bit that mean eight 01 are 8 bit)
* short
 *
* char
 * It take 2 bytes of memory 
* boolean
 * It take 1 bytes of memory 
* int
 * It take 4  bytes of memory 
* long
 * It take 8 bytes of memory 
* float
 * It take 4 bytes of memory 
* double
 * It take 8 bytes of memory 

This bytes are count in 64-bit system

#### 2. Non-Primitive data type

we can customise then and create them

* String
* Array
* Class
* Object
* Interface


Let pratice this:
```java
class demo{
    public static void main(String args[]){
        // add two number
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
        // subtract two number
        int sub = b - a;
        System.out.println(sub);
        // Multiply
        int mul = a * b;
        System.out.println(mul);
    }
}
```
|Operators|Description|Example|
|--|--|--|
|+|	Addition | a + b |
|-|	Subtraction | a - b |
|*|	Multiplication | a * b |
|/|	Division | a / b |

#### Question

<img width="371" alt="shapes at 25-05-14 12 43 55" src="https://github.com/user-attachments/assets/86dfde6b-111a-4a63-b4b5-bb34c8c4b98c" />

Options:
1. 
```java 
int solve = a * b / a -b;
```

2.
```java
int solve = (a * b) / (a - b);
```

If your code look like this:
```java
class demo {
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        int solve = a * b / a - b;
        System.out.println(solve);
    }
}
```
> **the output might be**
>
> 0 

becouse the java dont follow BOADMAS rule, Java follow the priority of operators

The priority list be like:
1. * = multiply
2. / = divide
3. % =  Modular (this operator only print remainder)
4. +
5. -

As 1 More thing java calculate form `left` to `right`.

SO the correct answer is 2nd
```java
class demo {
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        int solve = (a * b) / (a - b);
        System.out.println(solve);
    }
}
```
> **the output might be**
>
> 10

#### Input

At 1st we need to `import java utils` in our code then

we imported a `Scanner` class in our code
in this scanner class we pass `System.in` for inpute like we use `System.out` for output and `System.in` use for inpute

```java
import java.util.*;

public class demo {

    public static void main(String args[]){
        Scanner test = new Scanner(System.in);
        String hello = test.next();
        System.out.println(hello);
    }
}
```

With Scanner class we created an `object` called "test" and declare test object as new Scanner and get input by System.in
after that we created a variable hello aas string and make it equal to object test to store value as string and for print we use next function

`Sc.next` can take only 1 token like if i enter a name `death esther` it will print only death bez death is single token and esther is 2nd tokken so for printing both token and all token we can use this function. `Sc.nextline` 
```java
import java.util.*;

public class demo {

    public static void main(String args[]){
        Scanner test = new Scanner(System.in);
        String hello = test.nextLine();
        System.out.println(hello);
    }
}
```
* Using String as variable we use `nextLine`
* Using int as varibale we use `nextInt`
* Using int as varibale we use `nextFloat`
* Using int as varibale we use `nextLong`
etc..

Question take Two Vaiable A,B and print there sum


## Condition Statement

* if
* else if
* else

* Switch
* break


Writing If else structure
```java
if (Condition){
    statement: 1;
    statement: 2;    
}
else if (Condition){
    statement: 3;
    statement: 4;    
}
else{
    statement: 0;
}
```

Question: Age checker for driving  
```java
import java.util.Scanner;

public class age_checker_for_driving {
    public static void main(String args[]){
        Scanner test = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = test.nextInt();

        if(age >= 18){
            System.out.println("U can drive");
        }
        else{
            System.out.println("U cant drive");
        }
    }
}
```

Question 2: Odd even number calculator
> Hint:
> 
> U can take in use of `%` Modular operator becouse it can show the reminder or 2 divided number and analysing reminder we can get idea of weither the number is odd or even.
> If givin number divided by 2 and remainder = 0 then its an even number like. 10/2 = question is 5 and reminder is 0

<img width="244" alt="test" src="https://github.com/user-attachments/assets/c93166b6-6b75-4357-ab7b-e99801be9c4f" />

```java
package questions;

import java.util.Scanner;
// Check Input is odd number or Even
public class check_Odd_and_Even {
    public static void main(String agrs[]){
        Scanner check = new Scanner(System.in);
        int number = check.nextInt();
        
        if(number % 2 == 0 ){
            System.out.println("Even Number hai..");
        }
        else{
            System.out.println("Even Number hai..");
        }
    }
}
```

Question 3: Write a program that checks the relationship between two variables a and b. If a == b, print 'equal'; if a > b, print 'a is greater'; and if a < b, print 'a is lesser'

```java
import java.util.*;

public class relationship_checker {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // for a 
        System.out.print("Enter the 1st number = ");
        int a = sc.nextInt();
        // for b
        System.out.print("Enter the 2nd number = ");
        int b = sc.nextInt();

        // condition start here:

        if(a == b){
            System.out.println("Equal");
        }
        else if (a > b){
                System.out.println("a is greater");
            }
        else{
                System.out.println("a is lesser");
            }
        
        }

                
}
```

Question: If 3 is na odd number, print "Hello world"

1. 

<div align="center">
<img src="https://github.com/user-attachments/assets/e67968a5-d04c-4520-8f1b-b2f77cd64fda" height="200"></img>
</div>



2. 

<div align="center">
<img src="https://github.com/user-attachments/assets/061d7f97-af28-42b6-9d1e-33653039cf50" height="200"></img>
</div>


3.

<div align="center">
<img src="https://github.com/user-attachments/assets/64b25631-aad5-46b2-8963-a9d3efa30f12" height="200"></img>
</div>


1 and 2 are true bez if 1st is true then statement directly get execute 



### Switch Case

Syntax
```java
Switch (variable){
    Case 1:
                statement 1;
                break;
    Case 2:
                statement 2;
                break
    Case 3:
                statement 3;
                break;
    default:
                statement 4;
}