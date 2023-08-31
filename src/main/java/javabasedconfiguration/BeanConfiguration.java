package javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import pojo.AccountRepository;
import pojo.AccountRepositoryImpl;
import pojo.AccountServiceImpl;
import pojo.AccounttService;

public class BeanConfiguration {
    @Bean
    public AccounttService accounttService(){
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountRepository(accountDao());
        return bean;
    }

    @Bean
    public AccountRepository accountDao(){
        AccountRepositoryImpl bean = new AccountRepositoryImpl() ;
        return bean;

    }

}
