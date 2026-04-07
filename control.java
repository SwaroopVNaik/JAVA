public class control{
    public static void main(String[] args) {
        int esal = 50000;

        // If / if else statement output is in boolean values (true / false) when using expressions Relational Operator, Logical Operator, Equality Operator
        // if statement
        if(esal >= 45000){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }

        // checking number is 3 digit 
        int number = 456;

        if(number >= 100 && number <= 999){
            System.out.println("NUmber is 3 digit");
        }
        else{
            System.out.println("Number is not 3 digit");
        }

        //  Ternary Operator 
        //  condtion Statement ? True Statement : Flase Statement
        int num = 71;
        String result = num%2 == 0 ? "even no" : "Odd No";

        System.out.println(result);
    }
}