// public class array {
// // Array is group of elements as one entity 
// // array allow duplicates 
// // array is homogenoues mixture(same element)
// // array elements String based on indexing
// // once array is created we can't increase the size or decrease the size (array are fixed nature)
//     public static void main(String[] args) {
//         int [] eid = {101, 102, 103, 104};
//         String[] ename = {"Swaroop", "Aravind", "Chethan", "Darshan", "nitish", "Dhanush", "shetty", "9999"};
//         double[] prices = {9.9999, 9.99, 2.999, 54.6778};

//         // reading the elemnents from the array
//         System.out.println(eid[0]); // 101
//         System.out.println(eid[2]); // 102 
//         // System.out.println(eid[9]); // array out of boud ! error ! 

//         // Updating the array 

//         eid[2] = 67890;

//         System.out.println(eid[2]);
        
//     }

// }

public class array{
    public static void main(String[] args) {
        int [] eid; // declaration
        eid = new int [4]; // creation (size is mandatory)

        // initializaton
        eid[0] = 101;
        eid[1] = 104;
        eid[2] = 105;
        eid[3] = 111;

        // foreach(printing all array elemnts)
        for (int eids : eid) {
            System.out.println(eids);
            
        }

        System.out.println("-----------------------------------------------------------------------------------");

        String [] enames;

        enames = new String[5];

        enames[0] = "Aprillia rs457";
        enames[1] = "CBR 350";
        enames[2] = "ninja 500";

        // System.out.println(enames[0]);
        // System.out.println(enames[1]);
        // System.out.println(enames[2]);
        // System.out.println(enames[3]);
        // System.out.println(enames[4]);

        for (String ename : enames) {
            System.out.println(ename);
        }

        double [] prices = {99.9, 199.9, 289.9, 339.9, 499.9};

        System.out.println(prices.length); // to find array size using .length

        String name = "SwaroopVNaik";

        System.out.println(name.length()); // to find String size use method length()

    }
}
