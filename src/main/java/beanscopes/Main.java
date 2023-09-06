package beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanScope/beans.xml");
        // scopes prototype
        Account account1 = (Account) context.getBean("account2");
        account1.setOwnerName("tu van hoang");
        Account account2 = (Account) context.getBean("account2");
        System.out.println("Account Name :"+account2.getOwnerName());

        // scopes singleton
        Account account3 = (Account) context.getBean("account3");
        account3.setOwnerName("tu van hoang");
        Account account4 = (Account) context.getBean("account3");
        System.out.println("Account Name :"+account4.getOwnerName());
    }
}
