package abs_factory;

public class Test {
    public static void main(String[] args) {
        WordEditApp wordEditApp = new WordEditApp(new MACGUIFactory());
        wordEditApp.createGUI();
        System.out.println(wordEditApp);
        WordEditApp wordEditAppW = new WordEditApp(new WINGUIFactory());
        wordEditAppW.createGUI();
        System.out.println(wordEditAppW);
    }
}
