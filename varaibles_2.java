public class varaibles_2 {
    //  for instance and static initialization in not required
    int a; // Instance varaible;
    static int b; // static variable;

    public double get_bal(){
        double min_balance = 500.00;
        double acc_bal = 150000.00;
        return min_balance - acc_bal;
    }

    public static void main(String[] args) {
        // local varaible needs intialization
        int c; // initlaization
        c = 100;  // decalration

        System.out.println(c);

        varaibles_2 V2 = new varaibles_2();
        System.out.println(V2.get_bal());

    }
}
