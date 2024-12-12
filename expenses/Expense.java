package expenses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Expense {
    private double amount;
    private String description;
    private Date date;

    public Expense(double amount, String description, Date date) {
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public void displayExpense() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Expense: " + description + " | Amount: " + amount + " | Date: " + sdf.format(date));
    }
}
