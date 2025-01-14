// The PremiumCustomer class extends the functionality of a basic customer
public class PremiumCustomer extends Customer {

    // Constructor for a premium customer
    public PremiumCustomer(String id, String name, Account account, double cashbackRate) {
        super(id, name, account);
        this.cashbackRate = cashbackRate;
    }
    public PremiumCustomer() {

    }

    private double cashbackRate; // Cashback rate


    // Get the cashback rate
    public double getCashbackRate() {
        return cashbackRate;
    }

    // Set a new cashback rate
    public void setCashbackRate(double cashbackRate) {
        this.cashbackRate = cashbackRate;
    }

    // Apply cashback to the customer's account
    public void applyCashback() {
        double cashback = getAccount().getBalance() * cashbackRate;
        getAccount().deposit(cashback);
    }

    // String representation of a premium customer
    @Override
    public String toString() {
        return "PremiumCustomer{" +
                "cashbackRate=" + cashbackRate +
                ", details=" + super.toString() +
                '}';
    }
}
