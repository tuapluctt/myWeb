package pojo;


import java.sql.Date;

public class Accountt {
    private long id;
    private String ownerName;
    private double balance;
    private Date accessTime;
    private boolean locked;

    public long getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public boolean isLocked() {
        return locked;
    }

    public  void setId(long id) {
        this.id = id;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
