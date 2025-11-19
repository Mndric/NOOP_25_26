package pckg_notification;

public abstract class NotifierDecorator implements Notifier {

    protected Notifier notifier;
    //dipendens inđekšen

    protected NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }


}
