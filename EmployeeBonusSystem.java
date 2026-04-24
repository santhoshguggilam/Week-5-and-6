import java.util.Scanner;

// Class to calculate employee bonus and salary details
class EmployeeBonusSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Arrays to store employee data
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter salary and years of service for 10 employees:");

        // Input loop with validation
        for (int i = 0; i < 10; i++) {

            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double sal = input.nextDouble();

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            double years = input.nextDouble();

            // Validate input
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; // repeat same index
            } 
            else {
                salary[i] = sal;
                yearsOfService[i] = years;
            }
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            totalOldSalary += salary[i];

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } 
            else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}