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