package pckg_VJ_Z4;

import pckg_Event_solution.GenObserver;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OpenSourceProject implements Subject {

    private List<Observer> suradnici = new ArrayList<>();
    private String kod = "POČETAK PROJEKTA";
    @Override
    public void dodajSuradnika(Observer suradnik) {
        suradnici.add(suradnik);
        System.out.println("Novi suradnik se pridružio!");
    }

    @Override
    public void ukloniSuradnika(Observer suradnik) {
        suradnici.remove(suradnik);
        System.out.println("Suradnik je napustio projekt!");
    }

    @Override
    public void obavijestiSve(String poruka) {
        for(Observer suradnik : suradnici) {
            suradnik.update(poruka);
        }
    }
    public void promijeniKod(String noviKod, String imeSuradnika, String opisPromjene){
        this.kod = noviKod;
        String poruka = "Suradnik: " + imeSuradnika + "\nVrijeme promjene: " + LocalDate.now().toString() + "\nPromjena nastala: " +  opisPromjene + "\nKod: " + kod;
        obavijestiSve(poruka);
    }
}
