package ro.acs.SingletonRegistryMain;

import ro.acs.SingletonRegistry.Logger;
import ro.acs.SingletonRegistry.PaymentService;
import ro.acs.SingletonRegistry.SingletonRegistry;


public class Main {
    public static void main(String[] args) {
        SingletonRegistry singletonRegistry=new SingletonRegistry();
        Logger logger= (Logger) singletonRegistry.getSingleton(SingletonRegistry.LOGGER);
        logger.log("conectat");
        PaymentService paymentService= (PaymentService) singletonRegistry.getSingleton(SingletonRegistry.PAYMENT);
        paymentService.pay(100);
        PaymentService paymentService1=(PaymentService) singletonRegistry.getSingleton(SingletonRegistry.PAYMENT);
        System.out.println(paymentService1==paymentService);

    }
}
