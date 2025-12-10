package pckg_VJ_Z4;

public class Suradnik implements Observer {

    private String ime;
    public Suradnik(String ime) {
        this.ime = ime;
    }


    @Override
    public void update(String poruka) {
        System.out.println("Obavijest za: " + ime + " " + poruka);
    }

    public String getIme() {
        return ime;
    }
}
