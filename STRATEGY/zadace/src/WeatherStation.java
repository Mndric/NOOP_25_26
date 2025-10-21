import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObservableInt {
    private List<ObserverInt> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherStation(float temp, float press, float hum) {
        this.observers = new ArrayList<>();
        this.temperature = temp;
        this.pressure = press;
        this.humidity = hum;
    }

    @Override
    public void addObserver(ObserverInt observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInt observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (ObserverInt observer : observers) {
            observer.update(temperature, pressure, humidity);
        }
    }

    public void stateChanged(float temp, float press, float hum) {
        this.temperature = temp;
        this.pressure = press;
        this.humidity = hum;
        notifyAllObservers();
    }

    public void listAllObservers() {
        System.out.println("Registered observers: " + observers.size());
    }
}
