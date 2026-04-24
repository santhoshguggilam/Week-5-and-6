import java.util.Scanner;

// Class to find frequency of each digit
class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;

        // Array to store digits (max 10 digits)
        int[] digits = new int[10];
        int index = 0;

        // Extract digits and store in array
        while (temp != 0 && index < 10) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Frequency array for digits 0-9
        int[] frequency = new int[10];

        // Count frequency of each digit
        for (int i = 0; i < index; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        // Display frequency of each digit
        System.out.println("Digit frequencies are:");

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}