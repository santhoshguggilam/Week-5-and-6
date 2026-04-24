import java.util.Scanner;

// Class to check voting eligibility of students
class VotingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Define array for 10 students' ages
        int[] ages = new int[10];

        // Take input for ages
        System.out.println("Enter ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];

            if (age < 0) {
                System.out.println("Invalid age for student " + (i + 1));
            } 
            else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } 
            else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }
}