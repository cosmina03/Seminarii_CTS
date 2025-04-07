package ro.acs.clase;

public class NetflexUltraHdSubscription implements Subscription{
    NetflexUltraHdSubscription(){
        System.out.println("Netflex Ultra Hd");
    }
    @Override
    public void renderContent() {
        System.out.println("Rendering content in Full HD format");
    }
}
