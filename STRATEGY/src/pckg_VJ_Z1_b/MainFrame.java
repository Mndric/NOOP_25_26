package pckg_VJ_Z1_b;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame extends JFrame {

    private InputPanel inputPanel;
    private PresentationPanel presentationPanel;
    private CalculationStrategy calculationStrategy;

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
        inputPanel.setInputPanelListener(new InputPanelListener() {
            @Override
            public void inputPanelEventOccurred(InputPanelData ipd) {
                CalculationStrategy calculationStrategy = resolveAlgOperation(ipd.getAlgOperation());
                Double result = calculationStrategy.performCalculation(ipd.getFstNum(), ipd.getSndNum());
                try {
                    presentationPanel.setResult(result.toString());
                    presentationPanel.addResultToAll(ipd.getFstNum() + " " + ipd.getAlgOperation().toString() + " " + ipd.getSndNum() + " = " + result.toString());

                }catch (NullPointerException npe){
                    presentationPanel.setResult("Error - dividing with zero!");
                }

            }
        });
    }

    private CalculationStrategy resolveAlgOperation(ALG_OPERATION alg_operation) {
        switch (alg_operation.toString()) {
            case "Addition": return new AdditionStrategy();
            case "Subtraction": return new SubtractionStrategy();
            case "Multiplication": return new MultiplicationStrategy();
            case "Division": return new DivisionStrategy();
            default: return null;
        }
    }
}
