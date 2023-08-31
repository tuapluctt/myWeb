import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlconfiguration/beans.xml");

        Account account1 = (Account) context.getBean("account1");
        System.out.println("\n =>account 1 data ");
        System.out.println("ID: "+account1.getId());
        System.out.println("Account Name :"+account1.getOwnerName());
        System.out.println("Balance : "+account1.getBalance());

        Account account2 = (Account) context.getBean("account2");
        System.out.println("\n =>account 1 data ");
        System.out.println("ID: "+account2.getId());
        System.out.println("Account Name :"+account2.getOwnerName());
        System.out.println("Balance : "+account2.getBalance());
    }
}
