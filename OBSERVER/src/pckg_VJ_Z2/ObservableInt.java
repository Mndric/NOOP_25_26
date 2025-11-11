package pckg_VJ_Z2;


public interface ObservableInt {
    void addSubscriber(Subscriber subscriber );
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
}
