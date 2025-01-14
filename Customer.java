import java.util.Objects;

// The Customer class represents a bank customer
public class Customer {
    private String name;    // Customer name
    private String id;      // Unique customer ID
    private Account account; // Customer's account

    // Constructor to initialize a customer
    public Customer(String id, String name, Account account) {
        this.id = id;
        this.name = name;
        this.account = account;
    }

    // Get the customer's name
    public String getName() {
        return name;
    }

    // Get the customer's ID
    public String getId() {
        return id;
    }

    // Get the customer's account
    public Account getAccount() {
        return account;
    }

    // String representation of the customer
    @Override
    public String toString() {
        return "Customer{id='" + id + "', name='" + name + "', " + account + "}";
    }

    // Compare customers by ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    // Generate a hash code for the customer
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Print customer details
    public void printDetails() {
        System.out.println(this);
    }
}
