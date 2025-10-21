public class AppCli {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation(30, 1020, 75);

        MobileObserverApp mobi = new MobileObserverApp();

        mobi.register(ws);

        ws.listAllObservers();

        System.out.println("=== First state change ===");
        ws.stateChanged(29, 1020, 75);

        System.out.println("=== Second state change ===");
        ws.stateChanged(28, 1018, 80);

        System.out.println("=== Third state change ===");
        ws.stateChanged(27, 1015, 85);
    }
}