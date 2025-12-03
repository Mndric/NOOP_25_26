package abs_factory;

public class WINGUIFactory implements GUIFactory{

    @Override
    public void renderGUIApp() {
        MACButton macButton = new MACButton();
        macButton.renderButton();
        MACChkBox macChkBox = new MACChkBox();
        macChkBox.renderChkBox();

    }

    @Override
    public String toString() {
        return "WINGUIFactory{}";
    }
}
