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


## Variable
Variables are containers for storing data values.

Creating Variables
Python has no command for declaring a variable.

A variable is created the moment you first assign a value to it.

Example
```
x = 5
y = "John"
print(x)
print(y)
```
output
5 john

Variables do not need to be declared with any particular type, and can even change type after they have been set.


x = 10
x = "tom"
print(x)

## Casting
If you want to specify the data type of a variable, this can be done with casting.

Example
x = str(3)    # x will be '3'
y = int(3)    # y will be 3
z = float(3)  # z will be 3.0

Get the Type
You can get the data type of a variable with the type() function.

Example
x = 10
y = "Tom"
z = 9.9
print(type(x))
print(type(y))
print(type(x))

output:
<class 'int'>
<class 'str'>
<class 'float'>


Variable Names
A variable can have a short name (like x and y) or a more descriptive name (age, carname, total_volume).

Rules for Python variables:

A variable name must start with a letter or the underscore character
A variable name cannot start with a number
A variable name can only contain alpha-numeric characters and underscores (A-z, 0-9, and _ )
Variable names are case-sensitive (age, Age and AGE are three different variables)
A variable name cannot be any of the Python keywords.
ExampleGet your own Python Server
Legal variable names:

myvar = "John"
my_var = "John"
_my_var = "John"
myVar = "John"
MYVAR = "John"
myvar2 = "John"
Example
Illegal variable names:

2myvar = "John"
my-var = "John"
my var = "John"
Remember that variable names are case-sensitive

ADVERTISEMENT

REMOVE ADS

Multi Words Variable Names
Variable names with more than one word can be difficult to read.

There are several techniques you can use to make them more readable:

Camel Case
Each word, except the first, starts with a capital letter:

myVariableName = "John"
Pascal Case
Each word starts with a capital letter:

MyVariableName = "John"
Snake Case
Each word is separated by an underscore character:

my_variable_name = "John"



Question: Create a variable named test and assign the value car to it.
test = "car"