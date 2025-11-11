package pckg_VJ_Z2;

import java.util.ArrayList;

public class Izdavac implements ObservableInt{
    private String izdavacIme;
    private ArrayList<Subscriber> subscribers;
    private String trenutni;
    private String pdfContent;

    public Izdavac(String izdavacIme) {
        this.izdavacIme = izdavacIme;
        this.subscribers = new ArrayList<Subscriber>();

    }

    public void newIssue(String trenutni, String pdfContent) {
        this.trenutni = trenutni;
        this.pdfContent = pdfContent;
        notifySubscribers();
    }


    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }


    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(izdavacIme, trenutni, pdfContent);
        }
    }
}
