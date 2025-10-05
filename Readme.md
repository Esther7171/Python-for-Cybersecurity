# Chapter 1 – Introduction to Python

Hi 👋, in this repo I’m sharing my **Python notes from beginner to advanced**, along with **competitive programming solutions** and **custom cybersecurity scripts**.

Let’s start with the basics.

Python was created by **Guido van Rossum** in **1991**.
Over the years, it has become one of the most popular programming languages because it is:

* Easy to read and write
* Open-source and free
* Widely used in **cybersecurity, automation, AI, web development, and competitive programming**

---

### What is Python?

Python is a high-level, general-purpose programming language.
It is used for many things, such as:

* **Web development** (server-side applications)
* **Software development** and automation workflows
* **Mathematics and data analysis**
* **System scripting and cybersecurity tasks**
* **Handling big data** and performing complex operations
* **Rapid prototyping** as well as **production-ready applications**

---

### Why Python?

* Works on different platforms (**Windows, Mac, Linux, Raspberry Pi, etc.**)
* Has a **simple syntax similar to English**
* Lets developers write programs with **fewer lines of code** compared to other languages
* Runs on an interpreter system, meaning code executes **immediately after writing**
* Supports multiple programming approaches: **procedural, object-oriented, and functional**

💡 The most recent major version is **Python 3**, which I’ll be using throughout these notes.

---

### Python Syntax vs Other Languages

* Python was designed for **readability**, inspired by English and mathematics.
* **New lines** are used to complete a command (unlike other languages that use semicolons).
* Python uses **indentation (whitespace)** to define scope, such as loops, functions, and classes (instead of curly braces `{}`).

Example:

```python
print("Hello, World!")
```

---

### Writing Our First Program

Now let’s write our very first Python program together.

1. Create a file named **`demo.py`**
2. Add the following code:

```python
print("Hello World")
```

3. Run the program:

```bash
python demo.py
```

✅ Output:

```
Hello World
```

👉 The `print()` function is used to **display messages on the screen**.

---

### Why `.py` Extension?

When we save our file as `demo.py`, the **`.py` extension** tells the system that it’s a Python script.
Examples of other extensions you might know:

* `.txt` → Text file
* `.jpg` → Image file
* `.html` → Webpage file

So, `.py` is just the standard extension that lets the interpreter recognize your code as Python.


---

# Chapter 2 – Variables and Data Types 

### What are Comments?

When I started learning Python, one of the first things I discovered was **comments**.
Comments are special notes in code that **Python ignores** during execution.

They are super useful for:

* Explaining what the code does
* Making the code more readable for you (and others)
* Temporarily disabling lines of code while testing

### Single-Line Comments

In Python, comments start with `#`.

Example:

```python
# This is a comment
print("Hello, World!")
```

✅ Output:

```
Hello, World!
```

You can also place a comment at the end of a line:

```python
print("Hello, World!")  # This is a comment
```

---

### Using Comments to Disable Code

Comments can also be used to **stop Python from running a line**.

Example:

```python
# print("Hello, World!")
print("Cheers, Mate!")
```

✅ Output:

```
Cheers, Mate!
```

---

### Multiline Comments

Python doesn’t have a dedicated multiline comment syntax like some other languages.
But there are **two common ways** to write multiline comments:

#### Method 1: Using `#` on each line

```python
# This is a comment
# written in
# multiple lines
print("Hello, World!")
```

#### Method 2: Using Triple Quotes (`'''` or `"""`)

Since Python ignores string literals that aren’t assigned to variables, you can use triple quotes as multiline comments.

Example:

```python
print("Test")

'''
There is a CVE that must be patched immediately.
An attacker could exploit it to gain access.
Port 80 is exposed and serves a login page with default WordPress credentials.
'''

print("Hii")
```

✅ Output:

```
Test
Hii
```

---

### Cybersecurity Student Tip 🔐

As a cybersecurity learner, **commenting is powerful** when writing scripts:

* You can leave **notes about vulnerabilities** (e.g., “Port 80 is open – check for weak login”).
* You can **disable dangerous payloads** while testing safely.
* Your teammates can **understand exploits and patches** quickly if your comments are clear.

---

## Variables

Variables are containers for storing data values. In Python, you don’t need to declare a variable explicitly. A variable is created the moment you assign a value to it.

```python
x = 5
y = "Tom"
print(x)
print(y)
```

**Output:**

```
5
Tom
```

---

### Variables Are Dynamic

Python variables can change type after assignment:

```python
x = 10      # x is an integer
x = "Tom"   # now x is a string
print(x)
```

**Output:**

```
Tom
```

---

### Casting

You can explicitly define a variable's data type using **casting**:

```python
x = str(3)    # '3' as string
y = int(3)    # 3 as integer
z = float(3)  # 3.0 as float

print(type(x))
print(type(y))
print(type(z))
```

**Output:**

```
<class 'str'>
<class 'int'>
<class 'float'>
```

---

### Variable Names

* Must start with a letter or underscore (`_`)
* Cannot start with a number
* Can contain letters, numbers, and underscores (A-z, 0-9, and _ )
* Are **case-sensitive** (`age`, `Age`, `AGE` are different)
* Cannot be Python keywords (`for`, `if`, `while`, etc.)
**Legal Examples:**

```python
myvar = "John"
my_var = "John"
_my_var = "John"
myVar = "John"
MYVAR = "John"
myvar2 = "John"
```

**Illegal Examples:**

```python
2myvar = "John"
my-var = "John"
my var = "John"
```

---

### Multi-word Variable Names

* **Camel Case:** `myVariableName`
* **Pascal Case:** `MyVariableName`
* **Snake Case:** `my_variable_name`

---

### 1. **Camel Case**

* First word lowercase, each subsequent word starts with a capital letter.

```python
networkScannerTool = "Nmap"
print(networkScannerTool)
```

**Output:**

```
Nmap
```

---

### 2. **Pascal Case**

* Each word starts with a capital letter.

```python
NetworkScannerTool = "Nmap"
print(NetworkScannerTool)
```

**Output:**

```
Nmap
```

---

### 3. **Snake Case**

* Words are separated by underscores, all lowercase (most common in Python).

```python
network_scanner_tool = "Nmap"
print(network_scanner_tool)
```

**Output:**

```
Nmap
```
---


### Assigning Multiple Values

**Many Values to Multiple Variables:**

```python
x, y, z = "Orange", "Banana", "Cherry"
print(x, y, z)
```

**Cybersecurity Example:**

```python
tool, protocol, alert_level = "Wireshark", "HTTPS", "High"
print(tool, protocol, alert_level)
```

**One Value to Multiple Variables:**

```python
x = y = z = "Orange"
print(x, y, z)
```

**Unpacking a Collection:**

```python
fruits = ["apple", "banana", "cherry"]
x, y, z = fruits
print(x, y, z)
```

**Question Example:**
Correct syntax to assign `'Hello World'` to 3 variables in one statement:

```python
x = y = z = 'Hello World'
```

---

### Outputting Variables

* Use `print()` with commas to output multiple variables:

```python
x = "Python"
y = "is"
z = "awesome"
print(x, y, z)   # Python is awesome
```

* Use `+` for string concatenation (careful with spaces):

```python
print(x + " " + y + " " + z)  # Python is awesome
```

* Numbers can be added with `+`:

```python
x = 5
y = 10
print(x + y)  # 15
```

* Mixing string + number with `+` gives an error:

```python
x = 5
y = "John"
# print(x + y)  # Error
print(x, y)     # Works: 5 John
```

---

### Global and Local Variables

* **Global variable:** Created outside a function, accessible inside and outside functions:

```python
x = "awesome"

def myfunc():
    print("Python is " + x)

myfunc()  # Python is awesome
```

* **Local variable:** Created inside a function, only accessible within the function:

```python
x = "awesome"

def myfunc():
    x = "fantastic"
    print("Python is " + x)

myfunc()           # Python is fantastic
print("Python is " + x)  # Python is awesome
```

* **Global keyword:** Declare a variable inside a function to make it global:

```python
def myfunc():
    global x
    x = "fantastic"

myfunc()
print("Python is " + x)  # Python is fantastic
```

* Change a global variable inside a function:

```py
x = "awesome"

def myfunc():
    global x
    x = "fantastic"

myfunc()
print("Python is " + x)  # Python is fantastic
```

---

## Data Types

When I started learning Python, one of the most important things I discovered was **data types**.
A **data type** defines the kind of value a variable can hold and what operations can be performed on it.

---

### Built-in Data Types in Python

Python has several built-in data types, grouped into categories:

* **Text Type** → `str`
* **Numeric Types** → `int`, `float`, `complex`
* **Sequence Types** → `list`, `tuple`, `range`
* **Mapping Type** → `dict`
* **Set Types** → `set`, `frozenset`
* **Boolean Type** → `bool`
* **Binary Types** → `bytes`, `bytearray`, `memoryview`
* **None Type** → `NoneType`

---

### Checking a Data Type

You can check the data type of any variable with the built-in `type()` function.

```python
x = 5
print(type(x))   # Output: <class 'int'>
```

---

### Commonly Used Data Types

When learning Python for security scripting or competitive programming, I often use these main types:

* **Integer (`int`)** – whole numbers
* **Floating-point (`float`)** – decimal numbers
* **String (`str`)** – text
* **Boolean (`bool`)** – `True` or `False`
* **None (`NoneType`)** – represents no value

Example:

```python
a = 1        # int
b = 1.01     # float
c = "hii"    # string
d = True     # boolean
e = None     # none type
```

---

#### Real-Life Example (Movie Data Table)

Think of storing movie details:

| Title        | Rating | Time Viewed | Favorite | Seen By        |
| ------------ | ------ | ----------- | -------- | -------------- |
| Star Wars    | 9.8    | 13          | True     | Tom, Jack      |
| Harry Potter | 8.6    | 30          | True     | Oggy, Nobita   |
| Matrix       | 6.1    | 5           | False    | Charlie        |
| Men in Black | 7.8    | 25          | False    | Phoenix, Gekko |

---

#### Examples of Different Data Types

```python
x = "Hello World"                      # str
x = 20                                 # int
x = 20.5                               # float
x = 1j                                 # complex
x = ["apple", "banana", "cherry"]      # list
x = ("apple", "banana", "cherry")      # tuple
x = range(6)                           # range
x = {"name": "John", "age": 36}        # dict
x = {"apple", "banana", "cherry"}      # set
x = frozenset({"apple", "banana"})     # frozenset
x = True                               # bool
x = b"Hello"                           # bytes
x = bytearray(5)                       # bytearray
x = memoryview(bytes(5))               # memoryview
x = None                               # NoneType
```

---

#### Setting Specific Data Types

Python automatically detects types, but I can also explicitly define them with constructor functions:

```python
x = str("Hello World")   # str
x = int(20)              # int
x = float(20.5)          # float
x = complex(1j)          # complex
x = list(("apple", "banana", "cherry"))  # list
x = tuple(("apple", "banana", "cherry")) # tuple
x = range(6)             # range
x = dict(name="John", age=36)  # dict
x = set(("apple", "banana", "cherry"))   # set
x = frozenset(("apple", "banana", "cherry"))  # frozenset
x = bool(5)              # bool
x = bytes(5)             # bytes
x = bytearray(5)         # bytearray
x = memoryview(bytes(5)) # memoryview
```

---

#### Numbers in Python

Python has **three numeric types**:

* **int** → Whole numbers (positive/negative, unlimited length)
* **float** → Numbers with decimals
* **complex** → Numbers with a real and imaginary part (e.g., `1j`)

Example:

```python
x = 1        # int
y = 2.8      # float
z = 1j       # complex

print(type(x))   # <class 'int'>
print(type(y))   # <class 'float'>
print(type(z))   # <class 'complex'>
```

---

## Numbers

When I started learning Python, I realized numbers are used everywhere — from simple calculations to **network scripting, log analysis, and cybersecurity tools**.

Python supports **three main numeric types**:

* **int** → integers (whole numbers)
* **float** → floating-point numbers (decimals)
* **complex** → numbers with real and imaginary parts

---

### Creating Numbers in Python

Variables of numeric types are created automatically when you assign values.

```python
x = 1     # int
y = 2.8   # float
z = 1j    # complex
```

You can check their type using `type()`:

```python
print(type(x))   # <class 'int'>
print(type(y))   # <class 'float'>
print(type(z))   # <class 'complex'>
```

---

#### Integers (`int`)

An **integer** is a whole number, positive or negative, without decimals.
Python integers can be very large (unlimited length).

Example:

```python
x = 1
y = 35656222554887711
z = -3255522

print(type(x))   # <class 'int'>
print(type(y))   # <class 'int'>
print(type(z))   # <class 'int'>
```

---

#### Floating-Point Numbers (`float`)

A **float** is a number with a decimal point.

Example:

```python
x = 1.10
y = 1.0
z = -35.59

print(type(x))   # <class 'float'>
print(type(y))   # <class 'float'>
print(type(z))   # <class 'float'>
```

Floats can also be written in **scientific notation** with `"e"` to indicate powers of 10.

```python
x = 35e3
y = 12E4
z = -87.7e100

print(type(x))   # <class 'float'>
print(type(y))   # <class 'float'>
print(type(z))   # <class 'float'>
```

---

#### Complex Numbers (`complex`)

Complex numbers are written with a `"j"` as the imaginary part.

```python
x = 3+5j
y = 5j
z = -5j

print(type(x))   # <class 'complex'>
print(type(y))   # <class 'complex'>
print(type(z))   # <class 'complex'>
```

---

#### Type Conversion

Python lets you **convert between number types** using constructor functions.

```python
x = 1      # int
y = 2.8    # float
z = 1j     # complex

# Convert int → float
a = float(x)

# Convert float → int
b = int(y)

# Convert int → complex
c = complex(x)

print(a)       # 1.0
print(b)       # 2
print(c)       # (1+0j)

print(type(a)) # <class 'float'>
print(type(b)) # <class 'int'>
print(type(c)) # <class 'complex'>
```

⚠️ Note: You **cannot convert complex numbers** into other numeric types.

---

#### Generating Random Numbers

Python does not have a built-in `random()` function, but it provides a **`random` module** for generating random numbers.

Example:

```python
import random

print(random.randrange(1, 10))  # Random number between 1 and 9
```

---
Here’s a **cleaned, structured, and SEO-friendly version** of your Python Operators notes. I’ve kept it beginner-friendly but professional, with proper formatting for a GitHub repo or documentation.

---

# Chapter 3 – Python Operators

Python operators are special symbols used to perform operations on variables and values.

For example, the `+` operator can be used to add two numbers:

```py
print(10 + 5)   # Output: 15
```

Python divides operators into the following groups:

1. **Arithmetic operators**
2. **Assignment operators**
3. **Comparison operators**
4. **Logical operators**
5. **Identity operators**
6. **Membership operators**
7. **Bitwise operators**

---

### 1. Arithmetic Operators

Arithmetic operators are used with numeric values to perform common mathematical operations:

| Operator | Name           | Example  |
| -------- | -------------- | -------- |
| `+`      | Addition       | `x + y`  |
| `-`      | Subtraction    | `x - y`  |
| `*`      | Multiplication | `x * y`  |
| `/`      | Division       | `x / y`  |
| `%`      | Modulus        | `x % y`  |
| `**`     | Exponentiation | `x ** y` |
| `//`     | Floor division | `x // y` |

---

### 2. Assignment Operators

Assignment operators are used to assign values to variables:
| Operator | Example         | Same As                  |
| -------- | --------------- | ------------------------ |
| `=`      | `x = 5`         | `x = 5`                  |
| `+=`     | `x += 3`        | `x = x + 3`              |
| `-=`     | `x -= 3`        | `x = x - 3`              |
| `*=`     | `x *= 3`        | `x = x * 3`              |
| `/=`     | `x /= 3`        | `x = x / 3`              |
| `%=`     | `x %= 3`        | `x = x % 3`              |
| `//=`    | `x //= 3`       | `x = x // 3`             |
| `**=`    | `x **= 3`       | `x = x ** 3`             |
| `&=`     | `x &= 3`        | `x = x & 3`              |
| `^=`     | `x ^= 3`        | `x = x ^ 3`              |
| `>>=`    | `x >>= 3`       | `x = x >> 3`             |
| `<<=`    | `x <<= 3`       | `x = x << 3`             |
| `:=`     | `print(x := 3)` | Assigns and prints value |

---

### 3. Comparison Operators

Comparison operators are used to compare two values:

| Operator | Name                     | Example  |
| -------- | ------------------------ | -------- |
| `==`     | Equal                    | `x == y` |
| `!=`     | Not equal                | `x != y` |
| `>`      | Greater than             | `x > y`  |
| `<`      | Less than                | `x < y`  |
| `>=`     | Greater than or equal to | `x >= y` |
| `<=`     | Less than or equal to    | `x <= y` |

---

## 4. Logical Operators

Logical operators are used to combine conditional statements:

| Operator | Description                                | Example                 |
| -------- | ------------------------------------------ | ----------------------- |
| `and`    | Returns `True` if both statements are true | `x < 5 and x < 10`      |
| `or`     | Returns `True` if at least one is true     | `x < 5 or x < 4`        |
| `not`    | Reverses the result                        | `not(x < 5 and x < 10)` |

---

## 5. Identity Operators

Identity operators compare objects, not just values, but also their memory location:

| Operator | Description                                | Example      |
| -------- | ------------------------------------------ | ------------ |
| `is`     | True if both variables are the same object | `x is y`     |
| `is not` | True if they are not the same object       | `x is not y` |

---

## 6. Membership Operators

Membership operators test if a sequence exists within an object:

| Operator | Description                                 | Example      |
| -------- | ------------------------------------------- | ------------ |
| `in`     | True if a sequence is present in the object | `x in y`     |
| `not in` | True if not present in the object           | `x not in y` |

---

## 7. Bitwise Operators

Bitwise operators compare numbers at the **binary level**:

| Operator | Name        | Description                                     | Example                                    |    |    |
| -------- | ----------- | ----------------------------------------------- | ------------------------------------------ | -- | -- |
| `&`      | AND         | Sets each bit to 1 if both bits are 1           | `x & y`                                    |    |    |
| `        | `           | OR                                              | Sets each bit to 1 if one of two bits is 1 | `x | y` |
| `^`      | XOR         | Sets each bit to 1 if only one of two bits is 1 | `x ^ y`                                    |    |    |
| `~`      | NOT         | Inverts all the bits                            | `~x`                                       |    |    |
| `<<`     | Shift left  | Shift left, pushing zeros in from the right     | `x << 2`                                   |    |    |
| `>>`     | Shift right | Shift right, pushing copies of leftmost bit     | `x >> 2`                                   |    |    |

---

## Operator Precedence

Operator precedence defines the order in which operations are executed.

Example – parentheses have the highest precedence:

```py
print((6 + 3) - (6 + 3))  # Output: 0
```

Example – multiplication has higher precedence than addition:

```py
print(100 + 5 * 3)  # Output: 115
```

### Precedence Table (highest to lowest):

1. `()` – Parentheses
2. `**` – Exponentiation
3. `+x, -x, ~x` – Unary operators
4. `*, /, //, %` – Multiplication, Division, Floor division, Modulus
5. `+, -` – Addition and Subtraction
6. `<<, >>` – Bitwise shifts
7. `&` – Bitwise AND
8. `^` – Bitwise XOR
9. `|` – Bitwise OR
10. Comparisons (`==, !=, >, >=, <, <=, is, is not, in, not in`)
11. `not` – Logical NOT
12. `and` – Logical AND
13. `or` – Logical OR

---

