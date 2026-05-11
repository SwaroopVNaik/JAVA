public class Custom_error {
    public static void main(String[] args) {
        System.out.println(10/5);

        try {
            throw new ArithmeticException("go" + " Enjoy");
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

        System.out.println(10/1);
    }
}
