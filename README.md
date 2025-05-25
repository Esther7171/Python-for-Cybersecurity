# **Introduction to Java Programming**

### **1. What is Code?**

Code is a set of instructions written in a programming language that a computer can understand and execute.

### **2. What is a Programming Language?**

A programming language is a formal set of rules and syntax used to write code that instructs a computer on how to perform specific tasks.

### **3. Binary**

* A computer understands only binary — a system that uses **0s and 1s**.
* **1** represents the presence of electric current in a circuit.
* **0** represents the absence of electric current.

  **Alternatively:**
* **1** = High voltage (device is on)
* **0** = Low voltage (device is off)

### **What is Java?**

Java is a **high-level programming language**, which means it's closer to human language and easier to read and write compared to low-level languages.

When we write code in Java:

* It is first converted into **bytecode** by the **Java compiler**.
* This bytecode is then executed by the **Java Virtual Machine (JVM)**, which translates it into **machine language (binary)** that the computer can understand.

Thanks, Yash! Here's your refined and well-organized version of the notes. I've polished the grammar, made the explanations simpler, added headings for structure, and clarified some key concepts:

## **Code Execution in Java**

To run a Java program, the code goes through **two main stages**:

1. **Compilation**
2. **Execution**


## **JDK, JRE, and JVM Explained**

Java follows a layered architecture:

```
JDK → JRE → JVM
```

* **JDK (Java Development Kit):** Contains tools needed to develop Java applications, including the **compiler**.
* **JRE (Java Runtime Environment):** Provides the environment to run Java programs.
* **JVM (Java Virtual Machine):** Executes the bytecode and converts it to machine-specific instructions.

## **Step-by-Step Java Code Execution**

### **1. Compilation Stage**

* The code you write is called **source code**.
* Source code is saved with the `.java` extension.
* The **Java compiler** (inside the JDK) compiles this code into **bytecode**, saved as a `.class` file.
* Bytecode is platform-independent — it can run on any OS using JRE.

### **2. Execution Stage**

* The **JVM** takes the bytecode and translates it into **native machine code** that your computer can understand and execute.

## **Structure of a Java Program**

Here’s a basic example:

```java
class CodeChef {
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
```

### Breakdown of the `main` Method:

* `public` – Accessible by the JVM from anywhere.
* `static` – Can run without creating an object of the class.
* `void` – Does not return any value.
* `main` – Entry point of the program.
* `String[] args` – Used for command-line arguments (optional for now).

## **Printing Output in Java**

### **1. Using `System.out.print()`**

Prints the text but stays on the **same line**.

```java
System.out.print("Hello");
System.out.print("World");
```

> **Output:** `HelloWorld`

### **2. Using `System.out.println()`**

Prints the text and moves to the **next line**.

```java
System.out.println("Hello");
System.out.println("World");
```

> **Output:**

```
Hello
World
```

### **3. Using `\n` (Escape Sequence)**

For manual line breaks within `print()`:

```java
System.out.print("Hello\nWorld");
```

> **Output:**

```
Hello
World
```

You can also print multiple lines with one statement:

```java
System.out.print("Hello\nTesting This\nJava is cool");
```

> **Output:**

```
Hello
Testing This
Java is cool
```


## **Printing Patterns in Java**

### **Example: Print a star pattern**

```
*
**
***
****
*****
```

```java
class Demo {
    public static void main(String[] args) {
        // Using println()
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        System.out.println(""); // Empty line

        // Using \n in a single print
        System.out.print("*\n**\n***\n****\n*****");
    }
}
```

## **Comments in Java**

### **1. Single-line Comments**

Start with `//`. Anything after `//` is ignored.

```java
// This is a comment
System.out.println("Hello World");
```

### **2. Multi-line Comments**

Start with `/*` and end with `*/`.

```java
/* This code prints Hello World
   to the screen. */
System.out.println("Hello World");
```

## **Java Program Components**

### **1. Functions/Methods**

A **function** (also called a method in Java) is a block of code that performs a specific task.

```java
class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

* The method name here is `main`.
* The return type is `void`, meaning it returns nothing.

### **2. Class**

In Java, all code is written **inside a class**.

```java
class Main {
    void main() {
        // code here
    }
}
```

* A **class** is like a container that holds functions.
* You can think of a class as a **kitchen**, and functions as **tools or containers** inside it.



## **Variables and Data Types in Java**


### **Declaring Variables**

When you declare a variable, you must specify its **data type** — this tells Java what kind of data the variable will hold. Each data type has a fixed size in memory and a specific range of values it can store.

### **Common Data Types in Java**

| Data Type | Description                          | Example Declaration   |
| --------- | ------------------------------------ | --------------------- |
| `int`     | Stores integers                      | `int c = 100000;`     |
| `long`    | Stores larger integers               | `long d = 100000L;`   |
| `float`   | Stores small decimal numbers         | `float e = 10.5f;`    |
| `double`  | Stores large decimal numbers         | `double f = 10.5;`    |
| `char`    | Stores a single character            | `char g = 'A';`       |
| `boolean` | Stores true/false values             | `boolean h = true;`   |
| `String`  | Stores text (sequence of characters) | `String i = "Hello";` |

### **Example: Defining and Printing Variables**

```java
class Demo {
    public static void main(String[] args) {
        String name = "Death";
        int a = 2;
        int b = 4;
        double price = 25.25;

        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
        System.out.println(price);
    }
}
```

> **Output:**
>
> Death
> 2
> 4
> 25.25


### **Modifying Variable Values**

You can change variable values after declaring them:

```java
class Demo {
    public static void main(String[] args) {
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

> **Output:**
>
> ```
> Esther
> 10
> 4
> ```

## **Data Types**

Java is a **strongly typed language**, meaning every variable must have a declared type.

### **1. Primitive Data Types**

Java has **8 primitive types** — these are predefined and always available.

| Data Type | Memory Size     | Description                  |
| --------- | --------------- | ---------------------------- |
| `byte`    | 1 byte (8 bits) | Small integers (-128 to 127) |
| `short`   | 2 bytes         | Medium-sized integers        |
| `char`    | 2 bytes         | Single Unicode character     |
| `boolean` | 1 byte\*        | `true` or `false`            |
| `int`     | 4 bytes         | Standard integers            |
| `long`    | 8 bytes         | Large integers               |
| `float`   | 4 bytes         | Single-precision decimals    |
| `double`  | 8 bytes         | Double-precision decimals    |

\*Note: Actual size of `boolean` can depend on JVM implementation.


### **2. Non-Primitive Data Types**

These are customizable and can be created by the programmer.

* `String`
* Arrays
* Classes
* Objects
* Interfaces

## **Practice: Simple Arithmetic Operations**

```java
class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = a + b;
        System.out.println(sum); // 30

        int sub = b - a;
        System.out.println(sub); // 10

        int mul = a * b;
        System.out.println(mul); // 200
    }
}
```

### **Basic Arithmetic Operators**

| Operator | Description    | Example |
| -------- | -------------- | ------- |
| `+`      | Addition       | `a + b` |
| `-`      | Subtraction    | `a - b` |
| `*`      | Multiplication | `a * b` |
| `/`      | Division       | `a / b` |
| `%`      | Modulas(Get Reminder)        | `a % b` |

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
class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int solve = a * b / a - b;
        System.out.println(solve);
    }
}
```

> **Output:**
>
> 0

### Why does this happen?

Java **does not follow the traditional BODMAS rule strictly** as in mathematics. Instead, Java uses **operator precedence** and evaluates expressions **left to right** when operators have the same precedence.


### Operator Precedence in Java (Relevant to Arithmetic):

1. `*` (Multiplication)
2. `/` (Division)
3. `%` (Modulus - gives the remainder of division)
4. `+` (Addition)
5. `-` (Subtraction)

### How Java Evaluates `a * b / a - b`

Step-by-step evaluation for the expression:

```java
a * b / a - b
```

1. `a * b` → `10 * 5` = `50`
2. `50 / a` → `50 / 10` = `5`
3. `5 - b` → `5 - 5` = `0`

Hence, the result is `0`.


### Using Parentheses to Control Evaluation

If you want to calculate:

$$
\frac{a \times b}{a - b}
$$

You must use parentheses to explicitly define the order:

```java
class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int solve = (a * b) / (a - b);
        System.out.println(solve);
    }
}
```

> **Output:**
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
```


### LOOPS

repatation in code

types of loop

* For Loop
* While Loop
* Do While Loop


### For loop Syntax
```java
for (initialisation; condition; updation){

// do something

}
```

if we want to print "Hello world" so we need to create a counter vairable for initialisation like integer that value in start is 0.
```java
int counter = 0
```

we can also Use incremental operator like this
* rather than this i = i + 1.
* we can use i++ direclty.

```java
public class demo {

    public static void main(String[] args) {
        for(int counter=0;counter<=10;counter++){
            System.out.println(counter);
        }
    }
}
```
updataion is increment in counter variable 

Question 1: Print "Hello World" 10 time
```java
public class demo {

    public static void main(String[] args) {
        for(int counter=0;counter<=10;counter = counter + 1){
            System.out.println("Hello World");
        }
    }
}
```

Quetion 2. Print '1. "Hello World" to 100. "Hello World"'
```java
public class demo{
    public static void main(String[] args){
        for(int i=0;i<=100;i=i+1){
            System.out.println(i+ ". " + "\"Hello World\"" );
        }
    }
}
```
Question 3: Print a number from 1 to 10 in vertical and horizontal

```java
public class loop_test {
    public static void main(String agrs[]){
        System.out.println();
        String bold ="\033[1m Question\033[0m";
        System.out.println(bold+"1: Print a 1 to 10 number using loop vertically");
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println();
        System.out.println(bold+"2: Print a 1 to 10 number using loop horizontally");
        for(int i=0;i<=10;i++){
            System.out.print(i+" ");
        }
        for()
    }
}
```

### While Loop

```java
variable = here   -----> here is initialisation
while(condition){  ----> here is condition
    //do something ----> here is updation
}
```

Question 1: print number 1 to 10 using while loop.

```java 
public class demo {

    public static void main(String[] args) {
        int i = 0;
        while(i<=10){
            System.out.println(i);
            i = i + 1; // i++
        }
    }
}
```


### Do While Loop
```java
variable = here
do {
    // do something
} while(condition);
```

Question 1: print number 1 to 10 using while loop.
```java
public class demo {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println(i);
            i = i + 1;
        }
        while(i<=10);
    }
}
```

DO vs While Loop difference 

while check condition and then execute work, while do execute work then care for condition.

```java
public class demo {

    public static void main(String args[]){

        int i = 20;

        while(i <= 10){
            System.out.println("While is here");
        }

        do{
            System.out.println("Doooo is here");
        }
        while(i<=10);
    }
}
```

if u run this code `dooo is here` would be printed bez while check for condition and do do his work and later check for conditon as i is not to 10 or lesser bez i value is already 20 so still do printed and while check.

 Question 1: Print the sum of First n natural number.

```java
import java.util.Scanner;

public class print_n_number_using_loop {
    public static void main(String args[]){
        System.out.print("Enter a number = ");
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=n;i++){
            sum = sum + i;
            System.out.println(sum);
        }
    }
}

```