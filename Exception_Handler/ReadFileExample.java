import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {

    public static void main(String[] args) {

        try {
            // Open data.txt file
            File file = new File("data.txt");

            // Read file using Scanner
            Scanner sc = new Scanner(file);

            // Read line by line
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }

            // Close scanner
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}