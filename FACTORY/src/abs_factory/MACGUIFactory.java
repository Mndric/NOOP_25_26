package abs_factory;

public class MACGUIFactory implements GUIFactory {
    @Override
    public void renderGUIApp() {
        MACButton macButton = new MACButton();
        macButton.renderButton();
        MACList macList = new MACList();
        macList.renderList();
        MACChkBox macChkBox = new MACChkBox();
        macChkBox.renderChkBox();
        MACCombo macCombo = new MACCombo();
        macCombo.renderCombo();
    }

    @Override
    public String toString() {
        return "MACGUIFactory{}";
    }
}
