package pojo;

public interface AccountRepository {
    void insert (Accountt acc);
    void update(Accountt acc);
    Accountt find(long accId);
}
