public class iterative {
    public static void main(String[] args) {
        
        // for Loop

        // write a small program to print 1 to 100 
        // for(int i = 1; i<=100; i++){
        //     System.out.println(i);
        // }
        // write a program to print from 100 to 51
        // for(int i = 100; i >= 51; i-- ){
        //     System.out.println(i);
        // }

        // first ten even numbers 1 to 20
        // for(int i = 2; i<=20; i = i + 2){
        //     System.out.println(i);
        // }


        // while loop
        // write a program to print even number 1 to 20

        // int i = 2;
        // while (i <= 20) {
        //     System.out.println(i);
        //     i = i + 2;
        // }

        // do - while loop (irespective of condition if we want ot execute block of code one time)
        // used to establish db Connection
        // For - each => to iterate sequences

        // itrate array using for, while, do while , foreach)

        int [] eid = {101, 102, 103, 104};

        // for(int i = 0; i <= 3; i++){
        //     System.out.println(eid[i]);
        // }

        int i = 0; 
        while(i <= eid.length - 1 ){
            System.out.println(eid[i]);
            i++;
        }

        // int i = 0;
        // do{
        //     System.out.println(eid[i]);
        //     i++;
        // }while(i <= eid.length - 1);

        for (int id : eid) {
            System.out.println(id);
        }
    }
}

