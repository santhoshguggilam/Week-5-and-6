import java.util.Scanner;

// Class to analyze numbers in an array
class NumberAnalysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Define array of 5 elements
        int[] numbers = new int[5];

        // Take input from user
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Process each number
        for (int i = 0; i < numbers.length; i++) {

            int number = numbers[i];

            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } 
            else if (number < 0) {
                System.out.println(number + " is negative.");
            } 
            else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and last elements are equal.");
        } 
        else if (first > last) {
            System.out.println("First element is greater than last element.");
        } 
        else {
            System.out.println("First element is less than last element.");
        }
    }
}