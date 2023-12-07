import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TotalCalculation {

    public static void main(String[] args) {
        // File paths
        String inputFile = "src/items.txt";
        String outputFile = "src/total.txt";


        // Read values from "items.txt" and calculate totals
        calculateTotal(inputFile, outputFile);

        System.out.println("Calculation completed successfully.");
    }

    private static void calculateTotal(String inputFile, String outputFile) {
        try (Scanner scanner = new Scanner(new File(inputFile));
             FileWriter fileWriter = new FileWriter(outputFile)) {

            double subtotal = 0;

            // Read values and calculate subtotal
            while (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                subtotal += value;
            }

            // Calculate tax and final total
            double taxRate = 0.053;
            double tax = subtotal * taxRate;
            double finalTotal = subtotal + tax;

            // Write results to "total.txt"
            fileWriter.write(String.format("Subtotal: $%.2f\n", subtotal));
            fileWriter.write(String.format("Tax: $%.2f\n", tax));
            fileWriter.write(String.format("Final Total: $%.2f\n", finalTotal));

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
