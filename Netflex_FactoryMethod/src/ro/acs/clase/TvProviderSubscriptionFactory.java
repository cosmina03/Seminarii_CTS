package ro.acs.clase;

public class TvProviderSubscriptionFactory implements AbstractSubscriptionFactory {
    @Override
    public Subscription getSubscription(String type) {
        if(HD.equals(type)){
            return new TVHdSubscription();
        }else if(FHD.equals(type)){
            return new TVFullHdSubscription();
        }else if(UHD.equals(type)){
            return new TVUltraHdSubscription();
        }else {
            throw new RuntimeException("Nu avem acest tip de subscrptie");
        }
    }
}
