# ABSTRACT CLASS IN JAVA (COMPLETE NOTES)

## 1. DEFINITION
An abstract class is a class declared using the `abstract` keyword. It is incomplete and cannot be instantiated. It is used as a blueprint for other classes. It can contain both abstract methods (without body) and normal methods (with body).

---

## 2. KEY IDEA
Abstract class = partially implemented class  
Some methods are defined, some are left for child classes to implement.

---

## 3. SYNTAX
```java
abstract class Animal {
    abstract void sound();
}
```

## 4. ABSTRACT METHOD

- A method without body
- Only declaration is given
- Must be implemented by subclass

abstract void sound();

## 5. NORMAL METHOD IN ABSTRACT CLASS

- Abstract class can also have fully defined methods.

```java
void sleep() {
    System.out.println("Sleeping");
}
```

## 6. OBJECT CREATION RULE

```java
Animal a = new Animal(); // ERROR
```

- Abstract class object creation is not allowed because it is incomplete.

## 7. WHY ABSTRACT CLASS IS USED

- To define common structure for multiple classes
- To enforce method implementation in subclasses
- To achieve abstraction
- To improve code reuse and flexibility

## 8. COMPLETE EXAMPLE

ABSTRACT CLASS

```java
abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
```
CHILD CLASS

```java
class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}
```

MAIN CLASS

```java
public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
        a.sleep();
    }
}
```

## 9. OUTPUT
- Dog barks
- Animal is sleeping


## 10. IMPORTANT RULES

- Abstract class must be declared using abstract
- Cannot create object of abstract class
- Can contain both abstract and non-abstract methods
- If a class contains abstract method, class must be abstract
- Subclass must implement all abstract methods
- If subclass does not implement, it must also be abstract

## 11. RUNTIME POLYMORPHISM

- Animal a = new Dog();

- Reference type → Parent (Animal)
- Object type → Child (Dog)
- Method execution decided at runtime

## 12. ADVANTAGES

- Provides standard structure
- Improves reusability
- Reduces code duplication
- Supports polymorphism
- Makes code flexible and maintainable

## 13. REAL-TIME EXAMPLES

-  Animal → sound()
-  Vehicle → start()
-  Shape → draw()

## 14. MEMORY POINT

- Abstract = incomplete class
- Child class = completes it

## 15. ONE LINE SUMMARY

- Abstract class defines rules, child class provides implementation.


---