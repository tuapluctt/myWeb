package annotationbasedconfiguration;

import javabasedconfiguration.BeanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.AccounttService;

public class main3{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationconfiguration/beans.xml");
        AccounttService accounttService = applicationContext.getBean("accountService", AccounttService.class);

        System.out.println("before money ");
        System.out.println( " ACC 1 balance : "+accounttService.getAcc(1).getBalance());
        System.out.println( " ACC 2 balance : "+accounttService.getAcc(2).getBalance());

        accounttService.transferMoney(1,2,5.0);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("AFTER MONEY TRANSFER");
        System.out.println("Acc q balance 1 : "+accounttService.getAcc(1).getBalance());
        System.out.println("Acc q balance 1 : "+accounttService.getAcc(2).getBalance());
    }
}
