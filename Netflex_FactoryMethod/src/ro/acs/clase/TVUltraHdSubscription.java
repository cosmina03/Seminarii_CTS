package ro.acs.clase;

public class TVUltraHdSubscription implements Subscription{
    TVUltraHdSubscription(){
        System.out.println("TV Provider UHD");
    }
    @Override
    public void renderContent() {
        System.out.println("Rendering content in ultra Hd format");
    }
}
