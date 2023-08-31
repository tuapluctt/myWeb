package annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pojo.AccountRepository;
import pojo.Accountt;
import pojo.AccounttService;

@Service("accountService")
public class AccountService2Impl implements AccounttService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountService2Impl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountService2Impl() {

    }

    public AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transferMoney(long fromAccId, long toAccId, double amount) {
        Accountt sourceAccount = accountRepository.find(fromAccId);
        Accountt targetAccount = accountRepository.find(toAccId);
        sourceAccount.setBalance(sourceAccount.getBalance()-amount);
        targetAccount.setBalance(targetAccount.getBalance()+amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(targetAccount);
    }

    @Override
    public void deposiMoney(long accId, double amount) {
        Accountt account = accountRepository.find(accId);
        account.setBalance(account.getBalance()+amount);
        accountRepository.update(account);
    }

    @Override
    public Accountt getAcc(long accId) {
        return accountRepository.find(accId);
    }

}
