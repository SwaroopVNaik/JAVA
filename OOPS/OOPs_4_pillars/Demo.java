class GP{
    GP(){
        super();
        System.out.println("GP Class constructor");
    }
}
class Parent extends GP{
    Parent(){
        super();
        System.out.println("Parent class Constructor");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child Class Constructor");
    }
}

// Inheritance (Hierarcheal)
public class Demo {
    public static void main(String[] args) {
        new Child();
    }
}