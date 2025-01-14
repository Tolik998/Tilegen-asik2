import java.util.Objects;

// The Account class represents a bank account
public class Account {
    private String accountNumber; // Account number
    private double balance;       // Account balance

    // Constructor to initialize the account
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Get the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Get the current balance
    public double getBalance() {
        return balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // String representation of the account
    @Override
    public String toString() {
        return "Account{accountNumber='" + accountNumber + "', balance=$" + balance + "}";
    }

    // Compare accounts by account number
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    // Generate a hash code for the account
    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}
