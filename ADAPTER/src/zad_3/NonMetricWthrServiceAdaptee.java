package zad_3;

import java.util.concurrent.ThreadLocalRandom;

public class NonMetricWthrServiceAdaptee {
    private double tempF;
    private double wndSpeed;

    public double getTempF(){
        return tempF;
    }
    public double getWndSpdKn(){
        return wndSpeed;
    }
    public void readTempinF(){
        this.tempF = ThreadLocalRandom.current().nextDouble(0, 114);
    }
    public void readWndSpdInKn(){
        this.wndSpeed = ThreadLocalRandom.current().nextDouble(0, 60);
    }
    public void showMeasureData(){
        System.out.println(toString());
    }

}
