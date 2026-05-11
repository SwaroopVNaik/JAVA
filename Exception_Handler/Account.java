class InsufficientBalExeception extends Exception{
    InsufficientBalExeception(String msg){

    }
}

public class Account {

    public void withdrawl() throws InsufficientBalExeception{
        int acc_bal = 400; 

        if(acc_bal <= 1000){
            throw new InsufficientBalExeception("Buddy ! balance is too low");
        }
        else{
            System.out.println("withdraw & enjoy");
        }
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.withdrawl();
    }
}
