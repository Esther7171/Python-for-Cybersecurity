## Chapter 1 – Introduction to Python

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

## Chapter 2 – Variables and Data Types 

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
