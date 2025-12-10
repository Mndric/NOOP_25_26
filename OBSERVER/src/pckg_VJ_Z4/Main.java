package pckg_VJ_Z4;

public class Main {

    public static void main(String[] args) {
        OpenSourceProject project = new OpenSourceProject();

        Suradnik a = new Suradnik("Paola");
        Suradnik b = new Suradnik("Patrik");
        Suradnik c = new Suradnik("Eli");

        project.dodajSuradnika(a);
        project.dodajSuradnika(b);
        project.dodajSuradnika(c);

        System.out.println("====POČETAK RADA NA PROJEKTU===");

        project.promijeniKod("Verzija 20", "Paola", "Prva verzija koda");
        project.promijeniKod("Verzija 21", "Eli", "Ispravak errora");
        project.ukloniSuradnika(c);

        project.promijeniKod("Verzija 22", "Paola", "Dodala novo dugme");
        project.promijeniKod("Verzija 23", "Eli", "Uredio izgled dugmadi");

        System.out.println("===KRAJ PROJEKTA===");
    }
}
