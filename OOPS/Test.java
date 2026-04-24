package OOPS;

public class Test {
    // Main Method
    public static void main(String[] args) {
        // Creating New Object of parent class !
        // The parent class is default class so it can be accssed anywhere in the package
        Parent p1=new Parent(); 
        p1.m1();
        p1.m2();

        // Creating New Object of Child class !
        // The child class is default class so it can be accssed anywhere in the package
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        
        // Creating New Object of parent class !
        // The parent class is default class so it can be accssed anywhere in the package
        Parent c2=new Child();
        c2.m1();
        c2.m2();
    }
}