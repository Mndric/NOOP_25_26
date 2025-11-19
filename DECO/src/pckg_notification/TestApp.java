package pckg_notification;

public class TestApp {
    public static void main(String[] args) {
        BaseNotifier baseNotifier = new BaseNotifier();
        Notifier notifierCompound = new SMSNotifierDecorator(new SlackNotifierDecorator(baseNotifier)); //omata koliko mi treba, prvo Slack pa SMS
        notifierCompound.sendMessage("Poruka koja ima smisla!");
        baseNotifier.sendMessage("Poruka koja ima smisla!");
    }
}
