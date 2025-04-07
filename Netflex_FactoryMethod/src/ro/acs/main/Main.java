package ro.acs.main;

import ro.acs.clase.AbstractSubscriptionFactory;
import ro.acs.clase.NetflexSubscriptionFactory;
import ro.acs.clase.Subscription;
import ro.acs.clase.TvProviderSubscriptionFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AbstractSubscriptionFactory factoryMethod=new NetflexSubscriptionFactory();
        Subscription subscription=factoryMethod.getSubscription(AbstractSubscriptionFactory.FHD);
        subscription.renderContent();

    }
}