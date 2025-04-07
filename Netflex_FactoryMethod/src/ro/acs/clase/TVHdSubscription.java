package ro.acs.clase;

public class TVHdSubscription implements Subscription{
     TVHdSubscription() {
         System.out.println("TV Provider Hd");
    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in format hd");
    }
}
