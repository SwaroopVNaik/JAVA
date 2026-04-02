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
        eid = new int [4]; // creation

        // initializaton
        eid[0] = 101;
        eid[1] = 104;
        eid[2] = 105;
        eid[3] = 111;

        // foreach(printing all array elemnts)
        for (int eids : eid) {
            System.out.println(eids);
            
        }


        String [] enames = {"Aprillia RS457", "CBR 350", "Ninja 500" };

        for (String ename : enames) {
            System.out.println(ename);
        }
    }
}
