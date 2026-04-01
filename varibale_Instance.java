// public class variables {

//     int  a = 10;
//     int b = 20; 
//     static int c = 30;
//     public static void main(String[] args) {
//         // Accesing static varibales
//         System.out.println(c);
//         System.out.println(variables.c);

//         variables V1 = new variables();

//         System.out.println(V1.c);
//     }
// }

// Accessing instance variable 

public class varibale_Instance{
    int a = 10;
    int b = 20;

    static int c = 30; 

    public static void main(String[] args){
        // // Accesing static varibales and instance varibale and updating 
        varibale_Instance v2_A = new varibale_Instance();
        varibale_Instance v2_B =  new varibale_Instance();

        System.out.println(v2_A.a + v2_B.b + c);
        
        v2_B.b=200; // updating
        System.out.println(v2_A.a + v2_B.b + c);

        c = 3; // updating 
        System.out.println(v2_A.a + v2_B.b + c);

        v2_A.a=1; // updating
        System.out.println(v2_A.a + v2_B.b + c);
    }
}
