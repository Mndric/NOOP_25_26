package pckg_Feed_solution;

import java.util.Observable;
import java.util.Observer;

public class MobileWSAppFeeds implements Observer {

    private WeatherFeed weatherFeedData;

    public void setFeedData(WeatherFeed wfd){
        this.weatherFeedData = wfd;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Mobile app: " + this);
        System.out.println("Temperature: " + weatherFeedData.getTemperature());
        System.out.println("Pressure: " + weatherFeedData.getPressure());
        System.out.println("Humidity: " + weatherFeedData.getHumidity());
    }
}
