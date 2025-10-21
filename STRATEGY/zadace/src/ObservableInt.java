interface ObservableInt {
    void addObserver(ObserverInt observer);
    void removeObserver(ObserverInt observer);
    void notifyAllObservers();
}