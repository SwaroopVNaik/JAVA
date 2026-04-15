class Parent{
    public void m1(){
        System.out.println("Parent class m1 - method()");
    }

    public void m2(){
        System.out.println("Parent class m2 - method()");
    }

    // cannot overide this method as it is hv final keyword
    public final void m3(){
        System.out.println("Parent class m3 - method()");
    }
}

