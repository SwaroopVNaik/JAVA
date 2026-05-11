public class Code_error {
    public static void main(String[] args) {

        System.out.println(10/5);

        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println(10/1);
    }
}
