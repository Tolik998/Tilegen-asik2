import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// The Bank class represents a bank that manages customers
public class Bank {

    // Constructor to initialize the bank
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public Bank(){

    }
    private String name;               // Bank name
    private List<Customer> customers; // List of customers

    // Add a customer to the bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Get the list of all customers
    public List<Customer> getCustomers() {
        return customers;
    }

    // Filter customers by name
    public List<Customer> filterCustomersByName(String name) {
        return customers.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // Find a customer by ID
    public Customer findCustomerById(String id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Sort customers by name
    public List<Customer> sortCustomersByName() {
        return customers.stream()
                .sorted(Comparator.comparing(Customer::getName))
                .collect(Collectors.toList());
    }

    // String representation of the bank
    @Override
    public String toString() {
        return "Bank{name='" + name + "', totalCustomers=" + customers.size() + "}";
    }
}
