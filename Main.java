public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Java Bank");

        Account account1 = new Account("A12345", 5000.0);
        Account account2 = new Account("A67890", 3000.0);

        Customer customer1 = new Customer("C001", "Beksultan", account1);
        Customer customer2 = new Customer("C002", "Sanjar", account2);

        // Add customers
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Display all customers
        System.out.println("All Customers:");
        bank.getCustomers().forEach(System.out::println);

        // Filter by name
        System.out.println("\nFilter by Name (Beksultan):");
        bank.filterCustomersByName("Beksultan").forEach(System.out::println);

        // Search customer by ID
        System.out.println("\nSearch by ID (C001):");
        System.out.println(bank.findCustomerById("C001"));

        // Sort by name
        System.out.println("\nSorted by Name:");
        bank.sortCustomersByName().forEach(System.out::println);
    }
}
