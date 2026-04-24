import java.util.Scanner;

// Class to store values in array and calculate sum
class ArraySumCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store up to 10 numbers
        double[] numbers = new double[10];

        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (max 10). Enter 0 or negative number to stop:");

        // Infinite loop for input
        while (true) {

            System.out.print("Enter number: ");
            double number = input.nextDouble();

            // Stop condition
            if (number <= 0) {
                break;
            }

            // Array size limit check
            if (index == 10) {
                break;
            }

            // Store number in array
            numbers[index] = number;
            index++;
        }

        // Calculate total and display values
        System.out.println("\nNumbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display total
        System.out.println("Sum of all numbers is: " + total);
    }
}