package zad_3;

public class Adapter implements PrimaryInterface{
    private double temp;
    private double wndSpeed;
    private NonMetricWthrServiceAdaptee nonMetricWthrServiceAdaptee;

    public Adapter(NonMetricWthrServiceAdaptee nonMetricWthrServiceAdaptee){
        this.nonMetricWthrServiceAdaptee = nonMetricWthrServiceAdaptee;
    }



    @Override
    public void readTempC() {
        nonMetricWthrServiceAdaptee.readTempinF();
        this.temp = convertFintoC(nonMetricWthrServiceAdaptee.getTempF());
    }

    @Override
    public void readWndSpdms() {
        nonMetricWthrServiceAdaptee.readWndSpdInKn();
        this.wndSpeed = convertKnintoMs(nonMetricWthrServiceAdaptee.getWndSpdKn());
    }

    @Override
    public void showWthrData() {
        System.out.println("==========WHEATER DATA==========");
        System.out.println("Input data from " + nonMetricWthrServiceAdaptee.getClass().getSimpleName() + ":");
        nonMetricWthrServiceAdaptee.showMeasureData();
        System.out.println("Data after using adapter: ");
        System.out.println(toString());
    }

    public double convertFintoC(double inF){
        double convertedTemp = (inF-32)*0.556;
        return convertedTemp;
    }
    public double convertKnintoMs(double inKn){
        double convertedSpd = inKn/1.994;
        return convertedSpd;
    }

    @Override
    public String toString() {
        return "Adapter{" +
                "temp=" + temp +
                ", wndSpeed=" + wndSpeed +
                ", nonMetricWthrServiceAdaptee=" + nonMetricWthrServiceAdaptee +
                '}';
    }
}
