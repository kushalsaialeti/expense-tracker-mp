package expenses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker(0, null, null);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Expense Tracker Menu ---");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. Display Expenses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter income amount: ");
                    double income = scanner.nextDouble();
                    tracker.addIncome(income);
                    break;

                case 2:
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter expense description: ");
                    String description = scanner.nextLine();
                    tracker.addExpense(amount, description);
                    break;

                case 3:
                    tracker.displayExpenses();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
