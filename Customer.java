import java.util.Objects;

public class Customer {
    private String name;
    private String id;
    private Account account;

    public Customer(String id, String name, Account account) {
        this.id = id;
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer{id='" + id + "', name='" + name + "', " + account + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
