public class Wrapper {
    public static void main(String[] args) {
        // Wrapper Class means converting primitive data into Object
        /*
        Why needed?
        Because some Java features work only with objects.
        */
        int a = 100; // primitive
        Integer b = a; // Object 

        // Auto-Boxing (primitive -> Object Automatically)

        int c = b; // Object → Primitive automatically (Unboxing)

        System.out.println(a);
        System.out.println(b);

        int c = b;
        System.out.println(c);
    }
}
