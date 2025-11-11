package pckg_VJ_Z2;

public class Test {
    public static void main(String[] args) {
        Izdavac izdavacM = new Izdavac("Mjesecni Fashion");
        Izdavac izdavacK = new Izdavac("Kvartalni Sport");

        Subscriber sub1 = new Subscriber("Eli Puljiz", "elipuljiz@gmail.com");
        Subscriber sub2 = new Subscriber("Lucijan Krpina", "lucijankrpina@gmail.com");
        Subscriber sub3 = new Subscriber("Samuel Puljiz", "samuelpuljiz@gmail.com");

        izdavacM.addSubscriber(sub1);
        izdavacM.addSubscriber(sub2);

        izdavacK.addSubscriber(sub1);
        izdavacK.addSubscriber(sub2);
        izdavacK.addSubscriber(sub3);

        System.out.println("Mjesečni časopis ==== izdanje 1.");
        izdavacM.newIssue("Studeni", "Studena špica");

        System.out.println("Kvartalni časopis === izdanje 1.");
        izdavacK.newIssue("STUDENI", "STOLNI TENIS");

        System.out.println("Eli Puljiz je otkazao mjesečni časopis: Mjesecni Fashion");
        izdavacM.removeSubscriber(sub1);

        System.out.println("Mjesečni časopis ==== izdanje 2.");
        izdavacM.newIssue("Prosinac", "Moda za kraj");

        System.out.println("NOVA IZDANJA MJESEČNOG ČASOPISA I KVARTALNOG");
        izdavacM.newIssue("Nova", "Što nas čeka 2026?");
        izdavacK.newIssue("NOVA", "GOLF U HR 2026");
    }

}
