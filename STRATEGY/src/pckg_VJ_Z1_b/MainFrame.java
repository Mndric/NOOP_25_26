package pckg_VJ_Z1_b;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame extends JFrame {

    private InputPanel inputPanel;
    private PresentationPanel presentationPanel;

    public MainFrame(){
        super("Simple calculator");
        setSize(600, 350);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
        layoutComponents();
        activateMainFrame();
    }

    private void initComponents() {
        this.inputPanel = new InputPanel();
        this.presentationPanel = new PresentationPanel();
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(presentationPanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.WEST);
    }

    private void activateMainFrame() {

    }
}
