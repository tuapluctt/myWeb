package pojo;

public interface AccounttService {
    void transferMoney(long fromAccId , long toAccId , double amount);
    void  deposiMoney (long accId , double amount);
    Accountt getAcc(long accId);
}
