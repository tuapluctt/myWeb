package annotationbasedconfiguration;

import org.springframework.stereotype.Repository;
import pojo.AccountRepository;
import pojo.Accountt;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountRepository2Impl implements AccountRepository {

private Map<Long, Accountt> accountsMap = new HashMap<>();
    {
        Accountt account1 = new Accountt();

        account1.setId(1L);
        account1.setOwnerName ("John");
        account1.setBalance (10.0);

        Accountt account2= new Accountt();

        account2.setId(2L);
        account2.setOwnerName ("Mary");
        account2.setBalance (20.0);

        accountsMap.put(account1.getId(), account1);

        accountsMap.put(account2.getId(), account2);
    }




    @Override
    public void insert(Accountt acc) {
        accountsMap.put(acc.getId(),acc) ;
    }

    @Override
    public void update(Accountt acc) {
        accountsMap.put(acc.getId(),acc) ;
    }

    @Override
    public Accountt find(long accId) {
        return accountsMap.get(accId) ;
    }


}

