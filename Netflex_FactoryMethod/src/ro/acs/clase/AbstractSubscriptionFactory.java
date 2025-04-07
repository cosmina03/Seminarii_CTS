package ro.acs.clase;

public interface AbstractSubscriptionFactory {
    String HD="HD";
    String FHD="FHD";
    String UHD="UHD";

    Subscription getSubscription(String type);
}
