package ro.acs.clase;

public class NetflexHdSubscription implements Subscription{
    NetflexHdSubscription(){
        System.out.println("Netflex Hd ");
    }
    @Override
    public void renderContent() {
        System.out.println("Rendering content in Hd format");
    }
}
