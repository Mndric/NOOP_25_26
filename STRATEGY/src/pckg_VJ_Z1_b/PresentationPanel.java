package pckg_VJ_Z1_b;

import javax.swing.*;
import java.awt.*;

public class PresentationPanel extends JPanel {

    private JTextField resultField;
    private JTextArea allResults;
    private JSlider scrollPane;
    private JScrollPane resultsScrollPane;

    public PresentationPanel() {

        initComponents();
        layoutComponents();
    }



    private void initComponents() {
        this.resultField = new JTextField(15);
        resultField.setEditable(false);
        this.allResults = new JTextArea(10, 15);
        this.resultsScrollPane = new JScrollPane(allResults, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);    }


    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Result: "), gbc);


        gbc.gridy = 1;
        add(resultField, gbc);

        gbc.gridy = 2;
        add(new JLabel("All results: "), gbc);


        gbc.gridy = 3;
        add(allResults, gbc);

    }

    public void setResult(String result){
        resultField.setText(result);
    }

    public void addResultToAll(String res){
        allResults.append(res + "\n");
    }
}
