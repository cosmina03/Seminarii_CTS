package ro.acs.SingletonRegistry;

public class PaymentService {
    PaymentService(){

    }
    public void pay(double amount){
        System.out.println("paid:"+amount);
    }
}
