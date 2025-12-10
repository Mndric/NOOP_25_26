package zad_2;

public class NoviPlotter implements NoviSoftver {

    private String nazivGrafike;

    public NoviPlotter(String nazivGrafike) {
        this.nazivGrafike = nazivGrafike;
    }
    @Override
    public void ispisGrafike() {
        System.out.println("NOVI PLOTTER: " + nazivGrafike);
        System.out.println("============");
        System.out.println(nazivGrafike);
        System.out.println("============");
    }
}
