class Assignment_practice {

    // 🔹 Static variable (shared)
    static String college = "MVJ";

    // 🔹 Non-static variable (individual)
    int age;

    // Constructor
    Assignment_practice(int a) {
        age = a;
    }

    // Non-static method
    void showDetails() {
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("-----");
    }

    public static void main(String[] args) {

        // Creating objects
        Assignment_practice s1 = new Assignment_practice(20);
        Assignment_practice s2 = new Assignment_practice(25);

        // Display details
        s1.showDetails();
        s2.showDetails();

        // Change static variable
        college = "IIT";

        System.out.println("After changing college:\n");

        s1.showDetails();
        s2.showDetails();
    }
}