# Java Assignments 

#### 1 ) What is Java ? 
- Java is a high-level, object-oriented, platform-independent programming language used to develop applications like web apps, mobile apps, and enterprise software.

#### 2) What are the differences between C++ and Java?
| Feature              | C++                           | Java                             |
|----------------------|-------------------------------|----------------------------------|
| Type                 | Procedural + Object-Oriented  | Pure Object-Oriented             |
| Platform             | Platform dependent            | Platform independent (JVM)       |
| Memory Management    | Manual (using pointers)       | Automatic (Garbage Collection)   |
| Pointers             | Supported                     | Not supported                    |
| Security             | Less secure                   | More secure                      |
| Compilation          | Machine code                  | Bytecode + JVM                   |
| Multiple Inheritance | Supported                     | Not supported (uses interfaces)  |

#### 3) List the features of Java Programming Language ? 

### Features of Java Programming Language

- **1. Platform Independent**  
  👉 Java follows *“Write Once, Run Anywhere”* using JVM.

- **2. Object-Oriented**  
  👉 Based on classes and objects (OOP concepts like inheritance, polymorphism).

- **3. Simple**  
  👉 Easy to learn, removes complex features like pointers.

- **4. Secure**  
  👉 No direct memory access, has bytecode verification.

- **5. Robust**  
  👉 Strong memory management, exception handling.

- **6. Multithreaded**  
  👉 Can perform multiple tasks at the same time.

- **7. High Performance**  
  👉 Uses Just-In-Time (JIT) compiler for faster execution.

- **8. Distributed**  
  👉 Supports network-based applications.

- **9. Dynamic**  
  👉 Can load classes at runtime.

- **10. Portable**  
  👉 Same code runs on different systems without changes.


#### 4) What do you understand about Java virtual Machine ? 
- JVM is the engine that runs Java programs by converting bytecode into machine-level instructions.

#### 5) What is the difference between JDK, JRE and JVM ?

| Feature        | JDK (Java Development Kit)                  | JRE (Java Runtime Environment)        | JVM (Java Virtual Machine)              |
|----------------|---------------------------------------------|----------------------------------------|-----------------------------------------|
| Definition     | Complete package for developing Java apps   | Environment to run Java programs       | Engine that executes Java bytecode      |
| Purpose        | Develop + Compile + Run                     | Run Java programs                     | Execute bytecode                        |
| Contains       | JRE + Development tools (javac, debugger)   | JVM + Libraries                       | Class loader, interpreter, JIT          |
| Usage          | Used by developers                          | Used by users                         | Works internally                        |
| Main Function  | Writing & compiling code                    | Running code                          | Converting bytecode → machine code      |


#### 6) How many types of memory areas are allocated by JVM ?

👉 JVM allocates **5 types of memory areas**:

1. **Method Area**  
   👉 Stores class information, static variables, methods.

2. **Heap Memory**  
   👉 Stores objects and instance variables.

3. **Stack Memory**  
   👉 Stores method calls, local variables, and references.

4. **Program Counter (PC Register)**  
   👉 Keeps track of the current executing instruction.

5. **Native Method Stack**  
   👉 Stores native (non-Java) method execution.

#### 7) What is JIT Compiler ? 

- JIT improves Java performance by compiling bytecode into native machine code during execution.

#### 8) What gives Java its 'write once and run anywhere' nature?

- JVM enables Java’s platform independence by running the same bytecode on different operating systems.

#### 9) what is ClassLoader ? 

- ClassLoader dynamically loads required class into JVM during Runtime

#### 10) Is Empty .java file name a valid source file name ? 

- NO, An Empty file name is not a valid source of file name in Java

#### 11) What if I write static public void instead of public static void ? 

- yes, both are Valid as Java does not enforce java Modifiers, but Always use public static (standard convention) to follow coding best practices

#### 12) what is the default value of local variable ? 

- Local variable have no default value , they must be initialized before use. 

#### 13) What are the various access specifiers in Java ? 

- the various access speicifiers in Java Are (Public, Private, Protected, Default)
- Public ( Acessible everywhere)
- Private (within class only])
- protected (within package + subclass)
- default (within package)

#### 14) what is the purpose of static methods and Variables ?

- static memebers belong to the class , not objects , used for common / shared data and methods 

#### 15) what are the advantages of Packages in Java ? 

- Packages help to organize classes and avoid naming conflicts.
- Improve code reuseablity and security. 

##### 16) What is an Object ? 

- An object is an instance of class 
- it contains data and behaviour 

##### 17) Initial Value of an Object reference (instance Variable) ?

- Default Value is NULL 

##### 18) what are the eight primitive data types ? 

- byte 
- short 
- int 
- long 
- float 
- double
- char 
- boolean

#### 19) Explain diffence between primitive datatypes and reference data type ? 

| Feature        | Primitive        | Reference             |
| -------------- | ---------------- | --------------------- |
| What it stores | Actual value     | Address of object     |
| Memory         | Stack            | Heap                  |
| Size           | Fixed            | Not fixed             |
| Speed          | Faster           | Slower                |
| Methods        | Not available    | Available             |
| Examples       | int, float, char | String, Array, Object |

#### 20) what is autoboxing in java ? 

- Auto boxing is a process of converting the primitive data type into its corresponding wrapper class Object 
- This is done automatically by java (no manual coding needed)
- “value → object (automatic conversion)”

#### 21) what are eight primitive data types and their default values ? 

- byte       ->   0 
- short      ->   0
- int        ->   0
- long       ->   0L
- float      ->   0.0f
- double     ->   0.0d
- char       ->   null
- boolean    ->   true/false 

#### 22) what is the default value of the boolean data type in java ? 

- The default value of the boolean data type in java is -> True / False

#### 23) what is the size of int datatype in java ? 

- The size of int datatype in java is (4 bytes)

#### 24) what is the difference between float and double datatypes ? 

| Feature      | **float**                  | **double**                   |
| ------------ | -------------------------- | ---------------------------- |
| Size         | 4 bytes (32-bit)           | 8 bytes (64-bit)             |
| Precision    | Less precise (~6–7 digits) | More precise (~15–16 digits) |
| Default type | ❌ Not default              | ✅ Default decimal type    |
| Suffix       | `f` or `F` required        | No suffix needed             |
| Memory       | Uses less memory           | Uses more memory             |
| Usage        | When memory is limited     | When accuracy is important   |

- example :
```java 
float a = 5.5f;   // must use 'f'
double b = 5.5;   // default decimal
```

#### 25) Explain the long data type and how to denote a long literal ?

- Long is used to store large integer values 
- The size of long is 8 bytes (64 bits)
- range -> -2^83 to 2^63 - 1

- we use long when int is not enough to store large integer values 
- Example : Population, timestamps, large counters 

- To denote long literal we need use L or l at the end of the number 
- Example : 
```java 
long num_1 = 100000L;
long num_2 = 5000l;
```
#### 26) how to convert double to float in java ? 

- The convertion of double to float in java can be doneby using the **typecasting**

double => 8 bytes 
float => 4 bytes

- Syntax :
 ```java
 float variable = (float) doubleValue;
 ```
- Example : 
```java
double d = 10.75
float f = (float) d;
system.out.println(f); 10.75
```
#### 27) how convert a String to an int in java ?

- To convert string to an int in java we use Integer.parseInt() 
- here parseInt() = returns int

- example : 
```java 
String s = "10";
int i = Integer.parseInt(s); // converting string to integer 
system.out.println(i);
```
##### 28) what is the differnce between break and continue statements in loops ?

- #### break : completely stops the loop 
- Loop terminates immediately 
- control goes outside the loop

Example : 
```java 
for(int i = 1; i <= 5; i++){
  if(i == 3){
    break;
  }
  system.out.println(i);
}
```
when i = 3, loop stops fully

output : 
```
1
2 
```
- #### continue : skips current iteration
- skips the current loop step
- moves to next iteration 

```java
for(int i = 1; i <= 5; i++){
  if(i == 3){
    continue;
  }
  system.out.println(i)
}
```
Output : 
```
1
2
4
5
```
- Differences => 

| Feature      | break 🚫                             |continue ⏭                              |
| ------------ | ------------------------------------ | --------------------------------------- |
| Purpose      | Stops loop completely                | Skips current iteration                 |
| Loop status  | Ends loop                            | Loop continues                          |
| Control flow | Goes outside loop                    | Goes to next iteration                  |
| Use case     | When condition met → stop everything | When condition met → skip only one step |

##### 29) Explain the difference between int and integer in java ?

| Feature       | `int` (Primitive)   | `Integer` (Wrapper Class)         |
| ------------- | ------------------- | --------------------------------- |
| Type          | Primitive data type | Object (class from `java.lang`)   |
| Storage       | Stores actual value | Stores reference to an object     |
| Default Value | `0`                 | `null`                            |
| Null Allowed  | ❌ Not allowed       | ✅ Allowed                         |
| Performance   | Faster, less memory | Slower, more memory               |
| Collections   | ❌ Cannot be used    | ✅ Can be used (`ArrayList`, etc.) |
| Methods       | ❌ No methods        | ✅ Has utility methods             |
| Example       | `int a = 10;`       | `Integer b = 10;`                 |

Example : 

```java

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // int example
        int a = 10;
        System.out.println("int value: " + a);

        // Integer example
        Integer b = 20;
        System.out.println("Integer value: " + b);

        // Using Integer in ArrayList
        // Creating ArrayList type is Integer => (we can't use int, only Integer)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println("ArrayList: " + list);

        // Autoboxing & Unboxing
        Integer obj = a;   // int → Integer
        int num = obj;     // Integer → int

        System.out.println("Autoboxed: " + obj);
        System.out.println("Unboxed: " + num);

        // Null example
        Integer x = null;
        System.out.println("Integer can be null: " + x);

        // int cannot be null (uncommenting below will cause error)
        // int y = null;
    }
}

```

##### 30) What is the difference between local variables and instance variables ?

| Feature            | Local Variable                      | Instance Variable                  |
| ------------------ | ----------------------------------- | ---------------------------------- |
| **Declaration**    | Inside method / block / constructor | Inside class, outside methods      |
| **Scope**          | Only within the method              | Throughout the class               |
| **Lifetime**       | Exists during method execution      | Exists as long as object exists    |
| **Default Value**  | No default value (must initialize)  | Has default value (0, null, false) |
| **Memory**         | Stored in stack                     | Stored in heap                     |
| **Access**         | Cannot be accessed outside method   | Accessed using object              |
| **Keyword Needed** | No keyword                          | No keyword (but belongs to object) |

