# Hash Table Project (Java)

This repository contains a simple implementation of a hash table in Java using **separate chaining** with linked lists.  
The project reads strings from a file, wraps them in a custom class, and inserts them into hash buckets determined by a custom hash function.

---

## Project Files

### **HashTable.java**
Implements the hash table structure:

- Uses an `ArrayList` of 10 buckets  
- Each bucket is a `LinkedList<StringWrapper>`  
- `.add()` inserts items if not already present  
- `.toString()` prints bucket contents in a readable format  

---

### **HashTableDemo.java**
Responsible for:

- Opening and reading `hello.txt`  
- Parsing the number of strings (first line)  
- Creating the `HashTable`  
- Adding each string as a `StringWrapper`  
- Printing the final hash table  

---

### **StringWrapper.java**
A wrapper class that stores a string and implements:

- A custom hash function  
  - `hash = (vowelCount × length) % 10`
- `.equals()` to avoid duplicates  
- `.toString()` returning the stored string  

---

## How the Hash Function Works

The hash code is computed by:

1. Count the vowels in the string (`a, e, i, o, u`)  
2. Multiply vowel count by total characters  
3. Take the last digit (mod 10)

### Example

String: **"apple"**  
Vowels: **2**  
Length: **5**  
Product: **2 × 5 = 10**  
Hash: **10 % 10 = 0**

So `"apple"` is placed in **bucket 0**.

---

## ▶️ How to Compile & Run

### 1. Make sure these files are present:
- `HashTable.java`  
- `HashTableDemo.java`  
- `StringWrapper.java`  
- `hello.txt`

### 2. Compile
javac *.java
### 3. Run
java HashTableDemo
### Example hello.txt
5
apple
banana
chair
echo
umbrella
