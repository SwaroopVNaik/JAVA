public class Parse_valueof {
    public static void main(String[] args) {
        String num_1 = "100"; // Not a Number 

        // Converts String --> Primitive Int
        int num_2 = Integer.parseInt(num_1); 

        // Converts String --> Object
        int num_3 = Integer.valueOf(num_1)

        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
    }
}
