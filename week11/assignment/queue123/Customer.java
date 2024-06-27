package week11.assignment.queue123;

public class Customer {
    private String name;
    private String address;
    private int accountNumber;

    public Customer(String name, String address, int accountNumber) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
