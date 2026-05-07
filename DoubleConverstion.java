public class DoubleConverstion {
    public static void main(String[] args) {
        String esal = "45000.45";

        // Double.valueOf() (String --> Double Object)
        double es1 = Double.valueOf(esal);

        // String to primitive Data Type
        // Double.parseDouble() (String --> primitive double)
        double es2 = Double.parseDouble(esal)

        System.out.println(esal);
        System.out.println(es1);
        System.out.println(es2);

    }
}
