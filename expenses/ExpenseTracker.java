package expenses;

import java.util.ArrayList;
import java.util.Date;

public class ExpenseTracker {
    private double remainingBalance;
    private final ArrayList<ExpenseTracker> expenses;

    // Constructor
    public ExpenseTracker(double amount, String description, Date date) {
        this.remainingBalance = 0.0;
        this.expenses = new ArrayList<>();
    }

    // Method to add income
    public void addIncome(double income) {
        remainingBalance += income;
        System.out.println("Income added: " + income + ". Total balance: " + remainingBalance);
    }

    // Method to add an expense
    public void addExpense(double amount, String description) {
        if (amount > remainingBalance) {
            System.out.println("Insufficient balance for this expense.");
            return;
        }
        remainingBalance -= amount;
        expenses.add(new ExpenseTracker(amount, description, new Date()));
        System.out.println("Expense added successfully. Remaining balance: " + remainingBalance);
    }

    // Method to display all expenses
    public void displayExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        System.out.println("\n--- Expenses ---");
        for (ExpenseTracker expense : expenses) {
            System.out.println(expense);
        }
        System.out.println("Total Remaining Balance: " + remainingBalance);
    }
}
