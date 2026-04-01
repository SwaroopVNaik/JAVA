// Types of Datatypes 
// 1) primitive Data types => byte, short, int, float, double, char, boolean
// 2) reference Datatypes => String, String Buffer, Array, Array Buffer 
// 3) User Defined datatypes => user defining datatype using class => class product{}, class emp{}
public class data_types {
    // Primitive datatypes (repersenting whole number)
    byte b = 10;  // range = 120 to 127
    short s = 100;
    int eid = 101; 
    long number = 1234567890l;

    // Primitive dataypes (repsenting fractional values)
    float esal = 45000.45f;
    double rating = 4.5;

    // primitve datatypes ( repsenting single char)
    char avail = 'y';

    // primitive datatype (repersenting flag type)
    boolean discount = true;

    public static void main(String[] args) {
        data_types data = new data_types();

        System.out.println(data.b);
        System.out.println(data.s);
        System.out.println(data.eid);
        System.out.println(data.number);
        System.out.println(data.esal);
        System.out.println(data.rating);
        System.out.println(data.avail);
        System.out.println(data.discount);
    }
}
