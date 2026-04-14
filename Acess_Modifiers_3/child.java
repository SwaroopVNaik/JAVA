package pack2;
import pack1.Parent;

public class child extends Parent {
    public static void main(String[] args) {
       Parent p2 =  new Parent();
    //    p2.m1(); // Cannot access becausing accessing with Class (Parent Class)

       child c1 = new child();
       c1.m1();
    }
}