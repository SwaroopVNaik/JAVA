package pack2;
import pack1.A;
public class Demo extends A {
    public static void main(String[] args) {
        Demo D1= new Demo();
        D1.m1();

        // A a2 = new A();
        // a2.m1(); // cannot access because accsing with class (parent class)
    }
}
