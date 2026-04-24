import java.util.Scanner;

// Class to find largest and second largest digit
class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store digits (max 10 digits)
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        // Extract digits from number
        while (number != 0 && index < maxDigit) {

            int digit = number % 10;  // get last digit
            digits[index] = digit;    // store in array
            index++;

            number = number / 10;     // remove last digit
        }

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("Largest digit is: " + largest);
        System.out.println("Second largest digit is: " + secondLargest);
    }
}