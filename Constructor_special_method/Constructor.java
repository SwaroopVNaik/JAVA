public class Constructor{

    // Instance variable
    int acc_id;
    String acc_name;
    double acc_bal;

    // constructor name will be same as class name
    // constuctor is a special method to initilize object values
    // constructor runs only once at the time of object creation 
    // we can't invoke constuctor method explicitly
    public Constructor(int id, String Name, double amount){
        this.acc_id = id;
        this.acc_name = Name;
        this.acc_bal = amount;
    }

    // this is non static - means instance method....
    public void deposit_amount(double amount){
        this.acc_bal = this.acc_bal + amount;
    }

    public void withdrawl(double amount){
        this.acc_bal = this.acc_bal - amount;
    }

    public double get_balance(){
        double finalBalance = this.acc_bal - 500;
        System.out.println("Your account balance is: " + finalBalance);
        return finalBalance;
    }

    public static void main(String[] args) {
        Constructor a1 = new Constructor(101, "svn", 60000);
        Constructor a2 = new Constructor(102, "nvs", 50000);

        a1.deposit_amount(500.00);
        a1.withdrawl(50);
        a1.get_balance();
    }
}