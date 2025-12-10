package zad_2;

public class StariPlotter {

    private String grafikNaziv;

    public StariPlotter(String grafikNaziv) {
        this.grafikNaziv = grafikNaziv;
    }
    public void plotGrafika(){
        System.out.println("STARI PLOTTER: " + grafikNaziv);
        System.out.println("========");
        System.out.println(grafikNaziv);
        System.out.println("========");
    }

    public String getGrafikNaziv() {
        return grafikNaziv;
    }
}
