class MobileObserverApp implements ObserverInt, DisplayInt {
    private float[] values2Dsply;

    public MobileObserverApp() {
        values2Dsply = new float[3];
    }

    @Override
    public void display() {
        System.out.println("Temperature is: " + values2Dsply[0] + " °C");
        System.out.println("Pressure is: " + values2Dsply[1] + " hPa");
        System.out.println("Humidity is: " + values2Dsply[2] + " %");
        System.out.println("-----------------------------");
    }

    @Override
    public void update(float temp, float press, float hum) {
        values2Dsply[0] = temp;
        values2Dsply[1] = press;
        values2Dsply[2] = hum;
        display();
    }

    public void register(ObservableInt observable) {
        observable.addObserver(this);
    }

    public void unregister(ObservableInt observable) {
        observable.removeObserver(this);
    }
}
