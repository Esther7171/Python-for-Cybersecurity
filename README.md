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


