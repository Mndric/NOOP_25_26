package zad_2;

public class PlotterApp {

    public static void main(String[] args) {

        NoviSoftver noviSoftver = new NoviPlotter("Nova grafika");
        System.out.println("Direktno korištenje novog plotera");
        noviSoftver.ispisGrafike();

        StariPlotter stariPlotter = new StariPlotter("Stara grafika");
        NoviSoftver adapter = new PlotterAdapter(stariPlotter);
        System.out.println("\nKorištenje starog plotera preko adaptera");
        adapter.ispisGrafike();


    }
}
