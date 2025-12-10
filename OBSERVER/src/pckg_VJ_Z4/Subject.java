package pckg_VJ_Z4;

public interface Subject {
    void dodajSuradnika(Observer suradnik);
    void ukloniSuradnika(Observer suradnik);
    void obavijestiSve(String poruka);
}
