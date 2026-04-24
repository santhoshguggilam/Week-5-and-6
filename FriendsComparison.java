import java.util.Scanner;

// Class to find youngest and tallest among friends
class FriendsComparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Arrays to store age and height of 3 friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height
        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Initialize youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest friend is " + friends[youngestIndex] +
                " with age " + ages[youngestIndex]);

        System.out.println("Tallest friend is " + friends[tallestIndex] +
                " with height " + heights[tallestIndex]);
    }
}