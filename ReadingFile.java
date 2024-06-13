package madhu;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nFile Operations Menu:");
            System.out.println("1. Create a file");
            System.out.println("2. Read a file");
            System.out.println("3. Write to a file");
            System.out.println("4. Delete a file");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createFile(scanner);
                    break;
                case 2:
                    readFile(scanner);
                    break;
                case 3:
                    writeFile(scanner);
                    break;
                case 4:
                    deleteFile(scanner);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createFile(Scanner scanner) {
        System.out.print("Enter a file name: ");
        String fileName = scanner.next();

        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully. File name: " + file.getName() + ", Location: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    private static void readFile(Scanner scanner) {
        System.out.print("Enter a file name: ");
        String fileName = scanner.next();

        File file = new File(fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("File contents:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void writeFile(Scanner scanner) {
        System.out.print("Enter a file name: ");
        String fileName = scanner.next();

        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            System.out.print("Enter data to write to the file: ");
            String data = scanner.next();
            writer.write(data + "\n");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter a file name: ");
        String fileName = scanner.next();

        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Error deleting file.");
        }
    }
}