// public class Account {
//     public void open_Account(){
//         System.out.println("Account opened Successfully");
//     }
//     public void deposit(){
//         System.out.println("Amount Deposited");
//     }
//     public void withdraw(){
//         System.out.println("Withdraw successfully");
//     }
//     public static void main(String[] args){
//         int eid = 101;
//         Account a1 = new Account();
//         a1.open_Account();
//         a1.deposit();
//         a1.withdraw();
//     }
// }

class Employee{

    public static void calc_salary(){
        System.out.println("Static method");
    }

    public String get_Emp(){
        return "swaroop";
    }

    public void set_emp(){
        System.out.println("Set employee details");
    }

    public static void main(String[]  args){
        int a = 100;
        Employee e1 = new Employee();
        e1.set_emp();

        
    }
}