package ro.acs.clase;

public class TVFullHdSubscription implements Subscription{
     TVFullHdSubscription() {
         System.out.println("TV Provider FHD");
    }

    @Override
    public void renderContent() {
        System.out.println("Rendering content in format FHD");
    }
}
