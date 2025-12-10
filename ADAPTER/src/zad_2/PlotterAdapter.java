package zad_2;

public class PlotterAdapter implements NoviSoftver{

    private StariPlotter stariPlotter;
    public PlotterAdapter(StariPlotter stariPlotter){
        this.stariPlotter = stariPlotter;
    }


    @Override
    public void ispisGrafike() {
        stariPlotter.plotGrafika();
    }
}
