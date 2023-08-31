package pojo;

public class Account {
    private long id;
    private String ownerName;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public long getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
