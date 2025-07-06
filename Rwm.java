import java.io.*;      //for input/output operations
import java.util.Scanner;    //for taking input

public class Rwm {

    public static void main(String[] args) {
        String fileName = "example.txt";

        // Write to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is the original file content before modification.\nIt is unmodified.");
            System.out.println("File is written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }

        // Read fle content
        System.out.println("\nreading the file content :");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Modify the file 
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is the modified content.\nFile is modified.");
            System.out.println("\nFile  is modified.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file.");
            e.printStackTrace();
        }

        // Read to show updated content
        System.out.println("\nmodified file content:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error occurred while reading the modified file.");
            e.printStackTrace();
        }
    }
}
