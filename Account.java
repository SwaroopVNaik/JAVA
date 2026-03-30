public class Account {
    public void open_Account(){
        System.out.println("Account opened Successfully");
    }
    public void deposit(){
        System.out.println("Amount Deposited");
    }
    public void withdraw(){
        System.out.println("Withdraw successfully");
    }
    public static void main(String[] args){
        int eid = 101;
        Account a1 = new Account();
        a1.open_Account();
        a1.deposit();
        a1.withdraw();
    }
}