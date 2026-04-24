import java.util.Scanner;

// Class to generate multiplication table using array
class MultiplicationTableArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store multiplication results (1 to 10)
        int[] multiplicationTable = new int[10];

        // Fill array with multiplication results
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Display multiplication table
        System.out.println("Multiplication Table of " + number + ":");

        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
    }
}