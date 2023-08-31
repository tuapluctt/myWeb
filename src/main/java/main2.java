import javabasedconfiguration.BeanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.AccounttService;

public class main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        AccounttService accounttService = applicationContext.getBean("accounttService", AccounttService.class);

        System.out.println("before monney ");
        System.out.println( " ACC 1 balance : "+accounttService.getAcc(1).getBalance());
        System.out.println( " ACC 2 balance : "+accounttService.getAcc(2).getBalance());

        accounttService.transferMoney(1,2,5.0);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("AFTER MONEY TRANSFER");
        System.out.println("Acc q balance 1 : "+accounttService.getAcc(1).getBalance());
        System.out.println("Acc q balance 1 : "+accounttService.getAcc(2).getBalance());
    }
}
