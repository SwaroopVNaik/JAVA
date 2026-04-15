public class finalmethod {
    // instance variable
    final int min_balance = 500;

    public static void main(String[] args) {
       finalmethod f1 = new finalmethod();

       System.out.println(f1.min_balance);

    //    f1.min_balance = 500; // cannot modify final varibale

    //    System.out.println(f1.min_balance);

    }

}
