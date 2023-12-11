import java.util.ArrayList;

public interface Bank {
    String getName();
    void depositMoney(Customer customer);
    void withdrawMoney(Customer customer);
    void openFD(Customer customer);
    void applyLoan(Customer customer);
    void applyCreditCard(Customer customer);
    float getBalance();
    float getMiniBalance();
    void addCustomer(Customer customer);
    ArrayList<Customer> getCustList();
}
