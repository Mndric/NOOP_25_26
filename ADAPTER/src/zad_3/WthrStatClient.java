package zad_3;

import java.io.PrintWriter;

public class WthrStatClient {

    private static PrimaryInterface primary;

    public static void main(String[] args) {

        primary = new MetricWthrServiceStation();
        primary.readTempC();
        primary.readWndSpdms();
        primary.showWthrData();
        primary = new Adapter(new NonMetricWthrServiceAdaptee());
        primary.readTempC();
        primary.readWndSpdms();
        primary.showWthrData();

    }
}
