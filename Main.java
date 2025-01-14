// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Java Bank");

        // Create accounts
        Account account1 = new Account("A12345", 5000.0);
        Account account2 = new Account("A67890", 3000.0);

        // Create customers
        Customer customer1 = new Customer("C001", "Beksultan", account1);
        PremiumCustomer customer2 = new PremiumCustomer("C002", "Sanjar", account2, 0.05);

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Display all customers
        System.out.println("All Customers:");
        bank.getCustomers().forEach(Customer::printDetails);

        // Filter customers by name
        System.out.println("\nFilter by Name (Beksultan):");
        bank.filterCustomersByName("Beksultan").forEach(Customer::printDetails);

        // Search for a customer by ID
        System.out.println("\nSearch by ID (C001):");
        Customer foundCustomer = bank.findCustomerById("C001");
        if (foundCustomer != null) foundCustomer.printDetails();

        // Sort customers by name
        System.out.println("\nSorted by Name:");
        bank.sortCustomersByName().forEach(Customer::printDetails);

        // Apply cashback for premium customers
        System.out.println("\nApplying Cashback for Premium Customers:");
        customer2.applyCashback();
        customer2.printDetails();
    }
}
